package n10;

/* loaded from: classes7.dex */
public final class e extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "getBizPreloadData";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        xq0.b bVar = (xq0.b) this.f317890a;
        if (bVar != null) {
            n10.d dVar = new n10.d(this);
            qp0.c cVar = bVar.f325627f;
            jz5.f0 f0Var = null;
            java.lang.String str = bVar.f325640v;
            if (cVar != null) {
                com.tencent.mars.xlog.Log.i(str, "handleJsApiEvent, event: ".concat("getBizPreloadData"));
                cVar.ca("getBizPreloadData", null, dVar);
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.i(str, "handleJsApiEvent, but delegate is null, event: ".concat("getBizPreloadData"));
            }
        }
    }
}
