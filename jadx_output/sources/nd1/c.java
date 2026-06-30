package nd1;

/* loaded from: classes7.dex */
public class c extends nd1.e0 {
    public static final int CTRL_INDEX = 139;
    public static final java.lang.String NAME = "disableScrollBounce";

    public c() {
        super(ni1.h.class);
    }

    @Override // nd1.e0
    public void C(com.tencent.mm.plugin.appbrand.y yVar, org.json.JSONObject jSONObject, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) yVar;
        ni1.h hVar = (ni1.h) obj;
        if (!jSONObject.has("disable")) {
            v5Var.a(i17, o("ok"));
            return;
        }
        if (jSONObject.optBoolean("disable", false)) {
            hVar.c(false);
        } else {
            k91.f M1 = v5Var.M1();
            if (M1 == null) {
                hVar.c(false);
            } else {
                hVar.c(M1.f305721j);
            }
        }
        v5Var.a(i17, o("ok"));
    }
}
