package va3;

/* loaded from: classes15.dex */
public class c0 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ va3.f0 f434271d;

    public c0(va3.f0 f0Var) {
        this.f434271d = f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r22 <= 0.0d) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        if (((r6 == -85.0d || r10 == -1000.0d || r12 == -1000.0d || r3 == -85.0d || o25.l2.a(r6, r10, r3, r12) < 5.0d) ? false : true) == false) goto L34;
     */
    @Override // i11.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGetLocation(boolean r18, float r19, float r20, int r21, double r22, double r24, double r26) {
        /*
            r17 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = 0
            if (r18 != 0) goto La
            return r3
        La:
            r4 = r17
            va3.f0 r5 = r4.f434271d
            double r6 = r5.f434283f
            r8 = -4571364728013586432(0xc08f400000000000, double:-1000.0)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r14 = 1
            if (r10 == 0) goto L5e
            double r10 = r5.f434284g
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 == 0) goto L5e
            double r12 = (double) r0
            double r3 = (double) r1
            if (r2 != 0) goto L2e
            r2 = 0
            int r2 = (r22 > r2 ? 1 : (r22 == r2 ? 0 : -1))
            if (r2 != 0) goto L2b
            goto L5b
        L2b:
            if (r2 <= 0) goto L5b
            goto L59
        L2e:
            if (r2 != r14) goto L5b
            r15 = -4587690276662804480(0xc055400000000000, double:-85.0)
            int r2 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r2 == 0) goto L55
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 != 0) goto L3e
            goto L55
        L3e:
            int r2 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r2 == 0) goto L55
            int r2 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r2 != 0) goto L47
            goto L55
        L47:
            r8 = r10
            r10 = r3
            double r2 = o25.l2.a(r6, r8, r10, r12)
            r6 = 4617315517961601024(0x4014000000000000, double:5.0)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L55
            r2 = r14
            goto L56
        L55:
            r2 = 0
        L56:
            if (r2 != 0) goto L59
            goto L5b
        L59:
            r3 = r14
            goto L5c
        L5b:
            r3 = 0
        L5c:
            r5.f434286i = r3
        L5e:
            double r1 = (double) r1
            r5.f434283f = r1
            double r3 = (double) r0
            r5.f434284g = r3
            double r6 = r5.f434282e
            r8 = 4651127699538968576(0x408c200000000000, double:900.0)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 == 0) goto L7f
            double r6 = r5.f434281d
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L76
            goto L7f
        L76:
            r5.f434282e = r6
            double r0 = va3.x.a(r1, r3)
            r5.f434281d = r0
            goto L87
        L7f:
            double r0 = va3.x.a(r1, r3)
            r5.f434281d = r0
            r5.f434282e = r0
        L87:
            double r0 = r5.f434281d
            double r0 = r5.f434282e
            boolean r0 = r5.f434286i
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: va3.c0.onGetLocation(boolean, float, float, int, double, double, double):boolean");
    }
}
