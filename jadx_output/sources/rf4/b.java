package rf4;

/* loaded from: classes3.dex */
public final class b implements android.animation.TypeEvaluator {
    @Override // android.animation.TypeEvaluator
    public java.lang.Object evaluate(float f17, java.lang.Object startValue, java.lang.Object endValue) {
        kotlin.jvm.internal.o.g(startValue, "startValue");
        kotlin.jvm.internal.o.g(endValue, "endValue");
        int intValue = ((java.lang.Integer) startValue).intValue();
        float f18 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((java.lang.Integer) endValue).intValue();
        float pow = (float) java.lang.Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) java.lang.Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) java.lang.Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) java.lang.Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float f19 = f18 + (((((intValue2 >> 24) & 255) / 255.0f) - f18) * f17);
        float pow5 = pow2 + ((((float) java.lang.Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d)) - pow2) * f17);
        float pow6 = pow3 + (f17 * (((float) java.lang.Math.pow((intValue2 & 255) / 255.0f, 2.2d)) - pow3));
        return java.lang.Integer.valueOf((java.lang.Math.round(((float) java.lang.Math.pow(pow + ((pow4 - pow) * f17), 0.45454545454545453d)) * 255.0f) << 16) | (java.lang.Math.round(f19 * 255.0f) << 24) | (java.lang.Math.round(((float) java.lang.Math.pow(pow5, 0.45454545454545453d)) * 255.0f) << 8) | java.lang.Math.round(((float) java.lang.Math.pow(pow6, 0.45454545454545453d)) * 255.0f));
    }
}
