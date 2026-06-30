package hr3;

/* loaded from: classes4.dex */
public class a0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.BizBindWxaInfoUI f283370d;

    public a0(com.tencent.mm.plugin.profile.ui.BizBindWxaInfoUI bizBindWxaInfoUI) {
        this.f283370d = bizBindWxaInfoUI;
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
        yj0.a.b("com/tencent/mm/plugin/profile/ui/BizBindWxaInfoUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo wxaAttributes$WxaEntryInfo = (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo) adapterView.getAdapter().getItem(i17);
        if (wxaAttributes$WxaEntryInfo == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        appBrandStatObject.f87790f = com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_USERLIST;
        appBrandStatObject.f87791g = this.f283370d.f153651e;
        com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
        com.tencent.mm.plugin.profile.ui.BizBindWxaInfoUI bizBindWxaInfoUI = this.f283370d;
        ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).Vi(bizBindWxaInfoUI, wxaAttributes$WxaEntryInfo.f77429d, null, 0, 0, null, appBrandStatObject, bizBindWxaInfoUI.f153652f);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
