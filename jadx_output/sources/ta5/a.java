package ta5;

/* loaded from: classes4.dex */
public class a extends android.view.animation.BounceInterpolator {
    @Override // android.view.animation.BounceInterpolator, android.animation.TimeInterpolator
    public float getInterpolation(float f17) {
        double d17;
        double d18;
        double d19;
        double d27 = f17;
        if (d27 < 0.36363636363636365d) {
            d19 = 7.5625d * d27 * d27;
        } else {
            if (d27 < 0.7272727272727273d) {
                double d28 = (float) (d27 - 0.5454545454545454d);
                d17 = 7.5625d * d28 * d28;
                d18 = 0.75d;
            } else {
                double d29 = (float) (d27 - 0.8181818181818182d);
                d17 = 7.5625d * d29 * d29;
                d18 = 0.9375d;
            }
            d19 = d17 + d18;
        }
        return (float) d19;
    }
}
