package zq5;

/* loaded from: classes15.dex */
public abstract class o {
    public static final zq5.n a(zq5.n div, long j17) {
        kotlin.jvm.internal.o.g(div, "$this$div");
        return new zq5.n(div.f475082a / zq5.q.b(j17), div.f475083b / zq5.q.c(j17), div.f475084c / zq5.q.b(j17), div.f475085d / zq5.q.c(j17));
    }

    public static final zq5.n b(zq5.n limitTo, long j17) {
        kotlin.jvm.internal.o.g(limitTo, "$this$limitTo");
        float b17 = zq5.t.b(j17);
        float a17 = zq5.t.a(j17);
        float f17 = limitTo.f475082a;
        float f18 = limitTo.f475085d;
        float f19 = limitTo.f475084c;
        float f27 = limitTo.f475083b;
        return (f17 < 0.0f || f17 > b17 || f27 < 0.0f || f27 > a17 || f19 < 0.0f || f19 > b17 || f18 < 0.0f || f18 > a17) ? new zq5.n(e06.p.e(f17, 0.0f, b17), e06.p.e(f27, 0.0f, a17), e06.p.e(f19, 0.0f, b17), e06.p.e(f18, 0.0f, a17)) : limitTo;
    }

    public static final zq5.n c(zq5.n reverseRotateInSpace, long j17, int i17) {
        kotlin.jvm.internal.o.g(reverseRotateInSpace, "$this$reverseRotateInSpace");
        if (i17 % 180 != 0) {
            j17 = zq5.u.a(zq5.t.a(j17), zq5.t.b(j17));
        }
        int i18 = (360 - i17) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
        if (!(i18 % 90 == 0)) {
            throw new java.lang.IllegalArgumentException(("rotation must be a multiple of 90, rotation: " + i18).toString());
        }
        int i19 = i18 % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
        if (i19 < 0) {
            i19 += com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
        }
        float f17 = reverseRotateInSpace.f475084c;
        float f18 = reverseRotateInSpace.f475083b;
        float f19 = reverseRotateInSpace.f475082a;
        float f27 = reverseRotateInSpace.f475085d;
        return i19 != 90 ? i19 != 180 ? i19 != 270 ? reverseRotateInSpace : new zq5.n(f18, zq5.t.b(j17) - f17, f27, zq5.t.b(j17) - f19) : new zq5.n(zq5.t.b(j17) - f17, zq5.t.a(j17) - f27, zq5.t.b(j17) - f19, zq5.t.a(j17) - f18) : new zq5.n(zq5.t.a(j17) - f27, f19, zq5.t.a(j17) - f18, f17);
    }

    public static final zq5.e d(zq5.n nVar) {
        kotlin.jvm.internal.o.g(nVar, "<this>");
        return new zq5.e(a06.d.b(nVar.f475082a), a06.d.b(nVar.f475083b), a06.d.b(nVar.f475084c), a06.d.b(nVar.f475085d));
    }

    public static final java.lang.String e(zq5.n nVar) {
        kotlin.jvm.internal.o.g(nVar, "<this>");
        return "[" + zq5.b.c(nVar.f475082a, 2) + 'x' + zq5.b.c(nVar.f475083b, 2) + ',' + zq5.b.c(nVar.f475084c, 2) + 'x' + zq5.b.c(nVar.f475085d, 2) + ']';
    }
}
