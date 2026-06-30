package ym5;

/* loaded from: classes15.dex */
public class f3 implements android.view.animation.Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public android.view.animation.Interpolator f463296a = new android.view.animation.DecelerateInterpolator();

    public f3(com.tencent.mm.view.PhotoView photoView, ym5.y2 y2Var) {
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f17) {
        android.view.animation.Interpolator interpolator = this.f463296a;
        return interpolator != null ? interpolator.getInterpolation(f17) : f17;
    }
}
