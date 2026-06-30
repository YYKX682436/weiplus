package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class tn implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f136046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.rn f136047e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.eo f136048f;

    public tn(java.util.LinkedList linkedList, com.tencent.mm.plugin.finder.viewmodel.component.rn rnVar, com.tencent.mm.plugin.finder.viewmodel.component.eo eoVar) {
        this.f136046d = linkedList;
        this.f136047e = rnVar;
        this.f136048f = eoVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        java.lang.String str;
        r45.y94 y94Var = (r45.y94) kz5.n0.a0(this.f136046d, i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select encash, index:");
        sb6.append(i17);
        sb6.append(", bizEncashItem:");
        sb6.append(y94Var != null ? java.lang.Integer.valueOf(y94Var.getInteger(0)) : null);
        sb6.append(", ");
        sb6.append(y94Var != null ? y94Var.getString(1) : null);
        sb6.append(", encash_intercept_jump_info:");
        sb6.append(y94Var != null ? (com.tencent.mm.protocal.protobuf.FinderJumpInfo) y94Var.getCustom(4) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveIncomeListUIC", sb6.toString());
        boolean z17 = y94Var != null && y94Var.getInteger(0) == 1;
        com.tencent.mm.plugin.finder.viewmodel.component.rn rnVar = this.f136047e;
        if (z17) {
            finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) y94Var.getCustom(4);
            if (finderJumpInfo == null) {
                finderJumpInfo = rnVar.f135816m;
            }
        } else {
            finderJumpInfo = y94Var != null ? (com.tencent.mm.protocal.protobuf.FinderJumpInfo) y94Var.getCustom(4) : null;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.eo eoVar = this.f136048f;
        if (com.tencent.mm.plugin.finder.viewmodel.component.eo.S6(eoVar, rnVar)) {
            com.tencent.mm.plugin.finder.viewmodel.component.eo.Q6(eoVar, rnVar);
            return;
        }
        if (com.tencent.mm.plugin.finder.viewmodel.component.eo.R6(eoVar, rnVar)) {
            com.tencent.mm.plugin.finder.viewmodel.component.eo.P6(eoVar, rnVar);
            return;
        }
        js4.i iVar = (js4.i) gm0.j1.s(js4.i.class);
        android.app.Activity context = eoVar.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
        js4.q qVar = new js4.q();
        qVar.f301556a = rnVar.f135810d.getInteger(1);
        qVar.f301557b = y94Var != null ? y94Var.getLong(2) : 0L;
        qVar.f301558c = rnVar.f135812f;
        qVar.f301559d = rnVar.f135813g;
        qVar.f301560e = finderJumpInfo;
        qVar.f301561f = rnVar.f135817n;
        qVar.f301562g = y94Var != null ? y94Var.getInteger(0) : 0;
        qVar.f301563h = y94Var != null ? y94Var.getString(1) : null;
        if (y94Var == null || (str = y94Var.getString(3)) == null) {
            str = "";
        }
        qVar.f301564i = str;
        ((ms4.z) iVar).g(mMActivity, qVar, new java.lang.ref.WeakReference(eoVar));
    }
}
