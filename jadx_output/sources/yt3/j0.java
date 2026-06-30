package yt3;

/* loaded from: classes10.dex */
public final class j0 implements l45.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt3.p0 f465504a;

    public j0(yt3.p0 p0Var) {
        this.f465504a = p0Var;
    }

    @Override // l45.m
    public boolean a(xk0.p item) {
        kotlin.jvm.internal.o.g(item, "item");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putCharSequence("PARAM_EDIT_TEXT_CONTENT", item.E);
        bundle.putInt("PARAM_EDIT_TEXT_COLOR", item.A);
        bundle.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", item.B);
        this.f465504a.f465580e.w(ju3.c0.P, bundle);
        return true;
    }

    @Override // l45.m
    public void b() {
    }

    @Override // l45.m
    public void c(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        yt3.p0 p0Var = this.f465504a;
        if (booleanValue) {
            ju3.d0.k(p0Var.f465580e, ju3.c0.V, null, 2, null);
        } else {
            ju3.d0.k(p0Var.f465580e, ju3.c0.W, null, 2, null);
        }
    }
}
