package wd3;

/* loaded from: classes7.dex */
public final class b extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "stopListenToEvent";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("eventName");
        com.tencent.mars.xlog.Log.i("MBJsApiStopListenToEvent", "eventName:" + optString);
        try {
            kotlin.jvm.internal.o.d(optString);
            ((com.tencent.mm.plugin.magicbrush.i6) ((com.tencent.mm.plugin.magicbrush.g4) i95.n0.c(com.tencent.mm.plugin.magicbrush.g4.class))).Di(e().f344331a, com.tencent.mm.plugin.magicbrush.z4.valueOf(optString));
            s().invoke(k());
        } catch (java.lang.IllegalArgumentException unused) {
            com.tencent.mars.xlog.Log.e("MBJsApiStopListenToEvent", "eventName error");
            s().invoke(i(lc3.x.f317937d));
        }
    }
}
