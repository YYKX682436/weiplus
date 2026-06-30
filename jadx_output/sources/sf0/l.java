package sf0;

/* loaded from: classes.dex */
public class l implements gm0.i2 {
    @Override // gm0.i2
    public void kh(int i17) {
        if (com.tencent.mm.sdk.platformtools.z.f193112h != i17) {
            android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
            kotlin.jvm.internal.o.f(sharedPreferences, "getSharedPreferences(...)");
            sharedPreferences.edit().putInt("RedDotCheckUpdateTab", 0).putInt("RedDotAboutWechatTab", 0).putInt("RedDotSettingTab", 0).putInt("RedDotBottomTab", 0).apply();
        }
    }
}
