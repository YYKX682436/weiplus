package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class g5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo f154333d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
        super(0);
        this.f154333d = contactWidgetTabBizInfo;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f154333d.f154198d.getIntent().getBooleanExtra("biz_profile_trace_report", false));
    }
}
