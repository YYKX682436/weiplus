package nd1;

/* loaded from: classes7.dex */
public class k2 extends nd1.e0 {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = 584;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "private_setPageOrientation";

    public k2() {
        super(com.tencent.mm.plugin.appbrand.page.dc.class);
    }

    @Override // nd1.e0
    public void C(com.tencent.mm.plugin.appbrand.y env, org.json.JSONObject data, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.page.dc ext = (com.tencent.mm.plugin.appbrand.page.dc) obj;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(ext, "ext");
        java.lang.String optString = data.optString("orientation", null);
        if (optString == null) {
            env.a(i17, o("fail:invalid data"));
            return;
        }
        if (xi1.o.d(optString) == null) {
            env.a(i17, o("fail:invalid data"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(k(), optString);
        ext.l(optString, hashMap);
        env.a(i17, o("ok"));
    }
}
