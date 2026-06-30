package xc1;

@j95.b
/* loaded from: classes7.dex */
public final class t extends i95.w implements ft.q4 {
    public void Ai(java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() == 0) {
            return;
        }
        if (str2 == null || str2.length() == 0) {
            return;
        }
        if (str2 == null || str2.length() == 0) {
            return;
        }
        if (str == null || str.length() == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NativeToWxa", "onNativePostData, appId:" + str + ", data:" + str2);
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NativeToWxa", "onNativePostData, in main process");
            com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().O(str, new xc1.n(str, str2));
            return;
        }
        com.tencent.mm.plugin.appbrand.o6 b17 = com.tencent.mm.plugin.appbrand.l.b(str);
        jz5.f0 f0Var = null;
        if (b17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NativeToWxa", "onNativePostData, in appbrand process, get runtime success");
            com.tencent.mm.plugin.appbrand.e9 C0 = b17.C0();
            jz5.f0 f0Var2 = jz5.f0.f302826a;
            if (C0 != null) {
                b17.I1(new xc1.o(str2, C0));
                f0Var = f0Var2;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NativeToWxa", "onNativePostData, in appbrand process, runtime service is null");
            }
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NativeToWxa", "onNativePostData, in appbrand process, get runtime failed");
        }
    }

    public void Bi(java.lang.String str, ft.p4 p4Var) {
        if ((str == null || str.length() == 0) || p4Var == null) {
            return;
        }
        xc1.s sVar = xc1.s.f453057a;
        xc1.s.f453058b.f(str, p4Var);
    }

    public void wi(java.lang.String str, ft.p4 p4Var) {
        if ((str == null || str.length() == 0) || p4Var == null) {
            return;
        }
        xc1.s sVar = xc1.s.f453057a;
        xc1.s.f453058b.e(str, p4Var);
    }
}
