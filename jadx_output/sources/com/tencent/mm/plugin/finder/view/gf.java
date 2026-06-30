package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class gf implements android.animation.TimeInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.animation.AccelerateInterpolator f132159a = new android.view.animation.AccelerateInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public final android.view.animation.DecelerateInterpolator f132160b = new android.view.animation.DecelerateInterpolator();

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f17) {
        com.tencent.mars.xlog.Log.i("Finder.FinderMileStoneView", "input:" + f17);
        if (f17 <= 0.5f) {
            return this.f132159a.getInterpolation(f17 / 0.5f) * 0.5f;
        }
        return (this.f132160b.getInterpolation((f17 - 0.5f) / 0.5f) * 0.5f) + 0.5f;
    }
}
