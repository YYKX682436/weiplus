package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class up extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f114609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dq f114610e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up(java.lang.String str, com.tencent.mm.plugin.finder.live.plugin.dq dqVar) {
        super(0);
        this.f114609d = str;
        this.f114610e = dqVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f114609d;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "showConsumeFailDialog, errMsg".concat(str == null ? "null" : str));
        android.content.Context context = this.f114610e.f365323d.getContext();
        if (str == null || str.length() == 0) {
            str = context.getResources().getString(com.tencent.mm.R.string.ek7);
        }
        kotlin.jvm.internal.o.d(str);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.g(str);
        u1Var.n(context.getResources().getString(com.tencent.mm.R.string.dhn));
        u1Var.q(false);
        return jz5.f0.f302826a;
    }
}
