package zh1;

/* loaded from: classes8.dex */
public final class h0 implements com.tencent.mm.ui.widget.dialog.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zh1.r0 f472887a;

    public h0(zh1.r0 r0Var) {
        this.f472887a = r0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.g1
    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "onClick");
        zh1.y0 y0Var = zh1.y0.ENABLE;
        zh1.r0 r0Var = this.f472887a;
        if (y0Var != r0Var.f472935o.f472863a) {
            return;
        }
        r0Var.f472948f.u();
        zh1.v0 v0Var = r0Var.f472950h;
        if (v0Var == null) {
            zh1.a aVar = zh1.n.f472909o;
            zh1.n.f472911q = r0Var.f472946d;
            v0Var = aVar.b(r0Var.f472947e, r0Var.f472948f, r0Var.f472949g, r0Var.f472951i, r0Var.f472952m);
            r0Var.f472950h = v0Var;
        }
        v0Var.show();
    }
}
