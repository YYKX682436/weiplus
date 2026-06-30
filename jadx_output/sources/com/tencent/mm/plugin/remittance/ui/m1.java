package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class m1 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI f157816a;

    public m1(com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI, long j17) {
        this.f157816a = remittanceBaseUI;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        if (z17) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.System.currentTimeMillis();
            ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
            com.tencent.mm.modelavatar.g.f(str, 3);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.RemittanceBaseUI", "getContact failed");
        }
        int i17 = com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.I1;
        this.f157816a.j7();
    }
}
