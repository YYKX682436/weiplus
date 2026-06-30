package fj1;

/* loaded from: classes7.dex */
public final class r implements com.tencent.mm.plugin.appbrand.appcache.ob {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fj1.t f263133a;

    public r(fj1.t tVar) {
        this.f263133a = tVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.ob
    public void b(java.lang.String name, com.tencent.mm.plugin.appbrand.appcache.y8 handle) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(handle, "handle");
        com.tencent.mars.xlog.Log.e(this.f263133a.f263137a, "reportWxaPkgParseError name:" + name + ", pkg:" + handle.b());
    }
}
