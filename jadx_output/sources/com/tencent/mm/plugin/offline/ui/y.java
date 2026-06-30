package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class y extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f152763d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView, android.view.View view) {
        super(false);
        this.f152763d = view;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("wallet_lock_jsapi_scene", 2);
        if (com.tencent.mm.wallet_core.b.a().e()) {
            ((h45.q) i95.n0.c(h45.q.class)).startPaySecurityUseCase(2, null);
        } else {
            j45.l.j(this.f152763d.getContext(), "wallet", ".pwd.ui.WalletSecuritySettingUI", intent, null);
        }
    }
}
