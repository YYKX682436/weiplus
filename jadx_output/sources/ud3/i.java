package ud3;

/* loaded from: classes7.dex */
public final class i extends lc3.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final ud3.b f426670d = new ud3.b();

    @Override // lc3.c0
    public java.lang.String f() {
        return "getLocalDataAllKeysSync";
    }

    @Override // lc3.d0
    public lc3.a0 r(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.util.HashMap a17 = this.f426670d.a(data, e().f344331a);
        java.lang.Object obj = a17.get("error");
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.magicbrush.base.MBErrorInfo");
        lc3.z zVar = (lc3.z) obj;
        if (!kotlin.jvm.internal.o.b(zVar, lc3.x.f317934a)) {
            return h(zVar.f317944a, zVar.f317945b);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Object obj2 = a17.get("keys");
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
        hashMap.put("keys", (java.util.ArrayList) obj2);
        return l(hashMap);
    }
}
