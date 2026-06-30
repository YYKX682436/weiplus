package gd3;

/* loaded from: classes7.dex */
public final class b extends lc3.b0 {
    public static final android.graphics.Bitmap.CompressFormat u(gd3.b bVar, org.json.JSONObject jSONObject) {
        bVar.getClass();
        return r26.i0.p("jpg", jSONObject.optString("fileType"), true) ? android.graphics.Bitmap.CompressFormat.JPEG : android.graphics.Bitmap.CompressFormat.PNG;
    }

    public static final int v(gd3.b bVar, org.json.JSONObject jSONObject) {
        bVar.getClass();
        float optDouble = (float) jSONObject.optDouble("quality", 1.0d);
        return (int) (optDouble >= 0.0f ? optDouble > 1.0f ? 100.0f : 100 * optDouble : 0.0f);
    }

    @Override // lc3.c0
    public java.lang.String f() {
        return "canvasToFilePath";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(data, "data");
        boolean optBoolean = data.optBoolean("isScreenCanvas", false);
        int optInt = data.optInt("canvasId", Integer.MIN_VALUE);
        int optInt2 = data.optInt("windowId", Integer.MIN_VALUE);
        java.lang.String optString = data.optString("bizName");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        java.lang.String s07 = r26.n0.s0(optString, "-", optString);
        if (optBoolean && optInt2 == Integer.MIN_VALUE) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiCanvasToFilePath", "hy: invalid params: is screen canvas but bot providing windowId");
            s().invoke(i(lc3.u.f317921a));
            ((mq0.v0) ((mq0.e0) i95.n0.c(mq0.e0.class))).Ai("canvasToFilePath", 600001, "fail:no window id provided when capture screen", s07);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MBJsApiCanvasToFilePath", "invoke canvasToFilePath, canvasId:" + optInt + ", windowId: " + optInt2 + ", data:" + data);
        lc3.h0 h0Var = (lc3.h0) this.f317890a;
        if (h0Var != null) {
            sc3.k1 k1Var = (sc3.k1) h0Var;
            k1Var.g1(new sc3.k(k1Var, new gd3.a(this, s07, data, optInt), optBoolean, optInt2, optInt));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            s().invoke(i(lc3.x.f317938e));
            ((mq0.v0) ((mq0.e0) i95.n0.c(mq0.e0.class))).Ai("canvasToFilePath", 7, "fail:context lost", s07);
        }
    }
}
