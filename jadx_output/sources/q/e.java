package q;

/* loaded from: classes13.dex */
public class e implements java.util.Iterator, q.g {

    /* renamed from: d, reason: collision with root package name */
    public q.d f359206d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f359207e = true;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q.h f359208f;

    public e(q.h hVar) {
        this.f359208f = hVar;
    }

    @Override // q.g
    public void a(q.d dVar) {
        q.d dVar2 = this.f359206d;
        if (dVar == dVar2) {
            q.d dVar3 = dVar2.f359205g;
            this.f359206d = dVar3;
            this.f359207e = dVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f359207e) {
            return this.f359208f.f359211d != null;
        }
        q.d dVar = this.f359206d;
        return (dVar == null || dVar.f359204f == null) ? false : true;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (this.f359207e) {
            this.f359207e = false;
            this.f359206d = this.f359208f.f359211d;
        } else {
            q.d dVar = this.f359206d;
            this.f359206d = dVar != null ? dVar.f359204f : null;
        }
        return this.f359206d;
    }
}
