package qc1;

/* loaded from: classes7.dex */
public class c extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    private static final int CTRL_INDEX = 583;
    private static final java.lang.String NAME = "getSelectedTextRange";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        int[] iArr = (int[]) new qc1.b(this, (com.tencent.mm.plugin.appbrand.page.v5) lVar).a(new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()));
        if (iArr == null) {
            return o("fail:no focused input");
        }
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("start", java.lang.Integer.valueOf(iArr[0]));
        hashMap.put("end", java.lang.Integer.valueOf(iArr[1]));
        return p("ok", hashMap);
    }
}
