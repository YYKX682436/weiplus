package ud3;

/* loaded from: classes7.dex */
public final class h extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final ud3.b f426669f = new ud3.b();

    @Override // lc3.c0
    public java.lang.String f() {
        return "getLocalDataAllKeys";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.util.HashMap a17 = this.f426669f.a(data, e().f344331a);
        java.lang.Object obj = a17.get("error");
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.magicbrush.base.MBErrorInfo");
        lc3.z zVar = (lc3.z) obj;
        if (!kotlin.jvm.internal.o.b(zVar, lc3.x.f317934a)) {
            s().invoke(h(zVar.f317944a, zVar.f317945b));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Object obj2 = a17.get("keys");
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
        hashMap.put("keys", (java.util.ArrayList) obj2);
        s().invoke(l(hashMap));
    }
}
