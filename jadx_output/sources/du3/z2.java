package du3;

/* loaded from: classes3.dex */
public final class z2 implements l45.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ du3.t3 f243779a;

    public z2(du3.t3 t3Var) {
        this.f243779a = t3Var;
    }

    @Override // l45.m
    public boolean a(xk0.p item) {
        kotlin.jvm.internal.o.g(item, "item");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putCharSequence("PARAM_EDIT_TEXT_CONTENT", item.E);
        bundle.putInt("PARAM_EDIT_TEXT_COLOR", item.A);
        bundle.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", item.B);
        this.f243779a.f465332d.w(ju3.c0.P, bundle);
        return true;
    }

    @Override // l45.m
    public void b() {
    }

    @Override // l45.m
    public void c(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        du3.t3 t3Var = this.f243779a;
        if (booleanValue) {
            t3Var.E().h7(1, false);
            return;
        }
        t3Var.E().h7(1, true);
        hk0.o oVar = t3Var.E().f281821o;
        if ((oVar != null ? oVar.f281782a : 0) == 1) {
            t3Var.E().b7(t3Var.E().T6());
            return;
        }
        hk0.o oVar2 = t3Var.E().f281821o;
        if ((oVar2 != null ? oVar2.f281782a : 0) == 5) {
            t3Var.E().g7(t3Var.E().S6(), false);
        }
    }
}
