package f91;

/* loaded from: classes13.dex */
public class g implements f91.a {
    @Override // f91.a
    public boolean a(android.graphics.Path path, com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg basePathActionArg) {
        path.close();
        return true;
    }

    @Override // f91.a
    public boolean b(android.graphics.Path path, org.json.JSONArray jSONArray) {
        path.close();
        return true;
    }

    @Override // f91.a
    public java.lang.String getMethod() {
        return "closePath";
    }
}
