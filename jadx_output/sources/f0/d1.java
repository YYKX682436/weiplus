package f0;

/* loaded from: classes14.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f258042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f258043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.p2 f258044f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(float f17, kotlin.jvm.internal.e0 e0Var, b0.p2 p2Var) {
        super(1);
        this.f258042d = f17;
        this.f258043e = e0Var;
        this.f258044f = p2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        if ((r1 == ((java.lang.Number) r7.b()).floatValue()) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r1 < r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r1 > r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        r1 = r0;
     */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r7) {
        /*
            r6 = this;
            z.o r7 = (z.o) r7
            java.lang.String r0 = "$this$animateTo"
            kotlin.jvm.internal.o.g(r7, r0)
            float r0 = r6.f258042d
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L1f
            java.lang.Object r1 = r7.b()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 <= 0) goto L1d
            goto L31
        L1d:
            r0 = r1
            goto L31
        L1f:
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto L32
            java.lang.Object r1 = r7.b()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 >= 0) goto L1d
        L31:
            r1 = r0
        L32:
            kotlin.jvm.internal.e0 r0 = r6.f258043e
            float r2 = r0.f310115d
            float r2 = r1 - r2
            b0.p2 r3 = r6.f258044f
            float r3 = r3.a(r2)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L46
            r3 = r4
            goto L47
        L46:
            r3 = r5
        L47:
            if (r3 == 0) goto L5b
            java.lang.Object r3 = r7.b()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L58
            goto L59
        L58:
            r4 = r5
        L59:
            if (r4 != 0) goto L5e
        L5b:
            r7.a()
        L5e:
            float r7 = r0.f310115d
            float r7 = r7 + r2
            r0.f310115d = r7
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.d1.invoke(java.lang.Object):java.lang.Object");
    }
}
