package uz0;

/* loaded from: classes14.dex */
public final class n implements b0.q1 {

    /* renamed from: a, reason: collision with root package name */
    public final uz0.r f432143a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f432144b;

    /* renamed from: c, reason: collision with root package name */
    public final z.d0 f432145c;

    /* renamed from: d, reason: collision with root package name */
    public final z.p f432146d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.v2 f432147e;

    public n(uz0.r layoutInfo, yz5.l maximumFlingDistance, z.d0 decayAnimationSpec, z.p springAnimationSpec) {
        kotlin.jvm.internal.o.g(layoutInfo, "layoutInfo");
        kotlin.jvm.internal.o.g(maximumFlingDistance, "maximumFlingDistance");
        kotlin.jvm.internal.o.g(decayAnimationSpec, "decayAnimationSpec");
        kotlin.jvm.internal.o.g(springAnimationSpec, "springAnimationSpec");
        this.f432143a = layoutInfo;
        this.f432144b = maximumFlingDistance;
        this.f432145c = decayAnimationSpec;
        this.f432146d = springAnimationSpec;
        this.f432147e = n0.s4.c(null, null, 2, null);
    }

    public static final boolean b(uz0.n nVar, z.o oVar, uz0.s sVar, int i17, yz5.l lVar) {
        nVar.getClass();
        ((java.lang.Number) oVar.c()).floatValue();
        java.util.Objects.toString(sVar);
        float floatValue = ((java.lang.Number) oVar.c()).floatValue();
        uz0.r rVar = nVar.f432143a;
        int c17 = (floatValue <= 0.0f || sVar.a() != i17) ? (floatValue >= 0.0f || sVar.a() != i17 + (-1)) ? 0 : rVar.c(sVar.a() + 1) : rVar.c(sVar.a());
        if (c17 == 0) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("SnapperFlingBehavior", "Scrolled past item. vel:" + ((java.lang.Number) oVar.c()).floatValue() + ", current item: " + sVar + "} target:" + i17);
        lVar.invoke(java.lang.Float.valueOf((float) c17));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x01c3, code lost:
    
        if (r1 >= r0.c(r5.a() + 1)) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0136  */
    @Override // b0.q1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(b0.p2 r19, float r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uz0.n.a(b0.p2, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final float c(float f17) {
        uz0.r rVar = this.f432143a;
        if (f17 < 0.0f && !rVar.b()) {
            return f17;
        }
        if (f17 <= 0.0f || rVar.a()) {
            return 0.0f;
        }
        return f17;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(b0.p2 r25, uz0.s r26, int r27, float r28, boolean r29, kotlin.coroutines.Continuation r30) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uz0.n.d(b0.p2, uz0.s, int, float, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(b0.p2 r26, uz0.s r27, int r28, float r29, kotlin.coroutines.Continuation r30) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uz0.n.e(b0.p2, uz0.s, int, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void f(java.lang.Integer num) {
        ((n0.q4) this.f432147e).setValue(num);
    }
}
