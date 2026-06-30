package zq5;

/* loaded from: classes15.dex */
public abstract class m {
    public static final long a(float f17, float f18) {
        long floatToIntBits = (java.lang.Float.floatToIntBits(f18) & io.flutter.embedding.android.KeyboardMap.kValueMask) | (java.lang.Float.floatToIntBits(f17) << 32);
        int i17 = zq5.l.f475079d;
        return floatToIntBits;
    }

    public static final long b(long j17, zq5.n rect) {
        kotlin.jvm.internal.o.g(rect, "rect");
        float b17 = zq5.l.b(j17);
        float f17 = rect.f475082a;
        float f18 = rect.f475085d;
        float f19 = rect.f475083b;
        float f27 = rect.f475084c;
        return (b17 < f17 || zq5.l.b(j17) > f27 || zq5.l.c(j17) < f19 || zq5.l.c(j17) > f18) ? a(e06.p.e(zq5.l.b(j17), f17, f27), e06.p.e(zq5.l.c(j17), f19, f18)) : j17;
    }

    public static final long c(long j17, long j18, int i17) {
        if (!(i17 % 90 == 0)) {
            throw new java.lang.IllegalArgumentException(("rotation must be a multiple of 90, rotation: " + i17).toString());
        }
        int i18 = i17 % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
        if (i18 < 0) {
            i18 += com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
        }
        return i18 != 90 ? i18 != 180 ? i18 != 270 ? j17 : a(zq5.l.c(j17), zq5.t.b(j18) - zq5.l.b(j17)) : a(zq5.t.b(j18) - zq5.l.b(j17), zq5.t.a(j18) - zq5.l.c(j17)) : a(zq5.t.a(j18) - zq5.l.c(j17), zq5.l.b(j17));
    }

    public static final long d(long j17, long j18) {
        return a(zq5.l.b(j17) * zq5.q.b(j18), zq5.l.c(j17) * zq5.q.c(j18));
    }

    public static final java.lang.String e(long j17) {
        if (!(j17 != zq5.l.f475078c)) {
            return "Unspecified";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(zq5.b.c(zq5.l.b(j17), 2));
        sb6.append('x');
        sb6.append(zq5.b.c(zq5.l.c(j17), 2));
        return sb6.toString();
    }
}
