package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
final class FinderFollowListContract$FollowListViewCallback$showPopupMenu$1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f122639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListViewCallback f122640e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.v1 f122641f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFollowListContract$FollowListViewCallback$showPopupMenu$1(ya2.b2 b2Var, com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListViewCallback followListViewCallback, so2.v1 v1Var) {
        super(0);
        this.f122639d = b2Var;
        this.f122640e = followListViewCallback;
        this.f122641f = v1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList list;
        java.lang.Object obj;
        r45.fw0 fw0Var;
        java.util.LinkedList list2;
        r45.xk xkVar;
        ya2.b2 b2Var = this.f122639d;
        int i17 = b2Var.K2 & 4;
        so2.v1 v1Var = this.f122641f;
        com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract.FollowListViewCallback followListViewCallback = this.f122640e;
        if (i17 > 0) {
            rv.v2 v2Var = (rv.v2) i95.n0.c(rv.v2.class);
            r45.xk b17 = ya2.d.b(b2Var, false);
            java.lang.String string = b17 != null ? b17.getString(0) : null;
            ((qv.q) v2Var).getClass();
            qk.o b18 = r01.z.b(string);
            rv.m2 m2Var = (rv.m2) i95.n0.c(rv.m2.class);
            com.tencent.mm.ui.MMActivity mMActivity = followListViewCallback.f122620d;
            com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
            r45.aw0 aw0Var = b2Var.field_bindInfoList;
            if (aw0Var != null && (list = aw0Var.getList(0)) != null) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((r45.zv0) obj).getInteger(0) == 1) {
                        break;
                    }
                }
                r45.zv0 zv0Var = (r45.zv0) obj;
                if (zv0Var != null && (fw0Var = (r45.fw0) zv0Var.getCustom(1)) != null && (list2 = fw0Var.getList(0)) != null && (xkVar = (r45.xk) kz5.n0.Z(list2)) != null) {
                    z3Var.M1(xkVar.getString(1));
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    java.lang.String string2 = xkVar.getString(1);
                    ((ke0.e) xVar).getClass();
                    z3Var.J2 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, string2);
                    z3Var.X1(xkVar.getString(0));
                }
            }
            ((qv.e) m2Var).wi(b18, mMActivity, z3Var, false);
            followListViewCallback.f122622f.f122603g.remove(v1Var);
            followListViewCallback.o(false, -1, -1);
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_FOLLOW_COUNT_INT_SYNC;
            int r17 = c17.r(u3Var, 0);
            com.tencent.mars.xlog.Log.i(followListViewCallback.f122623g, "oldFollowCnt %d", java.lang.Integer.valueOf(r17));
            if (r17 > 0) {
                gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 - 1));
            }
        } else {
            com.tencent.mm.ui.MMActivity activity = followListViewCallback.f122620d;
            kotlin.jvm.internal.o.g(activity, "activity");
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            V6.set(7, 12);
            so2.z1 z1Var = so2.z1.f410730a;
            java.lang.String D0 = b2Var.D0();
            v1Var.getClass();
            so2.z1.c(z1Var, V6, D0, 2, 0L, null, false, 0, null, null, 0L, 992, null);
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(followListViewCallback.f122620d);
        lVarArr[0] = new jz5.l("behaviour_session_id", e17 != null ? e17.f135385q : null);
        com.tencent.mm.ui.MMActivity mMActivity2 = followListViewCallback.f122620d;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(mMActivity2);
        lVarArr[1] = new jz5.l("finder_context_id", e18 != null ? e18.f135382p : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(mMActivity2);
        lVarArr[2] = new jz5.l("finder_tab_context_id", e19 != null ? e19.f135386r : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e27 = iyVar.e(mMActivity2);
        lVarArr[3] = new jz5.l("comment_scene", e27 != null ? java.lang.Integer.valueOf(e27.f135380n) : null);
        ((cy1.a) rVar).Cj("un_follow_click", null, kz5.c1.k(lVarArr), 24617);
        ((nv2.v) ((nv2.g0) i95.n0.c(nv2.g0.class))).Ai(1, b2Var.D0(), true);
        if (followListViewCallback.f122625i) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20911, 3, b2Var.D0(), b2Var.w0());
        }
        return jz5.f0.f302826a;
    }
}
