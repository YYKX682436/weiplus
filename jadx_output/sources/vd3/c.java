package vd3;

/* loaded from: classes.dex */
public final class c extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "getServerTime";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        long c17 = c01.id.c();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("serverTime", java.lang.Long.valueOf(c17));
        s().invoke(l(hashMap));
    }
}
