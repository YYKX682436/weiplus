package mm0;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public mm0.g f328612a;

    /* renamed from: b, reason: collision with root package name */
    public nm0.a f328613b;

    /* renamed from: d, reason: collision with root package name */
    public android.text.StaticLayout f328615d;

    /* renamed from: f, reason: collision with root package name */
    public int f328617f;

    /* renamed from: g, reason: collision with root package name */
    public int f328618g;

    /* renamed from: l, reason: collision with root package name */
    public final android.view.View f328623l;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.CharSequence f328614c = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f328616e = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f328619h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f328620i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f328621j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f328622k = false;

    /* renamed from: m, reason: collision with root package name */
    public int f328624m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f328625n = 0;

    public h(android.view.View view, nm0.a aVar) {
        this.f328623l = view;
        this.f328613b = aVar;
    }

    public int a() {
        android.text.TextPaint paint = this.f328612a.f328611k.getPaint();
        if (paint == null) {
            paint = this.f328613b.f338454d;
        }
        float fontMetricsInt = paint.getFontMetricsInt(null);
        nm0.a aVar = this.f328613b;
        return java.lang.Math.round((fontMetricsInt * aVar.f338460j) + aVar.f338459i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (r5 == 8388613) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.graphics.Canvas r8) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mm0.h.b(android.graphics.Canvas):void");
    }

    public android.graphics.Point c(int i17, int i18) {
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        e(size);
        android.text.StaticLayout staticLayout = this.f328615d;
        if (staticLayout == null) {
            return null;
        }
        android.view.View view = this.f328623l;
        if (mode != 1073741824) {
            int i19 = 0;
            if (this.f328613b.f338456f == null) {
                int i27 = this.f328624m;
                if (i27 != 0) {
                    i19 = i27;
                } else {
                    int lineCount = staticLayout.getLineCount();
                    java.lang.CharSequence text = staticLayout.getText();
                    int i28 = 0;
                    while (true) {
                        if (i28 >= lineCount - 1) {
                            float f17 = 0.0f;
                            while (i19 < lineCount) {
                                f17 = java.lang.Math.max(f17, staticLayout.getLineWidth(i19));
                                i19++;
                            }
                            int ceil = (int) java.lang.Math.ceil(f17);
                            this.f328624m = ceil;
                            int paddingLeft = ceil + view.getPaddingLeft() + view.getPaddingRight();
                            this.f328624m = paddingLeft;
                            i19 = paddingLeft;
                        } else {
                            if (text.charAt(staticLayout.getLineEnd(i28) - 1) != '\n') {
                                i19 = -1;
                                break;
                            }
                            i28++;
                        }
                    }
                }
            }
            int ceil2 = (int) java.lang.Math.ceil(android.text.Layout.getDesiredWidth(this.f328615d.getText(), this.f328615d.getPaint()));
            if (ceil2 > i19) {
                i19 = ceil2;
            }
            size = mode == Integer.MIN_VALUE ? java.lang.Math.min(size, i19) : i19;
        }
        if (mode2 != 1073741824) {
            android.text.StaticLayout staticLayout2 = this.f328615d;
            int i29 = this.f328625n;
            if (i29 == 0) {
                int lineCount2 = staticLayout2.getLineCount();
                int i37 = this.f328612a.f328602b;
                if (i37 > 0 && i37 < lineCount2) {
                    lineCount2 = i37;
                }
                int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
                int lineTop = staticLayout2.getLineTop(lineCount2);
                int i38 = this.f328613b.f338452b;
                if (i38 > 0 && lineCount2 < i38) {
                    lineTop += a() * (this.f328613b.f338452b - lineCount2);
                }
                i29 = lineTop + paddingTop;
                this.f328625n = i29;
            }
            size2 = mode2 == Integer.MIN_VALUE ? java.lang.Math.min(i29, size2) : i29;
        }
        return new android.graphics.Point(size, size2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mm0.h.d(android.view.MotionEvent):boolean");
    }

    public final boolean e(int i17) {
        if ((!this.f328616e && this.f328612a != null && this.f328615d != null) || this.f328613b == null || i17 <= 0) {
            return false;
        }
        f();
        mm0.g a17 = mm0.e.d(this.f328614c, i17, this.f328613b).a();
        this.f328612a = a17;
        this.f328615d = a17.f328611k;
        this.f328616e = false;
        return true;
    }

    public final void f() {
        this.f328625n = 0;
        this.f328624m = 0;
        this.f328617f = 0;
        this.f328618g = 0;
    }

    public void g(int i17) {
        nm0.a aVar = this.f328613b;
        if (aVar.f338451a == i17 && aVar.f338452b == i17) {
            return;
        }
        this.f328616e = true;
        f();
        nm0.a aVar2 = this.f328613b;
        aVar2.f338451a = i17;
        aVar2.f338452b = i17;
        android.view.View view = this.f328623l;
        view.requestLayout();
        view.invalidate();
    }

    public void h(boolean z17) {
        int i17 = z17 ? 1 : Integer.MAX_VALUE;
        nm0.a aVar = this.f328613b;
        if (aVar.f338451a != i17) {
            aVar.f338451a = i17;
            this.f328616e = true;
            f();
            android.view.View view = this.f328623l;
            view.requestLayout();
            view.invalidate();
        }
    }

    public void i(java.lang.CharSequence charSequence, boolean z17) {
        if (charSequence == null) {
            return;
        }
        java.lang.CharSequence charSequence2 = this.f328614c;
        if (charSequence2 == null || !charSequence.equals(charSequence2) || z17) {
            this.f328614c = charSequence;
            this.f328616e = true;
            android.view.View view = this.f328623l;
            view.requestLayout();
            view.invalidate();
        }
    }

    public void j(mm0.g gVar) {
        android.text.StaticLayout staticLayout;
        if (gVar == null || (staticLayout = gVar.f328611k) == null) {
            this.f328612a = null;
            return;
        }
        if (this.f328613b == null) {
            nm0.a aVar = new nm0.a();
            aVar.f338451a = gVar.f328602b;
            aVar.f338453c = gVar.f328603c;
            android.text.TextPaint textPaint = gVar.f328606f;
            aVar.f338454d = textPaint;
            aVar.f338455e = gVar.f328607g;
            aVar.f338456f = gVar.f328608h;
            aVar.f338457g = gVar.f328609i;
            aVar.f338462l = textPaint.getTextSize();
            aVar.f338463m = gVar.f328606f.getColor();
            aVar.f338465o = gVar.f328610j;
            this.f328613b = aVar;
        }
        f();
        android.view.View view = this.f328623l;
        view.setWillNotDraw(false);
        this.f328612a = gVar;
        this.f328615d = staticLayout;
        java.lang.CharSequence charSequence = gVar.f328605e;
        this.f328614c = charSequence;
        boolean z17 = charSequence instanceof android.text.Spannable;
        this.f328619h = z17;
        if (z17) {
            this.f328614c = charSequence;
            if (om0.b.f346261a == null) {
                om0.b.f346261a = new om0.b();
            }
            om0.b bVar = om0.b.f346261a;
            android.text.Spannable spannable = (android.text.Spannable) this.f328614c;
            bVar.getClass();
            android.text.Selection.removeSelection(spannable);
            spannable.removeSpan(om0.b.f346262b);
        }
        if (this.f328614c == null) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Boolean.valueOf(gVar.f328605e == null);
            objArr[1] = java.lang.Boolean.valueOf(this.f328612a.f328605e == null);
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            objArr[2] = new com.tencent.mm.sdk.platformtools.z3();
            com.tencent.mars.xlog.Log.e("MicroMsg.StaticTextViewHolder", "text is null, [%b, %b, %s]", objArr);
        }
        view.requestLayout();
        view.invalidate();
    }

    public void k(int i17, float f17) {
        nm0.a aVar;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        float applyDimension = android.util.TypedValue.applyDimension(i17, f17, (context == null ? android.content.res.Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (applyDimension == 0.0f || (aVar = this.f328613b) == null || applyDimension == aVar.f338462l) {
            return;
        }
        aVar.f338462l = applyDimension;
        this.f328616e = true;
    }
}
