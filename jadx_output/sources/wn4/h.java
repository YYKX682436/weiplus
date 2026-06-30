package wn4;

/* loaded from: classes.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final wn4.h f447547d = new wn4.h();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        com.tencent.mm.vfs.r6[] G = lp0.b.h0("TPCFileTemp").G();
        if (G != null) {
            for (com.tencent.mm.vfs.r6 r6Var : G) {
                r6Var.l();
            }
        }
    }
}
