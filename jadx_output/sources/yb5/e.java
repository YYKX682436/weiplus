package yb5;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final yb5.e f460732d = new yb5.e();

    public e() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List k17 = kz5.c0.k(new jz5.l(android.os.Handler.class, kz5.b0.c("handleMessage")), new jz5.l(com.tencent.mm.sdk.event.IListener.class, kz5.b0.c("callback")), new jz5.l(com.tencent.mm.modelbase.u0.class, kz5.b0.c("onSceneEnd")), new jz5.l(java.lang.Runnable.class, kz5.b0.c("run")));
        try {
            k17.add(new jz5.l(kotlin.jvm.internal.q.class, kz5.b0.c("invoke")));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("ChatCheck.checker", th6, "parse kt lambda err", new java.lang.Object[0]);
        }
        try {
            k17.add(new jz5.l(qz5.l.class, kz5.b0.c("invokeSuspend")));
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.printErrStackTrace("ChatCheck.checker", th7, "parse kt suspend lambda err", new java.lang.Object[0]);
        }
        return k17;
    }
}
