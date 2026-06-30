package sc2;

/* loaded from: classes2.dex */
public final class b0 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f405773d;

    public b0(sc2.h1 h1Var) {
        this.f405773d = h1Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        if (i17 == i28 && i19 == i37) {
            return;
        }
        sc2.h1.G(this.f405773d);
    }
}
