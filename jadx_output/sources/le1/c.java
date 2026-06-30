package le1;

/* loaded from: classes7.dex */
public final class c extends nd1.e0 {
    private static final int CTRL_INDEX = 471;
    private static final java.lang.String NAME = "hideStatusBar";

    public c() {
        super(ni1.j.class);
    }

    @Override // nd1.e0
    public void C(com.tencent.mm.plugin.appbrand.y env, org.json.JSONObject data, int i17, java.lang.Object obj) {
        ni1.j ext = (ni1.j) obj;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(ext, "ext");
        ext.a();
        env.a(i17, o("ok"));
    }
}
