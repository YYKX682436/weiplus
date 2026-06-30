package oh1;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.PluginAppBrand.class})
/* loaded from: classes9.dex */
public class o1 extends i95.w implements k01.v0 {
    public final android.text.SpannableString wi(android.content.Context context, int i17, android.graphics.Bitmap bitmap) {
        android.graphics.drawable.Drawable bitmapDrawable;
        if (bitmap == null) {
            bitmapDrawable = context.getResources().getDrawable(i17 == 1 ? com.tencent.mm.R.raw.spannable_wxa_game_link_logo : com.tencent.mm.R.raw.spannable_app_brand_link_logo);
        } else {
            bitmapDrawable = new android.graphics.drawable.BitmapDrawable(context.getResources(), bitmap);
        }
        bitmapDrawable.setBounds(0, 0, ik1.j0.a(16), ik1.j0.a(16));
        yl1.b bVar = new yl1.b(bitmapDrawable, 1);
        android.text.SpannableString spannableString = new android.text.SpannableString("@ ");
        spannableString.setSpan(bVar, 0, 1, 33);
        return spannableString;
    }
}
