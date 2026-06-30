package hr3;

/* loaded from: classes4.dex */
public class qi implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.WxaBindBizInfoUI f283930d;

    public qi(com.tencent.mm.plugin.profile.ui.WxaBindBizInfoUI wxaBindBizInfoUI) {
        this.f283930d = wxaBindBizInfoUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/WxaBindBizInfoUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo wxaAttributes$WxaEntryInfo = (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo) adapterView.getAdapter().getItem(i17);
        if (wxaAttributes$WxaEntryInfo == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/WxaBindBizInfoUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", wxaAttributes$WxaEntryInfo.f77429d);
        intent.putExtra("key_start_biz_profile_from_app_brand_profile", true);
        intent.putExtra("key_use_new_contact_profile", true);
        intent.putExtra("force_get_contact", true);
        j45.l.j(this.f283930d, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/WxaBindBizInfoUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
