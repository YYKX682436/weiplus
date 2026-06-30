package vc1;

/* loaded from: classes13.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator f435029d;

    public o0(vc1.p1 p1Var, com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator markerTranslateAnimator) {
        this.f435029d = markerTranslateAnimator;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f435029d.cancelAnimation();
    }
}
