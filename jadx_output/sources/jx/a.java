package jx;

/* loaded from: classes.dex */
public final class a extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "getOldAdInfo";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("__WebJsEngineLocalData__");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        com.tencent.mm.sdk.platformtools.v3 v3Var = new com.tencent.mm.sdk.platformtools.v3(M, 15552000L);
        java.lang.String optString = data.optString("key");
        kotlin.jvm.internal.o.d(optString);
        java.lang.String s17 = v3Var.s(optString, "");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("value", s17);
        s().invoke(l(hashMap));
    }
}
