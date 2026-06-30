package com.tencent.mm.ui.chatting.component.appbrand;

/* loaded from: classes9.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.appbrand.f f198665d;

    public b(com.tencent.mm.ui.chatting.component.appbrand.f fVar) {
        this.f198665d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/appbrand/AppBrandServiceComponent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceComponent", "MMTitleGotoBtn onClick");
        com.tencent.mm.ui.chatting.component.appbrand.f fVar = this.f198665d;
        android.app.Activity g17 = fVar.f198685d.g();
        com.tencent.mm.plugin.appbrand.config.WxaExposedParams wxaExposedParams = fVar.f198672g;
        fVar.getClass();
        if (g17 == null || wxaExposedParams == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandServiceComponent", "activity or exportUrlParams is null");
        } else if (7 == fVar.f198671f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceComponent", "goToAppBrandProfileUI, from profile");
            g17.finish();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceComponent", "exportUrlParams : %s", wxaExposedParams.toString());
            java.lang.String str = wxaExposedParams.f77481g;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_username", str);
                intent.putExtra("key_from_scene", 8);
                intent.putExtra("key_scene_exposed_params", wxaExposedParams);
                j45.l.j(g17, "appbrand", ".ui.AppBrandProfileUI", intent, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/appbrand/AppBrandServiceComponent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
