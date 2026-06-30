package gx0;

/* loaded from: classes5.dex */
public final class k1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.r1 f276606d;

    public k1(gx0.r1 r1Var) {
        this.f276606d = r1Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        au0.c cVar;
        gx0.r1 r1Var = this.f276606d;
        if (r1Var.q7().isPlaying() || (cVar = r1Var.f285472q) == null || !cVar.isEnable()) {
            return;
        }
        ((gx0.x4) r1Var.T6(gx0.x4.class)).n7(cVar.c(), false, false);
    }
}
