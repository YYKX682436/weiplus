package nj1;

/* loaded from: classes7.dex */
public final class g implements sh1.e {
    @Override // sh1.e
    public sh1.g b(android.view.View view, int i17, java.lang.String params, android.graphics.SurfaceTexture surfaceTexture, sh1.f invoker) {
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(invoker, "invoker");
        com.tencent.mars.xlog.Log.i("MicroMsg.SkylineNativeViewFactoryRichText", "create params:".concat(params));
        org.json.JSONObject jSONObject = new org.json.JSONObject(params).getJSONObject("position");
        int i18 = jSONObject.getInt("height");
        int i19 = jSONObject.getInt("width");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        ik1.h0.b(new nj1.b(h0Var, surfaceTexture, i19, i18, h0Var2, view, params, invoker));
        return new nj1.f(h0Var, h0Var2);
    }
}
