package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class ze implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.he f212619d;

    public ze(com.tencent.mm.ui.he heVar) {
        this.f212619d = heVar;
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_ORDER_CENTER_TAB_ME_REDDOT_LONG_SYNC;
        com.tencent.mm.ui.he heVar = this.f212619d;
        if (obj == u3Var) {
            heVar.b();
            return;
        }
        int o17 = com.tencent.mm.sdk.platformtools.t8.o1(obj, 0);
        if (a1Var != c01.d9.b().p() || o17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LauncherUI.MainTabUnreadMgr", "onNotifyChange error obj:%d stg:%s", java.lang.Integer.valueOf(o17), a1Var);
            return;
        }
        heVar.getClass();
        nm.j.f338443g.a(new com.tencent.mm.ui.we(heVar));
        if (o17 == 143618) {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.pe(heVar));
        } else if (o17 == 204817 || o17 == 204820) {
            heVar.b();
        }
    }
}
