package nd1;

/* loaded from: classes7.dex */
public class y0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 880;
    public static final java.lang.String NAME = "setNavigateBackInterception";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (e9Var == null || jSONObject == null) {
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("scopes");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            e9Var.a(i17, o("fail:scopes is empty"));
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        java.util.Iterator it = e06.p.m(0, optJSONArray.length()).iterator();
        while (((e06.j) it).hasNext()) {
            java.lang.Object obj = optJSONArray.get(((kz5.x0) it).b());
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
            org.json.JSONObject jSONObject2 = (org.json.JSONObject) obj;
            boolean optBoolean = jSONObject2.optBoolean("interception", false);
            c0Var.f310112d |= optBoolean;
            try {
                int optInt = jSONObject2.optInt("type", 0);
                if (optInt == 1) {
                    str = "scene_swipe_back";
                } else if (optInt == 2) {
                    str = "scene_back_key_pressed";
                } else if (optInt == 3) {
                    str = "scene_actionbar_back";
                } else {
                    if (optInt != 4) {
                        throw new java.lang.IllegalArgumentException("illegal type!");
                    }
                    str = "scene_jsapi_navigate_back";
                }
                arrayList.add(new oi1.m(optBoolean, str));
            } catch (java.lang.IllegalArgumentException unused) {
                e9Var.a(i17, o("fail:illegal type"));
                return;
            }
        }
        e9Var.m(new nd1.x0(e9Var.t3().x0().getCurrentPage(), e9Var, c0Var, arrayList, i17, this));
    }
}
