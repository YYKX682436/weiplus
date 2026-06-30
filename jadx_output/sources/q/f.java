package q;

/* loaded from: classes13.dex */
public abstract class f implements java.util.Iterator, q.g {

    /* renamed from: d, reason: collision with root package name */
    public q.d f359209d;

    /* renamed from: e, reason: collision with root package name */
    public q.d f359210e;

    public f(q.d dVar, q.d dVar2) {
        this.f359209d = dVar2;
        this.f359210e = dVar;
    }

    @Override // q.g
    public void a(q.d dVar) {
        q.d dVar2 = null;
        if (this.f359209d == dVar && dVar == this.f359210e) {
            this.f359210e = null;
            this.f359209d = null;
        }
        q.d dVar3 = this.f359209d;
        if (dVar3 == dVar) {
            this.f359209d = b(dVar3);
        }
        q.d dVar4 = this.f359210e;
        if (dVar4 == dVar) {
            q.d dVar5 = this.f359209d;
            if (dVar4 != dVar5 && dVar5 != null) {
                dVar2 = c(dVar4);
            }
            this.f359210e = dVar2;
        }
    }

    public abstract q.d b(q.d dVar);

    public abstract q.d c(q.d dVar);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f359210e != null;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        q.d dVar = this.f359210e;
        q.d dVar2 = this.f359209d;
        this.f359210e = (dVar == dVar2 || dVar2 == null) ? null : c(dVar);
        return dVar;
    }
}
