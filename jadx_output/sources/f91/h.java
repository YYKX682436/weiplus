package f91;

/* loaded from: classes13.dex */
public class h implements f91.a {
    @Override // f91.a
    public boolean a(android.graphics.Path path, com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg basePathActionArg) {
        com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathLineToActionArg pathLineToActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathLineToActionArg) basePathActionArg;
        if (pathLineToActionArg == null) {
            return false;
        }
        path.lineTo(pathLineToActionArg.f77153e, pathLineToActionArg.f77154f);
        return true;
    }

    @Override // f91.a
    public boolean b(android.graphics.Path path, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 2) {
            return false;
        }
        path.lineTo(ik1.w.g(jSONArray, 0), ik1.w.g(jSONArray, 1));
        return true;
    }

    @Override // f91.a
    public java.lang.String getMethod() {
        return "lineTo";
    }
}
