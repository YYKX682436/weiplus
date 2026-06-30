package qd1;

/* loaded from: classes.dex */
public final class h extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 107;
    private static final java.lang.String NAME = "showActionSheet";

    /* renamed from: g, reason: collision with root package name */
    public static qd1.g f361635g;

    public static void C(android.content.Context context, com.tencent.mm.ui.widget.dialog.k0 k0Var, java.lang.String str) {
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setHeight(i65.a.f(context, com.tencent.mm.R.dimen.f479727dj));
        textView.setGravity(17);
        textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478873jj));
        textView.setTextSize(0, i65.a.h(context, com.tencent.mm.R.dimen.f479628b3));
        textView.setMaxLines(1);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.MIDDLE);
        int b17 = i65.a.b(context, 18);
        textView.setPadding(b17, 0, b17, 0);
        textView.setText(str);
        k0Var.s(textView, false);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mm.plugin.appbrand.page.v5 V0 = e9Var.V0();
        if (V0 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiShowActionSheet", "invoke JsApi JsApiShowActionSheet failed, current page view is null.");
            e9Var.a(i17, o("fail"));
            return;
        }
        int optInt = jSONObject.optInt(dm.i4.COL_ID, -1);
        java.lang.String a17 = nf.e.a(jSONObject, "alertText");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowActionSheet", "invoke, alertText: " + a17);
        java.lang.String optString = jSONObject.optString("itemList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(optString);
            for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                arrayList.add((java.lang.String) jSONArray.get(i18));
            }
            e9Var.m(new qd1.f(this, e9Var, V0, i17, optInt, a17, jSONObject, arrayList));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShowActionSheet", e17.getMessage());
            e9Var.a(i17, o("fail"));
        }
    }
}
