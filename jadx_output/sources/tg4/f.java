package tg4;

/* loaded from: classes7.dex */
public abstract class f extends lc3.b0 {
    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    public final float[] u(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(data.optString("position"));
            float h17 = ik1.w.h(jSONObject, "left", 0.0f);
            float h18 = ik1.w.h(jSONObject, "top", 0.0f);
            float h19 = ik1.w.h(jSONObject, "width", 0.0f);
            float h27 = ik1.w.h(jSONObject, "height", 0.0f);
            float f17 = Float.NaN;
            if (!android.text.TextUtils.isEmpty("zIndex")) {
                double optDouble = data.optDouble("zIndex", Float.NaN);
                if (!java.lang.Double.isNaN(optDouble)) {
                    f17 = (float) optDouble;
                }
            }
            return new float[]{h17, h18, h19, h27, f17};
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
