package com.tencent.mm.plugin.finder.view;

/* loaded from: classes.dex */
public final class ok implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderSnsHeaderView f132795d;

    public ok(int i17, com.tencent.mm.plugin.finder.view.FinderSnsHeaderView finderSnsHeaderView, int i18) {
        this.f132795d = finderSnsHeaderView;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.finder.view.FinderSnsHeaderView finderSnsHeaderView = this.f132795d;
        g4Var.d(1, finderSnsHeaderView.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac), finderSnsHeaderView.getContext().getString(com.tencent.mm.R.string.f490353sl));
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_SNS_LIVE_LIST_SETTING_ENABLE_INT_SYNC, 0);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        if (((java.lang.Integer) m17).intValue() == 1) {
            g4Var.a(2, com.tencent.mm.R.string.f5k);
        }
    }
}
