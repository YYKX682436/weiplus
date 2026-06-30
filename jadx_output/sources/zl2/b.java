package zl2;

/* loaded from: classes11.dex */
public final class b implements e51.i {

    /* renamed from: a, reason: collision with root package name */
    public java.util.concurrent.ConcurrentLinkedQueue f473662a;

    public final e51.j a(android.content.Context context, e51.f generator, e51.k source, g51.a renderStrategy) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(generator, "generator");
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(renderStrategy, "renderStrategy");
        if (this.f473662a == null) {
            this.f473662a = new java.util.concurrent.ConcurrentLinkedQueue();
        }
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f473662a;
        e51.j jVar = concurrentLinkedQueue != null ? (e51.j) concurrentLinkedQueue.poll() : null;
        if (jVar != null) {
            jVar.c(generator, source, renderStrategy, com.tencent.mm.particles.ConfettiView.a(context));
            jVar.f249591l = 0.001f;
            jVar.f249592m = 999.99994f;
            jVar.f249595p = 0.0f;
            jVar.f249596q = 0.0f;
            jVar.f(-360.0f, 50.0f);
            jVar.D = 1000L;
            jVar.f249589j = 1;
            jVar.H = this;
            return jVar;
        }
        e51.j jVar2 = new e51.j(context, generator, source, renderStrategy);
        jVar2.f249591l = 0.001f;
        jVar2.f249592m = 999.99994f;
        jVar2.f249595p = 0.0f;
        jVar2.f249596q = 0.0f;
        jVar2.f(-360.0f, 50.0f);
        jVar2.D = 1000L;
        jVar2.f249589j = 1;
        jVar2.H = this;
        return jVar2;
    }
}
