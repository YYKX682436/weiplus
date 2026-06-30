package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes.dex */
public final class y0 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f181004a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f181005b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f181006c;

    public y0(boolean z17, yz5.l lVar, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f181004a = z17;
        this.f181005b = lVar;
        this.f181006c = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        boolean z17 = this.f181004a;
        boolean z18 = !z17;
        long i17 = c01.z1.i();
        long j17 = z18 ? i17 & (-2199023255553L) : i17 | 2199023255552L;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletHelper", "setExtStatus2FlagFromUserInfo enable:" + z18);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(j17));
        r45.p53 p53Var = new r45.p53();
        p53Var.f382761d = 101;
        p53Var.f382762e = z18 ? 2 : 1;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        this.f181005b.invoke(java.lang.Boolean.valueOf(!z17));
        this.f181006c.B();
    }
}
