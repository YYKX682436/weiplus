package f91;

/* loaded from: classes13.dex */
public class k implements f91.a {
    @Override // f91.a
    public boolean a(android.graphics.Path path, com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg basePathActionArg) {
        com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathRectActionArg pathRectActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathRectActionArg) basePathActionArg;
        if (pathRectActionArg == null) {
            return false;
        }
        float f17 = pathRectActionArg.f77161e;
        float f18 = pathRectActionArg.f77162f;
        path.addRect(f17, f18, f17 + pathRectActionArg.f77163g, f18 + pathRectActionArg.f77164h, android.graphics.Path.Direction.CW);
        return true;
    }

    @Override // f91.a
    public boolean b(android.graphics.Path path, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 4) {
            return false;
        }
        float g17 = ik1.w.g(jSONArray, 0);
        float g18 = ik1.w.g(jSONArray, 1);
        path.addRect(g17, g18, g17 + ik1.w.g(jSONArray, 2), g18 + ik1.w.g(jSONArray, 3), android.graphics.Path.Direction.CW);
        return true;
    }

    @Override // f91.a
    public java.lang.String getMethod() {
        return "rect";
    }
}
