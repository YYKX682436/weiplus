package df5;

/* loaded from: classes10.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df5.v f232218d;

    public u(df5.v vVar) {
        this.f232218d = vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        android.text.SpannableStringBuilder spannableStringBuilder;
        android.text.SpannableStringBuilder spannableStringBuilder2;
        android.text.SpannableStringBuilder spannableStringBuilder3;
        java.lang.Object[] objArr;
        df5.v vVar = this.f232218d;
        vVar.f232236g = null;
        android.widget.TextView textView = vVar.f232237h;
        if (textView == null || (spannableStringBuilder = vVar.f232238i) == null || (spannableStringBuilder2 = vVar.f232239j) == null) {
            return;
        }
        int i17 = vVar.f232240k;
        int i18 = vVar.f232241l;
        int i19 = 0;
        yz5.a aVar = vVar.f232234e;
        if (i17 >= i18) {
            vVar.f232236g = null;
            vVar.f232237h = null;
            vVar.f232238i = null;
            vVar.f232239j = null;
            vVar.f232240k = 0;
            vVar.f232241l = 0;
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        int intValue = ((java.lang.Number) vVar.f232233d.invoke()).intValue();
        int intValue2 = ((java.lang.Number) vVar.f232231b.invoke()).intValue();
        if (intValue2 < 1) {
            intValue2 = 1;
        }
        int min = java.lang.Math.min(intValue > intValue2 ? ((intValue + intValue2) - 1) / intValue2 : 1, vVar.f232241l - vVar.f232240k);
        int i27 = vVar.f232240k;
        int i28 = min + i27;
        spannableStringBuilder2.append((java.lang.CharSequence) spannableStringBuilder.subSequence(i27, i28).toString());
        java.lang.Object[] spans = spannableStringBuilder.getSpans(i27, i28, java.lang.Object.class);
        int length = spannableStringBuilder2.length();
        kotlin.jvm.internal.o.d(spans);
        int length2 = spans.length;
        int i29 = 0;
        while (i29 < length2) {
            java.lang.Object obj = spans[i29];
            if ((obj instanceof ua5.a) || (obj instanceof android.text.NoCopySpan)) {
                spannableStringBuilder3 = spannableStringBuilder;
            } else {
                int spanStart = spannableStringBuilder.getSpanStart(obj);
                int spanEnd = spannableStringBuilder.getSpanEnd(obj);
                int spanFlags = spannableStringBuilder.getSpanFlags(obj);
                int max = java.lang.Math.max(spanStart, i19);
                if (max > length) {
                    max = length;
                }
                int min2 = java.lang.Math.min(spanEnd, length);
                if (min2 < max) {
                    min2 = max;
                }
                int spanStart2 = spannableStringBuilder2.getSpanStart(obj);
                if (spanStart2 >= 0) {
                    spannableStringBuilder3 = spannableStringBuilder;
                    if (spannableStringBuilder2.getSpanEnd(obj) != min2 || spanStart2 != max) {
                        spannableStringBuilder2.setSpan(obj, max, min2, spanFlags);
                    }
                } else {
                    spannableStringBuilder3 = spannableStringBuilder;
                    java.lang.Object[] spans2 = spannableStringBuilder2.getSpans(max, min2, obj.getClass());
                    kotlin.jvm.internal.o.d(spans2);
                    objArr = spans;
                    int i37 = 0;
                    for (int length3 = spans2.length; i37 < length3; length3 = length3) {
                        spannableStringBuilder2.removeSpan(spans2[i37]);
                        i37++;
                    }
                    spannableStringBuilder2.setSpan(obj, max, min2, spanFlags);
                    i29++;
                    spannableStringBuilder = spannableStringBuilder3;
                    spans = objArr;
                    i19 = 0;
                }
            }
            objArr = spans;
            i29++;
            spannableStringBuilder = spannableStringBuilder3;
            spans = objArr;
            i19 = 0;
        }
        ua5.a aVar2 = new ua5.a();
        spannableStringBuilder2.setSpan(aVar2, i27, i28, 33);
        textView.requestLayout();
        for (android.view.ViewParent viewParent = textView.getParent(); viewParent != 0; viewParent = viewParent.getParent()) {
            if ((viewParent instanceof df5.j1) || (viewParent instanceof df5.b0)) {
                ((android.view.View) viewParent).requestLayout();
                break;
            } else {
                if (viewParent instanceof df5.q0) {
                    break;
                }
            }
        }
        ua5.f fVar = vVar.f232230a;
        fVar.getClass();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat.addUpdateListener(new ua5.b(aVar2, textView));
        ofFloat.addListener(new ua5.c(fVar));
        ofFloat.start();
        ((java.util.ArrayList) fVar.f425989d).add(ofFloat);
        vVar.f232240k = i28;
        if (i28 < vVar.f232241l) {
            vVar.a();
            return;
        }
        java.lang.Runnable runnable = vVar.f232236g;
        if (runnable != null) {
            vVar.f232235f.removeCallbacks(runnable);
        }
        vVar.f232236g = null;
        vVar.f232237h = null;
        vVar.f232238i = null;
        vVar.f232239j = null;
        vVar.f232240k = 0;
        vVar.f232241l = 0;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
