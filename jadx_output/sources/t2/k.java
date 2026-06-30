package t2;

/* loaded from: classes14.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f414652a;

    /* renamed from: b, reason: collision with root package name */
    public t2.o f414653b;

    /* renamed from: c, reason: collision with root package name */
    public t2.t f414654c = new t2.t();

    /* renamed from: d, reason: collision with root package name */
    public boolean f414655d;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if (r6 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            r5.f414655d = r0
            t2.o r1 = r5.f414653b
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L23
            t2.j r1 = r1.f414658e
            r1.getClass()
            if (r6 != 0) goto L12
            java.lang.Object r6 = t2.j.f414648m
        L12:
            t2.b r4 = t2.j.f414647i
            boolean r6 = r4.b(r1, r2, r6)
            if (r6 == 0) goto L1f
            t2.j.b(r1)
            r6 = r0
            goto L20
        L1f:
            r6 = r3
        L20:
            if (r6 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            if (r0 == 0) goto L2c
            r5.f414652a = r2
            r5.f414653b = r2
            r5.f414654c = r2
        L2c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.k.a(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r6 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(java.lang.Throwable r6) {
        /*
            r5 = this;
            r0 = 1
            r5.f414655d = r0
            t2.o r1 = r5.f414653b
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L27
            t2.j r1 = r1.f414658e
            r1.getClass()
            t2.e r4 = new t2.e
            r6.getClass()
            r4.<init>(r6)
            t2.b r6 = t2.j.f414647i
            boolean r6 = r6.b(r1, r2, r4)
            if (r6 == 0) goto L23
            t2.j.b(r1)
            r6 = r0
            goto L24
        L23:
            r6 = r3
        L24:
            if (r6 == 0) goto L27
            goto L28
        L27:
            r0 = r3
        L28:
            if (r0 == 0) goto L30
            r5.f414652a = r2
            r5.f414653b = r2
            r5.f414654c = r2
        L30:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.k.b(java.lang.Throwable):boolean");
    }

    public void finalize() {
        t2.t tVar;
        t2.o oVar = this.f414653b;
        if (oVar != null && !oVar.isDone()) {
            t2.l lVar = new t2.l("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f414652a);
            t2.j jVar = oVar.f414658e;
            jVar.getClass();
            if (t2.j.f414647i.b(jVar, null, new t2.e(lVar))) {
                t2.j.b(jVar);
            }
        }
        if (this.f414655d || (tVar = this.f414654c) == null) {
            return;
        }
        tVar.i(null);
    }
}
