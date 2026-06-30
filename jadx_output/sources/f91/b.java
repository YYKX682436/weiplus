package f91;

/* loaded from: classes13.dex */
public class b implements f91.a {
    @Override // f91.a
    public boolean a(android.graphics.Path path, com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg basePathActionArg) {
        if (basePathActionArg == null || !(basePathActionArg instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathArcActionArg)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathArcActionArg pathArcActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathArcActionArg) basePathActionArg;
        c(path, pathArcActionArg.f77140e, pathArcActionArg.f77141f, pathArcActionArg.f77142g, pathArcActionArg.f77143h, pathArcActionArg.f77144i, pathArcActionArg.f77145m);
        return true;
    }

    @Override // f91.a
    public boolean b(android.graphics.Path path, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 5) {
            return false;
        }
        c(path, ik1.w.g(jSONArray, 0), ik1.w.g(jSONArray, 1), ik1.w.g(jSONArray, 2), (float) jSONArray.optDouble(3), (float) jSONArray.optDouble(4), jSONArray.optBoolean(5));
        return true;
    }

    public final boolean c(android.graphics.Path path, float f17, float f18, float f19, float f27, float f28, boolean z17) {
        float f29;
        float f37;
        float f38;
        float f39 = f17 - f19;
        float f47 = f18 - f19;
        float f48 = f17 + f19;
        float f49 = f18 + f19;
        float degrees = (float) java.lang.Math.toDegrees(f27);
        float degrees2 = (float) java.lang.Math.toDegrees(f28);
        float f57 = (float) (360.0d / (f19 * 6.283185307179586d));
        if (z17) {
            if (degrees - degrees2 >= 360.0f) {
                f38 = -360.0f;
            } else {
                f29 = degrees % 360.0f;
                f37 = degrees2 % 360.0f;
                if (f29 < 0.0f) {
                    f29 += 360.0f;
                }
                if (f37 < 0.0f) {
                    f37 += 360.0f;
                }
                if (f37 >= f29) {
                    f38 = (f37 - f29) - 360.0f;
                }
                f38 = f37 - f29;
            }
        } else if (degrees2 - degrees >= 360.0f) {
            f38 = 360.0f;
        } else {
            f29 = degrees % 360.0f;
            f37 = degrees2 % 360.0f;
            if (f29 < 0.0f) {
                f29 += 360.0f;
            }
            if (f37 < 0.0f) {
                f37 += 360.0f;
            }
            if (f37 < f29) {
                f37 += 360.0f;
            }
            f38 = f37 - f29;
        }
        float f58 = f38 % 360.0f;
        if (f58 > f57 || f58 < (-f57)) {
            path.arcTo(new android.graphics.RectF(f39, f47, f48, f49), degrees, f38, false);
            return true;
        }
        path.arcTo(new android.graphics.RectF(f39, f47, f48, f49), degrees, f38, false);
        path.addArc(new android.graphics.RectF(f39, f47, f48, f49), degrees, f38);
        return true;
    }

    @Override // f91.a
    public java.lang.String getMethod() {
        return "arc";
    }
}
