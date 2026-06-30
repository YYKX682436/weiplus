package dp3;

/* loaded from: classes9.dex */
public class n extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.order.model.a f242223d = null;

    public n(java.lang.String str, java.lang.String str2, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("trans_id", str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            hashMap.put("bill_id", str2);
        }
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 108;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            com.tencent.mm.plugin.order.model.a aVar = new com.tencent.mm.plugin.order.model.a();
            this.f242223d = aVar;
            try {
                aVar.f152819a = com.tencent.mm.plugin.order.model.MallTransactionObject.a(jSONObject);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MallOrderDetailObject", e17, "", new java.lang.Object[0]);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MallOrderDetailObject", e18, "", new java.lang.Object[0]);
            }
            try {
                aVar.f152820b = aVar.e(jSONObject);
            } catch (org.json.JSONException e19) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MallOrderDetailObject", e19, "", new java.lang.Object[0]);
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MallOrderDetailObject", e27, "", new java.lang.Object[0]);
            }
            try {
                aVar.f152821c = aVar.c(jSONObject);
            } catch (org.json.JSONException e28) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MallOrderDetailObject", e28, "", new java.lang.Object[0]);
            } catch (java.lang.Exception e29) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MallOrderDetailObject", e29, "", new java.lang.Object[0]);
            }
            try {
                java.util.List b17 = aVar.b(jSONObject);
                aVar.f152822d = b17;
                aVar.a(b17, jSONObject);
            } catch (org.json.JSONException e37) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MallOrderDetailObject", e37, "", new java.lang.Object[0]);
            } catch (java.lang.Exception e38) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MallOrderDetailObject", e38, "", new java.lang.Object[0]);
            }
            aVar.f152823e = jSONObject.optString("safeguard_url");
            jSONObject.optString("share_url");
            int optInt = jSONObject.optInt("modifyTimeStamp");
            aVar.f152826h = optInt;
            dp3.c cVar = aVar.f152820b;
            if (cVar != null && optInt <= 0) {
                aVar.f152826h = cVar.f242203b;
            }
            com.tencent.mm.plugin.order.model.MallTransactionObject mallTransactionObject = aVar.f152819a;
            if (mallTransactionObject != null) {
                aVar.f152824f = mallTransactionObject.D;
                aVar.f152825g = mallTransactionObject.C;
            }
        }
    }
}
