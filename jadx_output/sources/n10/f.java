package n10;

/* loaded from: classes.dex */
public final class f extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "getNirvanaVersionInfo";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("jsapiVersion", m10.b.f322619a.a());
            s().invoke(l(hashMap));
        } catch (java.lang.Exception unused) {
            s().invoke(i(lc3.x.f317936c));
        }
    }
}
