package hy4;

/* loaded from: classes.dex */
public abstract class t {
    public static android.content.Intent a(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", com.tencent.mm.sdk.platformtools.i1.b(com.tencent.mm.sdk.platformtools.x2.f193071a, new com.tencent.mm.vfs.r6(b(str))));
        return intent;
    }

    public static java.lang.String b(java.lang.String str) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(lp0.b.m());
        if (!r6Var.J()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebJSSDKUtil", "mkdirs failed.File is exist = " + r6Var.m());
        }
        if (!r6Var.m()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebJSSDKUtil", "camera storage path do not exist.(%s)", lp0.b.m());
        }
        java.lang.String str2 = r6Var.o() + "/" + str + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebJSSDKUtil", "get file path from capture file name : %s == %s", str, str2);
        return str2;
    }
}
