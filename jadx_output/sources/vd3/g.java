package vd3;

/* loaded from: classes7.dex */
public class g extends vd3.f {
    @Override // vd3.f, lc3.d0
    public lc3.a0 r(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.util.HashMap a17 = this.f436059d.a();
        a17.putAll(s());
        if (com.tencent.mm.sdk.platformtools.x2.f193075e.getConfiguration().orientation == 2) {
            java.lang.Object obj = a17.get("screenWidth");
            java.lang.Object obj2 = a17.get("screenHeight");
            if (a17.containsKey("screenWidth") && a17.containsKey("screenHeight") && a17.containsKey("windowWidth") && a17.containsKey("windowHeight")) {
                a17.put("screenWidth", obj2);
                a17.put("screenHeight", obj);
                a17.put("windowWidth", obj2);
                a17.put("windowHeight", obj);
            }
        }
        return l(a17);
    }
}
