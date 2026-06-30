package le1;

/* loaded from: classes7.dex */
public final class b extends com.tencent.mm.plugin.appbrand.jsapi.b6 {
    static {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.appbrand.jsapi.b6.f79831g = z65.c.a();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.b6
    public boolean B(com.tencent.mm.plugin.appbrand.y env) {
        kotlin.jvm.internal.o.g(env, "env");
        if (env.getWindowAndroid().shouldInLargeScreenCompatMode()) {
            return true;
        }
        xi1.g windowAndroid = env.getWindowAndroid();
        return (windowAndroid instanceof xi1.q) && (((xi1.q) windowAndroid).f454714e instanceof com.tencent.mm.plugin.appbrand.widget.halfscreen.f);
    }
}
