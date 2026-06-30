package wz3;

/* loaded from: classes.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wz3.h f450783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent f450784e;

    public g(wz3.h hVar, com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent) {
        this.f450783d = hVar;
        this.f450784e = checkResUpdateCacheFileEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = this.f450784e;
        java.lang.String filePath = checkResUpdateCacheFileEvent.f54053g.f7761c;
        kotlin.jvm.internal.o.f(filePath, "filePath");
        am.r2 r2Var = checkResUpdateCacheFileEvent.f54053g;
        wz3.h.wi(this.f450783d, filePath, r2Var.f7759a, r2Var.f7760b, r2Var.f7762d);
    }
}
