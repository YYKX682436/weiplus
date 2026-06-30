package vc1;

/* loaded from: classes13.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f435017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vc1.f2 f435018e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435019f;

    public n(vc1.p1 p1Var, boolean z17, vc1.f2 f2Var, java.lang.String str) {
        this.f435017d = z17;
        this.f435018e = f2Var;
        this.f435019f = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        vc1.f2 f2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/map/mapsdk/DefaultTencentMapView$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f435017d && (f2Var = this.f435018e) != null) {
            java.lang.String str = this.f435019f;
            uc1.e eVar = (uc1.e) f2Var;
            eVar.getClass();
            uc1.f fVar = new uc1.f(null);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("mapId", eVar.f426309a);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, str);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddMapControls", "put JSON data error : %s", e17);
            }
            fVar.f82374f = jSONObject.toString();
            eVar.f426310b.i(fVar, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/map/mapsdk/DefaultTencentMapView$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
