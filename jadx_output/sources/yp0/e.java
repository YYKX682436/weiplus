package yp0;

/* loaded from: classes7.dex */
public final class e extends lc3.d0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "getMsgMeta";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.d0
    public lc3.a0 r(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        lc3.e eVar = this.f317890a;
        kotlin.jvm.internal.o.d(eVar);
        com.tencent.mars.xlog.Log.i("getMsgMeta", "[mb] get msg meta data = " + data);
        java.lang.String optString = data.optString("ID");
        boolean optBoolean = data.optBoolean("needFrame", true);
        kotlin.jvm.internal.o.d(optString);
        wp0.b M0 = ((wp0.c) eVar).M0("", optString, optBoolean);
        if (M0 != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("meta", M0.b());
            return l(hashMap);
        }
        return h(1, "create meta by '" + optString + "' failed");
    }
}
