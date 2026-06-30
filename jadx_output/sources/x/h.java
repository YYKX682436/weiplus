package x;

/* loaded from: classes15.dex */
public final class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final int f450825d;

    /* renamed from: e, reason: collision with root package name */
    public int f450826e;

    /* renamed from: f, reason: collision with root package name */
    public int f450827f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f450828g = false;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x.m f450829h;

    public h(x.m mVar, int i17) {
        this.f450829h = mVar;
        this.f450825d = i17;
        this.f450826e = mVar.d();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f450827f < this.f450826e;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object b17 = this.f450829h.b(this.f450827f, this.f450825d);
        this.f450827f++;
        this.f450828g = true;
        return b17;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f450828g) {
            throw new java.lang.IllegalStateException();
        }
        int i17 = this.f450827f - 1;
        this.f450827f = i17;
        this.f450826e--;
        this.f450828g = false;
        this.f450829h.h(i17);
    }
}
