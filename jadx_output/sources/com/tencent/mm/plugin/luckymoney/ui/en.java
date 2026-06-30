package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public class en implements ym5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.co f146884a;

    public en(com.tencent.mm.plugin.luckymoney.ui.co coVar) {
        this.f146884a = coVar;
    }

    @Override // ym5.v1
    public void onFlush() {
        com.tencent.mm.plugin.luckymoney.ui.co coVar = this.f146884a;
        if (coVar.f146817p || !coVar.f146814m.f()) {
            return;
        }
        coVar.f146814m.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.dn(this), 100L);
        coVar.f146817p = true;
    }
}
