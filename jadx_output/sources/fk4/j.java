package fk4;

/* loaded from: classes12.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk4.k f263611d;

    public j(fk4.k kVar) {
        this.f263611d = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.modelcdntran.l3 Di = t21.o2.Di();
        fk4.k kVar = this.f263611d;
        Di.p(kVar.f(), 0, -1, 0);
        java.util.Iterator it = kVar.f263631s.iterator();
        while (it.hasNext()) {
            ((ok4.a) it.next()).i();
        }
    }
}
