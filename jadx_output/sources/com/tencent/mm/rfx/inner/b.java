package com.tencent.mm.rfx.inner;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.rfx.inner.RfxDisplayLink f192231d;

    public b(com.tencent.mm.rfx.inner.RfxDisplayLink rfxDisplayLink) {
        this.f192231d = rfxDisplayLink;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.animation.ValueAnimator valueAnimator;
        valueAnimator = this.f192231d.mAnimator;
        valueAnimator.cancel();
    }
}
