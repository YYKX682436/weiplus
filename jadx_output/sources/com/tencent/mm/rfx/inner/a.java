package com.tencent.mm.rfx.inner;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.rfx.inner.RfxDisplayLink f192230d;

    public a(com.tencent.mm.rfx.inner.RfxDisplayLink rfxDisplayLink) {
        this.f192230d = rfxDisplayLink;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.animation.ValueAnimator valueAnimator;
        valueAnimator = this.f192230d.mAnimator;
        valueAnimator.start();
    }
}
