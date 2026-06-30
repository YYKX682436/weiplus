package va5;

/* loaded from: classes11.dex */
public final class e implements android.view.animation.Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f17) {
        int i17 = va5.p.P;
        float f18 = 1;
        float f19 = f17 - f18;
        return (f19 * f19 * f19) + f18;
    }
}
