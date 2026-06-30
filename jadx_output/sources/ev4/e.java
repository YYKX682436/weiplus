package ev4;

/* loaded from: classes8.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ev4.j f256945d;

    public e(ev4.j jVar) {
        this.f256945d = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fv4.i iVar = this.f256945d.f256953a;
        iVar.f267014h.compareAndSet(false, true);
        fv4.j jVar = new fv4.j(iVar.f267008b);
        iVar.f267008b.g();
        iVar.f267008b = jVar;
        jVar.f(iVar);
    }
}
