package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes10.dex */
public final class w5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo f154685d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
        super(0);
        this.f154685d = contactWidgetTabBizInfo;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f154685d.f154198d.getIntent().getStringExtra("biz_profile_trace_report_parent");
    }
}
