package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class nv implements android.view.animation.Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float f113679a;

    /* renamed from: b, reason: collision with root package name */
    public final float f113680b;

    public nv(android.graphics.PointF divide) {
        kotlin.jvm.internal.o.g(divide, "divide");
        this.f113679a = divide.x;
        this.f113680b = divide.y;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f17) {
        float f18 = this.f113679a;
        float f19 = this.f113680b;
        if (f17 < f18) {
            return (f17 / f18) * f19;
        }
        float f27 = 1;
        return f19 + (((f17 - f18) / (f27 - f18)) * (f27 - f19));
    }
}
