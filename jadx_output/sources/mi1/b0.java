package mi1;

/* loaded from: classes7.dex */
public final class b0 implements mi1.f {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f326515d;

    /* renamed from: e, reason: collision with root package name */
    public final mi1.f f326516e;

    /* renamed from: f, reason: collision with root package name */
    public final u81.f f326517f;

    public b0(com.tencent.mm.plugin.appbrand.o6 runtime, mi1.f hostCapsuleBarBlinkHelper) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(hostCapsuleBarBlinkHelper, "hostCapsuleBarBlinkHelper");
        this.f326515d = runtime;
        this.f326516e = hostCapsuleBarBlinkHelper;
        mi1.a0 a0Var = new mi1.a0(this);
        java.lang.String str = runtime.f74803n;
        kotlin.jvm.internal.o.f(str, "getAppId(...)");
        cf.m mVar = new cf.m(str);
        a0Var.invoke(mVar);
        runtime.N.a(mVar);
        this.f326517f = mVar;
    }

    @Override // mi1.f
    public mi1.w0 a(mi1.d dVar, mi1.e eVar, java.lang.String str) {
        return this.f326516e.a(dVar, eVar, str);
    }

    @Override // mi1.f
    public int d() {
        return this.f326516e.d();
    }

    @Override // mi1.f
    public void g(java.lang.String str) {
        this.f326516e.g(str);
    }

    @Override // mi1.f
    public mi1.w0 h(mi1.d dVar) {
        mi1.w0 a17 = this.f326516e.a(dVar, mi1.e.HIGH, "embed_wxa_blink_handler");
        kotlin.jvm.internal.o.f(a17, "blinkCapsuleBar(...)");
        return a17;
    }

    @Override // mi1.f
    public int j() {
        return this.f326516e.j();
    }

    @Override // mi1.f
    public mi1.w0 k(java.util.Map map, mi1.e eVar, java.lang.String str) {
        return this.f326516e.k(map, eVar, str);
    }
}
