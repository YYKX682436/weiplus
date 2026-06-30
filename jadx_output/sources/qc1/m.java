package qc1;

/* loaded from: classes7.dex */
public class m extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    private static final int CTRL_INDEX = -2;
    private static final java.lang.String NAME = "restoreWebviewFocus";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        new qc1.l(this, (com.tencent.mm.plugin.appbrand.page.v5) lVar, jSONObject.optBoolean("focus", false)).a(new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()));
        return o("ok");
    }
}
