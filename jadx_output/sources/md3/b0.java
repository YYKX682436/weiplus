package md3;

/* loaded from: classes.dex */
public final class b0 extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "preloadMiniProgramEnv";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data.optString("type", "app").equals("app")) {
            ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Yf(com.tencent.mm.plugin.appbrand.service.x6.f88827r);
        } else {
            ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).c8(com.tencent.mm.plugin.appbrand.service.x6.f88827r);
        }
        s().invoke(k());
    }
}
