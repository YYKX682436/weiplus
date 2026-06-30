package com.tencent.mm.plugin.walletlock.model;

/* loaded from: classes9.dex */
public class g extends com.tencent.mm.sdk.event.n {
    public g() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.StartWalletLockUIEvent startWalletLockUIEvent = (com.tencent.mm.autogen.events.StartWalletLockUIEvent) iEvent;
        if (startWalletLockUIEvent != null) {
            am.rx rxVar = startWalletLockUIEvent.f54861g;
            android.content.Intent intent = rxVar.f7851b;
            int intExtra = intent.getIntExtra("key_wallet_lock_type", -1);
            android.app.Activity activity = rxVar.f7850a;
            am.sx sxVar = startWalletLockUIEvent.f54862h;
            if (activity != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.StartWalletLockUIListener", "startWalletLockUI type: %d", java.lang.Integer.valueOf(intExtra));
                if (intExtra == 2) {
                    intent.setClass(rxVar.f7850a, com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI.class);
                } else if (intExtra == 1) {
                    intent.setClass(rxVar.f7850a, com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI.class);
                }
                android.app.Activity activity2 = rxVar.f7850a;
                int i17 = rxVar.f7852c;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.k(activity2, arrayList.toArray(), "com/tencent/mm/plugin/walletlock/model/StartWalletLockUIListener", "callback", "(Lcom/tencent/mm/autogen/events/StartWalletLockUIEvent;)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                sxVar.f7944a = true;
            } else {
                sxVar.f7944a = false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.StartWalletLockUIListener", "isSuccess: %b", java.lang.Boolean.valueOf(sxVar.f7944a));
        }
        return false;
    }
}
