package d0;

/* loaded from: classes14.dex */
public final class i2 implements s1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0.t1 f225145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f225146b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0.b3 f225147c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.s f225148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0.p0 f225149e;

    public i2(d0.t1 t1Var, float f17, d0.b3 b3Var, yz5.s sVar, d0.p0 p0Var) {
        this.f225145a = t1Var;
        this.f225146b = f17;
        this.f225147c = b3Var;
        this.f225148d = sVar;
        this.f225149e = p0Var;
    }

    @Override // s1.t0
    public int a(s1.u uVar, java.util.List measurables, int i17) {
        yz5.q qVar;
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurables, "measurables");
        if (this.f225145a == d0.t1.Horizontal) {
            int i18 = d0.s1.f225206a;
            qVar = d0.f1.f225113d;
        } else {
            int i19 = d0.s1.f225206a;
            qVar = d0.r1.f225202d;
        }
        return ((java.lang.Number) qVar.invoke(measurables, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(uVar.G(this.f225146b)))).intValue();
    }

    @Override // s1.t0
    public int b(s1.u uVar, java.util.List measurables, int i17) {
        yz5.q qVar;
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurables, "measurables");
        if (this.f225145a == d0.t1.Horizontal) {
            int i18 = d0.s1.f225206a;
            qVar = d0.w0.f225230d;
        } else {
            int i19 = d0.s1.f225206a;
            qVar = d0.i1.f225144d;
        }
        return ((java.lang.Number) qVar.invoke(measurables, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(uVar.G(this.f225146b)))).intValue();
    }

    @Override // s1.t0
    public int c(s1.u uVar, java.util.List measurables, int i17) {
        yz5.q qVar;
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurables, "measurables");
        if (this.f225145a == d0.t1.Horizontal) {
            int i18 = d0.s1.f225206a;
            qVar = d0.c1.f225088d;
        } else {
            int i19 = d0.s1.f225206a;
            qVar = d0.o1.f225182d;
        }
        return ((java.lang.Number) qVar.invoke(measurables, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(uVar.G(this.f225146b)))).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x020f A[LOOP:2: B:58:0x020d->B:59:0x020f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0200  */
    @Override // s1.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s1.u0 d(s1.x0 r27, java.util.List r28, long r29) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.i2.d(s1.x0, java.util.List, long):s1.u0");
    }

    @Override // s1.t0
    public int e(s1.u uVar, java.util.List measurables, int i17) {
        yz5.q qVar;
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurables, "measurables");
        if (this.f225145a == d0.t1.Horizontal) {
            int i18 = d0.s1.f225206a;
            qVar = d0.z0.f225248d;
        } else {
            int i19 = d0.s1.f225206a;
            qVar = d0.l1.f225164d;
        }
        return ((java.lang.Number) qVar.invoke(measurables, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(uVar.G(this.f225146b)))).intValue();
    }
}
