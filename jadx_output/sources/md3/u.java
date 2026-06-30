package md3;

/* loaded from: classes4.dex */
public final class u extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "preloadEcsJumpInfo";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 param) {
        kotlin.jvm.internal.o.g(param, "param");
        java.lang.String optString = param.optString("ecsJumpInfo", "");
        kotlin.jvm.internal.o.d(optString);
        if (optString.length() == 0) {
            com.tencent.mars.xlog.Log.e("MBJsApiPreloadEcsJumpInfo", "error: ecsJumpInfo is empty");
            s().invoke(j(lc3.x.f317937d, "ecsJumpInfo is empty"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MBJsApiPreloadEcsJumpInfo", "preload, ecsJumpInfo: ".concat(optString));
        i95.m c17 = i95.n0.c(pq.q.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        pq.q qVar = (pq.q) c17;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pq.q.ub(qVar, new pq.a(context), optString, null, null, 12, null);
        s().invoke(k());
    }
}
