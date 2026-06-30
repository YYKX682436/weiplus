package y50;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final y50.m f459460a;

    /* renamed from: b, reason: collision with root package name */
    public static final y50.e f459461b;

    /* renamed from: c, reason: collision with root package name */
    public static final y50.e f459462c;

    static {
        y50.m mVar = new y50.m();
        f459460a = mVar;
        f459461b = new y50.e(new y50.k(mVar), new y50.l(mVar));
        f459462c = new y50.e(new y50.f(mVar), new y50.g(mVar));
    }

    public static void a(y50.m mVar, com.tencent.mm.ui.MMActivity activity, java.lang.Integer[] targetColor, long j17, java.lang.Integer[] numArr, android.view.animation.Interpolator interpolator, int i17, java.lang.Object obj) {
        long j18 = (i17 & 4) != 0 ? 0L : j17;
        java.lang.Integer[] fromColor = (i17 & 8) != 0 ? new java.lang.Integer[0] : numArr;
        android.view.animation.Interpolator interpolator2 = (i17 & 16) != 0 ? null : interpolator;
        mVar.getClass();
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(targetColor, "targetColor");
        kotlin.jvm.internal.o.g(fromColor, "fromColor");
        long j19 = j18;
        android.view.animation.Interpolator interpolator3 = interpolator2;
        mVar.b(activity, f459461b, j19, (java.lang.Integer) kz5.z.U(targetColor, 0), (java.lang.Integer) kz5.z.U(fromColor, 0), interpolator3);
        mVar.b(activity, f459462c, j19, (java.lang.Integer) kz5.z.U(targetColor, 1), (java.lang.Integer) kz5.z.U(fromColor, 1), interpolator3);
    }

    public final void b(com.tencent.mm.ui.MMActivity mMActivity, y50.e eVar, long j17, java.lang.Integer num, java.lang.Integer num2, android.view.animation.Interpolator interpolator) {
        int intValue;
        android.animation.ValueAnimator valueAnimator = eVar.f459448d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        eVar.f459448d = null;
        java.lang.Integer num3 = eVar.f459447c;
        yz5.l lVar = eVar.f459445a;
        if (num3 == null) {
            if (num == null) {
                return;
            } else {
                eVar.f459447c = (java.lang.Integer) lVar.invoke(mMActivity);
            }
        }
        if (num != null) {
            intValue = num.intValue();
        } else {
            java.lang.Integer num4 = eVar.f459447c;
            intValue = num4 != null ? num4.intValue() : 0;
        }
        if (j17 <= 0) {
            if (num == null) {
                eVar.f459447c = null;
            }
            eVar.f459446b.invoke(mMActivity, java.lang.Integer.valueOf(intValue));
            return;
        }
        int intValue2 = num2 != null ? num2.intValue() : ((java.lang.Number) lVar.invoke(mMActivity)).intValue();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(j17);
        ofFloat.addUpdateListener(new y50.h(intValue2, intValue, eVar, mMActivity));
        ofFloat.addListener(new y50.j(num, eVar, mMActivity, intValue));
        ofFloat.addListener(new y50.i(eVar, mMActivity, intValue));
        ofFloat.setInterpolator(interpolator != null ? interpolator : ta5.h.f416879a.a());
        eVar.f459448d = ofFloat;
        ofFloat.start();
    }
}
