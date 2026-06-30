package tp5;

/* loaded from: classes12.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public boolean f421174d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f421175e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tp5.c f421176f;

    public e(tp5.c cVar, tp5.d dVar) {
        this.f421176f = cVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f421174d) {
            return false;
        }
        if (!this.f421175e) {
            tp5.c cVar = this.f421176f;
            cVar.f421168f.step();
            if (cVar.f421168f.isDone()) {
                cVar.close();
                this.f421174d = true;
                return false;
            }
            this.f421175e = true;
        }
        return true;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (this.f421174d || !(this.f421175e || hasNext())) {
            throw new java.util.NoSuchElementException();
        }
        tp5.c cVar = this.f421176f;
        java.lang.Object a17 = cVar.f421169g.a(cVar.f421168f);
        this.f421175e = false;
        return a17;
    }
}
