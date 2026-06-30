package f91;

/* loaded from: classes13.dex */
public class j implements f91.a {
    @Override // f91.a
    public boolean a(android.graphics.Path path, com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg basePathActionArg) {
        com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathQuadraticCurveToActionArg pathQuadraticCurveToActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathQuadraticCurveToActionArg) basePathActionArg;
        if (basePathActionArg == null) {
            return false;
        }
        path.quadTo(pathQuadraticCurveToActionArg.f77157e, pathQuadraticCurveToActionArg.f77158f, pathQuadraticCurveToActionArg.f77159g, pathQuadraticCurveToActionArg.f77160h);
        return true;
    }

    @Override // f91.a
    public boolean b(android.graphics.Path path, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 4) {
            return false;
        }
        path.quadTo(ik1.w.g(jSONArray, 0), ik1.w.g(jSONArray, 1), ik1.w.g(jSONArray, 2), ik1.w.g(jSONArray, 3));
        return true;
    }

    @Override // f91.a
    public java.lang.String getMethod() {
        return "quadraticCurveTo";
    }
}
