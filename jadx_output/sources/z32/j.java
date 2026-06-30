package z32;

/* loaded from: classes12.dex */
public final class j implements com.tencent.mm.plugin.appbrand.service.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z32.s f469914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.ed6 f469915b;

    public j(z32.s sVar, r45.ed6 ed6Var) {
        this.f469914a = sVar;
        this.f469915b = ed6Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.e6
    public final void a(k91.v5 v5Var) {
        if (v5Var != null) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
            u1Var.g(this.f469914a.getActivity().getString(com.tencent.mm.R.string.k0e, v5Var.field_nickname));
            u1Var.a(true);
            u1Var.m(com.tencent.mm.R.string.f490002i4);
            u1Var.b(new z32.i(v5Var, this.f469915b));
            u1Var.q(false);
        }
    }
}
