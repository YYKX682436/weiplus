package g10;

/* loaded from: classes7.dex */
public final class l implements xq0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f267531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.x7 f267532e;

    public l(int i17, bw5.x7 x7Var) {
        this.f267531d = i17;
        this.f267532e = x7Var;
    }

    @Override // qp0.c
    public void ca(java.lang.String event, java.util.HashMap hashMap, yz5.q callback) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "handleJsEvent, event = ".concat(event));
        if (!kotlin.jvm.internal.o.b(event, "getBizPreloadData")) {
            callback.invoke(1, "event not handle", null);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getBizPreloadData, preloadType = ");
        int i17 = this.f267531d;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", sb6.toString());
        callback.invoke(0, "", kz5.c1.i(new jz5.l("preloadType", java.lang.Integer.valueOf(i17)), new jz5.l("initParams", this.f267532e.e().c())));
    }
}
