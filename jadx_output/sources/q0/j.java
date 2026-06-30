package q0;

/* loaded from: classes14.dex */
public final class j extends q0.a {

    /* renamed from: f, reason: collision with root package name */
    public final q0.h f359236f;

    /* renamed from: g, reason: collision with root package name */
    public int f359237g;

    /* renamed from: h, reason: collision with root package name */
    public q0.m f359238h;

    /* renamed from: i, reason: collision with root package name */
    public int f359239i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q0.h builder, int i17) {
        super(i17, builder.d());
        kotlin.jvm.internal.o.g(builder, "builder");
        this.f359236f = builder;
        this.f359237g = builder.j();
        this.f359239i = -1;
        c();
    }

    @Override // q0.a, java.util.ListIterator
    public void add(java.lang.Object obj) {
        b();
        int i17 = this.f359216d;
        q0.h hVar = this.f359236f;
        hVar.add(i17, obj);
        this.f359216d++;
        this.f359217e = hVar.d();
        this.f359237g = hVar.j();
        this.f359239i = -1;
        c();
    }

    public final void b() {
        if (this.f359237g != this.f359236f.j()) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void c() {
        q0.h hVar = this.f359236f;
        java.lang.Object[] objArr = hVar.f359231i;
        if (objArr == null) {
            this.f359238h = null;
            return;
        }
        int d17 = (hVar.d() - 1) & (-32);
        int i17 = this.f359216d;
        if (i17 > d17) {
            i17 = d17;
        }
        int i18 = (hVar.f359229g / 5) + 1;
        q0.m mVar = this.f359238h;
        if (mVar == null) {
            this.f359238h = new q0.m(objArr, i17, d17, i18);
            return;
        }
        kotlin.jvm.internal.o.d(mVar);
        mVar.f359216d = i17;
        mVar.f359217e = d17;
        mVar.f359243f = i18;
        if (mVar.f359244g.length < i18) {
            mVar.f359244g = new java.lang.Object[i18];
        }
        mVar.f359244g[0] = objArr;
        ?? r66 = i17 == d17 ? 1 : 0;
        mVar.f359245h = r66;
        mVar.c(i17 - r66, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        b();
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i17 = this.f359216d;
        this.f359239i = i17;
        q0.m mVar = this.f359238h;
        q0.h hVar = this.f359236f;
        if (mVar == null) {
            java.lang.Object[] objArr = hVar.f359232m;
            this.f359216d = i17 + 1;
            return objArr[i17];
        }
        if (mVar.hasNext()) {
            this.f359216d++;
            return mVar.next();
        }
        java.lang.Object[] objArr2 = hVar.f359232m;
        int i18 = this.f359216d;
        this.f359216d = i18 + 1;
        return objArr2[i18 - mVar.f359217e];
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        b();
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        int i17 = this.f359216d;
        int i18 = i17 - 1;
        this.f359239i = i18;
        q0.m mVar = this.f359238h;
        q0.h hVar = this.f359236f;
        if (mVar == null) {
            java.lang.Object[] objArr = hVar.f359232m;
            this.f359216d = i18;
            return objArr[i18];
        }
        int i19 = mVar.f359217e;
        if (i17 <= i19) {
            this.f359216d = i18;
            return mVar.previous();
        }
        java.lang.Object[] objArr2 = hVar.f359232m;
        this.f359216d = i18;
        return objArr2[i18 - i19];
    }

    @Override // q0.a, java.util.ListIterator, java.util.Iterator
    public void remove() {
        b();
        int i17 = this.f359239i;
        if (i17 == -1) {
            throw new java.lang.IllegalStateException();
        }
        q0.h hVar = this.f359236f;
        hVar.e(i17);
        int i18 = this.f359239i;
        if (i18 < this.f359216d) {
            this.f359216d = i18;
        }
        this.f359217e = hVar.d();
        this.f359237g = hVar.j();
        this.f359239i = -1;
        c();
    }

    @Override // q0.a, java.util.ListIterator
    public void set(java.lang.Object obj) {
        b();
        int i17 = this.f359239i;
        if (i17 == -1) {
            throw new java.lang.IllegalStateException();
        }
        q0.h hVar = this.f359236f;
        hVar.set(i17, obj);
        this.f359237g = hVar.j();
        c();
    }
}
