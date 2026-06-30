package nf2;

/* loaded from: classes10.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.d1 f336784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nf2.g0 f336785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f336786f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(nf2.d1 d1Var, nf2.g0 g0Var, boolean z17) {
        super(0);
        this.f336784d = d1Var;
        this.f336785e = g0Var;
        this.f336786f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nf2.d1 d1Var = this.f336784d;
        nf2.d0 d0Var = new nf2.d0(d1Var, this.f336785e, d1Var.f336682c);
        d0Var.f336677l = d1Var.H;
        d0Var.f336678m = d1Var.f336679J;
        android.view.View view = ((nf2.d1) d0Var.f336666a).f336685f;
        boolean z17 = this.f336786f;
        if (view != null) {
            android.view.ViewParent parent = view.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.post(new nf2.a0(d0Var, z17, view));
            }
        }
        d1Var.C = d0Var;
        com.tencent.mars.xlog.Log.i("FinderLiveLyricsView", "setupGesture: initialized, alignmentTriggerWidth=" + d1Var.F + ", setInitialPosition=" + z17);
        return jz5.f0.f302826a;
    }
}
