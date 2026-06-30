package ou3;

/* loaded from: classes12.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ou3.b f348937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent f348938e;

    public a(ou3.b bVar, com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent) {
        this.f348937d = bVar;
        this.f348938e = checkResUpdateCacheFileEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = this.f348938e;
        java.lang.String filePath = checkResUpdateCacheFileEvent.f54053g.f7761c;
        kotlin.jvm.internal.o.f(filePath, "filePath");
        am.r2 r2Var = checkResUpdateCacheFileEvent.f54053g;
        this.f348937d.l(filePath, r2Var.f7759a, r2Var.f7760b, r2Var.f7762d);
    }
}
