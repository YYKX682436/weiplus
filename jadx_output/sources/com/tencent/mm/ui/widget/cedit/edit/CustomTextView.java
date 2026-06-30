package com.tencent.mm.ui.widget.cedit.edit;

@android.widget.RemoteViews.RemoteView
/* loaded from: classes15.dex */
public class CustomTextView extends android.view.View implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: o2, reason: collision with root package name */
    public static final float[] f211571o2 = new float[2];

    /* renamed from: p2, reason: collision with root package name */
    public static final android.graphics.RectF f211572p2 = new android.graphics.RectF();

    /* renamed from: q2, reason: collision with root package name */
    public static final android.text.InputFilter[] f211573q2 = new android.text.InputFilter[0];

    /* renamed from: r2, reason: collision with root package name */
    public static final android.text.Spanned f211574r2 = new android.text.SpannedString("");

    /* renamed from: s2, reason: collision with root package name */
    public static final int[] f211575s2 = {android.R.attr.state_multiline};

    /* renamed from: t2, reason: collision with root package name */
    public static final android.util.SparseIntArray f211576t2;

    /* renamed from: u2, reason: collision with root package name */
    public static final android.text.BoringLayout.Metrics f211577u2;
    public java.lang.CharSequence A;
    public int A1;
    public android.text.Spannable B;
    public int B1;
    public java.lang.CharSequence C;
    public int C1;
    public android.widget.TextView.BufferType D;
    public int D1;
    public java.lang.CharSequence E;
    public boolean E1;
    public android.text.Layout F;
    public int F1;
    public il5.a G;
    public boolean G1;
    public android.text.method.TransformationMethod H;
    public int H1;
    public gl5.f I;
    public android.graphics.Rect I1;

    /* renamed from: J, reason: collision with root package name */
    public java.util.ArrayList f211578J;
    public long J1;
    public android.text.TextPaint K;
    public android.widget.Scroller K1;
    public boolean L;
    public android.text.BoringLayout.Metrics L1;
    public android.text.Layout M;
    public android.text.BoringLayout.Metrics M1;
    public boolean N;
    public android.text.BoringLayout N1;
    public android.text.BoringLayout O1;
    public int P;
    public android.text.TextDirectionHeuristic P1;
    public boolean Q;
    public android.text.InputFilter[] Q1;
    public boolean R;
    public android.os.UserHandle R1;
    public boolean S;
    public int S1;
    public int T;
    public android.graphics.Path T1;
    public boolean U;
    public android.graphics.Paint U1;
    public int V;
    public boolean V1;
    public boolean W;
    public int W1;
    public android.graphics.drawable.Drawable X1;
    public int Y1;
    public android.graphics.drawable.Drawable Z1;

    /* renamed from: a2, reason: collision with root package name */
    public int f211579a2;

    /* renamed from: b2, reason: collision with root package name */
    public android.graphics.drawable.Drawable f211580b2;

    /* renamed from: c2, reason: collision with root package name */
    public int f211581c2;

    /* renamed from: d, reason: collision with root package name */
    public android.content.res.ColorStateList f211582d;

    /* renamed from: d2, reason: collision with root package name */
    public android.graphics.drawable.Drawable f211583d2;

    /* renamed from: e, reason: collision with root package name */
    public android.content.res.ColorStateList f211584e;

    /* renamed from: e2, reason: collision with root package name */
    public int f211585e2;

    /* renamed from: f, reason: collision with root package name */
    public android.content.res.ColorStateList f211586f;

    /* renamed from: f2, reason: collision with root package name */
    public boolean f211587f2;

    /* renamed from: g, reason: collision with root package name */
    public int f211588g;

    /* renamed from: g2, reason: collision with root package name */
    public gl5.e0 f211589g2;

    /* renamed from: h, reason: collision with root package name */
    public int f211590h;

    /* renamed from: h2, reason: collision with root package name */
    public android.widget.TextView f211591h2;

    /* renamed from: i, reason: collision with root package name */
    public boolean f211592i;

    /* renamed from: i2, reason: collision with root package name */
    public final android.text.TextWatcher f211593i2;

    /* renamed from: j2, reason: collision with root package name */
    public int f211594j2;

    /* renamed from: k2, reason: collision with root package name */
    public boolean f211595k2;

    /* renamed from: l1, reason: collision with root package name */
    public int f211596l1;

    /* renamed from: l2, reason: collision with root package name */
    public nl5.a0 f211597l2;

    /* renamed from: m, reason: collision with root package name */
    public android.text.Editable.Factory f211598m;

    /* renamed from: m2, reason: collision with root package name */
    public final java.util.Set f211599m2;

    /* renamed from: n, reason: collision with root package name */
    public android.text.Spannable.Factory f211600n;

    /* renamed from: n2, reason: collision with root package name */
    public final java.util.Set f211601n2;

    /* renamed from: o, reason: collision with root package name */
    public float f211602o;

    /* renamed from: p, reason: collision with root package name */
    public float f211603p;

    /* renamed from: p0, reason: collision with root package name */
    public float f211604p0;

    /* renamed from: p1, reason: collision with root package name */
    public int f211605p1;

    /* renamed from: q, reason: collision with root package name */
    public float f211606q;

    /* renamed from: r, reason: collision with root package name */
    public int f211607r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f211608s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f211609t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.textclassifier.TextClassifier f211610u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.textclassifier.TextClassifier f211611v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.textclassifier.TextClassificationContext f211612w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f211613x;

    /* renamed from: x0, reason: collision with root package name */
    public float f211614x0;

    /* renamed from: x1, reason: collision with root package name */
    public int f211615x1;

    /* renamed from: y, reason: collision with root package name */
    public android.text.TextUtils.TruncateAt f211616y;

    /* renamed from: y0, reason: collision with root package name */
    public int f211617y0;

    /* renamed from: y1, reason: collision with root package name */
    public int f211618y1;

    /* renamed from: z, reason: collision with root package name */
    public gl5.g f211619z;

    /* renamed from: z1, reason: collision with root package name */
    public int f211620z1;

    static {
        gl5.b bVar = new gl5.b();
        f211576t2 = bVar;
        bVar.put(5, 5);
        bVar.put(4, 4);
        bVar.put(6, 6);
        bVar.put(7, 7);
        bVar.put(1, 1);
        try {
            bVar.put(89, 89);
        } catch (java.lang.Throwable unused) {
        }
        android.util.SparseIntArray sparseIntArray = f211576t2;
        sparseIntArray.put(2, 2);
        sparseIntArray.put(68, 68);
        sparseIntArray.put(3, 3);
        sparseIntArray.put(88, 88);
        sparseIntArray.put(65, 65);
        sparseIntArray.put(34, 34);
        sparseIntArray.put(35, 35);
        sparseIntArray.put(36, 36);
        sparseIntArray.put(37, 37);
        sparseIntArray.put(69, 69);
        sparseIntArray.put(84, 84);
        sparseIntArray.put(70, 70);
        sparseIntArray.put(71, 71);
        sparseIntArray.put(83, 83);
        f211577u2 = new android.text.BoringLayout.Metrics();
    }

    public CustomTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.style.f494325k0);
    }

    public static int E(android.text.Layout layout) {
        int lineCount = layout.getLineCount();
        java.lang.CharSequence text = layout.getText();
        for (int i17 = 0; i17 < lineCount - 1; i17++) {
            if (text.charAt(layout.getLineEnd(i17) - 1) != '\n') {
                return -1;
            }
        }
        float f17 = 0.0f;
        for (int i18 = 0; i18 < lineCount; i18++) {
            f17 = java.lang.Math.max(f17, layout.getLineWidth(i18));
        }
        return (int) java.lang.Math.ceil(f17);
    }

    public static boolean S(int i17) {
        int i18 = i17 & 4095;
        return i18 == 129 || i18 == 225 || i18 == 18;
    }

    private java.util.Locale getCustomLocaleForKeyListenerOrNull() {
        android.os.LocaleList imeHintLocales;
        if (this.R && (imeHintLocales = getImeHintLocales()) != null) {
            return imeHintLocales.get(0);
        }
        return null;
    }

    private int getDesiredHeight() {
        return java.lang.Math.max(I(this.M, true), I(this.F, this.f211616y != null));
    }

    private android.view.inputmethod.InputMethodManager getInputMethodManager() {
        return (android.view.inputmethod.InputMethodManager) getContext().getSystemService(android.view.inputmethod.InputMethodManager.class);
    }

    private android.text.Layout.Alignment getLayoutAlignment() {
        switch (getTextAlignment()) {
            case 1:
                int i17 = this.T & 8388615;
                if (i17 == 1) {
                    return android.text.Layout.Alignment.ALIGN_CENTER;
                }
                if (i17 == 3) {
                    com.tencent.mars.xlog.Log.i("cmEdit.CMTextView", "getTextAlignment() Gravity.LEFT");
                } else {
                    if (i17 != 5) {
                        if (i17 != 8388611 && i17 == 8388613) {
                            return android.text.Layout.Alignment.ALIGN_OPPOSITE;
                        }
                        return android.text.Layout.Alignment.ALIGN_NORMAL;
                    }
                    com.tencent.mars.xlog.Log.i("cmEdit.CMTextView", "getTextAlignment() Gravity.RIGHT");
                }
                return null;
            case 2:
                return android.text.Layout.Alignment.ALIGN_NORMAL;
            case 3:
                return android.text.Layout.Alignment.ALIGN_OPPOSITE;
            case 4:
                return android.text.Layout.Alignment.ALIGN_CENTER;
            case 5:
                com.tencent.mars.xlog.Log.i("cmEdit.CMTextView", "getTextAlignment() TEXT_ALIGNMENT_VIEW_START");
                return null;
            case 6:
                com.tencent.mars.xlog.Log.i("cmEdit.CMTextView", "getTextAlignment() TEXT_ALIGNMENT_VIEW_END");
                return null;
            default:
                return android.text.Layout.Alignment.ALIGN_NORMAL;
        }
    }

    private android.graphics.Path getUpdatedHighlightPath() {
        android.graphics.Paint paint = this.U1;
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (this.G != null && ((isFocused() || isPressed()) && selectionStart >= 0)) {
            if (selectionStart != selectionEnd) {
                if (this.V1) {
                    if (this.T1 == null) {
                        this.T1 = new android.graphics.Path();
                    }
                    this.T1.reset();
                    this.M.getSelectionPath(selectionStart, selectionEnd, this.T1);
                    this.V1 = false;
                }
                paint.setColor(this.S1);
                paint.setStyle(android.graphics.Paint.Style.FILL);
                return this.T1;
            }
            gl5.e0 e0Var = this.f211589g2;
            if (e0Var != null) {
                boolean z17 = true;
                if (!(e0Var.f272964v && e0Var.U.V()) || (!e0Var.f272962t && (android.os.SystemClock.uptimeMillis() - e0Var.f272961s) % 1000 >= 500)) {
                    z17 = false;
                }
                if (z17) {
                    if (this.V1) {
                        if (this.T1 == null) {
                            this.T1 = new android.graphics.Path();
                        }
                        this.T1.reset();
                        this.M.getCursorPath(selectionStart, this.T1, this.A);
                        gl5.e0 e0Var2 = this.f211589g2;
                        android.graphics.drawable.Drawable drawable = e0Var2.F;
                        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = e0Var2.U;
                        if (drawable == null) {
                            e0Var2.F = customTextView.getTextCursorDrawable();
                        }
                        if (e0Var2.F != null) {
                            android.text.Layout layout = customTextView.getLayout();
                            int selectionStart2 = customTextView.getSelectionStart();
                            int lineForOffset = layout.getLineForOffset(selectionStart2);
                            int lineTop = layout.getLineTop(lineForOffset);
                            int lineBottom = layout.getLineBottom(lineForOffset);
                            float primaryHorizontal = layout.getPrimaryHorizontal(selectionStart2);
                            if (e0Var2.F == null) {
                                e0Var2.F = customTextView.getTextCursorDrawable();
                            }
                            int c17 = e0Var2.c(e0Var2.F, primaryHorizontal);
                            int intrinsicWidth = e0Var2.F.getIntrinsicWidth();
                            android.graphics.drawable.Drawable drawable2 = e0Var2.F;
                            android.graphics.Rect rect = e0Var2.T;
                            drawable2.setBounds(c17, lineTop - rect.top, intrinsicWidth + c17, lineBottom + rect.bottom);
                        }
                        this.V1 = false;
                    }
                    paint.setColor(this.f211588g);
                    paint.setStyle(android.graphics.Paint.Style.STROKE);
                    return this.T1;
                }
            }
        }
        return null;
    }

    private void setHintInternal(java.lang.CharSequence charSequence) {
        this.E = android.text.TextUtils.stringOrSpannedString(charSequence);
        if (this.M != null) {
            A();
        }
        if (this.A.length() == 0) {
            invalidate();
        }
        if (this.f211589g2 != null) {
            this.A.length();
        }
    }

    private void setInputTypeSingleLine(boolean z17) {
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var != null) {
            int i17 = e0Var.f272958p;
            if ((i17 & 15) == 1) {
                if (z17) {
                    e0Var.f272958p = (-131073) & i17;
                } else {
                    e0Var.f272958p = 131072 | i17;
                }
            }
        }
    }

    private void setKeyListenerOnly(android.text.method.KeyListener keyListener) {
        if (this.f211589g2 == null && keyListener == null) {
            return;
        }
        D();
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var.f272957o != keyListener) {
            e0Var.f272957o = keyListener;
            if (keyListener != null) {
                java.lang.CharSequence charSequence = this.A;
                if (!(charSequence instanceof android.text.Editable)) {
                    setText(charSequence);
                }
            }
            k0((android.text.Editable) this.A, this.Q1);
        }
    }

    private void setTextInternal(java.lang.CharSequence charSequence) {
        this.A = charSequence;
        this.B = charSequence instanceof android.text.Spannable ? (android.text.Spannable) charSequence : null;
    }

    public final void A() {
        android.text.Layout layout;
        if ((getLayoutParams().width == -2 && (this.B1 != this.D1 || this.A1 != this.C1)) || ((this.E != null && this.F == null) || ((getRight() - getLeft()) - getCompoundPaddingLeft()) - getCompoundPaddingRight() <= 0)) {
            Y();
            requestLayout();
            invalidate();
            return;
        }
        int height = this.M.getHeight();
        int width = this.M.getWidth();
        android.text.Layout layout2 = this.F;
        int width2 = layout2 == null ? 0 : layout2.getWidth();
        android.text.BoringLayout.Metrics metrics = f211577u2;
        X(width, width2, metrics, metrics, ((getRight() - getLeft()) - getCompoundPaddingLeft()) - getCompoundPaddingRight(), false);
        if (this.f211616y != android.text.TextUtils.TruncateAt.MARQUEE) {
            if (getLayoutParams().height != -2 && getLayoutParams().height != -1) {
                invalidate();
                return;
            } else if (this.M.getHeight() == height && ((layout = this.F) == null || layout.getHeight() == height)) {
                invalidate();
                return;
            }
        }
        requestLayout();
        invalidate();
    }

    public final void B() {
        boolean z17 = false;
        if (this.M != null) {
            if (getLayoutParams().width == -2) {
                invalidate();
                z17 = true;
            }
            if (getLayoutParams().height != -2 ? !(getLayoutParams().height != -1 || this.F1 < 0 || getDesiredHeight() == this.F1) : getDesiredHeight() != getHeight()) {
                z17 = true;
            }
        }
        if (z17) {
            requestLayout();
        }
    }

    public float C(float f17) {
        return java.lang.Math.min((getWidth() - getTotalPaddingRight()) - 1, java.lang.Math.max(0.0f, f17 - getTotalPaddingLeft())) + getScrollX();
    }

    public final void D() {
        if (this.f211589g2 == null) {
            this.f211589g2 = new gl5.e0(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int F(int r8, android.view.KeyEvent r9, android.view.KeyEvent r10) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.cedit.edit.CustomTextView.F(int, android.view.KeyEvent, android.view.KeyEvent):int");
    }

    public void G() {
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var != null) {
            e0Var.f272967y = false;
            gl5.s sVar = e0Var.f272953k;
            if (sVar != null) {
                int i17 = sVar.f273090c - 1;
                sVar.f273090c = i17;
                if (i17 == 0) {
                    e0Var.h(sVar);
                }
            }
        }
    }

    public final void H() {
        gl5.e0 e0Var;
        if (this.G == null && ((e0Var = this.f211589g2) == null || e0Var.f272957o == null)) {
            setClickable(false);
            setLongClickable(false);
        } else {
            setFocusable(true);
            setClickable(true);
            setLongClickable(true);
        }
    }

    public final int I(android.text.Layout layout, boolean z17) {
        int i17;
        if (layout == null) {
            return 0;
        }
        int height = layout.getHeight();
        gl5.g gVar = this.f211619z;
        if (gVar != null) {
            height = java.lang.Math.max(java.lang.Math.max(height, gVar.f272996q), gVar.f272997r);
        }
        int lineCount = layout.getLineCount();
        int compoundPaddingTop = getCompoundPaddingTop() + getCompoundPaddingBottom();
        int i18 = height + compoundPaddingTop;
        if (this.f211596l1 != 1) {
            i18 = java.lang.Math.min(i18, this.f211617y0);
        } else if (z17 && lineCount > (i17 = this.f211617y0) && ((layout instanceof android.text.DynamicLayout) || (layout instanceof android.text.BoringLayout))) {
            int lineTop = layout.getLineTop(i17);
            if (gVar != null) {
                lineTop = java.lang.Math.max(java.lang.Math.max(lineTop, gVar.f272996q), gVar.f272997r);
            }
            i18 = lineTop + compoundPaddingTop;
            lineCount = this.f211617y0;
        }
        if (this.f211615x1 != 1) {
            i18 = java.lang.Math.max(i18, this.f211605p1);
        } else if (lineCount < this.f211605p1) {
            i18 += getLineHeight() * (this.f211605p1 - lineCount);
        }
        return java.lang.Math.max(i18, getSuggestedMinimumHeight());
    }

    public int J(float f17) {
        return getLayout().getLineForVertical((int) (java.lang.Math.min((getHeight() - getTotalPaddingBottom()) - 1, java.lang.Math.max(0.0f, f17 - getTotalPaddingTop())) + getScrollY()));
    }

    public int K(float f17, float f18) {
        if (getLayout() == null) {
            return -1;
        }
        return getLayout().getOffsetForHorizontal(J(f18), C(f17));
    }

    public int L(boolean z17) {
        int extendedPaddingTop;
        int extendedPaddingBottom;
        android.text.Layout layout;
        int i17 = this.T & 112;
        android.text.Layout layout2 = this.M;
        if (!z17 && this.A.length() == 0 && (layout = this.F) != null) {
            layout2 = layout;
        }
        if (i17 != 48) {
            if (layout2 == this.F) {
                extendedPaddingTop = getCompoundPaddingTop();
                extendedPaddingBottom = getCompoundPaddingBottom();
            } else {
                extendedPaddingTop = getExtendedPaddingTop();
                extendedPaddingBottom = getExtendedPaddingBottom();
            }
            int measuredHeight = getMeasuredHeight() - (extendedPaddingTop + extendedPaddingBottom);
            int height = layout2.getHeight();
            if (height < measuredHeight) {
                int i18 = measuredHeight - height;
                return i17 == 80 ? i18 : i18 >> 1;
            }
        }
        return 0;
    }

    public boolean M() {
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        return selectionStart >= 0 && selectionEnd > 0 && selectionStart != selectionEnd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:253:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0978  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x09b8  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x09bf  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x09c6  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x09cd  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x09fc  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0a1d  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0a24  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0a2b  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0a34  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0a67  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0a72  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0a91  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0a97  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0a9d  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0aab  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0ab4  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0abb  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0ac2  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0ac9  */
    /* JADX WARN: Removed duplicated region for block: B:434:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0a81  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x09b4  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x098c  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0758  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void N(android.content.Context r63, android.util.AttributeSet r64, int r65, int r66) {
        /*
            Method dump skipped, instructions count: 2765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.cedit.edit.CustomTextView.N(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public final void O(int i17, int i18, int i19) {
        android.graphics.drawable.Drawable drawable;
        if (i17 >= 0 || i18 >= 0 || i19 >= 0) {
            int min = java.lang.Math.min(java.lang.Math.min(i17, i18), i19);
            int max = java.lang.Math.max(java.lang.Math.max(i17, i18), i19);
            android.text.Layout layout = this.M;
            if (layout == null) {
                invalidate();
                return;
            }
            int lineForOffset = layout.getLineForOffset(min);
            int lineTop = this.M.getLineTop(lineForOffset);
            if (lineForOffset > 0) {
                lineTop -= this.M.getLineDescent(lineForOffset - 1);
            }
            int lineBottom = this.M.getLineBottom(min == max ? lineForOffset : this.M.getLineForOffset(max));
            gl5.e0 e0Var = this.f211589g2;
            if (e0Var != null && (drawable = e0Var.F) != null) {
                android.graphics.Rect bounds = drawable.getBounds();
                lineTop = java.lang.Math.min(lineTop, bounds.top);
                lineBottom = java.lang.Math.max(lineBottom, bounds.bottom);
            }
            int compoundPaddingLeft = getCompoundPaddingLeft();
            int extendedPaddingTop = getExtendedPaddingTop() + L(true);
            invalidate(getScrollX() + compoundPaddingLeft, lineTop + extendedPaddingTop, getScrollY() + (getWidth() - getCompoundPaddingRight()), extendedPaddingTop + lineBottom);
        }
    }

    public void P() {
        if (this.V1) {
            int selectionEnd = getSelectionEnd();
            O(selectionEnd, selectionEnd, selectionEnd);
            return;
        }
        int compoundPaddingLeft = getCompoundPaddingLeft();
        int extendedPaddingTop = getExtendedPaddingTop() + L(true);
        android.graphics.drawable.Drawable drawable = this.f211589g2.F;
        if (drawable != null) {
            android.graphics.Rect bounds = drawable.getBounds();
            invalidate(bounds.left + compoundPaddingLeft, bounds.top + extendedPaddingTop, bounds.right + compoundPaddingLeft, bounds.bottom + extendedPaddingTop);
            return;
        }
        android.graphics.RectF rectF = f211572p2;
        synchronized (rectF) {
            float ceil = (float) java.lang.Math.ceil(this.K.getStrokeWidth());
            if (ceil < 1.0f) {
                ceil = 1.0f;
            }
            float f17 = ceil / 2.0f;
            this.T1.computeBounds(rectF, false);
            float f18 = compoundPaddingLeft;
            float f19 = extendedPaddingTop;
            invalidate((int) java.lang.Math.floor((rectF.left + f18) - f17), (int) java.lang.Math.floor((rectF.top + f19) - f17), (int) java.lang.Math.ceil(f18 + rectF.right + f17), (int) java.lang.Math.ceil(f19 + rectF.bottom + f17));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001a, code lost:
    
        if (r7 == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Q(android.view.MotionEvent r6, boolean r7) {
        /*
            r5 = this;
            int r0 = r5.f211585e2
            r1 = 0
            r2 = 1
            r3 = -1
            if (r0 != r3) goto L10
            int r0 = r6.getPointerId(r1)
            r5.f211585e2 = r0
            r5.f211587f2 = r7
            goto L1c
        L10:
            int r4 = r6.getPointerId(r1)
            if (r0 == r4) goto L1c
            boolean r0 = r5.f211587f2
            if (r0 == 0) goto L1d
            if (r7 == 0) goto L1d
        L1c:
            r1 = r2
        L1d:
            int r7 = r6.getActionMasked()
            if (r7 == r2) goto L2a
            int r6 = r6.getActionMasked()
            r7 = 3
            if (r6 != r7) goto L2c
        L2a:
            r5.f211585e2 = r3
        L2c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.cedit.edit.CustomTextView.Q(android.view.MotionEvent, boolean):boolean");
    }

    public boolean R() {
        java.lang.String str;
        return getReuseItems().size() > 0 && (str = android.os.Build.BRAND) != null && getReuseBrands().contains(str.toLowerCase());
    }

    public boolean T(float f17, float f18) {
        float[] fArr = f211571o2;
        synchronized (fArr) {
            fArr[0] = f17;
            fArr[1] = f18;
            android.view.View view = this;
            while (view != null) {
                if (view != this) {
                    fArr[0] = fArr[0] - view.getScrollX();
                    fArr[1] = fArr[1] - view.getScrollY();
                }
                float f19 = fArr[0];
                if (f19 >= 0.0f && fArr[1] >= 0.0f && f19 <= view.getWidth() && fArr[1] <= view.getHeight()) {
                    if (!view.getMatrix().isIdentity()) {
                        view.getMatrix().mapPoints(fArr);
                    }
                    fArr[0] = fArr[0] + view.getLeft();
                    fArr[1] = fArr[1] + view.getTop();
                    java.lang.Object parent = view.getParent();
                    view = parent instanceof android.view.View ? (android.view.View) parent : null;
                }
                return false;
            }
            return true;
        }
    }

    public boolean U() {
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var == null) {
            return false;
        }
        int i17 = e0Var.f272958p;
        if ((i17 & 15) != 1 || (524288 & i17) > 0) {
            return false;
        }
        int i18 = i17 & 4080;
        return i18 == 0 || i18 == 48 || i18 == 80 || i18 == 64 || i18 == 160;
    }

    public boolean V() {
        return (this.A instanceof android.text.Editable) && onCheckIsTextEditor() && isEnabled();
    }

    public boolean W() {
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var == null) {
            return false;
        }
        return e0Var.f272966x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [android.text.Layout] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    public void X(int i17, int i18, android.text.BoringLayout.Metrics metrics, android.text.BoringLayout.Metrics metrics2, int i19, boolean z17) {
        android.text.BoringLayout.Metrics metrics3;
        android.text.TextUtils.TruncateAt truncateAt;
        int i27;
        android.text.Layout.Alignment alignment;
        android.text.Layout layout;
        android.text.BoringLayout boringLayout;
        android.text.BoringLayout boringLayout2;
        ?? r132;
        int i28;
        android.text.Layout layout2;
        android.text.BoringLayout.Metrics metrics4;
        int i29;
        int i37 = i19;
        this.f211618y1 = this.f211617y0;
        this.f211620z1 = this.f211596l1;
        this.V1 = true;
        int i38 = i17 < 0 ? 0 : i17;
        int i39 = i18 < 0 ? 0 : i18;
        android.text.Layout.Alignment layoutAlignment = getLayoutAlignment();
        boolean z18 = this.E1 && this.M != null && (layoutAlignment == android.text.Layout.Alignment.ALIGN_NORMAL || layoutAlignment == android.text.Layout.Alignment.ALIGN_OPPOSITE);
        int paragraphDirection = z18 ? this.M.getParagraphDirection(0) : 0;
        boolean z19 = this.f211616y != null && getKeyListener() == null;
        android.text.TextUtils.TruncateAt truncateAt2 = this.f211616y;
        if (this.P1 == null) {
            this.P1 = getTextDirectionHeuristic();
        }
        boolean z27 = truncateAt2 == this.f211616y;
        boolean z28 = W() || this.B != null;
        android.text.BoringLayout.Metrics metrics5 = f211577u2;
        if (z28) {
            r132 = 0;
            metrics3 = metrics5;
            truncateAt = truncateAt2;
            i27 = paragraphDirection;
            alignment = layoutAlignment;
            layout = new android.text.DynamicLayout(this.A, this.C, this.K, i38, layoutAlignment, this.f211604p0, this.f211614x0, this.G1, getKeyListener() == null ? truncateAt2 : null, i19);
        } else {
            android.text.BoringLayout.Metrics metrics6 = metrics;
            java.lang.Object obj = null;
            metrics3 = metrics5;
            truncateAt = truncateAt2;
            i27 = paragraphDirection;
            alignment = layoutAlignment;
            if (metrics6 == metrics3 && (metrics6 = android.text.BoringLayout.isBoring(this.C, this.K, this.L1)) != null) {
                this.L1 = metrics6;
            }
            android.text.BoringLayout.Metrics metrics7 = metrics6;
            if (metrics7 != null) {
                int i47 = metrics7.width;
                if (i47 <= i38 && (truncateAt == null || i47 <= i37)) {
                    android.text.BoringLayout make = (!z27 || (boringLayout2 = this.N1) == null) ? android.text.BoringLayout.make(this.C, this.K, i38, alignment, this.f211604p0, this.f211614x0, metrics7, this.G1) : boringLayout2.replaceOrMake(this.C, this.K, i38, alignment, this.f211604p0, this.f211614x0, metrics7, this.G1);
                    layout = make;
                    r132 = obj;
                    if (z27) {
                        this.N1 = make;
                        layout = make;
                        r132 = obj;
                    }
                } else if (z19 && i47 <= i38) {
                    if (!z27 || (boringLayout = this.N1) == null) {
                        layout = android.text.BoringLayout.make(this.C, this.K, i38, alignment, this.f211604p0, this.f211614x0, metrics7, this.G1, truncateAt, i19);
                        r132 = obj;
                    } else {
                        layout = boringLayout.replaceOrMake(this.C, this.K, i38, alignment, this.f211604p0, this.f211614x0, metrics7, this.G1, truncateAt, i19);
                        r132 = obj;
                    }
                }
            }
            layout = null;
            r132 = obj;
        }
        if (layout == null) {
            java.lang.CharSequence charSequence = this.C;
            int length = charSequence.length();
            android.text.TextPaint textPaint = this.K;
            float f17 = this.f211604p0;
            float f18 = this.f211614x0;
            boolean z29 = this.G1;
            android.text.TextUtils.TruncateAt truncateAt3 = z19 ? truncateAt : r132;
            if (z19) {
                i29 = i37;
                i28 = i38;
            } else {
                i28 = i38;
                i29 = 0;
            }
            layout2 = new android.text.StaticLayout(charSequence, 0, length, textPaint, i28, alignment, f17, f18, z29, truncateAt3, i29);
        } else {
            i28 = i38;
            layout2 = layout;
        }
        this.M = layout2;
        boolean z37 = this.f211616y != null;
        this.F = r132;
        java.lang.CharSequence charSequence2 = this.E;
        if (charSequence2 != null) {
            int i48 = z37 ? i28 : i39;
            if (metrics2 == metrics3) {
                android.text.BoringLayout.Metrics isBoring = android.text.BoringLayout.isBoring(charSequence2, this.K, this.M1);
                if (isBoring != null) {
                    this.M1 = isBoring;
                }
                metrics4 = isBoring;
            } else {
                metrics4 = metrics2;
            }
            if (metrics4 != null) {
                int i49 = metrics4.width;
                if (i49 <= i48 && (!z37 || i49 <= i37)) {
                    android.text.BoringLayout boringLayout3 = this.O1;
                    if (boringLayout3 != null) {
                        this.F = boringLayout3.replaceOrMake(this.E, this.K, i48, alignment, this.f211604p0, this.f211614x0, metrics4, this.G1);
                    } else {
                        this.F = android.text.BoringLayout.make(this.E, this.K, i48, alignment, this.f211604p0, this.f211614x0, metrics4, this.G1);
                    }
                    this.O1 = (android.text.BoringLayout) this.F;
                } else if (z37 && i49 <= i48) {
                    android.text.BoringLayout boringLayout4 = this.O1;
                    if (boringLayout4 != null) {
                        this.F = boringLayout4.replaceOrMake(this.E, this.K, i48, alignment, this.f211604p0, this.f211614x0, metrics4, this.G1, this.f211616y, i19);
                    } else {
                        this.F = android.text.BoringLayout.make(this.E, this.K, i48, alignment, this.f211604p0, this.f211614x0, metrics4, this.G1, this.f211616y, i19);
                    }
                }
            }
            if (this.F == null) {
                java.lang.CharSequence charSequence3 = this.E;
                int length2 = charSequence3.length();
                android.text.TextPaint textPaint2 = this.K;
                float f19 = this.f211604p0;
                float f27 = this.f211614x0;
                boolean z38 = this.G1;
                android.text.TextUtils.TruncateAt truncateAt4 = z37 ? truncateAt : r132;
                if (!z37) {
                    i37 = 0;
                }
                this.F = new android.text.StaticLayout(charSequence3, 0, length2, textPaint2, i48, alignment, f19, f27, z38, truncateAt4, i37);
            }
        }
        if (z17 || (z18 && i27 != this.M.getParagraphDirection(0))) {
            d0();
        }
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var != null) {
            e0Var.z();
        }
    }

    public void Y() {
        android.text.Layout layout = this.M;
        if ((layout instanceof android.text.BoringLayout) && this.N1 == null) {
            this.N1 = (android.text.BoringLayout) layout;
        }
        android.text.Layout layout2 = this.F;
        if ((layout2 instanceof android.text.BoringLayout) && this.O1 == null) {
            this.O1 = (android.text.BoringLayout) layout2;
        }
        this.M1 = null;
        this.L1 = null;
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var != null) {
            e0Var.z();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Z(int i17) {
        java.lang.Object obj;
        gl5.e0 e0Var = this.f211589g2;
        gl5.r rVar = e0Var == null ? null : e0Var.f272952j;
        if (rVar != null) {
            gl5.h hVar = rVar.f273084f;
            if (hVar != null) {
                if (this instanceof fl5.i ? ((fl5.l) hVar).f263955a.a((fl5.i) this, i17, null) : false) {
                    return;
                }
            }
            if (i17 == 5) {
                android.view.View focusSearch = focusSearch(2);
                if (focusSearch != null && !focusSearch.requestFocus(2)) {
                    throw new java.lang.IllegalStateException("focus search returned a view that wasn't able to take focus!");
                }
                return;
            }
            if (i17 == 7) {
                android.view.View focusSearch2 = focusSearch(1);
                if (focusSearch2 != null && !focusSearch2.requestFocus(1)) {
                    throw new java.lang.IllegalStateException("focus search returned a view that wasn't able to take focus!");
                }
                return;
            }
            if (i17 == 6) {
                android.view.inputmethod.InputMethodManager inputMethodManager = getInputMethodManager();
                if (inputMethodManager == null || !inputMethodManager.isActive(this)) {
                    return;
                }
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
                return;
            }
        }
        java.lang.Class<?>[] clsArr = new java.lang.Class[0];
        java.lang.reflect.Method method = null;
        for (java.lang.Class<?> cls = getClass(); cls != java.lang.Object.class; cls = cls.getSuperclass()) {
            try {
                method = cls.getDeclaredMethod("getViewRootImpl", clsArr);
            } catch (java.lang.Throwable unused) {
            }
        }
        if (method == null) {
            new java.lang.Throwable("MB getViewRootImpl");
        }
        java.lang.Object[] objArr = new java.lang.Object[0];
        try {
            method.setAccessible(true);
            obj = method.invoke(this, objArr);
        } catch (java.lang.Throwable unused2) {
            obj = null;
        }
        if (obj != null) {
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            java.lang.Class<?>[] clsArr2 = {android.view.KeyEvent.class};
            java.lang.reflect.Method method2 = null;
            for (java.lang.Class<?> cls2 = obj.getClass(); cls2 != java.lang.Object.class; cls2 = cls2.getSuperclass()) {
                try {
                    method2 = cls2.getDeclaredMethod("dispatchKeyFromIme", clsArr2);
                } catch (java.lang.Throwable unused3) {
                }
            }
            if (method2 == null) {
                new java.lang.Throwable("MB dispatchKeyFromIme");
            }
            java.lang.reflect.Method method3 = method2;
            java.lang.Object[] objArr2 = {new android.view.KeyEvent(uptimeMillis, uptimeMillis, 0, 66, 0, 0, -1, 0, 22)};
            try {
                method3.setAccessible(true);
                method3.invoke(obj, objArr2);
            } catch (java.lang.Throwable unused4) {
            }
            java.lang.Class<?>[] clsArr3 = {android.view.KeyEvent.class};
            java.lang.reflect.Method method4 = null;
            for (java.lang.Class<?> cls3 = obj.getClass(); cls3 != java.lang.Object.class; cls3 = cls3.getSuperclass()) {
                try {
                    method4 = cls3.getDeclaredMethod("dispatchKeyFromIme", clsArr3);
                } catch (java.lang.Throwable unused5) {
                }
            }
            if (method4 == null) {
                new java.lang.Throwable("MB dispatchKeyFromIme");
            }
            java.lang.reflect.Method method5 = method4;
            java.lang.Object[] objArr3 = {new android.view.KeyEvent(android.os.SystemClock.uptimeMillis(), uptimeMillis, 1, 66, 0, 0, -1, 0, 22)};
            try {
                method5.setAccessible(true);
                method5.invoke(obj, objArr3);
            } catch (java.lang.Throwable unused6) {
            }
        }
    }

    public boolean a0(java.lang.String str, android.os.Bundle bundle) {
        return false;
    }

    @Override // android.view.View
    public void addExtraDataToAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.String str, android.os.Bundle bundle) {
        android.graphics.RectF characterBounds;
        float f17;
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this;
        if (bundle == null || !str.equals("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            return;
        }
        int i17 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i18 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i18 <= 0 || i17 < 0 || i17 >= customTextView.A.length()) {
            com.tencent.mars.xlog.Log.e("cmEdit.CMTextView", "Invalid arguments for accessibility character locations");
            return;
        }
        android.graphics.RectF[] rectFArr = new android.graphics.RectF[i18];
        android.view.inputmethod.CursorAnchorInfo.Builder builder = new android.view.inputmethod.CursorAnchorInfo.Builder();
        int i19 = i17 + i18;
        float compoundPaddingLeft = getCompoundPaddingLeft() - getScrollX();
        float y07 = y0();
        int lineForOffset = customTextView.M.getLineForOffset(i17);
        int lineForOffset2 = customTextView.M.getLineForOffset(i19 - 1);
        int i27 = lineForOffset;
        while (i27 <= lineForOffset2) {
            int lineStart = customTextView.M.getLineStart(i27);
            int lineEnd = customTextView.M.getLineEnd(i27);
            int max = java.lang.Math.max(lineStart, i17);
            int min = java.lang.Math.min(lineEnd, i19);
            boolean z17 = customTextView.M.getParagraphDirection(i27) == 1;
            float[] fArr = new float[min - max];
            customTextView.M.getPaint().getTextWidths(customTextView.C, max, min, fArr);
            float lineTop = customTextView.M.getLineTop(i27);
            float lineBottom = customTextView.M.getLineBottom(i27);
            int i28 = i19;
            int i29 = max;
            while (i29 < min) {
                float f18 = fArr[i29 - max];
                float[] fArr2 = fArr;
                boolean isRtlCharAt = customTextView.M.isRtlCharAt(i29);
                int i37 = min;
                float primaryHorizontal = customTextView.M.getPrimaryHorizontal(i29);
                int i38 = max;
                float secondaryHorizontal = customTextView.M.getSecondaryHorizontal(i29);
                if (!z17) {
                    if (isRtlCharAt) {
                        secondaryHorizontal = primaryHorizontal - f18;
                    } else {
                        primaryHorizontal = secondaryHorizontal + f18;
                    }
                    float f19 = secondaryHorizontal;
                    secondaryHorizontal = primaryHorizontal;
                    primaryHorizontal = f19;
                } else if (isRtlCharAt) {
                    primaryHorizontal = secondaryHorizontal - f18;
                } else {
                    secondaryHorizontal = f18 + primaryHorizontal;
                }
                float f27 = primaryHorizontal + compoundPaddingLeft;
                float f28 = secondaryHorizontal + compoundPaddingLeft;
                int i39 = i27;
                float f29 = lineTop + y07;
                int i47 = lineForOffset2;
                float f37 = lineBottom + y07;
                boolean T = customTextView.T(f27, f29);
                boolean T2 = customTextView.T(f28, f37);
                int i48 = (T || T2) ? 1 : 0;
                if (!T || !T2) {
                    i48 |= 2;
                }
                if (isRtlCharAt) {
                    f17 = lineBottom;
                    i48 |= 4;
                } else {
                    f17 = lineBottom;
                }
                builder.addCharacterBounds(i29, f27, f29, f28, f37, i48);
                i29++;
                customTextView = this;
                i27 = i39;
                fArr = fArr2;
                min = i37;
                max = i38;
                lineForOffset2 = i47;
                lineBottom = f17;
                lineTop = lineTop;
            }
            i27++;
            customTextView = this;
            i19 = i28;
        }
        android.view.inputmethod.CursorAnchorInfo build = builder.setMatrix(null).build();
        for (int i49 = 0; i49 < i18; i49++) {
            int i57 = i17 + i49;
            if ((build.getCharacterBoundsFlags(i57) & 1) == 1 && (characterBounds = build.getCharacterBounds(i57)) != null) {
                rectFArr[i49] = characterBounds;
            }
        }
        accessibilityNodeInfo.getExtras().putParcelableArray(str, rectFArr);
    }

    public final void append(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        java.lang.CharSequence charSequence2 = this.A;
        if (!(charSequence2 instanceof android.text.Editable)) {
            n0(charSequence2, android.widget.TextView.BufferType.EDITABLE);
        }
        ((android.text.Editable) this.A).append(charSequence, 0, length);
        int i17 = this.V;
        if (i17 == 0 || !android.text.util.Linkify.addLinks(this.B, i17) || !this.W || v0()) {
            return;
        }
        setMovementMethod(com.tencent.mm.ui.widget.cedit.move.LinkMovementMethod.getInstance());
    }

    @Override // android.view.View
    public void autofill(android.view.autofill.AutofillValue autofillValue) {
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 < 26 || (autofillValue.isText() && V())) {
            o0(i17 >= 26 ? autofillValue.getTextValue() : null, this.D, true, 0);
            java.lang.CharSequence text = getText();
            if (text instanceof android.text.Spannable) {
                android.text.Selection.setSelection((android.text.Spannable) text, text.length());
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.w("cmEdit.CMTextView", autofillValue + " could not be autofilled into " + this);
    }

    public void b0(int i17, int i18) {
        sendAccessibilityEvent(8192);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x011d A[FALL_THROUGH, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c0(int r14) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.cedit.edit.CustomTextView.c0(int):boolean");
    }

    @Override // android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var != null) {
            e0Var.f272960r = true;
        }
    }

    public void clearComposingText() {
        if (this.A instanceof android.text.Spannable) {
            android.view.inputmethod.BaseInputConnection.removeComposingSpans(this.B);
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        android.text.Layout layout = this.M;
        return layout != null ? (this.E1 && (this.T & 7) == 3) ? (int) layout.getLineWidth(0) : layout.getWidth() : super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        android.widget.Scroller scroller = this.K1;
        if (scroller == null || !scroller.computeScrollOffset()) {
            return;
        }
        postInvalidate();
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return (getHeight() - getCompoundPaddingTop()) - getCompoundPaddingBottom();
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        android.text.Layout layout = this.M;
        return layout != null ? layout.getHeight() : super.computeVerticalScrollRange();
    }

    public final void d0() {
        if (this.f211608s) {
            return;
        }
        getViewTreeObserver().addOnPreDrawListener(this);
        this.f211608s = true;
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f17, float f18) {
        super.drawableHotspotChanged(f17, f18);
        gl5.g gVar = this.f211619z;
        if (gVar != null) {
            for (android.graphics.drawable.Drawable drawable : gVar.f272981b) {
                if (drawable != null) {
                    drawable.setHotspot(f17, f18);
                }
            }
        }
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        android.content.res.ColorStateList colorStateList;
        android.content.res.ColorStateList colorStateList2;
        super.drawableStateChanged();
        android.content.res.ColorStateList colorStateList3 = this.f211582d;
        if ((colorStateList3 != null && colorStateList3.isStateful()) || (((colorStateList = this.f211584e) != null && colorStateList.isStateful()) || ((colorStateList2 = this.f211586f) != null && colorStateList2.isStateful()))) {
            x0();
        }
        if (this.f211619z != null) {
            int[] drawableState = getDrawableState();
            for (android.graphics.drawable.Drawable drawable : this.f211619z.f272981b) {
                if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
                    invalidateDrawable(drawable);
                }
            }
        }
    }

    public final void e0(int i17, int i18, java.lang.Class cls) {
        java.lang.CharSequence charSequence = this.A;
        if (charSequence instanceof android.text.Editable) {
            android.text.Editable editable = (android.text.Editable) charSequence;
            java.lang.Object[] spans = editable.getSpans(i17, i18, cls);
            int length = spans.length;
            for (int i19 = 0; i19 < length; i19++) {
                int spanStart = editable.getSpanStart(spans[i19]);
                if (editable.getSpanEnd(spans[i19]) == i17 || spanStart == i18) {
                    return;
                }
                editable.removeSpan(spans[i19]);
            }
        }
    }

    public java.lang.CharSequence f0(java.lang.CharSequence charSequence) {
        if (!(charSequence instanceof android.text.Spanned)) {
            return charSequence;
        }
        android.text.Spannable newSpannable = charSequence instanceof android.text.Spannable ? (android.text.Spannable) charSequence : this.f211600n.newSpannable(charSequence);
        android.text.style.SuggestionSpan[] suggestionSpanArr = (android.text.style.SuggestionSpan[]) newSpannable.getSpans(0, charSequence.length(), android.text.style.SuggestionSpan.class);
        if (suggestionSpanArr.length == 0) {
            return charSequence;
        }
        for (android.text.style.SuggestionSpan suggestionSpan : suggestionSpanArr) {
            newSpannable.removeSpan(suggestionSpan);
        }
        return newSpannable;
    }

    @Override // android.view.View
    public void findViewsWithText(java.util.ArrayList arrayList, java.lang.CharSequence charSequence, int i17) {
        super.findViewsWithText(arrayList, charSequence, i17);
        if (arrayList.contains(this) || (i17 & 1) == 0 || android.text.TextUtils.isEmpty(charSequence) || android.text.TextUtils.isEmpty(this.A)) {
            return;
        }
        if (this.A.toString().toLowerCase().contains(charSequence.toString().toLowerCase())) {
            arrayList.add(this);
        }
    }

    @Override // android.view.View
    public android.view.View focusSearch(int i17) {
        try {
            return super.focusSearch(i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("cmEdit.CMTextView", "focusSearch err", th6);
            return null;
        }
    }

    public android.view.ViewParent g() {
        return getParent();
    }

    public final void g0(android.graphics.Typeface typeface, int i17, int i18) {
        if (i18 < 0) {
            p0(typeface, i17);
        } else {
            java.lang.Math.min(1000, i18);
            p0(typeface, i17);
        }
    }

    @Override // android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return com.tencent.mm.ui.widget.cedit.edit.CustomTextView.class.getName();
    }

    public int getAccessibilitySelectionEnd() {
        return getSelectionEnd();
    }

    public int getAccessibilitySelectionStart() {
        return getSelectionStart();
    }

    public android.widget.TextView getAdaptText() {
        return this.f211591h2;
    }

    @Override // android.view.View
    public int getAutofillType() {
        return V() ? 1 : 0;
    }

    @Override // android.view.View
    public android.view.autofill.AutofillValue getAutofillValue() {
        if (!V()) {
            return null;
        }
        java.lang.CharSequence b17 = jl5.b.b(getText());
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return android.view.autofill.AutofillValue.forText(b17);
        }
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.M == null ? super.getBaseline() : getBaselineOffset() + this.M.getLineBaseline(0);
    }

    public int getBaselineOffset() {
        return getExtendedPaddingTop() + ((this.T & 112) != 48 ? L(true) : 0);
    }

    @Override // android.view.View
    public int getBottomPaddingOffset() {
        return (int) java.lang.Math.max(0.0f, this.f211606q + this.f211602o);
    }

    public int getCompoundDrawablePadding() {
        gl5.g gVar = this.f211619z;
        if (gVar != null) {
            return gVar.f272998s;
        }
        return 0;
    }

    public android.graphics.BlendMode getCompoundDrawableTintBlendMode() {
        gl5.g gVar = this.f211619z;
        if (gVar != null) {
            return gVar.f272983d;
        }
        return null;
    }

    public android.content.res.ColorStateList getCompoundDrawableTintList() {
        gl5.g gVar = this.f211619z;
        if (gVar != null) {
            return gVar.f272982c;
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getCompoundDrawableTintMode() {
        return null;
    }

    public android.graphics.drawable.Drawable[] getCompoundDrawables() {
        gl5.g gVar = this.f211619z;
        return gVar != null ? (android.graphics.drawable.Drawable[]) gVar.f272981b.clone() : new android.graphics.drawable.Drawable[]{null, null, null, null};
    }

    public android.graphics.drawable.Drawable[] getCompoundDrawablesRelative() {
        gl5.g gVar = this.f211619z;
        if (gVar == null) {
            return new android.graphics.drawable.Drawable[]{null, null, null, null};
        }
        android.graphics.drawable.Drawable[] drawableArr = gVar.f272981b;
        return new android.graphics.drawable.Drawable[]{gVar.f272986g, drawableArr[1], gVar.f272987h, drawableArr[3]};
    }

    public int getCompoundPaddingBottom() {
        gl5.g gVar = this.f211619z;
        return (gVar == null || gVar.f272981b[3] == null) ? getPaddingBottom() : getPaddingBottom() + gVar.f272998s + gVar.f272991l;
    }

    public int getCompoundPaddingEnd() {
        return getLayoutDirection() != 1 ? getCompoundPaddingRight() : getCompoundPaddingLeft();
    }

    public int getCompoundPaddingLeft() {
        gl5.g gVar = this.f211619z;
        return (gVar == null || gVar.f272981b[0] == null) ? getPaddingLeft() : getPaddingLeft() + gVar.f272998s + gVar.f272992m;
    }

    public int getCompoundPaddingRight() {
        gl5.g gVar = this.f211619z;
        return (gVar == null || gVar.f272981b[2] == null) ? getPaddingRight() : getPaddingRight() + gVar.f272998s + gVar.f272993n;
    }

    public int getCompoundPaddingStart() {
        return getLayoutDirection() != 1 ? getCompoundPaddingLeft() : getCompoundPaddingRight();
    }

    public int getCompoundPaddingTop() {
        gl5.g gVar = this.f211619z;
        return (gVar == null || gVar.f272981b[1] == null) ? getPaddingTop() : getPaddingTop() + gVar.f272998s + gVar.f272990k;
    }

    public final int getCurrentHintTextColor() {
        return this.f211584e != null ? this.f211590h : this.f211588g;
    }

    public final int getCurrentTextColor() {
        return this.f211588g;
    }

    public android.view.ActionMode.Callback getCustomInsertionActionModeCallback() {
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var == null) {
            return null;
        }
        return e0Var.L;
    }

    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var == null) {
            return null;
        }
        return e0Var.K;
    }

    public boolean getDefaultEditable() {
        return false;
    }

    public il5.a getDefaultMovementMethod() {
        return null;
    }

    public android.text.Editable getEditableText() {
        java.lang.CharSequence charSequence = this.A;
        if (charSequence instanceof android.text.Editable) {
            return (android.text.Editable) charSequence;
        }
        return null;
    }

    public gl5.e0 getEditor() {
        return this.f211589g2;
    }

    @android.view.ViewDebug.ExportedProperty
    public android.text.TextUtils.TruncateAt getEllipsize() {
        return this.f211616y;
    }

    public int getExtendedPaddingBottom() {
        if (this.f211596l1 != 1) {
            return getCompoundPaddingBottom();
        }
        if (this.M == null) {
            t();
        }
        if (this.M.getLineCount() <= this.f211617y0) {
            return getCompoundPaddingBottom();
        }
        int compoundPaddingTop = getCompoundPaddingTop();
        int compoundPaddingBottom = getCompoundPaddingBottom();
        int height = (getHeight() - compoundPaddingTop) - compoundPaddingBottom;
        int lineTop = this.M.getLineTop(this.f211617y0);
        if (lineTop >= height) {
            return compoundPaddingBottom;
        }
        int i17 = this.T & 112;
        return i17 == 48 ? (compoundPaddingBottom + height) - lineTop : i17 == 80 ? compoundPaddingBottom : compoundPaddingBottom + ((height - lineTop) / 2);
    }

    public int getExtendedPaddingTop() {
        int i17;
        if (this.f211596l1 != 1) {
            return getCompoundPaddingTop();
        }
        if (this.M == null) {
            t();
        }
        if (this.M.getLineCount() <= this.f211617y0) {
            return getCompoundPaddingTop();
        }
        int compoundPaddingTop = getCompoundPaddingTop();
        int height = (getHeight() - compoundPaddingTop) - getCompoundPaddingBottom();
        int lineTop = this.M.getLineTop(this.f211617y0);
        return (lineTop < height && (i17 = this.T & 112) != 48) ? i17 == 80 ? (compoundPaddingTop + height) - lineTop : compoundPaddingTop + ((height - lineTop) / 2) : compoundPaddingTop;
    }

    public android.text.InputFilter[] getFilters() {
        return this.Q1;
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.view.View
    public void getFocusedRect(android.graphics.Rect rect) {
        if (this.M == null) {
            super.getFocusedRect(rect);
            return;
        }
        int selectionEnd = getSelectionEnd();
        if (selectionEnd < 0) {
            super.getFocusedRect(rect);
            return;
        }
        int selectionStart = getSelectionStart();
        if (selectionStart < 0 || selectionStart >= selectionEnd) {
            int lineForOffset = this.M.getLineForOffset(selectionEnd);
            rect.top = this.M.getLineTop(lineForOffset);
            rect.bottom = this.M.getLineBottom(lineForOffset);
            int primaryHorizontal = ((int) this.M.getPrimaryHorizontal(selectionEnd)) - 2;
            rect.left = primaryHorizontal;
            rect.right = primaryHorizontal + 4;
        } else {
            int lineForOffset2 = this.M.getLineForOffset(selectionStart);
            int lineForOffset3 = this.M.getLineForOffset(selectionEnd);
            rect.top = this.M.getLineTop(lineForOffset2);
            rect.bottom = this.M.getLineBottom(lineForOffset3);
            if (lineForOffset2 == lineForOffset3) {
                rect.left = (int) this.M.getPrimaryHorizontal(selectionStart);
                rect.right = (int) this.M.getPrimaryHorizontal(selectionEnd);
            } else {
                if (this.V1) {
                    if (this.T1 == null) {
                        this.T1 = new android.graphics.Path();
                    }
                    this.T1.reset();
                    this.M.getSelectionPath(selectionStart, selectionEnd, this.T1);
                    this.V1 = false;
                }
                android.graphics.RectF rectF = f211572p2;
                synchronized (rectF) {
                    this.T1.computeBounds(rectF, true);
                    rect.left = ((int) rectF.left) - 1;
                    rect.right = ((int) rectF.right) + 1;
                }
            }
        }
        int compoundPaddingLeft = getCompoundPaddingLeft();
        int extendedPaddingTop = getExtendedPaddingTop();
        if ((this.T & 112) != 48) {
            extendedPaddingTop += L(false);
        }
        rect.offset(compoundPaddingLeft, extendedPaddingTop);
        rect.bottom += getExtendedPaddingBottom();
    }

    public java.lang.String getFontFeatureSettings() {
        return this.K.getFontFeatureSettings();
    }

    public java.lang.String getFontVariationSettings() {
        return android.os.Build.VERSION.SDK_INT >= 26 ? this.K.getFontVariationSettings() : "";
    }

    public boolean getFreezesText() {
        return this.f211592i;
    }

    public int getGravity() {
        return this.T;
    }

    public int getHighlightColor() {
        return this.S1;
    }

    @android.view.ViewDebug.CapturedViewProperty
    public java.lang.CharSequence getHint() {
        return this.E;
    }

    public final android.content.res.ColorStateList getHintTextColors() {
        return this.f211584e;
    }

    public int getHorizontalOffsetForDrawables() {
        return 0;
    }

    public boolean getHorizontallyScrolling() {
        return this.U;
    }

    public int getImeActionId() {
        gl5.r rVar;
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var == null || (rVar = e0Var.f272952j) == null) {
            return 0;
        }
        return rVar.f273082d;
    }

    public java.lang.CharSequence getImeActionLabel() {
        gl5.r rVar;
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var == null || (rVar = e0Var.f272952j) == null) {
            return null;
        }
        return rVar.f273081c;
    }

    public android.os.LocaleList getImeHintLocales() {
        gl5.r rVar;
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var == null || (rVar = e0Var.f272952j) == null) {
            return null;
        }
        return rVar.f273086h;
    }

    public int getImeOptions() {
        gl5.r rVar;
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var == null || (rVar = e0Var.f272952j) == null) {
            return 0;
        }
        return rVar.f273079a;
    }

    public boolean getIncludeFontPadding() {
        return this.G1;
    }

    public android.os.Bundle getInputExtras(boolean z17) {
        if (this.f211589g2 == null && !z17) {
            return null;
        }
        D();
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var.f272952j == null) {
            if (!z17) {
                return null;
            }
            e0Var.d();
        }
        gl5.r rVar = this.f211589g2.f272952j;
        if (rVar.f273083e == null) {
            if (!z17) {
                return null;
            }
            rVar.f273083e = new android.os.Bundle();
        }
        return this.f211589g2.f272952j.f273083e;
    }

    public int getInputType() {
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var == null) {
            return 0;
        }
        return e0Var.f272958p;
    }

    public java.lang.CharSequence getIterableTextForAccessibility() {
        return this.A;
    }

    public final android.text.method.KeyListener getKeyListener() {
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var == null) {
            return null;
        }
        return e0Var.f272957o;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public final android.text.Layout getLayout() {
        return this.M;
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        if (getLineCount() != 1) {
            return super.getLeftFadingEdgeStrength();
        }
        float lineLeft = getLayout().getLineLeft(0);
        if (lineLeft > getScrollX()) {
            return 0.0f;
        }
        float scrollX = getScrollX();
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        if (horizontalFadingEdgeLength == 0) {
            return 0.0f;
        }
        float abs = java.lang.Math.abs(scrollX - lineLeft);
        float f17 = horizontalFadingEdgeLength;
        if (abs > f17) {
            return 1.0f;
        }
        return abs / f17;
    }

    @Override // android.view.View
    public int getLeftPaddingOffset() {
        return (getCompoundPaddingLeft() - getPaddingLeft()) + ((int) java.lang.Math.min(0.0f, this.f211603p - this.f211602o));
    }

    public float getLetterSpacing() {
        return this.K.getLetterSpacing();
    }

    public int getLineCount() {
        android.text.Layout layout = this.M;
        if (layout != null) {
            return layout.getLineCount();
        }
        return 0;
    }

    public int getLineHeight() {
        return (int) (((((this.K.getFontMetricsInt(null) * this.f211604p0) + this.f211614x0) * 1.6777216E7f) + 8388608) >> 24);
    }

    public float getLineSpacingExtra() {
        return this.f211614x0;
    }

    public float getLineSpacingMultiplier() {
        return this.f211604p0;
    }

    public final android.content.res.ColorStateList getLinkTextColors() {
        return this.f211586f;
    }

    public final boolean getLinksClickable() {
        return this.W;
    }

    public int getMaxEms() {
        if (this.B1 == 1) {
            return this.A1;
        }
        return -1;
    }

    public int getMaxHeight() {
        if (this.f211596l1 == 2) {
            return this.f211617y0;
        }
        return -1;
    }

    public int getMaxLines() {
        if (this.f211596l1 == 1) {
            return this.f211617y0;
        }
        return -1;
    }

    public int getMaxWidth() {
        if (this.B1 == 2) {
            return this.A1;
        }
        return -1;
    }

    public nl5.a0 getMenuCallback() {
        return this.f211597l2;
    }

    public int getMinEms() {
        if (this.D1 == 1) {
            return this.C1;
        }
        return -1;
    }

    public int getMinHeight() {
        if (this.f211615x1 == 2) {
            return this.f211605p1;
        }
        return -1;
    }

    public int getMinLines() {
        if (this.f211615x1 == 1) {
            return this.f211605p1;
        }
        return -1;
    }

    public int getMinWidth() {
        if (this.D1 == 2) {
            return this.C1;
        }
        return -1;
    }

    public final il5.a getMovementMethod() {
        return this.G;
    }

    public android.text.TextPaint getPaint() {
        return this.K;
    }

    public int getPaintFlags() {
        return this.K.getFlags();
    }

    public java.lang.String getPrivateImeOptions() {
        gl5.r rVar;
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var == null || (rVar = e0Var.f272952j) == null) {
            return null;
        }
        return rVar.f273080b;
    }

    public java.util.Set<java.lang.String> getReuseBrands() {
        return this.f211601n2;
    }

    public java.util.Set<java.lang.String> getReuseItems() {
        return this.f211599m2;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        int horizontalFadingEdgeLength;
        if (getLineCount() != 1) {
            return super.getRightFadingEdgeStrength();
        }
        float scrollX = getScrollX() + ((getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight());
        float lineRight = getLayout().getLineRight(0);
        if (lineRight < scrollX || (horizontalFadingEdgeLength = getHorizontalFadingEdgeLength()) == 0) {
            return 0.0f;
        }
        float abs = java.lang.Math.abs(scrollX - lineRight);
        float f17 = horizontalFadingEdgeLength;
        if (abs > f17) {
            return 1.0f;
        }
        return abs / f17;
    }

    @Override // android.view.View
    public int getRightPaddingOffset() {
        return (-(getCompoundPaddingRight() - getPaddingRight())) + ((int) java.lang.Math.max(0.0f, this.f211603p + this.f211602o));
    }

    @android.view.ViewDebug.ExportedProperty(category = com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT)
    public float getScaledTextSize() {
        return this.K.getTextSize() / this.K.density;
    }

    public java.lang.String getSelectedText() {
        if (!M()) {
            return null;
        }
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        java.lang.CharSequence charSequence = this.A;
        return java.lang.String.valueOf(selectionStart > selectionEnd ? charSequence.subSequence(selectionEnd, selectionStart) : charSequence.subSequence(selectionStart, selectionEnd));
    }

    @android.view.ViewDebug.ExportedProperty(category = com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT)
    public int getSelectionEnd() {
        return android.text.Selection.getSelectionEnd(getText());
    }

    @android.view.ViewDebug.ExportedProperty(category = com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT)
    public int getSelectionStart() {
        return android.text.Selection.getSelectionStart(getText());
    }

    public int getShadowColor() {
        return this.f211607r;
    }

    public float getShadowDx() {
        return this.f211603p;
    }

    public float getShadowDy() {
        return this.f211606q;
    }

    public float getShadowRadius() {
        return this.f211602o;
    }

    public final boolean getShowSoftInputOnFocus() {
        gl5.e0 e0Var = this.f211589g2;
        return e0Var == null || e0Var.f272968z;
    }

    public java.util.Locale getSpellCheckerLocale() {
        android.os.AsyncTask.execute(new gl5.d(this));
        return null;
    }

    @android.view.ViewDebug.CapturedViewProperty
    public java.lang.CharSequence getText() {
        return this.A;
    }

    public android.view.textclassifier.TextClassificationContext getTextClassificationContext() {
        return this.f211612w;
    }

    public final android.view.textclassifier.TextClassificationManager getTextClassificationManagerForUser() {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return null;
        }
        getContext().getPackageName();
        return (android.view.textclassifier.TextClassificationManager) (this.R1 == null ? getContext().getSystemService(android.view.textclassifier.TextClassificationManager.class) : null);
    }

    public android.view.textclassifier.TextClassifier getTextClassificationSession() {
        android.view.textclassifier.TextClassifier textClassifier;
        if (android.os.Build.VERSION.SDK_INT >= 28 && ((textClassifier = this.f211611v) == null || textClassifier.isDestroyed())) {
            android.view.textclassifier.TextClassificationManager textClassificationManagerForUser = getTextClassificationManagerForUser();
            if (textClassificationManagerForUser != null) {
                android.view.textclassifier.TextClassificationContext build = new android.view.textclassifier.TextClassificationContext.Builder(getContext().getPackageName(), V() ? "edittext" : W() ? "textview" : "nosel-textview").build();
                this.f211612w = build;
                if (this.f211610u == null) {
                    this.f211611v = textClassificationManagerForUser.createTextClassificationSession(build);
                }
            } else {
                this.f211611v = android.view.textclassifier.TextClassifier.NO_OP;
            }
        }
        return this.f211611v;
    }

    public android.view.textclassifier.TextClassifier getTextClassifier() {
        if (this.f211610u == null) {
            android.view.textclassifier.TextClassificationManager textClassificationManagerForUser = getTextClassificationManagerForUser();
            if (textClassificationManagerForUser != null && android.os.Build.VERSION.SDK_INT >= 26) {
                return textClassificationManagerForUser.getTextClassifier();
            }
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                return android.view.textclassifier.TextClassifier.NO_OP;
            }
        }
        return this.f211610u;
    }

    public final android.content.res.ColorStateList getTextColors() {
        return this.f211582d;
    }

    public android.graphics.drawable.Drawable getTextCursorDrawable() {
        if (this.X1 == null && this.W1 != 0) {
            this.X1 = getContext().getDrawable(this.W1);
        }
        return this.X1;
    }

    public android.text.TextDirectionHeuristic getTextDirectionHeuristic() {
        if (this.H instanceof android.text.method.PasswordTransformationMethod) {
            return android.text.TextDirectionHeuristics.LTR;
        }
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var != null && (e0Var.f272958p & 15) == 3) {
            byte directionality = java.lang.Character.getDirectionality((android.os.Build.VERSION.SDK_INT >= 28 ? android.icu.text.DecimalFormatSymbols.getInstance(getTextLocale()).getDigitStrings()[0] : null).codePointAt(0));
            return (directionality == 1 || directionality == 2) ? android.text.TextDirectionHeuristics.RTL : android.text.TextDirectionHeuristics.LTR;
        }
        boolean z17 = getLayoutDirection() == 1;
        switch (getTextDirection()) {
            case 2:
                return android.text.TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return android.text.TextDirectionHeuristics.LTR;
            case 4:
                return android.text.TextDirectionHeuristics.RTL;
            case 5:
                return android.text.TextDirectionHeuristics.LOCALE;
            case 6:
                return android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                return z17 ? android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL : android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    public java.util.Locale getTextLocale() {
        return this.K.getTextLocale();
    }

    public android.os.LocaleList getTextLocales() {
        return this.K.getTextLocales();
    }

    public float getTextScaleX() {
        return this.K.getTextScaleX();
    }

    public android.graphics.drawable.Drawable getTextSelectHandle() {
        if (this.f211583d2 == null && this.f211581c2 != 0) {
            this.f211583d2 = getContext().getDrawable(com.tencent.mm.R.drawable.f482172bt4);
        }
        return this.f211583d2;
    }

    public android.graphics.drawable.Drawable getTextSelectHandleLeft() {
        if (this.Z1 == null && this.Y1 != 0) {
            this.Z1 = getContext().getDrawable(com.tencent.mm.R.drawable.f482171bt3);
        }
        return this.Z1;
    }

    public android.graphics.drawable.Drawable getTextSelectHandleRight() {
        if (this.f211580b2 == null && this.f211579a2 != 0) {
            this.f211580b2 = getContext().getDrawable(com.tencent.mm.R.drawable.f482173bt5);
        }
        return this.f211580b2;
    }

    public java.util.Locale getTextServicesLocale() {
        android.os.AsyncTask.execute(new gl5.d(this));
        return java.util.Locale.getDefault();
    }

    public final android.view.textservice.TextServicesManager getTextServicesManagerForUser() {
        return (android.view.textservice.TextServicesManager) (this.R1 == null ? getContext().getSystemService(android.view.textservice.TextServicesManager.class) : null);
    }

    @android.view.ViewDebug.ExportedProperty(category = com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT)
    public float getTextSize() {
        return this.K.getTextSize();
    }

    public int getTextSizeUnit() {
        return this.P;
    }

    @Override // android.view.View
    public int getTopPaddingOffset() {
        return (int) java.lang.Math.min(0.0f, this.f211606q - this.f211602o);
    }

    public int getTotalPaddingBottom() {
        int i17;
        int extendedPaddingTop;
        int extendedPaddingBottom;
        int extendedPaddingBottom2 = getExtendedPaddingBottom();
        int i18 = this.T & 112;
        android.text.Layout layout = this.M;
        if (i18 != 80) {
            if (layout == this.F) {
                extendedPaddingTop = getCompoundPaddingTop();
                extendedPaddingBottom = getCompoundPaddingBottom();
            } else {
                extendedPaddingTop = getExtendedPaddingTop();
                extendedPaddingBottom = getExtendedPaddingBottom();
            }
            int measuredHeight = getMeasuredHeight() - (extendedPaddingTop + extendedPaddingBottom);
            int height = layout.getHeight();
            if (height < measuredHeight) {
                i17 = measuredHeight - height;
                if (i18 != 48) {
                    i17 >>= 1;
                }
                return extendedPaddingBottom2 + i17;
            }
        }
        i17 = 0;
        return extendedPaddingBottom2 + i17;
    }

    public int getTotalPaddingEnd() {
        return getCompoundPaddingEnd();
    }

    public int getTotalPaddingLeft() {
        return getCompoundPaddingLeft();
    }

    public int getTotalPaddingRight() {
        return getCompoundPaddingRight();
    }

    public int getTotalPaddingStart() {
        return getCompoundPaddingStart();
    }

    public int getTotalPaddingTop() {
        return getExtendedPaddingTop() + L(true);
    }

    public final android.text.method.TransformationMethod getTransformationMethod() {
        return this.H;
    }

    public java.lang.CharSequence getTransformed() {
        return this.C;
    }

    public android.graphics.Typeface getTypeface() {
        return this.K.getTypeface();
    }

    @android.view.ViewDebug.ExportedProperty(category = com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, mapping = {@android.view.ViewDebug.IntToString(from = 0, to = "NORMAL"), @android.view.ViewDebug.IntToString(from = 1, to = "BOLD"), @android.view.ViewDebug.IntToString(from = 2, to = "ITALIC"), @android.view.ViewDebug.IntToString(from = 3, to = "BOLD_ITALIC")})
    public int getTypefaceStyle() {
        android.graphics.Typeface typeface = this.K.getTypeface();
        if (typeface != null) {
            return typeface.getStyle();
        }
        return 0;
    }

    public android.text.style.URLSpan[] getUrls() {
        java.lang.CharSequence charSequence = this.A;
        return charSequence instanceof android.text.Spanned ? (android.text.style.URLSpan[]) ((android.text.Spanned) charSequence).getSpans(0, charSequence.length(), android.text.style.URLSpan.class) : new android.text.style.URLSpan[0];
    }

    public kl5.b getWordIterator() {
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var == null) {
            return null;
        }
        if (e0Var.Q == null) {
            e0Var.Q = new kl5.b(e0Var.U.getTextServicesLocale());
        }
        return e0Var.Q;
    }

    public void h() {
        requestLayout();
    }

    public boolean h0() {
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var != null && e0Var != null) {
            e0Var.U.removeCallbacks(e0Var.V);
            hl5.g gVar = e0Var.Z;
            if (gVar != null) {
                try {
                    gVar.f282134i.getEditor().n().b(gVar.f282140o);
                    gVar.f282126a.dismiss();
                } catch (java.lang.Throwable unused) {
                }
            }
            android.view.ActionMode actionMode = e0Var.f272945c;
            if (actionMode != null) {
                actionMode.hide(500);
            }
        }
        int length = this.A.length();
        android.text.Selection.setSelection(this.B, 0, length);
        return length > 0;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return ((getBackground() == null || getBackground().getCurrent() == null) && this.B == null && !M() && !isHorizontalFadingEdgeEnabled() && this.f211607r == 0) ? false : true;
    }

    public int i() {
        return getWidth();
    }

    public final void i0(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.lang.Class<?> cls;
        java.util.ArrayList arrayList = this.f211578J;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i27 = 0; i27 < size; i27++) {
                ((android.text.TextWatcher) arrayList.get(i27)).beforeTextChanged(charSequence, i17, i18, i19);
            }
        }
        try {
            cls = java.lang.Class.forName("android.text.style.SpellCheckSpan");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            e0(i17, i17 + i18, cls);
        }
        e0(i17, i18 + i17, android.text.style.SuggestionSpan.class);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        int bottom;
        int compoundPaddingTop;
        int i17;
        boolean z17 = false;
        if (verifyDrawable(drawable)) {
            android.graphics.Rect bounds = drawable.getBounds();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            gl5.g gVar = this.f211619z;
            if (gVar != null) {
                android.graphics.drawable.Drawable[] drawableArr = gVar.f272981b;
                if (drawable == drawableArr[0]) {
                    compoundPaddingTop = getCompoundPaddingTop();
                    int bottom2 = ((getBottom() - getTop()) - getCompoundPaddingBottom()) - compoundPaddingTop;
                    scrollX += getPaddingLeft();
                    i17 = (bottom2 - gVar.f272996q) / 2;
                } else if (drawable == drawableArr[2]) {
                    compoundPaddingTop = getCompoundPaddingTop();
                    int bottom3 = ((getBottom() - getTop()) - getCompoundPaddingBottom()) - compoundPaddingTop;
                    scrollX += ((getRight() - getLeft()) - getPaddingRight()) - gVar.f272993n;
                    i17 = (bottom3 - gVar.f272997r) / 2;
                } else {
                    if (drawable == drawableArr[1]) {
                        int compoundPaddingLeft = getCompoundPaddingLeft();
                        scrollX += compoundPaddingLeft + (((((getRight() - getLeft()) - getCompoundPaddingRight()) - compoundPaddingLeft) - gVar.f272994o) / 2);
                        bottom = getPaddingTop();
                    } else if (drawable == drawableArr[3]) {
                        int compoundPaddingLeft2 = getCompoundPaddingLeft();
                        scrollX += compoundPaddingLeft2 + (((((getRight() - getLeft()) - getCompoundPaddingRight()) - compoundPaddingLeft2) - gVar.f272995p) / 2);
                        bottom = ((getBottom() - getTop()) - getPaddingBottom()) - gVar.f272991l;
                    }
                    scrollY += bottom;
                    z17 = true;
                }
                bottom = compoundPaddingTop + i17;
                scrollY += bottom;
                z17 = true;
            }
            if (z17) {
                invalidate(bounds.left + scrollX, bounds.top + scrollY, bounds.right + scrollX, bounds.bottom + scrollY);
            }
        }
        if (z17) {
            return;
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View
    public boolean isPaddingOffsetRequired() {
        return (this.f211602o == 0.0f && this.f211619z == null) ? false : true;
    }

    public void j0(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = this.f211578J;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i27 = 0; i27 < size; i27++) {
                ((android.text.TextWatcher) arrayList.get(i27)).onTextChanged(charSequence, i17, i18, i19);
            }
        }
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var != null) {
            e0Var.o().getClass();
            e0Var.S = true;
            e0Var.r();
            gl5.b0 b0Var = e0Var.f272944b;
            if (b0Var != null) {
                b0Var.g();
            }
            e0Var.J();
        }
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        gl5.g gVar = this.f211619z;
        if (gVar != null) {
            for (android.graphics.drawable.Drawable drawable : gVar.f272981b) {
                if (drawable != null) {
                    drawable.jumpToCurrentState();
                }
            }
        }
    }

    public boolean k() {
        return requestFocus();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    public final void k0(android.text.Editable editable, android.text.InputFilter[] inputFilterArr) {
        ?? r07;
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var == null || (r07 = e0Var.f272957o instanceof android.text.InputFilter) <= 0) {
            editable.setFilters(inputFilterArr);
            return;
        }
        android.text.InputFilter[] inputFilterArr2 = new android.text.InputFilter[inputFilterArr.length + (r07 == true ? 1 : 0)];
        java.lang.System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, inputFilterArr.length);
        if (r07 != 0) {
            inputFilterArr2[inputFilterArr.length + 0] = (android.text.InputFilter) this.f211589g2.f272957o;
        }
        editable.setFilters(inputFilterArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l0(int r8, boolean r9) {
        /*
            r7 = this;
            r0 = r8 & 15
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L2b
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r8
            if (r0 == 0) goto Ld
            goto Le
        Ld:
            r2 = r1
        Le:
            r0 = r8 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L15
            android.text.method.TextKeyListener$Capitalize r0 = android.text.method.TextKeyListener.Capitalize.CHARACTERS
            goto L25
        L15:
            r0 = r8 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L1c
            android.text.method.TextKeyListener$Capitalize r0 = android.text.method.TextKeyListener.Capitalize.WORDS
            goto L25
        L1c:
            r0 = r8 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L23
            android.text.method.TextKeyListener$Capitalize r0 = android.text.method.TextKeyListener.Capitalize.SENTENCES
            goto L25
        L23:
            android.text.method.TextKeyListener$Capitalize r0 = android.text.method.TextKeyListener.Capitalize.NONE
        L25:
            android.text.method.TextKeyListener r0 = android.text.method.TextKeyListener.getInstance(r2, r0)
            goto La1
        L2b:
            r3 = 2
            r4 = 26
            r5 = 0
            if (r0 != r3) goto L5f
            java.util.Locale r0 = r7.getCustomLocaleForKeyListenerOrNull()
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r4) goto L4b
            r4 = r8 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L3f
            r4 = r2
            goto L40
        L3f:
            r4 = r1
        L40:
            r5 = r8 & 8192(0x2000, float:1.148E-41)
            if (r5 == 0) goto L45
            goto L46
        L45:
            r2 = r1
        L46:
            android.text.method.DigitsKeyListener r2 = android.text.method.DigitsKeyListener.getInstance(r0, r4, r2)
            goto L4c
        L4b:
            r2 = r5
        L4c:
            if (r0 == 0) goto L5d
            int r0 = r2.getInputType()
            r4 = r0 & 15
            if (r4 == r3) goto L5d
            r8 = r8 & 16
            if (r8 == 0) goto L5c
            r0 = r0 | 128(0x80, float:1.8E-43)
        L5c:
            r8 = r0
        L5d:
            r0 = r2
            goto La1
        L5f:
            r2 = 4
            if (r0 != r2) goto L95
            java.util.Locale r0 = r7.getCustomLocaleForKeyListenerOrNull()
            r2 = r8 & 4080(0xff0, float:5.717E-42)
            r3 = 16
            if (r2 == r3) goto L82
            r3 = 32
            if (r2 == r3) goto L79
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r4) goto L8b
            android.text.method.DateTimeKeyListener r0 = android.text.method.DateTimeKeyListener.getInstance(r0)
            goto L8c
        L79:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r4) goto L8b
            android.text.method.TimeKeyListener r0 = android.text.method.TimeKeyListener.getInstance(r0)
            goto L8c
        L82:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r4) goto L8b
            android.text.method.DateKeyListener r0 = android.text.method.DateKeyListener.getInstance(r0)
            goto L8c
        L8b:
            r0 = r5
        L8c:
            boolean r2 = r7.R
            if (r2 == 0) goto La1
            int r8 = r0.getInputType()
            goto La1
        L95:
            r2 = 3
            if (r0 != r2) goto L9d
            android.text.method.DialerKeyListener r0 = android.text.method.DialerKeyListener.getInstance()
            goto La1
        L9d:
            android.text.method.TextKeyListener r0 = android.text.method.TextKeyListener.getInstance()
        La1:
            r7.setRawInputType(r8)
            r7.Q = r1
            if (r9 == 0) goto Lb0
            r7.D()
            gl5.e0 r8 = r7.f211589g2
            r8.f272957o = r0
            goto Lb3
        Lb0:
            r7.setKeyListenerOnly(r0)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.cedit.edit.CustomTextView.l0(int, boolean):void");
    }

    public int length() {
        return this.A.length();
    }

    public final void m0(float f17, boolean z17) {
        if (f17 != this.K.getTextSize()) {
            this.K.setTextSize(f17);
            if (!z17 || this.M == null) {
                return;
            }
            Y();
            requestLayout();
            invalidate();
        }
    }

    public void n0(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        o0(charSequence, bufferType, true, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0081, code lost:
    
        if (r11.G != null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o0(java.lang.CharSequence r12, android.widget.TextView.BufferType r13, boolean r14, int r15) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.cedit.edit.CustomTextView.o0(java.lang.CharSequence, android.widget.TextView$BufferType, boolean, int):void");
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var != null) {
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = e0Var.U;
            android.view.ViewTreeObserver viewTreeObserver = customTextView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                gl5.w wVar = e0Var.f272942a;
                if (wVar != null) {
                    viewTreeObserver.addOnTouchModeChangeListener(wVar);
                }
                gl5.b0 b0Var = e0Var.f272944b;
                if (b0Var != null) {
                    b0Var.g();
                    viewTreeObserver.addOnTouchModeChangeListener(e0Var.f272944b);
                }
                viewTreeObserver.addOnDrawListener(e0Var.f272950h);
            }
            if (customTextView.M()) {
                e0Var.A();
            }
            gl5.n nVar = e0Var.f272963u;
            if (nVar != null) {
                nVar.f273045d = false;
                e0Var.x();
            }
        }
        if (this.f211609t) {
            getViewTreeObserver().addOnPreDrawListener(this);
            this.f211609t = false;
        }
        post(new gl5.c(this));
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        gl5.e0 e0Var = this.f211589g2;
        return (e0Var == null || e0Var.f272958p == 0) ? false : true;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.N) {
            return;
        }
        this.K.setTextLocales(android.os.LocaleList.getDefault());
        if (this.M != null) {
            Y();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public int[] onCreateDrawableState(int i17) {
        int[] onCreateDrawableState;
        if (this.E1) {
            onCreateDrawableState = super.onCreateDrawableState(i17);
        } else {
            onCreateDrawableState = super.onCreateDrawableState(i17 + 1);
            android.view.View.mergeDrawableStates(onCreateDrawableState, f211575s2);
        }
        if (W()) {
            int length = onCreateDrawableState.length;
            for (int i18 = 0; i18 < length; i18++) {
                if (onCreateDrawableState[i18] == 16842919) {
                    int[] iArr = new int[length - 1];
                    java.lang.System.arraycopy(onCreateDrawableState, 0, iArr, 0, i18);
                    java.lang.System.arraycopy(onCreateDrawableState, i18 + 1, iArr, i18, (length - i18) - 1);
                    return iArr;
                }
            }
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        if (onCheckIsTextEditor() && isEnabled()) {
            gl5.e0 e0Var = this.f211589g2;
            if (e0Var.f272953k == null) {
                e0Var.f272953k = new gl5.s();
            }
            editorInfo.inputType = getInputType();
            gl5.r rVar = this.f211589g2.f272952j;
            if (rVar != null) {
                editorInfo.imeOptions = rVar.f273079a;
                editorInfo.privateImeOptions = rVar.f273080b;
                editorInfo.actionLabel = rVar.f273081c;
                editorInfo.actionId = rVar.f273082d;
                editorInfo.extras = rVar.f273083e;
                editorInfo.hintLocales = rVar.f273086h;
            } else {
                editorInfo.imeOptions = 0;
                editorInfo.hintLocales = null;
            }
            int i17 = editorInfo.imeOptions;
            if ((i17 & 255) == 0) {
                if ((134217728 & i17) != 0) {
                    editorInfo.imeOptions = i17 | 5;
                } else {
                    editorInfo.imeOptions = i17 | 6;
                }
                if (!r0()) {
                    editorInfo.imeOptions |= 1073741824;
                }
            }
            if ((editorInfo.inputType & 131087) == 131073) {
                editorInfo.imeOptions |= 1073741824;
            }
            editorInfo.hintText = this.E;
            if (this.A instanceof android.text.Editable) {
                gl5.j jVar = new gl5.j(this);
                editorInfo.initialSelStart = getSelectionStart();
                editorInfo.initialSelEnd = getSelectionEnd();
                editorInfo.initialCapsMode = jVar.getCursorCapsMode(getInputType());
                return jVar;
            }
        }
        return null;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        java.lang.Runnable runnable;
        super.onDetachedFromWindow();
        if (this.f211608s) {
            getViewTreeObserver().removeOnPreDrawListener(this);
            this.f211609t = true;
        }
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var != null) {
            gl5.n nVar = e0Var.f272963u;
            if (nVar != null && !nVar.f273045d) {
                nVar.f273046e.U.removeCallbacks(nVar);
                nVar.f273045d = true;
            }
            gl5.w wVar = e0Var.f272942a;
            if (wVar != null) {
                wVar.f273106e.U.getViewTreeObserver().removeOnTouchModeChangeListener(wVar);
                gl5.u uVar = wVar.f273105d;
                if (uVar != null && (runnable = uVar.Q) != null) {
                    uVar.T.U.removeCallbacks(runnable);
                }
            }
            gl5.b0 b0Var = e0Var.f272944b;
            if (b0Var != null) {
                b0Var.f272913q.U.getViewTreeObserver().removeOnTouchModeChangeListener(b0Var);
            }
            java.lang.Runnable runnable2 = e0Var.P;
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = e0Var.U;
            if (runnable2 != null) {
                customTextView.removeCallbacks(runnable2);
            }
            customTextView.removeCallbacks(e0Var.V);
            android.view.ViewTreeObserver viewTreeObserver = customTextView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(e0Var.f272950h);
            }
            e0Var.r();
            e0Var.K();
        }
    }

    @Override // android.view.View
    public boolean onDragEvent(android.view.DragEvent dragEvent) {
        int action = dragEvent.getAction();
        if (action == 1) {
            gl5.e0 e0Var = this.f211589g2;
            return e0Var != null && e0Var.f272946d;
        }
        if (action == 2) {
            if (this.A instanceof android.text.Spannable) {
                android.text.Selection.setSelection(this.B, K(dragEvent.getX(), dragEvent.getY()));
            }
            return true;
        }
        if (action != 3) {
            if (action != 5) {
                return true;
            }
            requestFocus();
            return true;
        }
        gl5.e0 e0Var2 = this.f211589g2;
        if (e0Var2 != null) {
            e0Var2.getClass();
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = e0Var2.U;
            customTextView.u();
            try {
                int K = customTextView.K(dragEvent.getX(), dragEvent.getY());
                dragEvent.getLocalState();
                customTextView.getText().length();
                android.text.Selection.setSelection((android.text.Spannable) customTextView.getText(), K);
                ((android.text.Editable) customTextView.A).replace(K, K, spannableStringBuilder);
            } finally {
                customTextView.G();
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.cedit.edit.CustomTextView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z17, int i17, android.graphics.Rect rect) {
        android.text.Spannable spannable;
        int i18;
        if (isTemporarilyDetached()) {
            super.onFocusChanged(z17, i17, rect);
            return;
        }
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var != null) {
            e0Var.f272961s = android.os.SystemClock.uptimeMillis();
            gl5.s sVar = e0Var.f272953k;
            if (sVar != null && sVar.f273090c != 0) {
                sVar.f273090c = 0;
                e0Var.h(sVar);
            }
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = e0Var.U;
            if (z17) {
                int selectionStart = customTextView.getSelectionStart();
                int selectionEnd = customTextView.getSelectionEnd();
                e0Var.M = e0Var.f272954l && customTextView.M() && !(e0Var.f272965w && selectionStart == 0 && selectionEnd == customTextView.getText().length());
                if (!e0Var.f272954l || selectionStart < 0 || selectionEnd < 0) {
                    gl5.b0 b0Var = e0Var.f272944b;
                    if (b0Var == null || (i18 = b0Var.f272905f) < 0) {
                        i18 = -1;
                    } else if (i18 > customTextView.getText().length()) {
                        i18 = customTextView.getText().length();
                    }
                    if (i18 >= 0) {
                        android.text.Selection.setSelection((android.text.Spannable) customTextView.getText(), i18);
                    }
                    il5.a movementMethod = customTextView.getMovementMethod();
                    if (movementMethod != null) {
                        movementMethod.onTakeFocus(customTextView, (android.text.Spannable) customTextView.getText(), i17);
                    }
                    if (e0Var.f272955m && selectionStart >= 0 && selectionEnd >= 0) {
                        android.text.Selection.setSelection((android.text.Spannable) customTextView.getText(), selectionStart, selectionEnd);
                    }
                    if (e0Var.f272965w) {
                        customTextView.h0();
                    }
                    e0Var.f272956n = true;
                }
                e0Var.f272954l = false;
                e0Var.f272955m = false;
                e0Var.x();
            } else {
                customTextView.getClass();
                e0Var.r();
                if (customTextView.isTemporarilyDetached()) {
                    e0Var.K();
                } else {
                    e0Var.J();
                }
                gl5.b0 b0Var2 = e0Var.f272944b;
                if (b0Var2 != null) {
                    b0Var2.g();
                }
                e0Var.e();
            }
        }
        if (z17 && (spannable = this.B) != null) {
            android.text.method.MetaKeyKeyListener.resetMetaState(spannable);
        }
        android.text.method.TransformationMethod transformationMethod = this.H;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(this, this.A, z17, i17, rect);
        }
        super.onFocusChanged(z17, i17, rect);
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
        il5.a aVar = this.G;
        if (aVar != null && (this.A instanceof android.text.Spannable) && this.M != null) {
            try {
                if (aVar.onGenericMotionEvent(this, this.B, motionEvent)) {
                    return true;
                }
            } catch (java.lang.AbstractMethodError unused) {
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (F(i17, keyEvent, null) == 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyMultiple(int i17, int i18, android.view.KeyEvent keyEvent) {
        android.view.KeyEvent changeAction = android.view.KeyEvent.changeAction(keyEvent, 0);
        int F = F(i17, changeAction, keyEvent);
        if (F == 0) {
            return super.onKeyMultiple(i17, i18, keyEvent);
        }
        if (F == -1) {
            return true;
        }
        int i19 = i18 - 1;
        android.view.KeyEvent changeAction2 = android.view.KeyEvent.changeAction(keyEvent, 1);
        if (F == 1) {
            this.f211589g2.f272957o.onKeyUp(this, (android.text.Editable) this.A, i17, changeAction2);
            while (true) {
                i19--;
                if (i19 <= 0) {
                    break;
                }
                this.f211589g2.f272957o.onKeyDown(this, (android.text.Editable) this.A, i17, changeAction);
                this.f211589g2.f272957o.onKeyUp(this, (android.text.Editable) this.A, i17, changeAction2);
            }
        } else if (F == 2) {
            this.G.onKeyUp(this, this.B, i17, changeAction2);
            while (true) {
                i19--;
                if (i19 <= 0) {
                    break;
                }
                this.G.onKeyDown(this, this.B, i17, changeAction);
                this.G.onKeyUp(this, this.B, i17, changeAction2);
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048 A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyPreIme(int r3, android.view.KeyEvent r4) {
        /*
            r2 = this;
            r0 = 4
            if (r3 != r0) goto L49
            gl5.e0 r0 = r2.f211589g2
            r1 = 1
            if (r0 == 0) goto L45
            boolean r0 = r0.t()
            if (r0 == 0) goto Lf
            goto L45
        Lf:
            int r0 = r4.getAction()
            if (r0 != 0) goto L26
            int r0 = r4.getRepeatCount()
            if (r0 != 0) goto L26
            android.view.KeyEvent$DispatcherState r0 = r2.getKeyDispatcherState()
            if (r0 == 0) goto L24
            r0.startTracking(r4, r2)
        L24:
            r0 = r1
            goto L46
        L26:
            int r0 = r4.getAction()
            if (r0 != r1) goto L45
            android.view.KeyEvent$DispatcherState r0 = r2.getKeyDispatcherState()
            if (r0 == 0) goto L35
            r0.handleUpEvent(r4)
        L35:
            boolean r0 = r4.isTracking()
            if (r0 == 0) goto L45
            boolean r0 = r4.isCanceled()
            if (r0 != 0) goto L45
            r2.t0()
            goto L24
        L45:
            r0 = 0
        L46:
            if (r0 == 0) goto L49
            return r1
        L49:
            boolean r3 = super.onKeyPreIme(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.cedit.edit.CustomTextView.onKeyPreIme(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public boolean onKeyShortcut(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.hasModifiers(4096)) {
            if (i17 != 29) {
                if (i17 != 31) {
                    if (i17 != 50) {
                        if (i17 == 52 && x()) {
                            return c0(android.R.id.cut);
                        }
                    } else if (y()) {
                        return c0(android.R.id.paste);
                    }
                } else if (w()) {
                    return c0(android.R.id.copy);
                }
            } else if (z()) {
                return c0(android.R.id.selectAll);
            }
        } else if (keyEvent.hasModifiers(4097) && i17 == 50 && y()) {
            return c0(android.R.id.pasteAsPlainText);
        }
        return super.onKeyShortcut(i17, keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        android.view.inputmethod.InputMethodManager inputMethodManager;
        gl5.r rVar;
        gl5.h hVar;
        android.text.method.KeyListener keyListener;
        if (!isEnabled()) {
            return super.onKeyUp(i17, keyEvent);
        }
        if (!android.view.KeyEvent.isModifierKey(i17)) {
            this.f211613x = false;
        }
        if (i17 == 23) {
            if (keyEvent.hasNoModifiers() && !hasOnClickListeners() && this.G != null && (this.A instanceof android.text.Editable) && this.M != null && onCheckIsTextEditor()) {
                android.view.inputmethod.InputMethodManager inputMethodManager2 = getInputMethodManager();
                if (inputMethodManager2 != null) {
                    inputMethodManager2.viewClicked(this);
                }
                if (inputMethodManager2 != null && getShowSoftInputOnFocus()) {
                    inputMethodManager2.showSoftInput(this, 0);
                }
            }
            return super.onKeyUp(i17, keyEvent);
        }
        if ((i17 != 66 && i17 != 160) || !keyEvent.hasNoModifiers()) {
            gl5.e0 e0Var = this.f211589g2;
            if (e0Var != null && (keyListener = e0Var.f272957o) != null && keyListener.onKeyUp(this, (android.text.Editable) this.A, i17, keyEvent)) {
                return true;
            }
            il5.a aVar = this.G;
            if (aVar == null || this.M == null || !aVar.onKeyUp(this, this.B, i17, keyEvent)) {
                return super.onKeyUp(i17, keyEvent);
            }
            return true;
        }
        gl5.e0 e0Var2 = this.f211589g2;
        if (e0Var2 != null && (rVar = e0Var2.f272952j) != null && (hVar = rVar.f273084f) != null && rVar.f273085g) {
            rVar.f273085g = false;
            if (this instanceof fl5.i ? ((fl5.l) hVar).f263955a.a((fl5.i) this, 0, keyEvent) : false) {
                return true;
            }
        }
        if (((keyEvent.getFlags() & 16) != 0 || r0()) && !hasOnClickListeners()) {
            android.view.View focusSearch = focusSearch(130);
            if (focusSearch != null) {
                if (!focusSearch.requestFocus(130)) {
                    throw new java.lang.IllegalStateException("focus search returned a view that wasn't able to take focus!");
                }
                super.onKeyUp(i17, keyEvent);
                return true;
            }
            if ((keyEvent.getFlags() & 16) != 0 && (inputMethodManager = getInputMethodManager()) != null && inputMethodManager.isActive(this)) {
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            }
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = this.H1;
        if (i28 >= 0) {
            this.H1 = -1;
            v(java.lang.Math.min(i28, this.A.length()));
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        android.text.BoringLayout.Metrics metrics;
        boolean z17;
        int i19;
        int i27;
        android.text.BoringLayout.Metrics metrics2;
        int i28;
        android.text.BoringLayout.Metrics metrics3;
        android.text.BoringLayout.Metrics metrics4;
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        android.text.BoringLayout.Metrics metrics5 = f211577u2;
        if (this.P1 == null) {
            this.P1 = getTextDirectionHeuristic();
        }
        if (mode == 1073741824) {
            i28 = size;
            metrics2 = metrics5;
            metrics3 = metrics2;
            z17 = false;
            i27 = -1;
        } else {
            android.text.Layout layout = this.M;
            int E = (layout == null || this.f211616y != null) ? -1 : E(layout);
            if (E < 0) {
                metrics = android.text.BoringLayout.isBoring(this.C, this.K, this.L1);
                if (metrics != null) {
                    this.L1 = metrics;
                }
                z17 = false;
            } else {
                metrics = metrics5;
                z17 = true;
            }
            if (metrics == null || metrics == metrics5) {
                if (E < 0) {
                    java.lang.CharSequence charSequence = this.C;
                    E = (int) java.lang.Math.ceil(android.text.Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.K));
                }
                i19 = E;
            } else {
                i19 = metrics.width;
            }
            gl5.g gVar = this.f211619z;
            if (gVar != null) {
                i19 = java.lang.Math.max(java.lang.Math.max(i19, gVar.f272994o), gVar.f272995p);
            }
            if (this.E != null) {
                android.text.Layout layout2 = this.F;
                int E2 = (layout2 == null || this.f211616y != null) ? -1 : E(layout2);
                if (E2 < 0) {
                    metrics4 = android.text.BoringLayout.isBoring(this.E, this.K, this.M1);
                    if (metrics4 != null) {
                        this.M1 = metrics4;
                    }
                } else {
                    metrics4 = metrics5;
                }
                if (metrics4 != null && metrics4 != metrics5) {
                    E2 = metrics4.width;
                }
                metrics5 = metrics4;
                if (E2 > i19) {
                    i19 = E2;
                }
            }
            int compoundPaddingLeft = i19 + getCompoundPaddingLeft() + getCompoundPaddingRight();
            int min = this.B1 == 1 ? java.lang.Math.min(compoundPaddingLeft, this.A1 * getLineHeight()) : java.lang.Math.min(compoundPaddingLeft, this.A1);
            int max = java.lang.Math.max(this.D1 == 1 ? java.lang.Math.max(min, this.C1 * getLineHeight()) : java.lang.Math.max(min, this.C1), getSuggestedMinimumWidth());
            if (mode == Integer.MIN_VALUE) {
                i28 = java.lang.Math.min(size, max);
                i27 = E;
                metrics2 = metrics;
            } else {
                i27 = E;
                metrics2 = metrics;
                i28 = max;
            }
            metrics3 = metrics5;
        }
        int compoundPaddingLeft2 = (i28 - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        int i29 = this.U ? 1048576 : compoundPaddingLeft2;
        android.text.Layout layout3 = this.F;
        int width = layout3 == null ? i29 : layout3.getWidth();
        android.text.Layout layout4 = this.M;
        if (layout4 == null) {
            X(i29, i29, metrics2, metrics3, (i28 - getCompoundPaddingLeft()) - getCompoundPaddingRight(), false);
        } else {
            boolean z18 = (layout4.getWidth() == i29 && width == i29 && this.M.getEllipsizedWidth() == (i28 - getCompoundPaddingLeft()) - getCompoundPaddingRight()) ? false : true;
            boolean z19 = this.E == null && this.f211616y == null && i29 > this.M.getWidth() && ((this.M instanceof android.text.BoringLayout) || (z17 && i27 >= 0 && i27 <= i29));
            boolean z27 = (this.f211596l1 == this.f211620z1 && this.f211617y0 == this.f211618y1) ? false : true;
            if (z18 || z27) {
                if (z27 || !z19) {
                    X(i29, i29, metrics2, metrics3, (i28 - getCompoundPaddingLeft()) - getCompoundPaddingRight(), false);
                } else {
                    this.M.increaseWidthTo(i29);
                }
            }
        }
        if (mode2 == 1073741824) {
            this.F1 = -1;
        } else {
            int desiredHeight = getDesiredHeight();
            this.F1 = desiredHeight;
            size2 = mode2 == Integer.MIN_VALUE ? java.lang.Math.min(desiredHeight, size2) : desiredHeight;
        }
        int compoundPaddingTop = (size2 - getCompoundPaddingTop()) - getCompoundPaddingBottom();
        if (this.f211596l1 == 1) {
            int lineCount = this.M.getLineCount();
            int i37 = this.f211617y0;
            if (lineCount > i37) {
                compoundPaddingTop = java.lang.Math.min(compoundPaddingTop, this.M.getLineTop(i37));
            }
        }
        if (this.G != null || this.M.getWidth() > compoundPaddingLeft2 || this.M.getHeight() > compoundPaddingTop) {
            d0();
        } else {
            scrollTo(0, 0);
        }
        setMeasuredDimension(i28, size2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c3, code lost:
    
        if (r6 < 0) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.cedit.edit.CustomTextView.onPreDraw():boolean");
    }

    @Override // android.view.View
    public android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent motionEvent, int i17) {
        if (this.B != null && this.W) {
            int K = K(motionEvent.getX(i17), motionEvent.getY(i17));
            if (((android.text.style.ClickableSpan[]) this.B.getSpans(K, K, android.text.style.ClickableSpan.class)).length > 0) {
                return android.view.PointerIcon.getSystemIcon(getContext(), 1002);
            }
        }
        return (W() || V()) ? android.view.PointerIcon.getSystemIcon(getContext(), 1008) : super.onResolvePointerIcon(motionEvent, i17);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        int i17;
        if (!(parcelable instanceof com.tencent.mm.ui.widget.cedit.edit.CustomTextView.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView.SavedState savedState = (com.tencent.mm.ui.widget.cedit.edit.CustomTextView.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        java.lang.CharSequence charSequence = savedState.f211623f;
        if (charSequence != null) {
            setText(charSequence);
        }
        if (savedState.f211621d >= 0 && savedState.f211622e >= 0 && this.B != null) {
            int length = this.A.length();
            int i18 = savedState.f211621d;
            if (i18 > length || (i17 = savedState.f211622e) > length) {
                com.tencent.mars.xlog.Log.e("cmEdit.CMTextView", "Saved cursor position " + savedState.f211621d + "/" + savedState.f211622e + " out of range for " + (savedState.f211623f != null ? "(restored) " : "") + "text " + ((java.lang.Object) this.A));
            } else {
                android.text.Selection.setSelection(this.B, i18, i17);
                if (savedState.f211624g) {
                    D();
                    this.f211589g2.f272954l = true;
                }
            }
        }
        com.tencent.mm.ui.widget.cedit.util.ParcelableParcel parcelableParcel = savedState.f211626i;
        if (parcelableParcel != null) {
            D();
            this.f211589g2.getClass();
            parcelableParcel.f211627d.setDataPosition(0);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i17) {
        super.onRtlPropertiesChanged(i17);
        android.text.TextDirectionHeuristic textDirectionHeuristic = getTextDirectionHeuristic();
        if (this.P1 != textDirectionHeuristic) {
            this.P1 = textDirectionHeuristic;
            if (this.M != null) {
                A();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            r10 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            boolean r1 = r10.getFreezesText()
            java.lang.CharSequence r2 = r10.A
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L1c
            int r2 = r10.getSelectionStart()
            int r5 = r10.getSelectionEnd()
            if (r2 >= 0) goto L1a
            if (r5 < 0) goto L1e
        L1a:
            r6 = r3
            goto L1f
        L1c:
            r2 = -1
            r5 = r2
        L1e:
            r6 = r4
        L1f:
            if (r1 != 0) goto L25
            if (r6 == 0) goto L24
            goto L25
        L24:
            return r0
        L25:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView$SavedState r7 = new com.tencent.mm.ui.widget.cedit.edit.CustomTextView$SavedState
            r7.<init>(r0)
            if (r1 == 0) goto L6b
            java.lang.CharSequence r0 = r10.A
            boolean r1 = r0 instanceof android.text.Spanned
            if (r1 == 0) goto L65
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            java.lang.CharSequence r1 = r10.A
            r0.<init>(r1)
            gl5.e0 r1 = r10.f211589g2
            if (r1 == 0) goto L62
            int r1 = r0.length()
            java.lang.Class<android.text.style.SuggestionSpan> r8 = android.text.style.SuggestionSpan.class
            java.lang.Object[] r1 = r0.getSpans(r4, r1, r8)
            android.text.style.SuggestionSpan[] r1 = (android.text.style.SuggestionSpan[]) r1
        L49:
            int r8 = r1.length
            if (r4 >= r8) goto L62
            r8 = r1[r4]
            int r8 = r8.getFlags()
            r9 = r8 & 1
            if (r9 == 0) goto L5f
            r8 = r8 & 2
            if (r8 == 0) goto L5f
            r8 = r1[r4]
            r0.removeSpan(r8)
        L5f:
            int r4 = r4 + 1
            goto L49
        L62:
            r7.f211623f = r0
            goto L6b
        L65:
            java.lang.String r0 = r0.toString()
            r7.f211623f = r0
        L6b:
            if (r6 == 0) goto L71
            r7.f211621d = r2
            r7.f211622e = r5
        L71:
            boolean r0 = r10.isFocused()
            if (r0 == 0) goto L7d
            if (r2 < 0) goto L7d
            if (r5 < 0) goto L7d
            r7.f211624g = r3
        L7d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.cedit.edit.CustomTextView.onSaveInstanceState():android.os.Parcelable");
    }

    @Override // android.view.View
    public void onScreenStateChanged(int i17) {
        gl5.n nVar;
        super.onScreenStateChanged(i17);
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var != null) {
            if (i17 != 0) {
                if (i17 == 1 && (nVar = e0Var.f272963u) != null) {
                    nVar.f273045d = false;
                    e0Var.x();
                    return;
                }
                return;
            }
            gl5.n nVar2 = e0Var.f272963u;
            if (nVar2 == null || nVar2.f273045d) {
                return;
            }
            nVar2.f273046e.U.removeCallbacks(nVar2);
            nVar2.f273045d = true;
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i17, int i18, int i19, int i27) {
        super.onScrollChanged(i17, i18, i19, i27);
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var != null) {
            gl5.z zVar = e0Var.f272941J;
            if (zVar != null) {
                zVar.f273128o = true;
            }
            android.view.ActionMode actionMode = e0Var.f272945c;
            if (actionMode != null) {
                actionMode.invalidateContentRect();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0138, code lost:
    
        if (r2 != 3) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0382  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 1213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.cedit.edit.CustomTextView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean onTrackballEvent(android.view.MotionEvent motionEvent) {
        android.text.Spannable spannable;
        il5.a aVar = this.G;
        if (aVar == null || (spannable = this.B) == null || this.M == null || !aVar.onTrackballEvent(this, spannable, motionEvent)) {
            return super.onTrackballEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public void onVisibilityChanged(android.view.View view, int i17) {
        super.onVisibilityChanged(view, i17);
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var == null || i17 == 0) {
            return;
        }
        e0Var.r();
        t0();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var != null) {
            if (z17) {
                gl5.n nVar = e0Var.f272963u;
                if (nVar != null) {
                    nVar.f273045d = false;
                    e0Var.x();
                }
                if (!e0Var.U.M() || e0Var.g()) {
                    return;
                }
                e0Var.A();
                return;
            }
            gl5.n nVar2 = e0Var.f272963u;
            if (nVar2 != null && !nVar2.f273045d) {
                nVar2.f273046e.U.removeCallbacks(nVar2);
                nVar2.f273045d = true;
            }
            gl5.r rVar = e0Var.f272952j;
            if (rVar != null) {
                rVar.f273085g = false;
            }
            e0Var.r();
            e0Var.K();
            gl5.s sVar = e0Var.f272953k;
            if (sVar != null && sVar.f273090c != 0) {
                sVar.f273090c = 0;
                e0Var.h(sVar);
            }
            e0Var.e();
        }
    }

    public android.content.Context p() {
        return getContext();
    }

    public void p0(android.graphics.Typeface typeface, int i17) {
        if (i17 <= 0) {
            this.K.setFakeBoldText(false);
            this.K.setTextSkewX(0.0f);
            setTypeface(typeface);
        } else {
            android.graphics.Typeface defaultFromStyle = typeface == null ? android.graphics.Typeface.defaultFromStyle(i17) : android.graphics.Typeface.create(typeface, i17);
            setTypeface(defaultFromStyle);
            int i18 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i17;
            this.K.setFakeBoldText((i18 & 1) != 0);
            this.K.setTextSkewX((i18 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i17, android.os.Bundle bundle) {
        boolean z17;
        int length;
        if (i17 == 16) {
            if (!isEnabled()) {
                return false;
            }
            if (isClickable() || isLongClickable()) {
                if (isFocusable() && !isFocused()) {
                    requestFocus();
                }
                performClick();
                z17 = true;
            } else {
                z17 = false;
            }
            if (this.G != null || onCheckIsTextEditor()) {
                java.lang.CharSequence charSequence = this.A;
                if ((charSequence != null && (charSequence instanceof android.text.Spannable)) && this.M != null && ((V() || W()) && isFocused())) {
                    android.view.inputmethod.InputMethodManager inputMethodManager = getInputMethodManager();
                    if (inputMethodManager != null) {
                        inputMethodManager.viewClicked(this);
                    }
                    if (!W() && this.f211589g2.f272968z && inputMethodManager != null) {
                        z17 |= inputMethodManager.showSoftInput(this, 0);
                    }
                }
            }
            return z17;
        }
        if (i17 != 32) {
            if (i17 == 256 || i17 == 512) {
                java.lang.CharSequence charSequence2 = this.A;
                if (!(charSequence2 instanceof android.text.Spannable)) {
                    n0(charSequence2, android.widget.TextView.BufferType.SPANNABLE);
                }
                return super.performAccessibilityAction(i17, bundle);
            }
            if (i17 != 16384) {
                if (i17 != 32768) {
                    if (i17 == 65536) {
                        return isFocused() && x() && c0(android.R.id.cut);
                    }
                    if (i17 == 131072) {
                        java.lang.CharSequence charSequence3 = this.A;
                        if (!(charSequence3 instanceof android.text.Spannable)) {
                            n0(charSequence3, android.widget.TextView.BufferType.SPANNABLE);
                        }
                        java.lang.CharSequence iterableTextForAccessibility = getIterableTextForAccessibility();
                        if (iterableTextForAccessibility == null) {
                            return false;
                        }
                        int i18 = bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1;
                        int i19 = bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1;
                        if (getSelectionStart() != i18 || getSelectionEnd() != i19) {
                            if (i18 == i19 && i19 == -1) {
                                android.text.Selection.removeSelection((android.text.Spannable) iterableTextForAccessibility);
                                return true;
                            }
                            if (i18 >= 0 && i18 <= i19 && i19 <= iterableTextForAccessibility.length()) {
                                android.text.Selection.setSelection((android.text.Spannable) iterableTextForAccessibility, i18, i19);
                                gl5.e0 e0Var = this.f211589g2;
                                if (e0Var != null) {
                                    e0Var.I(false);
                                }
                                return true;
                            }
                        }
                        return false;
                    }
                    if (i17 == 2097152) {
                        if (!isEnabled() || this.D != android.widget.TextView.BufferType.EDITABLE) {
                            return false;
                        }
                        setText(bundle != null ? bundle.getCharSequence("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null);
                        java.lang.CharSequence charSequence4 = this.A;
                        if (charSequence4 != null && (length = charSequence4.length()) > 0) {
                            android.text.Selection.setSelection(this.B, length);
                        }
                        return true;
                    }
                }
            } else if (isFocused() && w() && c0(android.R.id.copy)) {
                return true;
            }
            return isFocused() && y() && c0(android.R.id.paste);
        }
        if (isLongClickable()) {
            if (!isEnabled() || this.D != android.widget.TextView.BufferType.EDITABLE) {
                return performLongClick();
            }
            this.f211589g2.E = true;
            try {
                return performLongClick();
            } finally {
                this.f211589g2.E = false;
            }
        }
        return super.performAccessibilityAction(i17, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0090  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean performLongClick() {
        /*
            r9 = this;
            boolean r0 = super.performLongClick()
            gl5.e0 r1 = r9.f211589g2
            r2 = 1
            r3 = 0
            if (r1 == 0) goto Laf
            boolean r4 = r1.E
            if (r4 == 0) goto L20
            if (r0 != 0) goto L1d
            boolean r4 = r1.t()
            if (r4 != 0) goto L1a
            r1.J()
            goto L1d
        L1a:
            r1.H()
        L1d:
            r5 = r2
            goto L94
        L20:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r4 = r1.U
            if (r0 != 0) goto L50
            gl5.f0 r5 = r1.O
            float r6 = r5.f272973a
            float r7 = r5.f272974b
            boolean r6 = r1.v(r6, r7)
            if (r6 != 0) goto L50
            boolean r6 = r1.f272946d
            if (r6 == 0) goto L50
            float r6 = r5.f272973a
            float r5 = r5.f272974b
            int r5 = r4.K(r6, r5)
            java.lang.CharSequence r6 = r4.getText()
            android.text.Spannable r6 = (android.text.Spannable) r6
            android.text.Selection.setSelection(r6, r5)
            gl5.w r5 = r1.k()
            r5.show()
            r1.W = r2
            r5 = r2
            goto L51
        L50:
            r5 = r0
        L51:
            if (r5 != 0) goto L8e
            boolean r6 = r1.t()
            if (r6 != 0) goto L8e
            int r5 = r4.getSelectionStart()
            int r6 = r4.getSelectionEnd()
            if (r5 != r6) goto L64
            goto L80
        L64:
            if (r5 <= r6) goto L72
            java.lang.CharSequence r4 = r4.getText()
            android.text.Spannable r4 = (android.text.Spannable) r4
            android.text.Selection.setSelection(r4, r6, r5)
            r8 = r6
            r6 = r5
            r5 = r8
        L72:
            gl5.b0 r4 = r1.p()
            int r7 = r4.f272905f
            int r4 = r4.f272906g
            if (r7 < r5) goto L80
            if (r4 >= r6) goto L80
            r4 = r2
            goto L81
        L80:
            r4 = r3
        L81:
            if (r4 == 0) goto L87
            r1.G()
            goto L8d
        L87:
            r1.J()
            r1.D()
        L8d:
            r5 = r2
        L8e:
            if (r5 != 0) goto L94
            boolean r5 = r1.D()
        L94:
            r1 = r0 | r5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "editor performLongClick handled ="
            r4.<init>(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "cmEdit.CMTextView"
            com.tencent.mars.xlog.Log.i(r5, r4)
            gl5.e0 r4 = r9.f211589g2
            r4.getClass()
            goto Lb0
        Laf:
            r1 = r0
        Lb0:
            if (r1 == 0) goto Lbd
            if (r0 != 0) goto Lb7
            r9.performHapticFeedback(r3)
        Lb7:
            gl5.e0 r0 = r9.f211589g2
            if (r0 == 0) goto Lbd
            r0.f272959q = r2
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.cedit.edit.CustomTextView.performLongClick():boolean");
    }

    public final void q0(android.graphics.Typeface typeface, java.lang.String str, int i17, int i18, int i19) {
        if (typeface == null && str != null) {
            g0(android.graphics.Typeface.create(str, 0), i18, i19);
            return;
        }
        if (typeface != null) {
            g0(typeface, i18, i19);
            return;
        }
        if (i17 == 1) {
            g0(android.graphics.Typeface.SANS_SERIF, i18, i19);
            return;
        }
        if (i17 == 2) {
            g0(android.graphics.Typeface.SERIF, i18, i19);
        } else if (i17 != 3) {
            g0(null, i18, i19);
        } else {
            g0(android.graphics.Typeface.MONOSPACE, i18, i19);
        }
    }

    public final void r() {
        gl5.g gVar = this.f211619z;
        if (gVar == null) {
            return;
        }
        boolean z17 = gVar.f272984e;
        if (z17 || gVar.f272985f) {
            android.content.res.ColorStateList colorStateList = gVar.f272982c;
            android.graphics.BlendMode blendMode = gVar.f272983d;
            boolean z18 = gVar.f272985f;
            int[] drawableState = getDrawableState();
            for (android.graphics.drawable.Drawable drawable : this.f211619z.f272981b) {
                if (drawable != null) {
                    this.f211619z.getClass();
                    drawable.mutate();
                    if (z17) {
                        drawable.setTintList(colorStateList);
                    }
                    if (drawable.isStateful()) {
                        drawable.setState(drawableState);
                    }
                }
            }
        }
    }

    public final boolean r0() {
        int i17;
        if (getKeyListener() == null) {
            return false;
        }
        if (this.E1) {
            return true;
        }
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var != null) {
            int i18 = e0Var.f272958p;
            if ((i18 & 15) == 1 && ((i17 = i18 & 4080) == 32 || i17 == 48)) {
                return true;
            }
        }
        return false;
    }

    public final void s(boolean z17, boolean z18, boolean z19) {
        this.E1 = z17;
        if (z17) {
            setLines(1);
            setHorizontallyScrolling(true);
            if (z18) {
                setTransformationMethod(android.text.method.SingleLineTransformationMethod.getInstance());
                return;
            }
            return;
        }
        if (z19) {
            setMaxLines(Integer.MAX_VALUE);
        }
        setHorizontallyScrolling(false);
        if (z18) {
            setTransformationMethod(null);
        }
    }

    public void s0(android.text.Spanned spanned, java.lang.Object obj, int i17, int i18, int i19, int i27) {
        boolean z17;
        int i28;
        gl5.e0 e0Var = this.f211589g2;
        gl5.s sVar = e0Var == null ? null : e0Var.f272953k;
        int i29 = -1;
        if (obj == android.text.Selection.SELECTION_END) {
            if (i17 >= 0 || i18 >= 0) {
                O(android.text.Selection.getSelectionStart(spanned), i17, i18);
                B();
                d0();
                gl5.e0 e0Var2 = this.f211589g2;
                if (e0Var2 != null) {
                    e0Var2.x();
                }
            }
            i28 = i18;
            z17 = true;
        } else {
            z17 = false;
            i28 = -1;
        }
        if (obj == android.text.Selection.SELECTION_START) {
            if (i17 >= 0 || i18 >= 0) {
                O(android.text.Selection.getSelectionEnd(spanned), i17, i18);
            }
            i29 = i18;
            z17 = true;
        }
        if (z17) {
            this.V1 = true;
            if (this.f211589g2 != null && !isFocused()) {
                this.f211589g2.f272955m = true;
            }
            if ((spanned.getSpanFlags(obj) & 512) == 0) {
                if (i29 < 0) {
                    i29 = android.text.Selection.getSelectionStart(spanned);
                }
                if (i28 < 0) {
                    i28 = android.text.Selection.getSelectionEnd(spanned);
                }
                gl5.e0 e0Var3 = this.f211589g2;
                if (e0Var3 != null) {
                    e0Var3.A();
                    if (!M() && this.f211589g2.t() && hasTransientState()) {
                        setHasTransientState(false);
                    }
                }
                b0(i29, i28);
            }
        }
        if ((obj instanceof android.text.style.UpdateAppearance) || (obj instanceof android.text.style.ParagraphStyle) || (obj instanceof android.text.style.CharacterStyle)) {
            if (sVar == null || sVar.f273090c == 0) {
                invalidate();
                this.V1 = true;
                B();
            } else {
                sVar.f273093f = true;
            }
            gl5.e0 e0Var4 = this.f211589g2;
            if (e0Var4 != null) {
                e0Var4.s();
            }
        }
        if (android.text.method.MetaKeyKeyListener.isMetaTracker(spanned, obj)) {
            this.V1 = true;
            if (sVar != null && android.text.method.MetaKeyKeyListener.isSelectingMetaTracker(spanned, obj)) {
                sVar.f273092e = true;
            }
            if (android.text.Selection.getSelectionStart(spanned) >= 0) {
                if (sVar == null || sVar.f273090c == 0) {
                    int selectionEnd = getSelectionEnd();
                    O(selectionEnd, selectionEnd, selectionEnd);
                } else {
                    sVar.f273091d = true;
                }
            }
        }
        if (!(obj instanceof android.text.ParcelableSpan) || sVar == null || sVar.f273088a == null) {
            return;
        }
        if (sVar.f273090c == 0) {
            sVar.f273093f = true;
            return;
        }
        if (i17 >= 0) {
            if (sVar.f273094g > i17) {
                sVar.f273094g = i17;
            }
            if (sVar.f273094g > i19) {
                sVar.f273094g = i19;
            }
        }
        if (i18 >= 0) {
            if (sVar.f273094g > i18) {
                sVar.f273094g = i18;
            }
            if (sVar.f273094g > i27) {
                sVar.f273094g = i27;
            }
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAdaptText(android.widget.TextView textView) {
        this.f211591h2 = textView;
        textView.addTextChangedListener(this.f211593i2);
    }

    public void setAllCaps(boolean z17) {
        if (z17) {
            return;
        }
        setTransformationMethod(null);
    }

    public final void setAutoLinkMask(int i17) {
        this.V = i17;
    }

    public void setBreakStrategy(int i17) {
        if (this.M != null) {
            Y();
            requestLayout();
            invalidate();
        }
    }

    public void setCompoundDrawablePadding(int i17) {
        gl5.g gVar = this.f211619z;
        if (i17 != 0) {
            if (gVar == null) {
                gVar = new gl5.g(getContext());
                this.f211619z = gVar;
            }
            gVar.f272998s = i17;
        } else if (gVar != null) {
            gVar.f272998s = i17;
        }
        invalidate();
        requestLayout();
    }

    public void setCompoundDrawableTintBlendMode(android.graphics.BlendMode blendMode) {
        if (this.f211619z == null) {
            this.f211619z = new gl5.g(getContext());
        }
        gl5.g gVar = this.f211619z;
        gVar.f272983d = blendMode;
        gVar.f272985f = true;
        r();
    }

    public void setCompoundDrawableTintList(android.content.res.ColorStateList colorStateList) {
        if (this.f211619z == null) {
            this.f211619z = new gl5.g(getContext());
        }
        gl5.g gVar = this.f211619z;
        gVar.f272982c = colorStateList;
        gVar.f272984e = true;
        r();
    }

    public void setCompoundDrawableTintMode(android.graphics.PorterDuff.Mode mode) {
    }

    public void setCursorVisible(boolean z17) {
        if (z17 && this.f211589g2 == null) {
            return;
        }
        D();
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var.f272964v != z17) {
            e0Var.f272964v = z17;
            invalidate();
            this.f211589g2.x();
            this.f211589g2.z();
        }
    }

    public void setCustomInsertionActionModeCallback(android.view.ActionMode.Callback callback) {
        D();
        this.f211589g2.L = callback;
    }

    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        D();
        this.f211589g2.K = callback;
    }

    public final void setEditableFactory(android.text.Editable.Factory factory) {
        this.f211598m = factory;
        setText(this.A);
    }

    public void setElegantTextHeight(boolean z17) {
        if (z17 != this.K.isElegantTextHeight()) {
            this.K.setElegantTextHeight(z17);
            if (this.M != null) {
                Y();
                requestLayout();
                invalidate();
            }
        }
    }

    public void setEllipsize(android.text.TextUtils.TruncateAt truncateAt) {
        if (this.f211616y != truncateAt) {
            this.f211616y = truncateAt;
            if (this.M != null) {
                Y();
                requestLayout();
                invalidate();
            }
        }
    }

    public void setEms(int i17) {
        this.C1 = i17;
        this.A1 = i17;
        this.D1 = 1;
        this.B1 = 1;
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z17) {
        android.view.inputmethod.InputMethodManager inputMethodManager;
        android.view.inputmethod.InputMethodManager inputMethodManager2;
        if (z17 == isEnabled()) {
            return;
        }
        if (!z17 && (inputMethodManager2 = getInputMethodManager()) != null && inputMethodManager2.isActive(this)) {
            inputMethodManager2.hideSoftInputFromWindow(getWindowToken(), 0);
        }
        super.setEnabled(z17);
        if (z17 && (inputMethodManager = getInputMethodManager()) != null) {
            inputMethodManager.restartInput(this);
        }
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var != null) {
            e0Var.z();
            this.f211589g2.x();
        }
    }

    public void setError(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            D();
        } else {
            D();
        }
    }

    public void setExtractedText(android.view.inputmethod.ExtractedText extractedText) {
        java.lang.Class<?> cls;
        int i17;
        android.text.Editable editableText = getEditableText();
        java.lang.CharSequence charSequence = extractedText.text;
        if (charSequence != null) {
            if (editableText == null) {
                n0(charSequence, android.widget.TextView.BufferType.EDITABLE);
            } else {
                int length = editableText.length();
                if (extractedText.partialStartOffset >= 0) {
                    length = editableText.length();
                    int i18 = extractedText.partialStartOffset;
                    if (i18 > length) {
                        i18 = length;
                    }
                    int i19 = extractedText.partialEndOffset;
                    i17 = i18;
                    if (i19 <= length) {
                        length = i19;
                    }
                } else {
                    i17 = 0;
                }
                java.lang.Object[] spans = editableText.getSpans(i17, length, android.text.ParcelableSpan.class);
                int length2 = spans.length;
                while (length2 > 0) {
                    length2--;
                    editableText.removeSpan(spans[length2]);
                }
                if (android.text.TextUtils.equals(editableText.subSequence(i17, length), extractedText.text)) {
                    java.lang.CharSequence charSequence2 = extractedText.text;
                    if (charSequence2 instanceof android.text.Spanned) {
                        android.text.TextUtils.copySpansFrom((android.text.Spanned) charSequence2, 0, length - i17, java.lang.Object.class, editableText, i17);
                    }
                } else {
                    editableText.replace(i17, length, extractedText.text);
                }
            }
        }
        android.text.Spannable spannable = (android.text.Spannable) getText();
        int length3 = spannable.length();
        int i27 = extractedText.selectionStart;
        if (i27 < 0) {
            i27 = 0;
        } else if (i27 > length3) {
            i27 = length3;
        }
        int i28 = extractedText.selectionEnd;
        if (i28 < 0) {
            length3 = 0;
        } else if (i28 <= length3) {
            length3 = i28;
        }
        android.text.Selection.setSelection(spannable, i27, length3);
        if ((extractedText.flags & 2) != 0) {
            java.lang.Class<?>[] clsArr = {android.text.Spannable.class};
            try {
                cls = java.lang.Class.forName(android.text.method.MetaKeyKeyListener.class.getName());
            } catch (java.lang.Throwable unused) {
                cls = null;
            }
            java.lang.reflect.Method method = null;
            while (cls != java.lang.Object.class) {
                try {
                    method = cls.getDeclaredMethod("startSelecting", clsArr);
                } catch (java.lang.Throwable unused2) {
                }
                cls = cls.getSuperclass();
            }
            java.lang.Object[] objArr = {this, spannable};
            try {
                method.setAccessible(true);
                method.invoke(null, objArr);
            } catch (java.lang.Throwable unused3) {
            }
        } else {
            jl5.c.b(this, spannable);
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            setHintInternal(extractedText.hint);
        }
    }

    public void setExtracting(android.view.inputmethod.ExtractedTextRequest extractedTextRequest) {
        gl5.e0 e0Var = this.f211589g2;
        gl5.s sVar = e0Var.f272953k;
        if (sVar != null) {
            sVar.f273088a = extractedTextRequest;
        }
        e0Var.r();
        t0();
        gl5.b0 b0Var = this.f211589g2.f272944b;
        if (b0Var != null) {
            b0Var.g();
        }
    }

    public void setFallbackLineSpacing(boolean z17) {
        if (this.S != z17) {
            this.S = z17;
            if (this.M != null) {
                Y();
                requestLayout();
                invalidate();
            }
        }
    }

    public void setFilters(android.text.InputFilter[] inputFilterArr) {
        if (inputFilterArr == null) {
            throw new java.lang.IllegalArgumentException();
        }
        this.Q1 = inputFilterArr;
        java.lang.CharSequence charSequence = this.A;
        if (charSequence instanceof android.text.Editable) {
            k0((android.text.Editable) charSequence, inputFilterArr);
        }
    }

    public void setFirstBaselineToTopHeight(int i17) {
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        android.graphics.Paint.FontMetricsInt fontMetricsInt = getPaint().getFontMetricsInt();
        int i18 = getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i17 > java.lang.Math.abs(i18)) {
            setPadding(getPaddingLeft(), i17 - (-i18), getPaddingRight(), getPaddingBottom());
        }
    }

    public void setFontFeatureSettings(java.lang.String str) {
        if (str != this.K.getFontFeatureSettings()) {
            this.K.setFontFeatureSettings(str);
            if (this.M != null) {
                Y();
                requestLayout();
                invalidate();
            }
        }
    }

    public void setFreezesText(boolean z17) {
        this.f211592i = z17;
    }

    public void setGravity(int i17) {
        if ((i17 & 8388615) == 0) {
            i17 |= 8388611;
        }
        if ((i17 & 112) == 0) {
            i17 |= 48;
        }
        int i18 = i17 & 8388615;
        int i19 = this.T;
        boolean z17 = i18 != (8388615 & i19);
        if (i17 != i19) {
            invalidate();
        }
        this.T = i17;
        android.text.Layout layout = this.M;
        if (layout == null || !z17) {
            return;
        }
        int width = layout.getWidth();
        android.text.Layout layout2 = this.F;
        int width2 = layout2 != null ? layout2.getWidth() : 0;
        android.text.BoringLayout.Metrics metrics = f211577u2;
        X(width, width2, metrics, metrics, ((getRight() - getLeft()) - getCompoundPaddingLeft()) - getCompoundPaddingRight(), true);
    }

    public void setHandleColorRes(int i17) {
        this.f211594j2 = i17;
    }

    public void setHeight(int i17) {
        this.f211605p1 = i17;
        this.f211617y0 = i17;
        this.f211615x1 = 2;
        this.f211596l1 = 2;
        requestLayout();
        invalidate();
    }

    public void setHighlightColor(int i17) {
        if (this.S1 != i17) {
            this.S1 = i17;
            invalidate();
        }
    }

    public final void setHint(java.lang.CharSequence charSequence) {
        setHintInternal(charSequence);
        if (this.f211589g2 != null) {
            android.view.inputmethod.InputMethodManager inputMethodManager = getInputMethodManager();
            if (inputMethodManager != null && inputMethodManager.isActive(this)) {
                this.f211589g2.B();
            }
        }
    }

    public final void setHintTextColor(int i17) {
        this.f211584e = android.content.res.ColorStateList.valueOf(i17);
        x0();
    }

    public void setHorizontallyScrolling(boolean z17) {
        if (this.U != z17) {
            this.U = z17;
            if (this.M != null) {
                Y();
                requestLayout();
                invalidate();
            }
        }
    }

    public void setImeHintLocales(android.os.LocaleList localeList) {
        gl5.e0 e0Var;
        D();
        this.f211589g2.d();
        this.f211589g2.f272952j.f273086h = localeList;
        if (this.R) {
            int i17 = android.os.Build.VERSION.SDK_INT;
            java.util.Locale locale = localeList == null ? null : localeList.get(0);
            if (this.Q || (e0Var = this.f211589g2) == null) {
                return;
            }
            android.text.method.KeyListener keyListener = e0Var.f272957o;
            if (!(keyListener instanceof android.text.method.DigitsKeyListener)) {
                if (keyListener instanceof android.text.method.DateKeyListener) {
                    if (i17 >= 26) {
                        keyListener = android.text.method.DateKeyListener.getInstance(locale);
                    }
                } else if (keyListener instanceof android.text.method.TimeKeyListener) {
                    if (i17 >= 26) {
                        keyListener = android.text.method.TimeKeyListener.getInstance(locale);
                    }
                } else {
                    if (!(keyListener instanceof android.text.method.DateTimeKeyListener)) {
                        return;
                    }
                    if (i17 >= 26) {
                        keyListener = android.text.method.DateTimeKeyListener.getInstance(locale);
                    }
                }
            }
            boolean S = S(this.f211589g2.f272958p);
            setKeyListenerOnly(keyListener);
            try {
                gl5.e0 e0Var2 = this.f211589g2;
                e0Var2.f272958p = e0Var2.f272957o.getInputType();
            } catch (java.lang.IncompatibleClassChangeError unused) {
                this.f211589g2.f272958p = 1;
            }
            setInputTypeSingleLine(this.E1);
            if (S) {
                gl5.e0 e0Var3 = this.f211589g2;
                int i18 = e0Var3.f272958p;
                int i19 = i18 & 15;
                if (i19 == 1) {
                    e0Var3.f272958p = i18 | 128;
                } else if (i19 == 2) {
                    e0Var3.f272958p = i18 | 16;
                }
            }
        }
    }

    public void setImeOptions(int i17) {
        D();
        this.f211589g2.d();
        this.f211589g2.f272952j.f273079a = i17;
    }

    public void setIncludeFontPadding(boolean z17) {
        if (this.G1 != z17) {
            this.G1 = z17;
            if (this.M != null) {
                Y();
                requestLayout();
                invalidate();
            }
        }
    }

    public void setInputExtras(int i17) {
        D();
        android.content.res.XmlResourceParser xml = getResources().getXml(i17);
        this.f211589g2.d();
        this.f211589g2.f272952j.f273083e = new android.os.Bundle();
        getResources().parseBundleExtras(xml, this.f211589g2.f272952j.f273083e);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setInputType(int r11) {
        /*
            r10 = this;
            int r0 = r10.getInputType()
            boolean r0 = S(r0)
            int r1 = r10.getInputType()
            r1 = r1 & 4095(0xfff, float:5.738E-42)
            r2 = 145(0x91, float:2.03E-43)
            r6 = 0
            r7 = 1
            if (r1 != r2) goto L16
            r1 = r7
            goto L17
        L16:
            r1 = r6
        L17:
            r10.l0(r11, r6)
            boolean r8 = S(r11)
            r3 = r11 & 4095(0xfff, float:5.738E-42)
            if (r3 != r2) goto L24
            r2 = r7
            goto L25
        L24:
            r2 = r6
        L25:
            if (r8 == 0) goto L38
            android.text.method.PasswordTransformationMethod r0 = android.text.method.PasswordTransformationMethod.getInstance()
            r10.setTransformationMethod(r0)
            r1 = 0
            r2 = 0
            r3 = 3
            r4 = 0
            r5 = -1
            r0 = r10
            r0.q0(r1, r2, r3, r4, r5)
            goto L66
        L38:
            if (r2 == 0) goto L4f
            android.text.method.TransformationMethod r0 = r10.H
            android.text.method.PasswordTransformationMethod r1 = android.text.method.PasswordTransformationMethod.getInstance()
            if (r0 != r1) goto L44
            r9 = r7
            goto L45
        L44:
            r9 = r6
        L45:
            r1 = 0
            r2 = 0
            r3 = 3
            r4 = 0
            r5 = -1
            r0 = r10
            r0.q0(r1, r2, r3, r4, r5)
            goto L67
        L4f:
            if (r0 != 0) goto L53
            if (r1 == 0) goto L66
        L53:
            r1 = 0
            r2 = 0
            r3 = -1
            r4 = 0
            r5 = -1
            r0 = r10
            r0.q0(r1, r2, r3, r4, r5)
            android.text.method.TransformationMethod r0 = r10.H
            android.text.method.PasswordTransformationMethod r1 = android.text.method.PasswordTransformationMethod.getInstance()
            if (r0 != r1) goto L66
            r9 = r7
            goto L67
        L66:
            r9 = r6
        L67:
            r0 = 131087(0x2000f, float:1.83692E-40)
            r0 = r0 & r11
            r1 = 131073(0x20001, float:1.83672E-40)
            if (r0 != r1) goto L71
            r6 = r7
        L71:
            r0 = r6 ^ 1
            boolean r1 = r10.E1
            if (r1 != r0) goto L79
            if (r9 == 0) goto L7e
        L79:
            r1 = r8 ^ 1
            r10.s(r0, r1, r7)
        L7e:
            boolean r0 = r10.U()
            if (r0 != 0) goto L8d
            java.lang.CharSequence r0 = r10.A
            java.lang.CharSequence r0 = r10.f0(r0)
            r10.setTextInternal(r0)
        L8d:
            android.view.inputmethod.InputMethodManager r0 = r10.getInputMethodManager()
            if (r0 == 0) goto L96
            r0.restartInput(r10)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.cedit.edit.CustomTextView.setInputType(int):void");
    }

    public void setKeyListener(android.text.method.KeyListener keyListener) {
        this.Q = true;
        setKeyListenerOnly(keyListener);
        H();
        if (keyListener != null) {
            D();
            try {
                gl5.e0 e0Var = this.f211589g2;
                e0Var.f272958p = e0Var.f272957o.getInputType();
            } catch (java.lang.IncompatibleClassChangeError unused) {
                this.f211589g2.f272958p = 1;
            }
            setInputTypeSingleLine(this.E1);
        } else {
            gl5.e0 e0Var2 = this.f211589g2;
            if (e0Var2 != null) {
                e0Var2.f272958p = 0;
            }
        }
        android.view.inputmethod.InputMethodManager inputMethodManager = getInputMethodManager();
        if (inputMethodManager != null) {
            inputMethodManager.restartInput(this);
        }
    }

    public void setLastBaselineToBottomHeight(int i17) {
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        android.graphics.Paint.FontMetricsInt fontMetricsInt = getPaint().getFontMetricsInt();
        int i18 = getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i17 > java.lang.Math.abs(i18)) {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), i17 - i18);
        }
    }

    public void setLetterSpacing(float f17) {
        if (f17 != this.K.getLetterSpacing()) {
            this.K.setLetterSpacing(f17);
            if (this.M != null) {
                Y();
                requestLayout();
                invalidate();
            }
        }
    }

    public void setLineHeight(int i17) {
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        int fontMetricsInt = getPaint().getFontMetricsInt(null);
        if (i17 != fontMetricsInt) {
            float f17 = i17 - fontMetricsInt;
            if (this.f211614x0 == f17 && this.f211604p0 == 1.0f) {
                return;
            }
            this.f211614x0 = f17;
            this.f211604p0 = 1.0f;
            if (this.M != null) {
                Y();
                requestLayout();
                invalidate();
            }
        }
    }

    public void setLines(int i17) {
        this.f211605p1 = i17;
        this.f211617y0 = i17;
        this.f211615x1 = 1;
        this.f211596l1 = 1;
        requestLayout();
        invalidate();
    }

    public final void setLinkTextColor(int i17) {
        this.f211586f = android.content.res.ColorStateList.valueOf(i17);
        x0();
    }

    public final void setLinksClickable(boolean z17) {
        this.W = z17;
    }

    public void setMaxEms(int i17) {
        this.A1 = i17;
        this.B1 = 1;
        requestLayout();
        invalidate();
    }

    public void setMaxHeight(int i17) {
        this.f211617y0 = i17;
        this.f211596l1 = 2;
        requestLayout();
        invalidate();
    }

    public void setMaxLines(int i17) {
        this.f211617y0 = i17;
        this.f211596l1 = 1;
        requestLayout();
        invalidate();
    }

    public void setMaxWidth(int i17) {
        this.A1 = i17;
        this.B1 = 2;
        requestLayout();
        invalidate();
    }

    public void setMenuCallback(nl5.a0 a0Var) {
        this.f211597l2 = a0Var;
    }

    public void setMinEms(int i17) {
        this.C1 = i17;
        this.D1 = 1;
        requestLayout();
        invalidate();
    }

    public void setMinHeight(int i17) {
        this.f211605p1 = i17;
        this.f211615x1 = 2;
        requestLayout();
        invalidate();
    }

    public void setMinLines(int i17) {
        this.f211605p1 = i17;
        this.f211615x1 = 1;
        requestLayout();
        invalidate();
    }

    public void setMinWidth(int i17) {
        this.C1 = i17;
        this.D1 = 2;
        requestLayout();
        invalidate();
    }

    public final void setMovementMethod(il5.a aVar) {
        if (this.G != aVar) {
            this.G = aVar;
            if (aVar != null && this.B == null) {
                setText(this.A);
            }
            H();
            gl5.e0 e0Var = this.f211589g2;
            if (e0Var != null) {
                e0Var.z();
            }
        }
    }

    public void setOnEditorActionListener(gl5.h hVar) {
        D();
        this.f211589g2.d();
        this.f211589g2.f272952j.f273084f = hVar;
    }

    @Override // android.view.View
    public void setPadding(int i17, int i18, int i19, int i27) {
        if (i17 != getPaddingLeft() || i19 != getPaddingRight() || i18 != getPaddingTop() || i27 != getPaddingBottom()) {
            Y();
        }
        super.setPadding(i17, i18, i19, i27);
        invalidate();
    }

    @Override // android.view.View
    public void setPaddingRelative(int i17, int i18, int i19, int i27) {
        if (i17 != getPaddingStart() || i19 != getPaddingEnd() || i18 != getPaddingTop() || i27 != getPaddingBottom()) {
            Y();
        }
        super.setPaddingRelative(i17, i18, i19, i27);
        invalidate();
    }

    public void setPaintFlags(int i17) {
        if (this.K.getFlags() != i17) {
            this.K.setFlags(i17);
            if (this.M != null) {
                Y();
                requestLayout();
                invalidate();
            }
        }
    }

    public void setPrivateImeOptions(java.lang.String str) {
        D();
        this.f211589g2.d();
        this.f211589g2.f272952j.f273080b = str;
    }

    public void setRawInputType(int i17) {
        if (i17 == 0 && this.f211589g2 == null) {
            return;
        }
        D();
        this.f211589g2.f272958p = i17;
    }

    public void setReuseBrands(java.util.List<java.lang.String> list) {
        if (list != null) {
            java.util.Set set = this.f211601n2;
            ((java.util.HashSet) set).clear();
            set.addAll(list);
        }
    }

    public void setReuseItems(java.util.List<java.lang.String> list) {
        if (list != null) {
            java.util.Set set = this.f211599m2;
            ((java.util.HashSet) set).clear();
            set.addAll(list);
        }
    }

    public void setScroller(android.widget.Scroller scroller) {
        this.K1 = scroller;
    }

    public void setSelectAllOnFocus(boolean z17) {
        D();
        this.f211589g2.f272965w = z17;
        if (z17) {
            java.lang.CharSequence charSequence = this.A;
            if (charSequence instanceof android.text.Spannable) {
                return;
            }
            n0(charSequence, android.widget.TextView.BufferType.SPANNABLE);
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z17) {
        isSelected();
        super.setSelected(z17);
    }

    public final void setShowSoftInputOnFocus(boolean z17) {
        D();
        this.f211589g2.f272968z = z17;
    }

    public void setSingleLine(boolean z17) {
        setInputTypeSingleLine(z17);
        s(z17, true, true);
    }

    public final void setSpannableFactory(android.text.Spannable.Factory factory) {
        this.f211600n = factory;
        setText(this.A);
    }

    public final void setText(java.lang.CharSequence charSequence) {
        n0(charSequence, this.D);
    }

    public void setTextClassifier(android.view.textclassifier.TextClassifier textClassifier) {
        this.f211610u = textClassifier;
    }

    public void setTextColor(int i17) {
        this.f211582d = android.content.res.ColorStateList.valueOf(i17);
        x0();
    }

    public void setTextCursorDrawable(android.graphics.drawable.Drawable drawable) {
        this.X1 = drawable;
        this.W1 = 0;
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var == null || e0Var.F != null) {
            return;
        }
        e0Var.F = e0Var.U.getTextCursorDrawable();
    }

    public void setTextIsSelectable(boolean z17) {
        if (z17 || this.f211589g2 != null) {
            D();
            gl5.e0 e0Var = this.f211589g2;
            if (e0Var.f272966x == z17) {
                return;
            }
            e0Var.f272966x = z17;
            setFocusableInTouchMode(z17);
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                setFocusable(16);
            } else {
                setFocusable(z17);
            }
            setClickable(z17);
            setLongClickable(z17);
            setMovementMethod(z17 ? com.tencent.mm.ui.widget.cedit.move.ArrowKeyMovementMethod.getInstance() : null);
            n0(this.A, z17 ? android.widget.TextView.BufferType.SPANNABLE : android.widget.TextView.BufferType.NORMAL);
            this.f211589g2.z();
        }
    }

    public final void setTextKeepState(java.lang.CharSequence charSequence) {
        android.text.Spannable spannable;
        android.widget.TextView.BufferType bufferType = this.D;
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        int length = charSequence.length();
        n0(charSequence, bufferType);
        if ((selectionStart >= 0 || selectionEnd >= 0) && (spannable = this.B) != null) {
            android.text.Selection.setSelection(spannable, java.lang.Math.max(0, java.lang.Math.min(selectionStart, length)), java.lang.Math.max(0, java.lang.Math.min(selectionEnd, length)));
        }
    }

    public void setTextLocale(java.util.Locale locale) {
        this.N = true;
        this.K.setTextLocale(locale);
        if (this.M != null) {
            Y();
            requestLayout();
            invalidate();
        }
    }

    public void setTextLocales(android.os.LocaleList localeList) {
        this.N = true;
        this.K.setTextLocales(localeList);
        if (this.M != null) {
            Y();
            requestLayout();
            invalidate();
        }
    }

    public final void setTextOperationUser(android.os.UserHandle userHandle) {
        if (java.util.Objects.equals(this.R1, userHandle)) {
            return;
        }
        if (userHandle != null) {
            android.os.Process.myUserHandle().equals(userHandle);
        }
        this.R1 = userHandle;
    }

    public void setTextScaleX(float f17) {
        if (f17 != this.K.getTextScaleX()) {
            this.L = true;
            this.K.setTextScaleX(f17);
            if (this.M != null) {
                Y();
                requestLayout();
                invalidate();
            }
        }
    }

    public void setTextSelectHandle(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            this.f211583d2 = drawable;
            this.f211581c2 = 0;
            gl5.e0 e0Var = this.f211589g2;
            if (e0Var != null) {
                e0Var.w(true);
                return;
            }
            return;
        }
        throw new java.lang.NullPointerException("The text select handle should not be null.");
    }

    public void setTextSelectHandleLeft(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            this.Z1 = drawable;
            this.Y1 = 0;
            gl5.e0 e0Var = this.f211589g2;
            if (e0Var != null) {
                e0Var.w(true);
                return;
            }
            return;
        }
        throw new java.lang.NullPointerException("The left text select handle should not be null.");
    }

    public void setTextSelectHandleRight(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            this.f211580b2 = drawable;
            this.f211579a2 = 0;
            gl5.e0 e0Var = this.f211589g2;
            if (e0Var != null) {
                e0Var.w(true);
                return;
            }
            return;
        }
        throw new java.lang.NullPointerException("The right text select handle should not be null.");
    }

    public void setTextSize(float f17) {
        setTextSize(2, f17);
    }

    public final void setTransformationMethod(android.text.method.TransformationMethod transformationMethod) {
        android.text.Spannable spannable;
        android.text.method.TransformationMethod transformationMethod2 = this.H;
        if (transformationMethod == transformationMethod2) {
            return;
        }
        if (transformationMethod2 != null && (spannable = this.B) != null) {
            spannable.removeSpan(transformationMethod2);
        }
        this.H = transformationMethod;
        setText(this.A);
        boolean z17 = this.H instanceof android.text.method.PasswordTransformationMethod;
        this.P1 = getTextDirectionHeuristic();
    }

    public void setTypeface(android.graphics.Typeface typeface) {
        if (this.K.getTypeface() != typeface) {
            this.K.setTypeface(typeface);
            if (this.M != null) {
                Y();
                requestLayout();
                invalidate();
            }
        }
    }

    public void setWidth(int i17) {
        this.C1 = i17;
        this.A1 = i17;
        this.D1 = 2;
        this.B1 = 2;
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public boolean showContextMenu() {
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var != null) {
            e0Var.getClass();
        }
        return super.showContextMenu();
    }

    public final void t() {
        int right = ((getRight() - getLeft()) - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        if (right < 1) {
            right = 0;
        }
        int i17 = right;
        int i18 = this.U ? 1048576 : i17;
        android.text.BoringLayout.Metrics metrics = f211577u2;
        X(i18, i17, metrics, metrics, i17, false);
    }

    public void t0() {
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var != null) {
            e0Var.J();
        }
    }

    public void u() {
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var != null) {
            e0Var.f272967y = true;
            gl5.s sVar = e0Var.f272953k;
            if (sVar != null) {
                int i17 = sVar.f273090c + 1;
                sVar.f273090c = i17;
                if (i17 == 1) {
                    sVar.f273091d = false;
                    sVar.f273096i = 0;
                    boolean z17 = sVar.f273093f;
                    com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = e0Var.U;
                    if (z17) {
                        sVar.f273094g = 0;
                        sVar.f273095h = customTextView.getText().length();
                    } else {
                        sVar.f273094g = -1;
                        sVar.f273095h = -1;
                        sVar.f273093f = false;
                    }
                    customTextView.getClass();
                }
            }
        }
    }

    public boolean u0() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f6, code lost:
    
        if ((r11 - r10) < r12) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean v(int r18) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.cedit.edit.CustomTextView.v(int):boolean");
    }

    public boolean v0() {
        il5.a aVar = this.G;
        if (aVar == null || !aVar.canSelectArbitrarily()) {
            return false;
        }
        return V() || (W() && (this.A instanceof android.text.Spannable) && isEnabled());
    }

    @Override // android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        gl5.g gVar;
        boolean verifyDrawable = super.verifyDrawable(drawable);
        if (!verifyDrawable && (gVar = this.f211619z) != null) {
            for (android.graphics.drawable.Drawable drawable2 : gVar.f272981b) {
                if (drawable == drawable2) {
                    return true;
                }
            }
        }
        return verifyDrawable;
    }

    public boolean w() {
        return !(this.H instanceof android.text.method.PasswordTransformationMethod) && this.A.length() > 0 && M() && this.f211589g2 != null;
    }

    public void w0() {
        invalidate();
        int selectionStart = getSelectionStart();
        if (selectionStart >= 0 || (this.T & 112) == 80) {
            d0();
        }
        B();
        if (selectionStart >= 0) {
            this.V1 = true;
            gl5.e0 e0Var = this.f211589g2;
            if (e0Var != null) {
                e0Var.x();
            }
            v(selectionStart);
        }
    }

    public boolean x() {
        gl5.e0 e0Var;
        return !(this.H instanceof android.text.method.PasswordTransformationMethod) && this.A.length() > 0 && M() && (this.A instanceof android.text.Editable) && (e0Var = this.f211589g2) != null && e0Var.f272957o != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r7.A.length() == 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x0() {
        /*
            r7 = this;
            int[] r0 = r7.getDrawableState()
            android.content.res.ColorStateList r1 = r7.f211582d
            r2 = 0
            int r1 = r1.getColorForState(r0, r2)
            int r3 = r7.f211588g
            r4 = 1
            if (r1 == r3) goto L14
            r7.f211588g = r1
            r1 = r4
            goto L15
        L14:
            r1 = r2
        L15:
            android.content.res.ColorStateList r3 = r7.f211586f
            if (r3 == 0) goto L26
            int r3 = r3.getColorForState(r0, r2)
            android.text.TextPaint r5 = r7.K
            int r6 = r5.linkColor
            if (r3 == r6) goto L26
            r5.linkColor = r3
            r1 = r4
        L26:
            android.content.res.ColorStateList r3 = r7.f211584e
            if (r3 == 0) goto L3d
            int r0 = r3.getColorForState(r0, r2)
            int r2 = r7.f211590h
            if (r0 == r2) goto L3d
            r7.f211590h = r0
            java.lang.CharSequence r0 = r7.A
            int r0 = r0.length()
            if (r0 != 0) goto L3d
            goto L3e
        L3d:
            r4 = r1
        L3e:
            if (r4 == 0) goto L43
            r7.invalidate()
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.cedit.edit.CustomTextView.x0():void");
    }

    public boolean y() {
        gl5.e0 e0Var;
        return (this.A instanceof android.text.Editable) && (e0Var = this.f211589g2) != null && e0Var.f272957o != null && getSelectionStart() >= 0 && getSelectionEnd() >= 0;
    }

    public int y0() {
        int extendedPaddingTop = getExtendedPaddingTop() - getScrollY();
        return (this.T & 112) != 48 ? extendedPaddingTop + L(false) : extendedPaddingTop;
    }

    public boolean z() {
        gl5.e0 e0Var;
        return (this.A.length() == 0 || (e0Var = this.f211589g2) == null || !e0Var.f272947e) ? false : true;
    }

    public CustomTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, 0);
    }

    public final void setText(int i17) {
        setText(getContext().getResources().getText(i17));
    }

    public void setTextSize(int i17, float f17) {
        android.content.res.Resources resources;
        u0();
        android.content.Context context = getContext();
        if (context == null) {
            resources = android.content.res.Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        this.P = i17;
        m0(android.util.TypedValue.applyDimension(i17, f17, resources.getDisplayMetrics()), true);
    }

    /* loaded from: classes13.dex */
    public static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<com.tencent.mm.ui.widget.cedit.edit.CustomTextView.SavedState> CREATOR = new com.tencent.mm.ui.widget.cedit.edit.a();

        /* renamed from: d, reason: collision with root package name */
        public int f211621d;

        /* renamed from: e, reason: collision with root package name */
        public int f211622e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.CharSequence f211623f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f211624g;

        /* renamed from: h, reason: collision with root package name */
        public final java.lang.CharSequence f211625h;

        /* renamed from: i, reason: collision with root package name */
        public final com.tencent.mm.ui.widget.cedit.util.ParcelableParcel f211626i;

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
            this.f211621d = -1;
            this.f211622e = -1;
        }

        public java.lang.String toString() {
            java.lang.String str = "TextView.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " start=" + this.f211621d + " end=" + this.f211622e;
            if (this.f211623f != null) {
                str = str + " text=" + ((java.lang.Object) this.f211623f);
            }
            return str + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeInt(this.f211621d);
            parcel.writeInt(this.f211622e);
            parcel.writeInt(this.f211624g ? 1 : 0);
            android.text.TextUtils.writeToParcel(this.f211623f, parcel, i17);
            java.lang.CharSequence charSequence = this.f211625h;
            if (charSequence == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                android.text.TextUtils.writeToParcel(charSequence, parcel, i17);
            }
            com.tencent.mm.ui.widget.cedit.util.ParcelableParcel parcelableParcel = this.f211626i;
            if (parcelableParcel == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelableParcel.writeToParcel(parcel, i17);
            }
        }

        public SavedState(android.os.Parcel parcel, gl5.a aVar) {
            super(parcel);
            this.f211621d = -1;
            this.f211622e = -1;
            this.f211621d = parcel.readInt();
            this.f211622e = parcel.readInt();
            this.f211624g = parcel.readInt() != 0;
            this.f211623f = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                this.f211625h = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            }
            if (parcel.readInt() != 0) {
                this.f211626i = com.tencent.mm.ui.widget.cedit.util.ParcelableParcel.CREATOR.createFromParcel(parcel);
            }
        }
    }

    public CustomTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        this.f211598m = android.text.Editable.Factory.getInstance();
        this.f211600n = android.text.Spannable.Factory.getInstance();
        this.D = android.widget.TextView.BufferType.NORMAL;
        this.N = false;
        this.P = -1;
        this.Q = false;
        this.T = 8388659;
        this.W = true;
        this.f211604p0 = 1.0f;
        this.f211614x0 = 0.0f;
        this.f211617y0 = Integer.MAX_VALUE;
        this.f211596l1 = 1;
        this.f211605p1 = 0;
        this.f211615x1 = 1;
        this.f211618y1 = Integer.MAX_VALUE;
        this.f211620z1 = 1;
        this.A1 = Integer.MAX_VALUE;
        this.B1 = 2;
        this.C1 = 0;
        this.D1 = 2;
        this.F1 = -1;
        this.G1 = true;
        this.H1 = -1;
        this.Q1 = f211573q2;
        this.S1 = 1714664933;
        this.V1 = true;
        this.W1 = android.R.attr.textCursorDrawable;
        this.Y1 = android.R.attr.textSelectHandleLeft;
        this.f211579a2 = android.R.attr.textSelectHandleRight;
        this.f211581c2 = android.R.attr.textSelectHandle;
        this.f211585e2 = -1;
        this.f211593i2 = new gl5.a(this);
        this.f211594j2 = getContext().getResources().getColor(com.tencent.mm.R.color.f478860j6);
        this.f211595k2 = false;
        this.f211599m2 = new java.util.HashSet();
        this.f211601n2 = new java.util.HashSet();
        N(context, attributeSet, i17, i18);
    }

    public final void setHintTextColor(android.content.res.ColorStateList colorStateList) {
        this.f211584e = colorStateList;
        x0();
    }

    public final void setLinkTextColor(android.content.res.ColorStateList colorStateList) {
        this.f211586f = colorStateList;
        x0();
    }

    public void setTextColor(android.content.res.ColorStateList colorStateList) {
        colorStateList.getClass();
        this.f211582d = colorStateList;
        x0();
    }

    @Override // android.view.View
    public boolean showContextMenu(float f17, float f18) {
        gl5.e0 e0Var = this.f211589g2;
        if (e0Var != null) {
            e0Var.getClass();
        }
        return super.showContextMenu(f17, f18);
    }

    public final void setHint(int i17) {
        setHint(getContext().getResources().getText(i17));
    }

    public void setTextCursorDrawable(int i17) {
        setTextCursorDrawable(i17 != 0 ? getContext().getDrawable(i17) : null);
    }

    public void setTextSelectHandle(int i17) {
        if (i17 != 0) {
            setTextSelectHandle(getContext().getDrawable(i17));
            return;
        }
        throw new java.lang.IllegalArgumentException("The text select handle should be a valid drawable resource id.");
    }

    public void setTextSelectHandleLeft(int i17) {
        if (i17 != 0) {
            setTextSelectHandleLeft(getContext().getDrawable(i17));
            return;
        }
        throw new java.lang.IllegalArgumentException("The text select left handle should be a valid drawable resource id.");
    }

    public void setTextSelectHandleRight(int i17) {
        if (i17 != 0) {
            setTextSelectHandleRight(getContext().getDrawable(i17));
            return;
        }
        throw new java.lang.IllegalArgumentException("The text select right handle should be a valid drawable resource id.");
    }
}
