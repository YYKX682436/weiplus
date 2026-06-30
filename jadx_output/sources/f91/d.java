package f91;

/* loaded from: classes13.dex */
public class d implements f91.a {
    @Override // f91.a
    public boolean a(android.graphics.Path path, com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg basePathActionArg) {
        com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathBezierCurveToActionArg pathBezierCurveToActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathBezierCurveToActionArg) basePathActionArg;
        if (pathBezierCurveToActionArg == null) {
            return false;
        }
        path.cubicTo(pathBezierCurveToActionArg.f77147e, pathBezierCurveToActionArg.f77148f, pathBezierCurveToActionArg.f77149g, pathBezierCurveToActionArg.f77150h, pathBezierCurveToActionArg.f77151i, pathBezierCurveToActionArg.f77152m);
        return true;
    }

    @Override // f91.a
    public boolean b(android.graphics.Path path, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 6) {
            return false;
        }
        path.cubicTo(ik1.w.g(jSONArray, 0), ik1.w.g(jSONArray, 1), ik1.w.g(jSONArray, 2), ik1.w.g(jSONArray, 3), ik1.w.g(jSONArray, 4), ik1.w.g(jSONArray, 5));
        return true;
    }

    @Override // f91.a
    public java.lang.String getMethod() {
        return "bezierCurveTo";
    }
}
