package k02;

/* loaded from: classes5.dex */
public abstract class m {
    public static void a(long j17, float f17, int i17) {
        java.lang.String str;
        java.lang.String str2 = "" + java.lang.Math.round(f17 * 100.0f) + "_" + i17;
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("download_pref", 0);
        if (sharedPreferences == null) {
            return;
        }
        java.lang.String string = sharedPreferences.getString(java.lang.String.valueOf(j17), "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            str = "1_" + str2 + "|";
        } else {
            str = string + (com.tencent.mm.sdk.platformtools.t8.P(string.split("\\|")[r2.length - 1].split("_")[0], 0) + 1) + "_" + str2 + "|";
        }
        sharedPreferences.edit().putString(java.lang.String.valueOf(j17), str).apply();
    }
}
