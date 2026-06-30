package j51;

/* loaded from: classes11.dex */
public abstract class a {
    public static int a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            new java.io.File(str3).deleteOnExit();
            int patch = com.tencent.mm.patchligthdiff.hdiff.HPatch.patch(str, str2, str3, 262144L);
            com.tencent.stubs.logger.Log.i("HdiffApk-CmdUtils", "hpatchz = code = " + patch);
            return patch;
        } catch (java.lang.Exception e17) {
            com.tencent.stubs.logger.Log.i("HdiffApk-CmdUtils", "hpatchz e = " + e17);
            return 999;
        }
    }
}
