package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class xy extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f120389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.dz f120390e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy(java.lang.String str, com.tencent.mm.plugin.finder.live.widget.dz dzVar) {
        super(0);
        this.f120389d = str;
        this.f120390e = dzVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showConsumeFailDialog ");
        java.lang.String str = this.f120389d;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveVisitorGameTeamPaymentBottomPage", sb6.toString());
        android.view.View view = this.f120390e.f118169e;
        android.content.Context context = view != null ? view.getContext() : null;
        if (context != null) {
            if (str == null || str.length() == 0) {
                str = context.getResources().getString(com.tencent.mm.R.string.f491546dh5);
            }
            kotlin.jvm.internal.o.d(str);
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
            u1Var.g(str);
            u1Var.n(context.getResources().getString(com.tencent.mm.R.string.dhn));
            u1Var.q(false);
        }
        return jz5.f0.f302826a;
    }
}
