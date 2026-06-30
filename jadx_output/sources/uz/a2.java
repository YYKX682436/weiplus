package uz;

@j95.b
/* loaded from: classes8.dex */
public class a2 extends i95.w implements vz.y1 {
    public java.lang.String Ai(com.tencent.mm.vfs.r6 r6Var) {
        try {
            return com.tencent.mm.sdk.platformtools.w2.b(e02.n.b(r6Var).array());
        } catch (e02.d unused) {
            com.tencent.mars.xlog.Log.e("gamelog.ApkSignUtil", "APK : " + r6Var.o() + " not have apk signature block");
            return null;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("gamelog.ApkSignUtil", "containV2Signature, error: %s", e17.getMessage());
            return null;
        }
    }

    public java.lang.String wi(java.lang.String str) {
        return com.tencent.mm.plugin.downloader.api.f.a(str);
    }
}
