package hy4;

/* loaded from: classes8.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy4.s f286184d;

    public p(hy4.s sVar, hy4.n nVar) {
        this.f286184d = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        hy4.s sVar = this.f286184d;
        java.lang.String str = sVar.f286196c;
        if (str == null) {
            return;
        }
        com.tencent.mm.vfs.r6[] I = new com.tencent.mm.vfs.r6(str).s().I(new hy4.o(this));
        if (I != null) {
            for (com.tencent.mm.vfs.r6 r6Var : I) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ViewCaptureHelper", "deleteFile file: %s, result: %b", r6Var.o(), java.lang.Boolean.valueOf(r6Var.l()));
            }
        }
        sVar.f286196c = null;
    }
}
