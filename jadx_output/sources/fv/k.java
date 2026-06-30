package fv;

/* loaded from: classes16.dex */
public final class k implements qk.t6 {

    /* renamed from: a, reason: collision with root package name */
    public final qk.q f266928a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f266929b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f266930c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f266931d;

    /* renamed from: e, reason: collision with root package name */
    public fv.l f266932e;

    public k(qk.q config, java.lang.String tag, yz5.a doReleaseCallback) {
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(doReleaseCallback, "doReleaseCallback");
        this.f266928a = config;
        this.f266929b = tag;
        this.f266930c = doReleaseCallback;
        this.f266931d = true;
        fv.e eVar = new fv.e(this);
        fv.b bVar = new fv.b(this);
        com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner.INSTANCE.addLifecycleCallback(eVar);
        com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE.addLifecycleCallback(bVar);
    }

    @Override // qk.t6
    public boolean a() {
        return this.f266931d;
    }

    @Override // qk.t6
    public void b() {
        com.tencent.mars.xlog.Log.i(d(), "markActive");
        pm0.v.X(new fv.f(this));
    }

    @Override // qk.t6
    public void c() {
        com.tencent.mars.xlog.Log.i(d(), "markInactive");
        pm0.v.X(new fv.g(this));
    }

    public final java.lang.String d() {
        return "MicroMsg.DelayReleaseTask:" + this.f266929b + ':' + hashCode();
    }
}
