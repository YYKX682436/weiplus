package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.l f180579d;

    public q(com.tencent.mm.plugin.wallet_core.ui.l lVar) {
        this.f180579d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet_core.ui.l lVar = this.f180579d;
        android.app.Dialog dialog = lVar.f180389i;
        if (dialog != null && dialog.isShowing()) {
            lVar.f180389i.dismiss();
            lVar.f180389i = null;
        }
        if (lVar.f180385e.r2()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "!contact.isContact() close page");
        java.lang.String d17 = lVar.f180385e.d1();
        c01.w9.h(d17, new com.tencent.mm.plugin.wallet_core.ui.p(this, d17));
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        com.tencent.mm.modelsimple.g1.I(d17, 15);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().k(d17);
        ((qv.i) ((rv.q2) i95.n0.c(rv.q2.class))).getClass();
        r01.q3.hj().y0(d17);
        ((qv.i) ((rv.q2) i95.n0.c(rv.q2.class))).getClass();
        r01.q3.nj().D0(d17);
        ((qv.i) ((rv.q2) i95.n0.c(rv.q2.class))).getClass();
        r01.q3.oj().z0(d17);
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.ui.LauncherUI"));
        intent.addFlags(67108864);
        android.app.Activity activity = (android.app.Activity) lVar.f180384d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ContactWidgetWxPayHKNotify$4", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/wallet_core/ui/ContactWidgetWxPayHKNotify$4", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
