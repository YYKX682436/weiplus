package xb1;

/* loaded from: classes7.dex */
public class a extends com.tencent.mm.plugin.appbrand.extendplugin.g {
    @Override // com.tencent.mm.plugin.appbrand.extendplugin.g
    public java.lang.String C() {
        return "webgl";
    }

    @Override // com.tencent.mm.plugin.appbrand.extendplugin.g
    public int D(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optInt("canvasId", -1);
        }
        return -1;
    }
}
