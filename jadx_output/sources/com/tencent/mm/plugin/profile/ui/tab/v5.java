package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public final class v5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo f154625d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
        super(0);
        this.f154625d = contactWidgetTabBizInfo;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo = this.f154625d;
        int i17 = contactWidgetTabBizInfo.f154208p;
        com.tencent.mm.storage.z3 z3Var = contactWidgetTabBizInfo.f154206n;
        java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
        if (d17 == null) {
            d17 = "";
        }
        com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher bizProfileDataFetcher = new com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher(i17, d17, contactWidgetTabBizInfo.f154198d, contactWidgetTabBizInfo.d(), contactWidgetTabBizInfo.f154203i.a());
        bizProfileDataFetcher.D = contactWidgetTabBizInfo.f() ? 1 : 0;
        bizProfileDataFetcher.E = contactWidgetTabBizInfo.f154202h;
        return bizProfileDataFetcher;
    }
}
