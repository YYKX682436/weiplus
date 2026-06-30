package f91;

/* loaded from: classes13.dex */
public class i implements f91.a {
    @Override // f91.a
    public boolean a(android.graphics.Path path, com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg basePathActionArg) {
        com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathMoveToActionArg pathMoveToActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathMoveToActionArg) basePathActionArg;
        if (pathMoveToActionArg == null) {
            return false;
        }
        path.moveTo(pathMoveToActionArg.f77155e, pathMoveToActionArg.f77156f);
        return true;
    }

    @Override // f91.a
    public boolean b(android.graphics.Path path, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 2) {
            return false;
        }
        path.moveTo(ik1.w.g(jSONArray, 0), ik1.w.g(jSONArray, 1));
        return true;
    }

    @Override // f91.a
    public java.lang.String getMethod() {
        return "moveTo";
    }
}
