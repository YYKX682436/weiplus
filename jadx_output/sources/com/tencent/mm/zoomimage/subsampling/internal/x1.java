package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public abstract class x1 {
    public static final int a(long j17, long j18, float f17) {
        if (zq5.h.b(j17) || zq5.h.b(j18) || f17 <= 0.0f) {
            return 0;
        }
        int i17 = zq5.g.f475066c;
        int pow = (int) java.lang.Math.pow(2.0d, a06.d.b((float) (java.lang.Math.log(zq5.b.c(((int) (j17 >> 32)) / (((int) (j18 >> 32)) * f17), 1)) / a06.a.f478a)));
        if (pow < 1) {
            return 1;
        }
        return pow;
    }
}
