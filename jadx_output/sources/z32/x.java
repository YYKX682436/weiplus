package z32;

/* loaded from: classes12.dex */
public final class x implements com.tencent.mm.plugin.appbrand.service.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z32.a0 f469952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.ed6 f469953b;

    public x(z32.a0 a0Var, r45.ed6 ed6Var) {
        this.f469952a = a0Var;
        this.f469953b = ed6Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.e6
    public final void a(k91.v5 v5Var) {
        if (v5Var != null) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
            u1Var.g(this.f469952a.getActivity().getString(com.tencent.mm.R.string.k0e, v5Var.field_nickname));
            u1Var.a(true);
            u1Var.m(com.tencent.mm.R.string.f490002i4);
            u1Var.b(new z32.w(v5Var, this.f469953b));
            u1Var.q(false);
        }
    }
}
