package w25;

/* loaded from: classes.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.location.LocationView f442652d;

    public l(com.tencent.mm.pluginsdk.location.LocationView locationView) {
        this.f442652d = locationView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/location/LocationView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean f17 = u11.c.f((java.lang.String) gm0.j1.u().c().l(274436, null));
        com.tencent.mm.pluginsdk.location.LocationView locationView = this.f442652d;
        if (!f17) {
            boolean a17 = j35.u.a((android.app.Activity) locationView.getContext(), "android.permission.ACCESS_FINE_LOCATION", 64, "", "");
            com.tencent.mars.xlog.Log.i("MicroMsg.LocationView", "summerper checkPermission checkLocation[%b]", java.lang.Boolean.valueOf(a17));
            if (!a17) {
                yj0.a.h(this, "com/tencent/mm/pluginsdk/location/LocationView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        } else if (!j35.u.d(locationView.getContext(), "android.permission.ACCESS_FINE_LOCATION", true)) {
            if (((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue()) {
                j35.u.i((android.app.Activity) locationView.getContext(), "android.permission.ACCESS_FINE_LOCATION", 64);
            } else {
                int i17 = com.tencent.mm.pluginsdk.location.LocationView.f188755y;
                locationView.getClass();
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", locationView.getResources().getString(com.tencent.mm.R.string.f492399gh2));
                intent.putExtra("showShare", false);
                intent.putExtra("show_bottom", false);
                intent.putExtra("needRedirect", false);
                intent.putExtra("neverGetA8Key", false);
                intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
                intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
                j45.l.j(locationView.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
            }
            yj0.a.h(this, "com/tencent/mm/pluginsdk/location/LocationView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        w25.g gVar = locationView.f188771v;
        if (gVar != null) {
            gVar.a();
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/location/LocationView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
