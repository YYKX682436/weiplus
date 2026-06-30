package fr5;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr5.m f265982d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(fr5.m mVar) {
        super(1);
        this.f265982d = mVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float f17;
        fr5.f detector = (fr5.f) obj;
        kotlin.jvm.internal.o.g(detector, "detector");
        boolean z17 = false;
        if (detector.a()) {
            boolean z18 = detector.f265928i;
            boolean z19 = (z18 && detector.f265933n < detector.f265934o) || (!z18 && detector.f265933n > detector.f265934o);
            float f18 = 1;
            float abs = (float) (java.lang.Math.abs(f18 - (detector.f265933n / detector.f265934o)) * 0.5f);
            if (detector.f265934o > detector.f265921b) {
                f17 = z19 ? f18 + abs : f18 - abs;
            }
            f17 = 1.0f;
        } else {
            float f19 = detector.f265934o;
            if (f19 > 0.0f) {
                f17 = detector.f265933n / f19;
            }
            f17 = 1.0f;
        }
        java.lang.Float valueOf = java.lang.Float.valueOf(f17);
        float floatValue = valueOf.floatValue();
        if (!java.lang.Float.isNaN(floatValue) && !java.lang.Float.isInfinite(floatValue)) {
            z17 = true;
        }
        if (!z17) {
            valueOf = null;
        }
        if (valueOf == null) {
            valueOf = java.lang.Float.valueOf(1.0f);
        }
        this.f265982d.f266000p = valueOf;
        return java.lang.Boolean.TRUE;
    }
}
