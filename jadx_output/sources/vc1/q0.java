package vc1;

/* loaded from: classes13.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator f435126d;

    public q0(vc1.p1 p1Var, com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator markerTranslateAnimator) {
        this.f435126d = markerTranslateAnimator;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f435126d.startAnimation();
    }
}
