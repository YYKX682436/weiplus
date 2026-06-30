package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class y4 implements ul5.j {

    /* renamed from: d, reason: collision with root package name */
    public int f174447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity f174448e;

    public y4(com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity textStatusCardFeedsActivity) {
        this.f174448e = textStatusCardFeedsActivity;
    }

    @Override // ul5.j
    public void c(int i17) {
        if (i17 != 0 && this.f174447d == 0 && i17 > 0) {
            in5.s0 Q6 = ((com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC) this.f174448e.component(com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC.class)).Q6();
            java.lang.Object obj = Q6 != null ? Q6.f293124h : null;
            bi4.n0 n0Var = obj instanceof bi4.n0 ? (bi4.n0) obj : null;
            if (n0Var != null) {
                n0Var.v3(false);
            }
        }
        this.f174447d = i17;
    }

    @Override // ul5.j
    public void w(int i17) {
    }
}
