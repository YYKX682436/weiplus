package dr5;

/* loaded from: classes5.dex */
public abstract class a {
    public static final float a(float f17, int i17) {
        if (java.lang.Float.isNaN(f17)) {
            return f17;
        }
        double pow = java.lang.Math.pow(10.0d, i17);
        return (float) (java.lang.Math.rint(f17 * pow) / pow);
    }
}
