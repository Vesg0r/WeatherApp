package android.bignerdrach.weatherapp;
import android.graphics.drawable.Drawable;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.BindingAdapter;

public class BindingAdapters {

    @BindingAdapter("icon")
    public static void setIcon(AppCompatImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
    }
}
