package ud3;

/* loaded from: classes7.dex */
public final class g extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final ud3.c f426668f = new ud3.c();

    @Override // lc3.c0
    public java.lang.String f() {
        return "getLocalData";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.util.HashMap a17 = this.f426668f.a(data, e().f344331a);
        java.lang.Object obj = a17.get("error");
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.magicbrush.base.MBErrorInfo");
        lc3.z zVar = (lc3.z) obj;
        if (!kotlin.jvm.internal.o.b(zVar, lc3.x.f317934a)) {
            s().invoke(h(zVar.f317944a, zVar.f317945b));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Object obj2 = a17.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, (java.lang.String) obj2);
        java.lang.Object obj3 = a17.get("type");
        kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
        hashMap.put("type", (java.lang.String) obj3);
        java.lang.Object obj4 = a17.get("size");
        kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.String");
        hashMap.put("size", (java.lang.String) obj4);
        s().invoke(l(hashMap));
    }
}
