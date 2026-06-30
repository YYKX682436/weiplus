package eu4;

/* loaded from: classes9.dex */
public class a extends com.tencent.mm.plugin.walletlock.model.a {
    @Override // com.tencent.mm.plugin.walletlock.model.a, cu4.g
    public void d(android.app.Activity activity, int i17, int i18) {
        super.d(activity, i17, i18);
    }

    @Override // com.tencent.mm.plugin.walletlock.model.a, cu4.g
    public void e(android.app.Activity activity, cu4.f fVar, cu4.e eVar) {
    }

    @Override // com.tencent.mm.plugin.walletlock.model.a, cu4.g
    public boolean f() {
        return ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLETLOCK_FACEID_IS_OPENED_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue();
    }

    @Override // com.tencent.mm.plugin.walletlock.model.a, cu4.g
    public cu4.f i() {
        if (com.tencent.mm.plugin.walletlock.model.i.f181365a == null) {
            com.tencent.mm.plugin.walletlock.model.i.f181365a = new com.tencent.mm.plugin.walletlock.model.i();
        }
        return com.tencent.mm.plugin.walletlock.model.i.f181365a;
    }

    @Override // com.tencent.mm.plugin.walletlock.model.a, cu4.g
    public void init() {
        com.tencent.mm.plugin.walletlock.model.l lVar = com.tencent.mm.plugin.walletlock.model.l.instance;
        lVar.k(true);
        lVar.m(3);
    }

    @Override // com.tencent.mm.plugin.walletlock.model.a, cu4.g
    public boolean k(android.app.Activity activity, cu4.f fVar) {
        if (fVar != null && !((com.tencent.mm.plugin.walletlock.model.i) fVar).a(activity)) {
            return false;
        }
        com.tencent.mm.autogen.events.WalletLockProtectEvent walletLockProtectEvent = new com.tencent.mm.autogen.events.WalletLockProtectEvent();
        am.n10 n10Var = walletLockProtectEvent.f54960g;
        n10Var.f7392a = 0;
        n10Var.f7393b = activity;
        walletLockProtectEvent.e();
        if (((java.lang.Integer) walletLockProtectEvent.f54961h.f7505a).intValue() != 17) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI.class);
        intent.addFlags(131072);
        intent.putExtra("action", "action.verify_pattern");
        intent.putExtra("next_action", "next_action.goto_protected_page");
        intent.putExtra("page_intent", activity.getIntent());
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, m(activity));
        intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/walletlock/faceid/FaceIdLockImpl", "protectMeOnCreate", "(Landroid/app/Activity;Lcom/tencent/mm/plugin/walletlock/api/IWalletLock$GuardFilter;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/walletlock/faceid/FaceIdLockImpl", "protectMeOnCreate", "(Landroid/app/Activity;Lcom/tencent/mm/plugin/walletlock/api/IWalletLock$GuardFilter;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.finish();
        return true;
    }
}
