package lg5;

/* loaded from: classes12.dex */
public final class b implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f318582d;

    /* renamed from: e, reason: collision with root package name */
    public final int f318583e;

    public b(android.view.View view, int i17) {
        this.f318582d = view;
        this.f318583e = i17;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(s17, "s");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence source, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(source, "source");
        android.view.View view = this.f318582d;
        if (!(view != null && view.isInEditMode()) && i19 > 0 && (source instanceof android.text.Spannable)) {
            int i27 = i17 + i19;
            android.text.Spannable spannable = (android.text.Spannable) source;
            al5.w[] wVarArr = (al5.w[]) spannable.getSpans(i17, i27, al5.w.class);
            jg5.b[] bVarArr = (jg5.b[]) spannable.getSpans(i17, i27, jg5.b.class);
            kotlin.jvm.internal.o.d(bVarArr);
            boolean a17 = (bVarArr.length == 0) ^ true ? true ^ bVarArr[bVarArr.length - 1].a(source.subSequence(i17, i27)) : false;
            if (wVarArr == null || wVarArr.length <= 0 || a17) {
                if (a17 && wVarArr != null && wVarArr.length > 0) {
                    for (al5.w wVar : wVarArr) {
                        spannable.removeSpan(wVar);
                    }
                }
                android.text.SpanWatcher[] spanWatcherArr = (android.text.SpanWatcher[]) spannable.getSpans(0, source.length(), android.text.SpanWatcher.class);
                if (spanWatcherArr != null) {
                    for (android.text.SpanWatcher spanWatcher : spanWatcherArr) {
                        spannable.removeSpan(spanWatcher);
                    }
                }
                java.util.Objects.toString(source.subSequence(i17, i27));
                source.hashCode();
                pg5.d.c(view, new pg5.a(source, 0, i27, this.f318583e, 0, false, false, false, 112, null));
                if (spanWatcherArr != null) {
                    for (android.text.SpanWatcher spanWatcher2 : spanWatcherArr) {
                        spannable.setSpan(spanWatcher2, 0, source.length(), 18);
                    }
                }
            }
        }
    }
}
