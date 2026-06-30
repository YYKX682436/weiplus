package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes10.dex */
public final class i6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo f154364d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
        super(0);
        this.f154364d = contactWidgetTabBizInfo;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.os.Bundle bundleExtra = this.f154364d.f154198d.getIntent().getBundleExtra("Contact_Ext_Args");
        if (bundleExtra != null) {
            return bundleExtra.getString("Contact_Ext_Args_Search_Click_Id", "");
        }
        return null;
    }
}
