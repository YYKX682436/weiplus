package wv;

@j95.b
/* loaded from: classes11.dex */
public class i0 extends i95.w implements xv.o0 {
    public void Ai() {
        java.util.Map map = c83.e.f39678a;
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("tinker_patch_share_config", 4);
        sharedPreferences.edit().putLong(c83.e.f39680c, java.lang.System.currentTimeMillis()).apply();
        java.lang.String str = c83.e.f39681d;
        sharedPreferences.edit().putInt(str, sharedPreferences.getInt(str, 0) + 1).apply();
    }

    public boolean wi() {
        java.util.Map map = c83.e.f39678a;
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("tinker_patch_share_config", 4);
        return java.lang.System.currentTimeMillis() - sharedPreferences.getLong(c83.e.f39680c, 0L) > 86400000 && sharedPreferences.getInt(c83.e.f39681d, 0) < 4;
    }
}
