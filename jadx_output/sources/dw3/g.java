package dw3;

/* loaded from: classes4.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final dw3.g f244209d = new dw3.g();

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Iterable<com.tencent.mm.vfs.x1> s17;
        java.lang.Iterable<com.tencent.mm.vfs.x1> s18;
        java.lang.String b17 = dw3.h.f244211a.b("capture");
        boolean j17 = com.tencent.mm.vfs.w6.j(b17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaFilePathUtil", "captureDir:" + b17 + " exist:" + j17);
        int i17 = 0;
        if (j17 && (s18 = com.tencent.mm.vfs.w6.s(b17, false)) != null) {
            int i18 = 0;
            for (com.tencent.mm.vfs.x1 x1Var : s18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaFilePathUtil", "index:" + i18 + "  path:" + x1Var.f213231a + " size:" + x1Var.f213233c);
                i18++;
            }
        }
        java.lang.String b18 = dw3.h.f244211a.b("edit");
        boolean j18 = com.tencent.mm.vfs.w6.j(b18);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaFilePathUtil", "editDir:" + j18 + " exist:" + j18);
        if (!j18 || (s17 = com.tencent.mm.vfs.w6.s(b18, false)) == null) {
            return;
        }
        for (com.tencent.mm.vfs.x1 x1Var2 : s17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaFilePathUtil", "index:" + i17 + "  path:" + x1Var2.f213231a + " size:" + x1Var2.f213233c);
            i17++;
        }
    }
}
