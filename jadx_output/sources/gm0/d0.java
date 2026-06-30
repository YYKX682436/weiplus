package gm0;

/* loaded from: classes8.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f273176d;

    public d0(gm0.b0 b0Var, com.tencent.mm.vfs.r6 r6Var) {
        this.f273176d = r6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.vfs.r6 r6Var = this.f273176d;
        com.tencent.mm.vfs.r6[] I = r6Var.s().I(new gm0.c0(this, r6Var.getName()));
        if (I != null) {
            for (com.tencent.mm.vfs.r6 r6Var2 : I) {
                com.tencent.mars.xlog.Log.i("MMKernel.CoreStorage", "Delete temporary recovery database file: " + r6Var2.getName());
                r6Var2.l();
            }
        }
    }
}
