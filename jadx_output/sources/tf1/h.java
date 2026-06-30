package tf1;

/* loaded from: classes7.dex */
public abstract class h {
    public static com.tencent.mm.plugin.appbrand.AppBrandRuntime a(sf.f fVar) {
        if (!(fVar instanceof com.tencent.mm.plugin.appbrand.extendplugin.b)) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.jsapi.l m17 = fVar.m();
        if (m17 instanceof com.tencent.mm.plugin.appbrand.page.v5) {
            return ((com.tencent.mm.plugin.appbrand.page.v5) m17).t3();
        }
        if (m17 instanceof com.tencent.mm.plugin.appbrand.e9) {
            return ((com.tencent.mm.plugin.appbrand.e9) m17).t3();
        }
        return null;
    }

    public static int b(java.lang.String str) {
        java.util.Map map;
        com.tencent.mm.plugin.appbrand.w0 d17 = com.tencent.mm.plugin.appbrand.x0.d(str);
        synchronized (tf1.g.class) {
            map = tf1.g.f418877f;
            if (map == null) {
                tf1.g.h();
                map = tf1.g.f418877f;
            }
        }
        return ((java.lang.Integer) map.get(d17)).intValue();
    }

    public static com.tencent.mm.plugin.appbrand.w0 c(int i17) {
        java.util.Map map;
        synchronized (tf1.g.class) {
            map = tf1.g.f418878g;
            if (map == null) {
                tf1.g.h();
                map = tf1.g.f418878g;
            }
        }
        com.tencent.mm.plugin.appbrand.w0 w0Var = (com.tencent.mm.plugin.appbrand.w0) map.get(java.lang.Integer.valueOf(i17));
        return w0Var == null ? com.tencent.mm.plugin.appbrand.w0.HIDE : w0Var;
    }
}
