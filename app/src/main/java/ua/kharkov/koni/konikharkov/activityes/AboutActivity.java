package ua.kharkov.koni.konikharkov.activityes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;
import ua.kharkov.koni.konikharkov.BuildConfig;
import ua.kharkov.koni.konikharkov.R;

public class AboutActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //добавляем кнопку назад и устанавливаем title
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(R.string.info);
        }

        Element versionElement = new Element();
        String versionName = BuildConfig.VERSION_NAME;
        versionElement.setTitle("Version " + versionName);

        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setDescription("Каталог амортизаторов KONI Украина в городе Харьков")
                .setImage(R.drawable.logo)
                .addItem(versionElement)
                .addEmail("koni.kharkov@gmail.com", "Напишите нам")
                .addWebsite("koni.kharkov.ua")
                .addFacebook("profile.php?id=100001746039121")
                .addInstagram("koni.kharkov.ua")
                .addYoutube("UCjZDLB7HsSS8F8_HEjbusEQ")
                .addItem(getCopyRightsElement())
                .create();
        setContentView(aboutPage);
    }

    Element getCopyRightsElement() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.copy_right), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.about_icon_copy_right);
        copyRightsElement.setIconTint(mehdi.sakout.aboutpage.R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.CENTER);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), copyrights, Toast.LENGTH_SHORT).show();
            }
        });
        return copyRightsElement;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            onBackPressed();  return true;
        }

        if (id == R.id.menu_fav) {

            Intent intent = new Intent(this, Favourites.class);
            this.startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
