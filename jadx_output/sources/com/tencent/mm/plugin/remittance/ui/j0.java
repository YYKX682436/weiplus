package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class j0 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.r0 f157774a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f157775b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceAdapterUI f157776c;

    public j0(com.tencent.mm.plugin.remittance.ui.RemittanceAdapterUI remittanceAdapterUI, long j17, com.tencent.mm.plugin.remittance.model.r0 r0Var, android.content.Intent intent) {
        this.f157776c = remittanceAdapterUI;
        this.f157774a = r0Var;
        this.f157775b = intent;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        if (z17) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.System.currentTimeMillis();
            ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
            com.tencent.mm.modelavatar.g.f(str, 3);
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.d1.wi().i(str);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.RemittanceAdapterUI", "getContact failed");
        }
        com.tencent.mm.plugin.remittance.ui.RemittanceAdapterUI remittanceAdapterUI = this.f157776c;
        remittanceAdapterUI.W6(remittanceAdapterUI.f157119e, this.f157774a.f156992h, this.f157775b);
    }
}
