package tv0;

/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tv0.j0 f422249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.ClipSegment f422250e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(tv0.j0 j0Var, com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment) {
        super(0);
        this.f422249d = j0Var;
        this.f422250e = clipSegment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        float width;
        int width2;
        tv0.j0 j0Var = this.f422249d;
        yw0.p m76 = j0Var.m7();
        m76.f466580c = yw0.o.f466577e;
        ((yw0.l) m76.f466587a).a();
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = this.f422250e;
        com.tencent.maas.moviecomposing.AspectRatio o17 = clipSegment.o1();
        java.lang.Float valueOf = o17 != null ? java.lang.Float.valueOf((float) o17.f48363b) : null;
        if (valueOf != null) {
            float floatValue = valueOf.floatValue();
            yw0.b n76 = j0Var.n7();
            n76.f466526d = floatValue;
            yw0.l lVar = (yw0.l) n76.f466587a;
            lVar.f466569a.f466571a.requestLayout();
            float f17 = n76.f466526d;
            float f18 = n76.f466529g;
            float f19 = n76.f466530h;
            boolean z17 = f18 / f19 < f17;
            android.graphics.RectF rectF = n76.f466527e;
            if (z17) {
                int i17 = n76.f466524b;
                float f27 = f18 - (i17 * 2);
                if (f27 > 0.0f) {
                    float f28 = f27 / f17;
                    float f29 = (f19 - f28) / 2.0f;
                    float f37 = i17;
                    rectF.set(f37, f29, f27 + f37, f28 + f29);
                }
            } else {
                int i18 = n76.f466525c;
                float f38 = f19 - (i18 * 2);
                if (f38 > 0.0f) {
                    float f39 = f17 * f38;
                    float f47 = (f18 - f39) / 2.0f;
                    float f48 = i18;
                    rectF.set(f47, f48, f39 + f47, f38 + f48);
                }
            }
            lVar.a();
            j0Var.f422212y.set(j0Var.r7());
        }
        com.tencent.maas.moviecomposing.AspectRatio o18 = clipSegment.o1();
        java.lang.Float valueOf2 = o18 != null ? java.lang.Float.valueOf((float) o18.f48363b) : null;
        if (valueOf2 != null) {
            float floatValue2 = valueOf2.floatValue();
            android.view.ViewGroup w76 = j0Var.w7();
            if (floatValue2 < j0Var.u7()) {
                width = j0Var.r7().height();
                width2 = w76.getHeight();
            } else {
                width = j0Var.r7().width();
                width2 = w76.getWidth();
            }
            j0Var.B = width / width2;
        }
        kotlinx.coroutines.l.d(j0Var.getMainScope(), null, null, new tv0.w(j0Var, clipSegment, null), 3, null);
        return jz5.f0.f302826a;
    }
}
