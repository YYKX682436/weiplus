package df5;

/* loaded from: classes15.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f232220a = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public final android.view.animation.AccelerateInterpolator f232221b = new android.view.animation.AccelerateInterpolator();

    /* renamed from: c, reason: collision with root package name */
    public int f232222c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f232223d;

    /* renamed from: e, reason: collision with root package name */
    public android.animation.ValueAnimator f232224e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f232225f;

    /* renamed from: g, reason: collision with root package name */
    public int f232226g;

    /* renamed from: h, reason: collision with root package name */
    public int f232227h;

    /* renamed from: i, reason: collision with root package name */
    public final df5.q1[] f232228i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f232229j;

    public u1() {
        df5.q1[] q1VarArr = new df5.q1[3];
        for (int i17 = 0; i17 < 3; i17++) {
            q1VarArr[i17] = new df5.q1();
        }
        this.f232228i = q1VarArr;
    }

    public final void a(android.text.Spannable spannable, df5.q1 q1Var) {
        int spanStart = spannable.getSpanStart(q1Var);
        int spanEnd = spannable.getSpanEnd(q1Var);
        if (spanStart < 0 || spanEnd <= spanStart) {
            return;
        }
        int spanFlags = spannable.getSpanFlags(q1Var);
        spannable.removeSpan(q1Var);
        spannable.setSpan(q1Var, spanStart, spanEnd, spanFlags);
    }

    public final void b(android.widget.TextView tv6) {
        android.text.Editable editableText;
        kotlin.jvm.internal.o.g(tv6, "tv");
        c();
        if (tv6.isAttachedToWindow() && (editableText = tv6.getEditableText()) != null) {
            this.f232225f = tv6;
            this.f232226g = editableText.length();
            this.f232229j = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.WaitingDotsCtrl", "[WAITING_DOTS] start: tvHash=%d, originalLen=%d, gen=%d", java.lang.Integer.valueOf(java.lang.System.identityHashCode(tv6)), java.lang.Integer.valueOf(this.f232226g), java.lang.Integer.valueOf(this.f232222c));
            editableText.append((java.lang.CharSequence) "...");
            tv6.requestLayout();
            for (int i17 = 0; i17 < 3; i17++) {
                df5.q1 q1Var = this.f232228i[i17];
                q1Var.f232195d = 0;
                int i18 = this.f232226g + i17;
                editableText.setSpan(q1Var, i18, i18 + 1, 33);
            }
            this.f232227h = 0;
            java.lang.Runnable runnable = this.f232223d;
            android.os.Handler handler = this.f232220a;
            if (runnable != null) {
                handler.removeCallbacks(runnable);
            }
            df5.t1 t1Var = new df5.t1(this, this.f232222c);
            this.f232223d = t1Var;
            handler.postDelayed(t1Var, 150L);
        }
    }

    public final void c() {
        android.text.Editable editableText;
        int i17;
        if (this.f232229j || this.f232225f != null) {
            android.widget.TextView textView = this.f232225f;
            com.tencent.mars.xlog.Log.i("MicroMsg.WaitingDotsCtrl", "[WAITING_DOTS] stop: tvHash=%d, state=%d, gen=%d", java.lang.Integer.valueOf(textView != null ? java.lang.System.identityHashCode(textView) : 0), java.lang.Integer.valueOf(this.f232227h), java.lang.Integer.valueOf(this.f232222c));
            this.f232222c++;
            this.f232229j = false;
            java.lang.Runnable runnable = this.f232223d;
            if (runnable != null) {
                this.f232220a.removeCallbacks(runnable);
            }
            this.f232223d = null;
            android.animation.ValueAnimator valueAnimator = this.f232224e;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f232224e = null;
            }
            android.widget.TextView textView2 = this.f232225f;
            if (textView2 != null && (editableText = textView2.getEditableText()) != null && editableText.length() >= (i17 = this.f232226g + 3)) {
                for (df5.q1 q1Var : this.f232228i) {
                    editableText.removeSpan(q1Var);
                }
                editableText.delete(this.f232226g, i17);
                textView2.requestLayout();
            }
            this.f232225f = null;
            this.f232226g = 0;
            this.f232227h = 0;
        }
    }
}
