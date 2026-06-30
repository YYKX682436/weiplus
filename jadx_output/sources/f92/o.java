package f92;

/* loaded from: classes10.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f260264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f92.t f260265e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m92.j f260266f;

    public o(java.util.HashSet hashSet, f92.t tVar, m92.j jVar) {
        this.f260264d = hashSet;
        this.f260265e = tVar;
        this.f260266f = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (m92.b bVar : this.f260264d) {
            for (l92.b bVar2 : this.f260265e.h6().f324984g) {
                kotlin.jvm.internal.o.d(bVar);
                ((f92.i) bVar2).c(bVar, this.f260266f.name());
            }
        }
    }
}
