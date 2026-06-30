package r26;

/* loaded from: classes10.dex */
public final class d implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public int f368868d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f368869e;

    /* renamed from: f, reason: collision with root package name */
    public int f368870f;

    /* renamed from: g, reason: collision with root package name */
    public e06.k f368871g;

    /* renamed from: h, reason: collision with root package name */
    public int f368872h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r26.e f368873i;

    public d(r26.e eVar) {
        this.f368873i = eVar;
        int f17 = e06.p.f(eVar.f368875b, 0, eVar.f368874a.length());
        this.f368869e = f17;
        this.f368870f = f17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r6 < r3) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r7 = this;
            int r0 = r7.f368870f
            r1 = 0
            if (r0 >= 0) goto Lb
            r7.f368868d = r1
            r0 = 0
            r7.f368871g = r0
            goto L7b
        Lb:
            r26.e r2 = r7.f368873i
            int r3 = r2.f368876c
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L1a
            int r6 = r7.f368872h
            int r6 = r6 + r5
            r7.f368872h = r6
            if (r6 >= r3) goto L22
        L1a:
            java.lang.CharSequence r3 = r2.f368874a
            int r3 = r3.length()
            if (r0 <= r3) goto L34
        L22:
            e06.k r0 = new e06.k
            int r1 = r7.f368869e
            java.lang.CharSequence r2 = r2.f368874a
            int r2 = r26.n0.H(r2)
            r0.<init>(r1, r2)
            r7.f368871g = r0
            r7.f368870f = r4
            goto L79
        L34:
            yz5.p r0 = r2.f368877d
            java.lang.CharSequence r3 = r2.f368874a
            int r6 = r7.f368870f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.invoke(r3, r6)
            jz5.l r0 = (jz5.l) r0
            if (r0 != 0) goto L58
            e06.k r0 = new e06.k
            int r1 = r7.f368869e
            java.lang.CharSequence r2 = r2.f368874a
            int r2 = r26.n0.H(r2)
            r0.<init>(r1, r2)
            r7.f368871g = r0
            r7.f368870f = r4
            goto L79
        L58:
            java.lang.Object r2 = r0.f302833d
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f302834e
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.f368869e
            e06.k r3 = e06.p.m(r3, r2)
            r7.f368871g = r3
            int r2 = r2 + r0
            r7.f368869e = r2
            if (r0 != 0) goto L76
            r1 = r5
        L76:
            int r2 = r2 + r1
            r7.f368870f = r2
        L79:
            r7.f368868d = r5
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r26.d.b():void");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f368868d == -1) {
            b();
        }
        return this.f368868d == 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (this.f368868d == -1) {
            b();
        }
        if (this.f368868d == 0) {
            throw new java.util.NoSuchElementException();
        }
        e06.k kVar = this.f368871g;
        kotlin.jvm.internal.o.e(kVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f368871g = null;
        this.f368868d = -1;
        return kVar;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
