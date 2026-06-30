package pv2;

/* loaded from: classes10.dex */
public final class b implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pv2.c f358573a;

    public b(pv2.c cVar) {
        this.f358573a = cVar;
    }

    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        pv2.e task = (pv2.e) dVar;
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(status, "status");
        this.f358573a.f358575b.remove(task.f358576f);
    }
}
