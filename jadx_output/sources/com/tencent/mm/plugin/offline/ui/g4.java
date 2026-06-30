package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes4.dex */
public final class g4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.h4 f152628d;

    public g4(com.tencent.mm.plugin.offline.ui.h4 h4Var) {
        this.f152628d = h4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/offline/ui/WalletOfflineEnableUIC$showEnableTokenAlert$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.offline.ui.h4 h4Var = this.f152628d;
        h4Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineEnableUIC", "goto pwd ui");
        android.content.Intent intent = new android.content.Intent(h4Var.getActivity(), (java.lang.Class<?>) com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdNewUI.class);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 4);
        h4Var.getActivity().startActivityForResult(intent, 256);
        yj0.a.h(this, "com/tencent/mm/plugin/offline/ui/WalletOfflineEnableUIC$showEnableTokenAlert$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
