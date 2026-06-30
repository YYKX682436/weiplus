package px1;

/* loaded from: classes12.dex */
public class t implements android.text.style.LeadingMarginSpan, px1.h, px1.g {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f358853d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f358854e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f358855f;

    /* renamed from: g, reason: collision with root package name */
    public final int f358856g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f358857h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f358858i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.ref.WeakReference f358859m;

    public t(boolean z17, int i17, boolean z18, boolean z19, boolean z27) {
        boolean z28 = false;
        this.f358853d = false;
        this.f358854e = false;
        this.f358855f = false;
        this.f358858i = false;
        this.f358856g = i17;
        if (z18 && z27 && !z19) {
            z28 = true;
        }
        this.f358857h = z28;
        this.f358858i = z17;
        this.f358853d = z19;
        this.f358854e = z27;
        this.f358855f = z18;
    }

    @Override // px1.g
    public px1.g a() {
        return new px1.t(this.f358858i, this.f358856g, this.f358855f, this.f358853d, this.f358854e);
    }

    public void b(android.widget.TextView textView, android.text.Spannable spannable, android.view.MotionEvent motionEvent, px1.t tVar) {
        ix1.a l17;
        if (motionEvent.getX() > this.f358856g) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TodoSpan", "x > mGapWidth");
            return;
        }
        int spanStart = spannable.getSpanStart(tVar);
        int spanEnd = spannable.getSpanEnd(tVar);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = this.f358858i ? "true" : "false";
        com.tencent.mars.xlog.Log.i("MicroMsg.TodoSpan", "current mIsTodoCheck: %s", objArr);
        spannable.removeSpan(this);
        boolean z17 = !this.f358858i;
        this.f358858i = z17;
        spannable.setSpan(new px1.t(z17, this.f358856g, this.f358855f, this.f358853d, this.f358854e), spanStart, spanEnd, 33);
        com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText = (com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText) textView;
        if (wXRTEditText.getEditTextType() == 0 && (l17 = nx1.d.q().l(wXRTEditText.getRecyclerItemPosition())) != null && l17.b() == 1) {
            ((ix1.l) l17).f295338s = lx1.c.a(spannable);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(android.graphics.Canvas canvas, android.graphics.Paint paint, int i17, int i18, int i19, int i27, int i28, java.lang.CharSequence charSequence, int i29, int i37, boolean z17, android.text.Layout layout) {
        android.text.Spanned spanned = (android.text.Spanned) charSequence;
        if (this.f358857h || spanned.getSpanStart(this) != i29) {
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f358859m;
        android.graphics.drawable.Drawable drawable = weakReference != null ? (android.graphics.drawable.Drawable) weakReference.get() : null;
        if (drawable == null) {
            drawable = this.f358858i ? b3.l.getDrawable(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.drawable.c1h) : b3.l.getDrawable(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.drawable.c1i);
            this.f358859m = new java.lang.ref.WeakReference(drawable);
        }
        if (drawable == null) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        canvas.save();
        android.graphics.Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        canvas.translate(0.0f, ((((fontMetricsInt.descent + i27) + i27) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z17) {
        if (this.f358857h) {
            return 0;
        }
        return this.f358856g;
    }

    @Override // px1.h
    public java.lang.Object getValue() {
        return java.lang.Boolean.TRUE;
    }
}
