package nf2;

/* loaded from: classes10.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f336802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nf2.d1 f336803e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(boolean z17, nf2.d1 d1Var) {
        super(0);
        this.f336802d = z17;
        this.f336803e = d1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f336802d;
        if (z17) {
            nf2.d1 d1Var = this.f336803e;
            jz5.l lVar = d1Var.D;
            if (lVar == null) {
                lVar = new jz5.l(java.lang.Float.valueOf(d1Var.f336682c.f336724f), java.lang.Float.valueOf(d1Var.f336682c.f336725g));
            }
            nf2.g0 g0Var = d1Var.B;
            if (g0Var != null) {
                nf2.g0.e(g0Var, ((java.lang.Number) lVar.f302833d).floatValue(), ((java.lang.Number) lVar.f302834e).floatValue(), false, null, 12, null);
            }
        }
        com.tencent.mars.xlog.Log.i("FinderLiveLyricsView", "setupPosition: positionManager ready, setInitialPosition=" + z17);
        return jz5.f0.f302826a;
    }
}
