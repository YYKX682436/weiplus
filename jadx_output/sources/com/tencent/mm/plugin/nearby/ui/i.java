package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes11.dex */
public class i extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f152144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.z9 f152145b;

    public i(boolean z17, com.tencent.mm.ui.z9 z9Var) {
        this.f152144a = z17;
        this.f152145b = z9Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int n17 = c01.z1.n();
        boolean z17 = this.f152144a;
        int i17 = z17 ? n17 & (-513) : n17 | 512;
        gm0.j1.u().c().w(34, java.lang.Integer.valueOf(i17));
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new e21.t(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", i17, "", 0, "", 0));
        if (!z17) {
            gm0.j1.b().c();
            com.tencent.mm.storage.u8 u8Var = (com.tencent.mm.storage.u8) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi();
            u8Var.f196265d.delete(u8Var.getTableName(), null, null);
            gm0.j1.d().g(new an3.f(2, 0.0f, 0.0f, 0, 0, "", ""));
        }
        com.tencent.mm.ui.z9 z9Var = this.f152145b;
        if (z9Var != null) {
            z9Var.onNotifyChange(null, null);
        }
    }
}
