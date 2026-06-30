package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class w4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo f154684d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
        super(0);
        this.f154684d = contactWidgetTabBizInfo;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = 0;
        int intExtra = this.f154684d.f154198d.getIntent().getIntExtra("biz_profile_tab_type", 0);
        if (intExtra <= 4 && intExtra >= 0) {
            i17 = intExtra;
        }
        return java.lang.Integer.valueOf(i17);
    }
}
