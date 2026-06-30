package hr3;

/* loaded from: classes4.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.BizBindWxaInfoPreference f284164d;

    public x(com.tencent.mm.plugin.profile.ui.BizBindWxaInfoPreference bizBindWxaInfoPreference) {
        this.f284164d = bizBindWxaInfoPreference;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag();
        if (tag == null || !(tag instanceof java.lang.String)) {
            yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        appBrandStatObject.f87790f = com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_USERLIST;
        com.tencent.mm.plugin.profile.ui.BizBindWxaInfoPreference bizBindWxaInfoPreference = this.f284164d;
        appBrandStatObject.f87791g = bizBindWxaInfoPreference.P.field_username;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).Vi(bizBindWxaInfoPreference.f197770d, (java.lang.String) tag, null, 0, 0, null, appBrandStatObject, bizBindWxaInfoPreference.P.field_appId);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
