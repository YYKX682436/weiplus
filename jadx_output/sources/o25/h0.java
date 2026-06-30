package o25;

/* loaded from: classes9.dex */
public class h0 implements o25.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f342529a = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o25.l0 f342530b;

    public h0(o25.l0 l0Var) {
        this.f342530b = l0Var;
        a();
    }

    @Override // o25.l0
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DeepLinkHelper", "markDeepLinkDoneWillBeCallback#buildWeAppStartCallback");
        this.f342530b.a();
    }

    @Override // o25.l0
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DeepLinkHelper", "onDeepLinkDone#buildWeAppStartCallback");
        if (this.f342529a.compareAndSet(false, true)) {
            this.f342530b.c();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.DeepLinkHelper", "onDeepLinkDone#buildWeAppStartCallback, already callback");
        }
    }
}
