package q81;

/* loaded from: classes7.dex */
public final class d0 implements com.tencent.mm.plugin.appbrand.utils.a, wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final t81.c f360701d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f360702e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f360703f;

    public d0(t81.c cmd) {
        kotlin.jvm.internal.o.g(cmd, "cmd");
        this.f360701d = cmd;
        this.f360702e = "MicroMsg.AppBrand.GetCodeRetryQueueNewImpl.RunCmdTask";
    }

    public final yz5.a a() {
        yz5.a aVar = this.f360703f;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.o.o("notifyQueueCallback");
        throw null;
    }

    public final java.lang.Object b(kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        new p81.j(this.f360701d, new q81.c0(rVar)).c();
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return this.f360702e;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("try record ");
        t81.c cVar = this.f360701d;
        sb6.append(cVar);
        com.tencent.mars.xlog.Log.i(this.f360702e, sb6.toString());
        q81.e0.f360705h.add(cVar.field_appId);
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new q81.b0(this, cVar, null), 2, null);
    }
}
