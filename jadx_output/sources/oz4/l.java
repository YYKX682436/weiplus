package oz4;

/* loaded from: classes12.dex */
public class l implements android.text.style.LeadingMarginSpan, oz4.h, oz4.g {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f350280d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f350281e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f350282f;

    /* renamed from: g, reason: collision with root package name */
    public final int f350283g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f350284h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f350285i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.ref.WeakReference f350286m;

    public l(boolean z17, int i17, boolean z18, boolean z19, boolean z27) {
        boolean z28 = false;
        this.f350280d = false;
        this.f350281e = false;
        this.f350282f = false;
        this.f350285i = false;
        this.f350283g = i17;
        if (z18 && z27 && !z19) {
            z28 = true;
        }
        this.f350284h = z28;
        this.f350285i = z17;
        this.f350280d = z19;
        this.f350281e = z27;
        this.f350282f = z18;
    }

    @Override // oz4.g
    public oz4.g a() {
        return new oz4.l(this.f350285i, this.f350283g, this.f350282f, this.f350280d, this.f350281e);
    }

    public void b(android.widget.TextView textView, android.text.Spannable spannable, android.view.MotionEvent motionEvent, oz4.l lVar) {
        iz4.c l17;
        if (motionEvent.getX() > this.f350283g) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NoteTodoSpan", "x > mGapWidth");
            return;
        }
        int spanStart = spannable.getSpanStart(lVar);
        int spanEnd = spannable.getSpanEnd(lVar);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = this.f350285i ? "true" : "false";
        com.tencent.mars.xlog.Log.i("MicroMsg.NoteTodoSpan", "current mIsTodoCheck: %s", objArr);
        spannable.removeSpan(this);
        boolean z17 = !this.f350285i;
        this.f350285i = z17;
        spannable.setSpan(new oz4.l(z17, this.f350283g, this.f350282f, this.f350280d, this.f350281e), spanStart, spanEnd, 33);
        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText = (com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText) textView;
        if (wXRTEditText.getEditTextType() == 0 && (l17 = wXRTEditText.getRecyclerHolder().f414183e.l(wXRTEditText.getRecyclerItemPosition())) != null && l17.d() == 1) {
            iz4.i iVar = (iz4.i) l17;
            iVar.f296155t = kz4.c.b(spannable);
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteDataManager", "item content = " + iVar.f296155t);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(android.graphics.Canvas canvas, android.graphics.Paint paint, int i17, int i18, int i19, int i27, int i28, java.lang.CharSequence charSequence, int i29, int i37, boolean z17, android.text.Layout layout) {
        android.text.Spanned spanned = (android.text.Spanned) charSequence;
        if (this.f350284h || spanned.getSpanStart(this) != i29) {
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f350286m;
        android.graphics.drawable.Drawable drawable = weakReference != null ? (android.graphics.drawable.Drawable) weakReference.get() : null;
        if (drawable == null) {
            drawable = this.f350285i ? b3.l.getDrawable(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.drawable.cc9) : b3.l.getDrawable(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.drawable.cc_);
            this.f350286m = new java.lang.ref.WeakReference(drawable);
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
        if (this.f350284h) {
            return 0;
        }
        return this.f350283g;
    }

    @Override // oz4.h
    public java.lang.Object getValue() {
        return java.lang.Boolean.TRUE;
    }
}
