package ze5;

/* loaded from: classes9.dex */
public final class r3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472179d;

    public r3(com.tencent.mm.storage.f9 f9Var) {
        this.f472179d = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pt0.e0 e0Var = pt0.f0.f358209b1;
        com.tencent.mm.storage.f9 f9Var = this.f472179d;
        com.tencent.mm.storage.f9 n17 = e0Var.n(f9Var.Q0(), f9Var.getMsgId());
        i95.m c17 = i95.n0.c(pt.g0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        pt.g0.Xb((pt.g0) c17, n17, null, 2, false, 8, null);
        ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).getClass();
        ut.b.f430592f.a().V6(f9Var, 7, false);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var.getMsgId(), n17, true);
    }
}
