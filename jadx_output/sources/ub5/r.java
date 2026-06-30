package ub5;

/* loaded from: classes8.dex */
public final class r implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ub5.k f426244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f426245e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.wp f426246f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426247g;

    public r(ub5.k kVar, java.util.List list, com.tencent.mm.ui.chatting.component.wp wpVar, java.lang.String str) {
        this.f426244d = kVar;
        this.f426245e = list;
        this.f426246f = wpVar;
        this.f426247g = str;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        xj.m mVar;
        gm0.b bVar;
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope;
        int itemId = menuItem.getItemId();
        java.util.List list = this.f426245e;
        ub5.k kVar = this.f426244d;
        if (itemId == 1) {
            ub5.u.a(kVar, list);
            return;
        }
        if (itemId != 2) {
            return;
        }
        ub5.u uVar = ub5.u.f426254a;
        com.tencent.mm.ui.chatting.component.wp wpVar = this.f426246f;
        if (wpVar != null && (bVar = gm0.j1.b().f273245h) != null && (lifecycleScope = bVar.f273145e) != null) {
            v65.i.b(lifecycleScope, null, new com.tencent.mm.ui.chatting.component.up(wpVar, null), 1, null);
        }
        ct.k3 k3Var = (ct.k3) i95.n0.c(ct.k3.class);
        jz5.l lVar = new jz5.l("share_type", 12);
        jz5.l lVar2 = new jz5.l("selected_how_many_msgs_to_forward", java.lang.Integer.valueOf(list.size()));
        com.tencent.mm.ui.chatting.component.d6 d6Var = (com.tencent.mm.ui.chatting.component.d6) kVar;
        jz5.l lVar3 = new jz5.l("chat_username", d6Var.f198925a.f198580d.x());
        java.lang.String str = this.f426247g;
        jz5.l lVar4 = new jz5.l("share_session_id", str);
        tb5.h0 h0Var = tb5.h0.f417053d;
        jz5.l lVar5 = new jz5.l("selected_msg_list", kz5.n0.g0(list, "#", null, null, 0, null, h0Var, 30, null));
        com.tencent.mm.ui.chatting.component.b5 b5Var = d6Var.f198925a;
        qg5.e3 e3Var = (qg5.e3) k3Var;
        java.util.Map l17 = kz5.c1.l(lVar, lVar2, lVar3, lVar4, lVar5, new jz5.l("enter_source", java.lang.Integer.valueOf(e3Var.aj(b5Var.f198580d.x()))));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("bottom_options_controls", "view_clk", kz5.c1.k(new jz5.l("click_btn_name", "more_yuanbao"), new jz5.l("selected_msg_list", kz5.n0.g0(list, "#", null, null, 0, null, h0Var, 30, null)), new jz5.l("selected_how_many_msgs_to_forward", java.lang.Integer.valueOf(list.size())), new jz5.l("share_session_id", str), new jz5.l("chat_username", b5Var.f198580d.x())), 35480);
        e3Var.qj("journey_copy", str);
        e3Var.sj("journey_copy", l17);
        ct.j3 j3Var = (ct.j3) i95.n0.c(ct.j3.class);
        kotlin.jvm.internal.o.d(j3Var);
        android.app.Activity uiCtx = b5Var.f198580d.g();
        com.tencent.mm.storage.z3 z3Var = b5Var.f198697h;
        if (wpVar != null) {
            mVar = wpVar.f200189b;
            if (mVar == null) {
                mVar = wpVar.f200190c;
            }
        } else {
            mVar = null;
        }
        ub5.p pVar = new ub5.p(d6Var);
        qg5.z2 z2Var = (qg5.z2) j3Var;
        kotlin.jvm.internal.o.g(uiCtx, "uiCtx");
        if (mVar == null) {
            ((wj.j0) z2Var.Zi()).Vi(wj.t0.f446513v, 2000L, new qg5.w2(z2Var, uiCtx, list, z3Var, true, true, pVar));
        } else {
            if (!jm0.g.class.isAssignableFrom(qg5.u3.class)) {
                throw new java.lang.IllegalArgumentException(qg5.z2.class.getName().concat(" must extends FeatureServiceComponent"));
            }
            androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(z2Var.getViewModel(), new jm0.e(z2Var)).a(qg5.u3.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ((qg5.u3) ((jm0.g) a17)).V6(uiCtx, list, z3Var, mVar, true, true, pVar);
        }
    }
}
