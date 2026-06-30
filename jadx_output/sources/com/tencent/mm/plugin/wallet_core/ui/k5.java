package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes11.dex */
public class k5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f180373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f180374e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f180375f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f180376g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f180377h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f180378i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI f180379m;

    public k5(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.String str5) {
        this.f180379m = walletOrderInfoNewUI;
        this.f180373d = str;
        this.f180374e = str2;
        this.f180375f = str3;
        this.f180376g = str4;
        this.f180377h = i17;
        this.f180378i = str5;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "leadViewInfo click jump status");
        pj4.q qVar = new pj4.q();
        qVar.f355255d = this.f180373d;
        qVar.f355256e = this.f180374e;
        bi4.n1 n1Var = new bi4.n1(null);
        n1Var.f354962d = this.f180375f;
        n1Var.f354963e = qVar;
        n1Var.f354970o = java.lang.String.valueOf(8);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI = this.f180379m;
        g0Var.d(24498, 1, walletOrderInfoNewUI.f180032p);
        ((com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService) ((xe0.g0) i95.n0.c(xe0.g0.class))).Ui(walletOrderInfoNewUI.getContext(), n1Var, new com.tencent.mm.plugin.wallet_core.ui.j5(this));
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
