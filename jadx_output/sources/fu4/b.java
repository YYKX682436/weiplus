package fu4;

/* loaded from: classes9.dex */
public class b extends com.tencent.mm.plugin.walletlock.model.a {
    @Override // com.tencent.mm.plugin.walletlock.model.a, cu4.g
    public void c(android.app.Activity activity, int i17) {
    }

    @Override // com.tencent.mm.plugin.walletlock.model.a, cu4.g
    public void d(android.app.Activity activity, int i17, int i18) {
        if (i17 != 2) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("action", "action.verify_paypwd");
        intent.putExtra("next_action", "next_action.switch_on_pattern");
        intent.putExtra("key_wallet_lock_type", 2);
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintLockImpl", "enterNewWalletLockProcessForResult start check pwd ui, wallet lock type: %d", java.lang.Integer.valueOf(i17));
        j45.l.n(activity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", intent, i18);
    }

    @Override // com.tencent.mm.plugin.walletlock.model.a, cu4.g
    public void e(android.app.Activity activity, cu4.f fVar, cu4.e eVar) {
        com.tencent.mm.autogen.events.WalletLockProtectEvent walletLockProtectEvent = new com.tencent.mm.autogen.events.WalletLockProtectEvent();
        am.n10 n10Var = walletLockProtectEvent.f54960g;
        n10Var.f7392a = 1;
        n10Var.f7393b = activity;
        walletLockProtectEvent.e();
        int intValue = ((java.lang.Integer) walletLockProtectEvent.f54961h.f7505a).intValue();
        if (intValue != 17) {
            if (intValue == 18 && eVar != null) {
                eVar.a();
                return;
            }
            return;
        }
        if (fVar == null || ((com.tencent.mm.plugin.walletlock.model.i) fVar).a(activity)) {
            if (eVar != null) {
                eVar.b();
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
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/walletlock/fingerprint/model/FingerprintLockImpl", "protectMeOnResume", "(Landroid/app/Activity;Lcom/tencent/mm/plugin/walletlock/api/IWalletLock$GuardFilter;Lcom/tencent/mm/plugin/walletlock/api/IWalletLock$GestureGuardCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/walletlock/fingerprint/model/FingerprintLockImpl", "protectMeOnResume", "(Landroid/app/Activity;Lcom/tencent/mm/plugin/walletlock/api/IWalletLock$GuardFilter;Lcom/tencent/mm/plugin/walletlock/api/IWalletLock$GestureGuardCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // com.tencent.mm.plugin.walletlock.model.a, cu4.g
    public boolean f() {
        return com.tencent.mm.plugin.walletlock.model.l.instance.i();
    }

    @Override // com.tencent.mm.plugin.walletlock.model.a, cu4.g
    public void g(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.plugin.walletlock.model.a, cu4.g
    public void h(android.app.Activity activity, int i17) {
        if (i17 != 2) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("action", "action.verify_paypwd");
        intent.putExtra("next_action", "next_action.switch_on_pattern");
        intent.putExtra("key_wallet_lock_type", 2);
        j45.l.j(activity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", intent, null);
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
        lVar.l(true);
        lVar.m(2);
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
        if (((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).Ai()) {
            ((h45.q) i95.n0.c(h45.q.class)).startTouchLockUseCase(activity.getIntent(), true, new h45.i() { // from class: fu4.b$$a
                @Override // h45.i
                public final void onKindaBusinessCallback(android.content.Intent intent) {
                    fu4.b bVar = fu4.b.this;
                    bVar.getClass();
                    ((ku5.t0) ku5.t0.f312615d).B(new fu4.c(bVar, intent));
                }
            });
            if (!((h45.q) i95.n0.c(h45.q.class)).isKindaActivity(activity)) {
                activity.finish();
            }
        } else {
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
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/walletlock/fingerprint/model/FingerprintLockImpl", "protectMeOnCreate", "(Landroid/app/Activity;Lcom/tencent/mm/plugin/walletlock/api/IWalletLock$GuardFilter;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/walletlock/fingerprint/model/FingerprintLockImpl", "protectMeOnCreate", "(Landroid/app/Activity;Lcom/tencent/mm/plugin/walletlock/api/IWalletLock$GuardFilter;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.finish();
        }
        return true;
    }
}
