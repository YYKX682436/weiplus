package tv0;

/* loaded from: classes5.dex */
public final class h extends tv0.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tv0.j0 f422194a;

    public h(tv0.j0 j0Var) {
        this.f422194a = j0Var;
    }

    @Override // bv0.a
    public void a(float f17, float f18) {
        tv0.j0 j0Var = this.f422194a;
        if (j0Var.X6()) {
            android.view.ViewGroup w76 = j0Var.w7();
            w76.setTranslationX(w76.getTranslationX() - f17);
            android.view.ViewGroup w77 = j0Var.w7();
            w77.setTranslationY(w77.getTranslationY() - f18);
            j0Var.z7();
        }
    }

    @Override // bv0.a
    public void b() {
        tv0.j0 j0Var = this.f422194a;
        if (j0Var.X6()) {
            if (j0Var.w7().getScaleX() <= j0Var.B || j0Var.w7().getScaleY() <= j0Var.B) {
                j0Var.y7();
            } else {
                j0Var.k7();
            }
        }
    }

    @Override // bv0.a
    public void c(float f17, float f18, boolean z17) {
        tv0.j0 j0Var = this.f422194a;
        if (j0Var.X6()) {
            float scaleX = j0Var.w7().getScaleX() * f17;
            if (scaleX > 5.0f) {
                scaleX = 5.0f;
            }
            if (scaleX < 0.2f) {
                scaleX = 0.2f;
            }
            j0Var.w7().setScaleX(scaleX);
            j0Var.w7().setScaleY(scaleX);
            j0Var.z7();
        }
    }

    @Override // bv0.a
    public boolean onDown(float f17, float f18) {
        tv0.d dVar = (tv0.d) this.f422194a.f69240i;
        return dVar != null && dVar.isShown();
    }
}
