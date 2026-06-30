package vb1;

/* loaded from: classes7.dex */
public class i extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 100;
    public static final java.lang.String NAME = "canvasToTempFilePath";

    public static android.graphics.Bitmap.CompressFormat C(org.json.JSONObject jSONObject) {
        return "jpg".equalsIgnoreCase(jSONObject.optString("fileType")) ? android.graphics.Bitmap.CompressFormat.JPEG : android.graphics.Bitmap.CompressFormat.PNG;
    }

    public static int D(org.json.JSONObject jSONObject) {
        float optDouble = (float) jSONObject.optDouble("quality", 1.0d);
        return (int) (optDouble >= 0.0f ? optDouble > 1.0f ? 100.0f : optDouble * 100.0f : 0.0f);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        ik1.h0.a().postToWorker(new vb1.h(this, lVar, i17, jSONObject));
    }
}
