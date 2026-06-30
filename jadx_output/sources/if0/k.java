package if0;

/* loaded from: classes16.dex */
public final class k implements qk.t6 {

    /* renamed from: a, reason: collision with root package name */
    public final qk.q f291028a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f291029b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f291030c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f291031d;

    /* renamed from: e, reason: collision with root package name */
    public if0.l f291032e;

    public k(qk.q config, java.lang.String tag, yz5.a doReleaseCallback) {
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(doReleaseCallback, "doReleaseCallback");
        this.f291028a = config;
        this.f291029b = tag;
        this.f291030c = doReleaseCallback;
        this.f291031d = true;
        if0.e eVar = new if0.e(this);
        if0.b bVar = new if0.b(this);
        com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner.INSTANCE.addLifecycleCallback(eVar);
        com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE.addLifecycleCallback(bVar);
    }

    @Override // qk.t6
    public boolean a() {
        return this.f291031d;
    }

    @Override // qk.t6
    public void b() {
        com.tencent.mars.xlog.Log.i(d(), "markActive");
        pm0.v.X(new if0.f(this));
    }

    @Override // qk.t6
    public void c() {
        com.tencent.mars.xlog.Log.i(d(), "markInactive");
        pm0.v.X(new if0.g(this));
    }

    public final java.lang.String d() {
        return "MicroMsg.DelayReleaseTask:" + this.f291029b + ':' + hashCode();
    }
}
