package pf1;

/* loaded from: classes7.dex */
public final class a0 extends gb1.f {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = -2;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "removeHTMLVConsoleView";

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        return data.optInt("htmlId");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gb1.f
    public boolean J(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) tVar;
        pf1.c cVar = view instanceof pf1.c ? (pf1.c) view : null;
        if (cVar == null || v5Var == null) {
            return true;
        }
        v5Var.m1(cVar);
        return true;
    }
}
