package dt;

/* loaded from: classes11.dex */
public class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.AccountExpiredEvent accountExpiredEvent = (com.tencent.mm.autogen.events.AccountExpiredEvent) iEvent;
        if (com.tencent.mm.app.w7.f53902o == 0 && gm0.j1.d().f70771n && gm0.j1.b().n() && c01.id.c() - com.tencent.mm.app.w7.f53903p > 60000) {
            android.content.Intent intent = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.ui.AccountExpiredUI.class);
            android.content.Intent putExtra = intent.addFlags(268435456).addFlags(67108864).putExtra("key_errType", accountExpiredEvent.f53963g.f6294a);
            am.c cVar = accountExpiredEvent.f53963g;
            putExtra.putExtra("key_errCode", cVar.f6295b).putExtra("key_errMsg", cVar.f6296c);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/WorkerProfile", "callbackOfAccountExpiredEvent", "(Lcom/tencent/mm/autogen/events/AccountExpiredEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/app/WorkerProfile", "callbackOfAccountExpiredEvent", "(Lcom/tencent/mm/autogen/events/AccountExpiredEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.tencent.mm.app.w7.f53903p = c01.id.c();
        }
        qk.g9 bj6 = i95.n0.c(qk.i9.class) != null ? ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).bj() : null;
        if (bj6 != null) {
            rk4.z8 z8Var = (rk4.z8) bj6;
            if (z8Var.nj()) {
                rk4.k5.e("TingServicesImpl stop play onAccountReleased", null);
                z8Var.zj();
            }
        }
        try {
            js.r0 r0Var = (js.r0) i95.n0.c(js.r0.class);
            if (r0Var != null) {
                ((is.f) r0Var).Ai(c01.z1.r());
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "clearNoPwdInfo err: %s", e17.getMessage());
        }
        try {
            wd0.j1 j1Var = (wd0.j1) i95.n0.c(wd0.j1.class);
            if (j1Var == null) {
                return true;
            }
            ((vd0.v1) j1Var).Zi(c01.z1.r());
            return true;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "resetUserInfo err: %s", e18.getMessage());
            return true;
        }
    }
}
