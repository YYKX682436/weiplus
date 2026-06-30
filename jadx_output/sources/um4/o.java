package um4;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lum4/o;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-topstory_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public class o extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteJsApiShowNavBarShadow", jSONObject != null ? jSONObject.toString() : null);
        if (jSONObject != null) {
            try {
                com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback uICallback = com.tencent.mm.plugin.lite.LiteAppCenter.getUICallback(this.f143442e.f299024a);
                if (uICallback != null && (uICallback instanceof com.tencent.liteapp.ui.WxaLiteAppBaseView)) {
                    java.lang.String string = jSONObject.getString("color");
                    kotlin.jvm.internal.o.d(string);
                    java.lang.String substring = string.substring(1, string.length());
                    kotlin.jvm.internal.o.f(substring, "substring(...)");
                    int i17 = (int) (jSONObject.getDouble("alpha") * 255);
                    r26.a.a(16);
                    ((ku5.t0) ku5.t0.f312615d).B(new um4.n(uICallback, java.lang.Integer.parseInt(substring, 16) + (i17 * com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62)));
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.putOpt("retCode", "0");
                    this.f143443f.c(jSONObject2, false);
                    return;
                }
                this.f143443f.a("cannot find view");
            } catch (java.lang.Exception unused) {
                this.f143443f.a("Error");
            }
        }
    }
}
