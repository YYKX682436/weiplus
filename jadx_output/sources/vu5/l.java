package vu5;

/* loaded from: classes12.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final vu5.f f440359a;

    /* renamed from: b, reason: collision with root package name */
    public final vu5.j f440360b;

    /* renamed from: c, reason: collision with root package name */
    public final vu5.q f440361c = new vu5.q();

    public l(ku5.c cVar) {
        this.f440359a = new vu5.f(cVar.f312555b, cVar.f312554a);
        this.f440360b = new vu5.j(cVar.f312556c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if ((r4.f440357e.getQueue().size() > 0) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if ((r4.f440357e.getQueue().size() > 0) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if ((r4.f440357e.getQueue().size() > 0) != false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [vu5.j] */
    /* JADX WARN: Type inference failed for: r4v1, types: [vu5.f] */
    /* JADX WARN: Type inference failed for: r4v2, types: [vu5.k] */
    /* JADX WARN: Type inference failed for: r5v0, types: [vu5.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wu5.c a(wu5.l r6, boolean r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r6.f449854o
            boolean r1 = r0 instanceof wu5.a
            r2 = 1
            r3 = 0
            vu5.j r4 = r5.f440360b
            if (r1 == 0) goto L27
            wu5.a r0 = (wu5.a) r0
            java.lang.String r1 = r6.getKey()
            boolean r0 = r0.h(r1)
            if (r0 == 0) goto L27
            vu5.i r0 = r4.f440357e
            java.util.concurrent.BlockingQueue r0 = r0.getQueue()
            int r0 = r0.size()
            if (r0 <= 0) goto L23
            goto L24
        L23:
            r2 = r3
        L24:
            if (r2 == 0) goto L59
            goto L57
        L27:
            ou5.g r0 = pu5.g.f358471a
            if (r0 == 0) goto L47
            java.lang.String r1 = r6.getKey()
            boolean r0 = r0.h(r1)
            if (r0 == 0) goto L36
            goto L57
        L36:
            vu5.i r0 = r4.f440357e
            java.util.concurrent.BlockingQueue r0 = r0.getQueue()
            int r0 = r0.size()
            if (r0 <= 0) goto L43
            goto L44
        L43:
            r2 = r3
        L44:
            if (r2 == 0) goto L59
            goto L57
        L47:
            vu5.i r0 = r4.f440357e
            java.util.concurrent.BlockingQueue r0 = r0.getQueue()
            int r0 = r0.size()
            if (r0 <= 0) goto L54
            goto L55
        L54:
            r2 = r3
        L55:
            if (r2 == 0) goto L59
        L57:
            vu5.f r4 = r5.f440359a
        L59:
            r5.b(r6, r7, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vu5.l.a(wu5.l, boolean):wu5.c");
    }

    public final wu5.c b(wu5.l lVar, boolean z17, vu5.k kVar) {
        lVar.f449857r = kVar;
        android.os.SystemClock.uptimeMillis();
        if (lVar instanceof xu5.v) {
            xu5.v vVar = (xu5.v) lVar;
            vVar.f457342y.f457303b.d(z17 ? -2147483648L : lVar.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS), vVar);
        } else {
            ((vu5.b) lVar.f449857r).c(lVar);
        }
        return lVar;
    }

    public wu5.c c(wu5.l lVar, boolean z17) {
        vu5.q qVar = this.f440361c;
        lVar.f449857r = qVar;
        android.os.SystemClock.uptimeMillis();
        if (!z17) {
            return new ku5.v0(qVar.c(lVar));
        }
        qVar.f440365e.f440364d.postAtFrontOfQueue(lVar);
        return new ku5.v0(lVar);
    }
}
