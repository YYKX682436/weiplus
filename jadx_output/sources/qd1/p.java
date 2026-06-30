package qd1;

/* loaded from: classes7.dex */
public final class p extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 104;
    private static final java.lang.String NAME = "showModal";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [int] */
    /* JADX WARN: Type inference failed for: r17v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v18, types: [int] */
    /* JADX WARN: Type inference failed for: r2v23, types: [int] */
    /* JADX WARN: Type inference failed for: r4v12, types: [int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [int] */
    /* JADX WARN: Type inference failed for: r4v6, types: [int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [int] */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void A(com.tencent.mm.plugin.appbrand.e9 e9Var, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.page.v5 V0 = e9Var.V0();
        if (V0 == null) {
            if (e9Var.t3() == null || e9Var.t3().L0() || e9Var.t3().J0()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiShowModal", "invoke failed with appId[%s] callbackId[%d], current page view is null.", e9Var.getAppId(), java.lang.Integer.valueOf(i17));
                e9Var.a(i17, o("fail:page don't exist"));
                return;
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiShowModal", "invoke with appId[%s] callbackId[%d] runtime !initialized, retry", e9Var.getAppId(), java.lang.Integer.valueOf(i17));
                e9Var.t3().I1(new qd1.i(this, e9Var, i17, jSONObject));
                return;
            }
        }
        int optInt = jSONObject.optInt(dm.i4.COL_ID, -1);
        java.lang.String optString = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        java.lang.String optString2 = jSONObject.optString("confirmText", e9Var.getContext().getString(com.tencent.mm.R.string.gpa));
        java.lang.String optString3 = jSONObject.optString("cancelText", e9Var.getContext().getString(com.tencent.mm.R.string.gp9));
        boolean optBoolean = jSONObject.optBoolean("showCancel", true);
        boolean optBoolean2 = jSONObject.optBoolean("editable", false);
        java.lang.String appId = e9Var.getAppId();
        nf.y yVar = nf.x.f336616b;
        java.lang.String str = "";
        try {
            if (yVar != null ? yVar.i(appId) : false) {
                java.lang.String optString4 = jSONObject.optString("confirmColorDark", "");
                ?? color = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478734fp);
                try {
                    color = ik1.w.l(optString4);
                } catch (java.lang.Exception unused) {
                }
                java.lang.String optString5 = jSONObject.optString("cancelColorDark", "");
                com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478714f5);
                str = ik1.w.l(optString5);
                yVar = color;
            } else {
                java.lang.String optString6 = jSONObject.optString("confirmColor", "");
                ?? color2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478734fp);
                try {
                    color2 = ik1.w.l(optString6);
                } catch (java.lang.Exception unused2) {
                }
                java.lang.String optString7 = jSONObject.optString("cancelColor", "");
                com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478714f5);
                str = ik1.w.l(optString7);
                yVar = color2;
            }
        } catch (java.lang.Exception unused3) {
        }
        ?? r162 = yVar;
        java.lang.String optString8 = jSONObject.optString("content");
        boolean optBoolean3 = jSONObject.optBoolean("upper", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowModal", "showModal appId[%s] title[%s] content[%s] upper[%b]", e9Var.getAppId(), optString, optString8, java.lang.Boolean.valueOf(optBoolean3));
        e9Var.m(new qd1.j(this, e9Var, V0, optBoolean3, optString, optString8, optBoolean2, optString2, optInt, i17, optBoolean, optString3, r162, str, jSONObject));
    }
}
