package lh5;

/* loaded from: classes7.dex */
public final class b extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public static final android.graphics.RectF f318725f = new android.graphics.RectF(0.0f, 0.0f, 0.0f, 0.0f);

    @Override // lc3.c0
    public java.lang.String f() {
        return "setEasterEggBoundingBox";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        android.graphics.RectF rectF;
        lc3.a0 h17;
        kotlin.jvm.internal.o.g(data, "data");
        yz5.l s17 = s();
        lc3.e eVar = this.f317890a;
        kotlin.jvm.internal.o.d(eVar);
        kh5.h hVar = (kh5.h) eVar;
        org.json.JSONObject optJSONObject = data.optJSONObject("frame");
        android.graphics.RectF rectF2 = f318725f;
        if (optJSONObject == null) {
            rectF = rectF2;
        } else {
            float f17 = ik1.w.f() * ((float) optJSONObject.optDouble("x"));
            float f18 = ik1.w.f() * ((float) optJSONObject.optDouble("y"));
            rectF = new android.graphics.RectF(f17, f18, (ik1.w.f() * ((float) optJSONObject.optDouble("w"))) + f17, (ik1.w.f() * ((float) optJSONObject.optDouble("h"))) + f18);
        }
        java.lang.String optString = data.optString("eggKey");
        java.lang.String optString2 = data.optString("eggId");
        if (!kotlin.jvm.internal.o.b(rectF, rectF2)) {
            kotlin.jvm.internal.o.d(optString);
            if (!(optString.length() == 0)) {
                kotlin.jvm.internal.o.d(optString2);
                if (!(optString2.length() == 0)) {
                    kotlin.jvm.internal.o.g(rectF, "rectF");
                    if (kotlin.jvm.internal.o.b(optString2, hVar.f308077q.f299868b)) {
                        hVar.f308072i.setBoundingBox(rectF);
                        android.os.Handler handler = hVar.f308075o;
                        java.lang.Runnable runnable = hVar.f308080t;
                        handler.removeCallbacks(runnable);
                        handler.postDelayed(runnable, 300L);
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.MEChattingMgr", "[ME]: can't set bbox because " + optString2 + " is not " + hVar.f308077q);
                    }
                    h17 = k();
                    s17.invoke(h17);
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MESetEasterEggBoundingB", "stevecai: set bounding box error: " + rectF + ' ' + optString + ' ' + optString2);
        h17 = h(2, "");
        s17.invoke(h17);
    }
}
