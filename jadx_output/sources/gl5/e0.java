package gl5;

/* loaded from: classes15.dex */
public class e0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public gl5.e1 D;
    public boolean E;
    public android.graphics.drawable.Drawable G;
    public android.graphics.drawable.Drawable H;
    public android.graphics.drawable.Drawable I;

    /* renamed from: J, reason: collision with root package name */
    public gl5.z f272941J;
    public android.view.ActionMode.Callback K;
    public android.view.ActionMode.Callback L;
    public boolean M;
    public int N;
    public java.lang.Runnable P;
    public kl5.b Q;
    public kl5.b R;
    public boolean S;
    public android.graphics.Rect T;
    public final com.tencent.mm.ui.widget.cedit.edit.CustomTextView U;
    public final java.lang.Runnable V;
    public boolean W;
    public final int X;
    public final int Y;
    public hl5.g Z;

    /* renamed from: a, reason: collision with root package name */
    public gl5.w f272942a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f272943a0;

    /* renamed from: b, reason: collision with root package name */
    public gl5.b0 f272944b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.ActionMode f272945c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f272946d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f272947e;

    /* renamed from: f, reason: collision with root package name */
    public gl5.y f272948f;

    /* renamed from: i, reason: collision with root package name */
    public gl5.o f272951i;

    /* renamed from: j, reason: collision with root package name */
    public gl5.r f272952j;

    /* renamed from: k, reason: collision with root package name */
    public gl5.s f272953k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f272954l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f272955m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f272956n;

    /* renamed from: o, reason: collision with root package name */
    public android.text.method.KeyListener f272957o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f272959q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f272960r;

    /* renamed from: s, reason: collision with root package name */
    public long f272961s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f272962t;

    /* renamed from: u, reason: collision with root package name */
    public gl5.n f272963u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f272965w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f272966x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f272967y;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f272949g = new gl5.k(this);

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnDrawListener f272950h = new gl5.l(this);

    /* renamed from: p, reason: collision with root package name */
    public int f272958p = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f272964v = true;

    /* renamed from: z, reason: collision with root package name */
    public boolean f272968z = true;
    public android.graphics.drawable.Drawable F = null;
    public final gl5.f0 O = new gl5.f0();

    public e0(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView) {
        new android.view.inputmethod.CursorAnchorInfo.Builder();
        new android.graphics.Matrix();
        this.V = new gl5.m(this);
        this.W = false;
        this.f272943a0 = false;
        this.U = customTextView;
        customTextView.setFilters(customTextView.getFilters());
        this.X = (int) android.util.TypedValue.applyDimension(1, 45.0f, customTextView.getContext().getResources().getDisplayMetrics());
        this.Y = (int) android.util.TypedValue.applyDimension(1, 12.0f, customTextView.getContext().getResources().getDisplayMetrics());
    }

    public static android.graphics.drawable.Drawable C(android.content.Context context, android.graphics.drawable.Drawable drawable, int i17) {
        if (!(drawable instanceof android.graphics.drawable.BitmapDrawable)) {
            return drawable;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == 0 || intrinsicHeight == 0) {
            return drawable;
        }
        android.graphics.Bitmap bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
        float f17 = intrinsicWidth;
        float width = f17 / bitmap.getWidth();
        float a17 = com.tencent.mm.ui.zk.a(context, i17);
        return new android.graphics.drawable.BitmapDrawable(context.getResources(), android.graphics.Bitmap.createScaledBitmap(bitmap, (int) (((f17 / intrinsicHeight) * a17) / width), (int) (a17 / width), true));
    }

    public static int a(gl5.e0 e0Var, int i17) {
        int d17;
        kl5.b q17 = e0Var.q();
        q17.b(i17);
        if (e0Var.q().f(q17.f308980d.following(i17))) {
            kl5.b q18 = e0Var.q();
            q18.b(i17);
            d17 = i17;
            while (d17 != -1) {
                if (!q18.h(d17) && q18.f(d17)) {
                    break;
                }
                q18.b(d17);
                d17 = q18.f308980d.following(d17);
            }
        } else {
            d17 = e0Var.q().d(i17, true);
        }
        return d17 == -1 ? i17 : d17;
    }

    public static int b(gl5.e0 e0Var, int i17) {
        int c17;
        kl5.b q17 = e0Var.q();
        q17.b(i17);
        if (e0Var.q().h(q17.f308980d.preceding(i17))) {
            kl5.b q18 = e0Var.q();
            q18.b(i17);
            c17 = i17;
            while (c17 != -1) {
                if (q18.h(c17) && !q18.f(c17)) {
                    break;
                }
                q18.b(c17);
                c17 = q18.f308980d.preceding(c17);
            }
        } else {
            c17 = e0Var.q().c(i17, true);
        }
        return c17 == -1 ? i17 : c17;
    }

    public void A() {
        if (g()) {
            this.B = false;
            return;
        }
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.U;
        boolean M = customTextView.M();
        gl5.b0 p17 = p();
        gl5.w k17 = k();
        if ((p17 != null && p17.e()) || (k17 != null && k17.e())) {
            this.B = false;
            return;
        }
        if (M) {
            r();
            if (t()) {
                if (this.B) {
                    I(false);
                }
            } else if (p17 == null || !p17.a()) {
                K();
                I(false);
            } else {
                android.view.ActionMode actionMode = this.f272945c;
                if (actionMode != null) {
                    actionMode.invalidateContentRect();
                }
                customTextView.postDelayed(this.V, android.view.ViewConfiguration.getDoubleTapTimeout());
                gl5.e1 o17 = o();
                o17.getClass();
                android.view.ActionMode actionMode2 = o17.f272969a.f272945c;
                if (actionMode2 != null) {
                    actionMode2.invalidate();
                }
            }
        } else if (k17 == null || !k17.a()) {
            J();
        } else {
            android.view.ActionMode actionMode3 = this.f272945c;
            if (actionMode3 != null) {
                actionMode3.invalidateContentRect();
            }
        }
        this.B = false;
    }

    public boolean B() {
        android.view.inputmethod.InputMethodManager j17;
        gl5.s sVar = this.f272953k;
        if (sVar == null) {
            return false;
        }
        boolean z17 = sVar.f273093f;
        if (!z17 && !sVar.f273092e) {
            return false;
        }
        sVar.f273093f = false;
        sVar.f273092e = false;
        android.view.inputmethod.ExtractedTextRequest extractedTextRequest = sVar.f273088a;
        if (extractedTextRequest == null || (j17 = j()) == null) {
            return false;
        }
        if (sVar.f273094g < 0 && !z17) {
            sVar.f273094g = -2;
        }
        int i17 = sVar.f273094g;
        int i18 = sVar.f273095h;
        int i19 = sVar.f273096i;
        android.view.inputmethod.ExtractedText extractedText = sVar.f273089b;
        if (!f(extractedTextRequest, i17, i18, i19, extractedText)) {
            return false;
        }
        j17.updateExtractedText(this.U, extractedTextRequest.token, extractedText);
        sVar.f273094g = -1;
        sVar.f273095h = -1;
        sVar.f273096i = 0;
        sVar.f273093f = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0110 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gl5.e0.D():boolean");
    }

    public final boolean E() {
        int selectionEnd;
        boolean z17 = this.f272964v;
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.U;
        if ((z17 && customTextView.V()) && customTextView.isFocused()) {
            int selectionStart = customTextView.getSelectionStart();
            if (selectionStart < 0 || (selectionEnd = customTextView.getSelectionEnd()) < 0) {
                return false;
            }
            if (selectionStart == selectionEnd) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b1 A[EDGE_INSN: B:45:0x01b1->B:46:0x01b1 BREAK  A[LOOP:1: B:37:0x016a->B:43:0x01ae], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F() {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gl5.e0.F():void");
    }

    public final void G() {
        o().getClass();
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.U;
        customTextView.getClass();
        android.content.ClipData.newPlainText(null, customTextView.f0(customTextView.C.subSequence(customTextView.getSelectionStart(), customTextView.getSelectionEnd())));
        J();
        if (this.f272947e) {
            p().g();
        }
    }

    public void H() {
        java.lang.Runnable runnable = this.P;
        if (runnable != null) {
            this.U.removeCallbacks(runnable);
        }
        if (g()) {
            return;
        }
        J();
        new gl5.c0(this, 1);
        F();
        if (t() || k() == null) {
            return;
        }
        k().show();
    }

    public void I(boolean z17) {
        boolean z18;
        gl5.b0 p17;
        boolean z19;
        android.view.inputmethod.InputMethodManager j17;
        gl5.e1 o17 = o();
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = o17.f272970b;
        customTextView.getText();
        gl5.e0 e0Var = o17.f272969a;
        if (!e0Var.g()) {
            android.view.ActionMode actionMode = e0Var.f272945c;
            if (actionMode == null) {
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView2 = e0Var.U;
                z18 = true;
                if (customTextView2.z() && customTextView2.requestFocus()) {
                    z19 = true;
                } else {
                    com.tencent.mars.xlog.Log.w("cmEdit.CMTextView", "TextView does not support text selection. Selection cancelled.");
                    z19 = false;
                }
                if (z19 && customTextView2.M()) {
                    new gl5.c0(e0Var, 0);
                    e0Var.F();
                    if (!customTextView2.V()) {
                        customTextView2.W();
                    }
                    if ((!e0Var.t()) && customTextView2.V() && !customTextView2.W() && e0Var.f272968z && (j17 = e0Var.j()) != null) {
                        j17.showSoftInput(customTextView2, 0, null);
                    }
                    if (z18 && (p17 = e0Var.p()) != null && (customTextView.W() || customTextView.V())) {
                        p17.show();
                    }
                    e0Var.B = false;
                }
            } else if (actionMode != null) {
                actionMode.invalidate();
            }
        }
        z18 = false;
        if (z18) {
            p17.show();
        }
        e0Var.B = false;
    }

    public void J() {
        android.view.ActionMode actionMode = this.f272945c;
        if (actionMode != null) {
            actionMode.finish();
        }
        java.lang.Runnable runnable = this.V;
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.U;
        customTextView.removeCallbacks(runnable);
        if (this.f272943a0) {
            o().getClass();
            this.f272945c = null;
            hl5.g gVar = this.Z;
            if (gVar != null) {
                try {
                    com.tencent.mars.xlog.Log.i("cmEdit.OperateWindow", "destroy OpWindow@%s", java.lang.Integer.valueOf(gVar.hashCode()));
                    try {
                        gVar.f282134i.getEditor().n().b(gVar.f282140o);
                        gVar.f282126a.dismiss();
                    } catch (java.lang.Throwable unused) {
                    }
                    gVar.f282126a.setContentView(null);
                    gVar.f282136k = true;
                } catch (java.lang.Throwable unused2) {
                }
            }
            this.f272943a0 = false;
            if (!this.A) {
                android.text.Selection.setSelection((android.text.Spannable) customTextView.getText(), customTextView.getSelectionEnd());
            }
            gl5.b0 b0Var = this.f272944b;
            if (b0Var != null) {
                b0Var.c();
            }
            this.C = false;
        }
    }

    public final void K() {
        if (!t()) {
            this.B = true;
        }
        this.A = true;
        J();
        this.A = false;
    }

    public final int c(android.graphics.drawable.Drawable drawable, float f17) {
        int i17;
        float max = java.lang.Math.max(0.5f, f17 - 0.5f);
        if (this.T == null) {
            this.T = new android.graphics.Rect();
        }
        if (drawable != null) {
            drawable.getPadding(this.T);
            i17 = drawable.getIntrinsicWidth();
        } else {
            this.T.setEmpty();
            i17 = 0;
        }
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.U;
        int scrollX = customTextView.getScrollX();
        float f18 = max - scrollX;
        int width = (customTextView.getWidth() - customTextView.getCompoundPaddingLeft()) - customTextView.getCompoundPaddingRight();
        float f19 = width;
        return f18 >= f19 - 1.0f ? (width + scrollX) - (i17 - this.T.right) : (java.lang.Math.abs(f18) <= 1.0f || (android.text.TextUtils.isEmpty(customTextView.getText()) && ((float) (1048576 - scrollX)) <= f19 + 1.0f && max <= 1.0f)) ? scrollX - this.T.left : ((int) max) - this.T.left;
    }

    public void d() {
        if (this.f272952j == null) {
            this.f272952j = new gl5.r();
        }
    }

    public final void e() {
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.U;
        if (customTextView.v0() || !customTextView.M()) {
            return;
        }
        android.text.Selection.setSelection((android.text.Spannable) customTextView.getText(), customTextView.length(), customTextView.length());
    }

    public final boolean f(android.view.inputmethod.ExtractedTextRequest extractedTextRequest, int i17, int i18, int i19, android.view.inputmethod.ExtractedText extractedText) {
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView;
        java.lang.CharSequence text;
        if (extractedTextRequest == null || extractedText == null || (text = (customTextView = this.U).getText()) == null) {
            return false;
        }
        if (i17 != -2) {
            int length = text.length();
            if (i17 < 0) {
                extractedText.partialEndOffset = -1;
                extractedText.partialStartOffset = -1;
                i17 = 0;
            } else {
                int i27 = i18 + i19;
                if (text instanceof android.text.Spanned) {
                    android.text.Spanned spanned = (android.text.Spanned) text;
                    java.lang.Object[] spans = spanned.getSpans(i17, i27, android.text.ParcelableSpan.class);
                    int length2 = spans.length;
                    while (length2 > 0) {
                        length2--;
                        int spanStart = spanned.getSpanStart(spans[length2]);
                        if (spanStart < i17) {
                            i17 = spanStart;
                        }
                        int spanEnd = spanned.getSpanEnd(spans[length2]);
                        if (spanEnd > i27) {
                            i27 = spanEnd;
                        }
                    }
                }
                extractedText.partialStartOffset = i17;
                extractedText.partialEndOffset = i27 - i19;
                if (i17 > length) {
                    i17 = length;
                } else if (i17 < 0) {
                    i17 = 0;
                }
                if (i27 <= length) {
                    length = i27 < 0 ? 0 : i27;
                }
            }
            if ((extractedTextRequest.flags & 1) != 0) {
                extractedText.text = text.subSequence(i17, length);
            } else {
                extractedText.text = android.text.TextUtils.substring(text, i17, length);
            }
        } else {
            extractedText.partialStartOffset = 0;
            extractedText.partialEndOffset = 0;
            extractedText.text = "";
        }
        extractedText.flags = 0;
        if (android.text.method.MetaKeyKeyListener.getMetaState(text, 2048) != 0) {
            extractedText.flags |= 2;
        }
        if (customTextView.E1) {
            extractedText.flags |= 1;
        }
        extractedText.startOffset = 0;
        extractedText.selectionStart = customTextView.getSelectionStart();
        extractedText.selectionEnd = customTextView.getSelectionEnd();
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            extractedText.hint = customTextView.getHint();
        }
        return true;
    }

    public final boolean g() {
        this.U.getClass();
        android.view.inputmethod.InputMethodManager j17 = j();
        return j17 != null && j17.isFullscreenMode();
    }

    public void h(gl5.s sVar) {
        android.view.inputmethod.InputMethodManager j17;
        int i17;
        int i18;
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.U;
        customTextView.getClass();
        if (sVar.f273093f || sVar.f273092e) {
            customTextView.w0();
            B();
        } else if (sVar.f273091d) {
            int selectionEnd = customTextView.getSelectionEnd();
            customTextView.O(selectionEnd, selectionEnd, selectionEnd);
        }
        gl5.s sVar2 = this.f272953k;
        if (sVar2 != null && sVar2.f273090c <= 0 && (j17 = j()) != null) {
            int selectionStart = customTextView.getSelectionStart();
            int selectionEnd2 = customTextView.getSelectionEnd();
            if (customTextView.getText() instanceof android.text.Spannable) {
                android.text.Spannable spannable = (android.text.Spannable) customTextView.getText();
                int composingSpanStart = android.view.inputmethod.BaseInputConnection.getComposingSpanStart(spannable);
                i18 = android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(spannable);
                i17 = composingSpanStart;
            } else {
                i17 = -1;
                i18 = -1;
            }
            j17.updateSelection(this.U, selectionStart, selectionEnd2, i17, i18);
        }
        if (t()) {
            return;
        }
        gl5.p p17 = customTextView.M() ? p() : k();
        if (p17 == null || p17.a() || p17.e()) {
            return;
        }
        p17.show();
    }

    public int i(android.text.Layout layout, int i17, float f17) {
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.U;
        int J2 = customTextView.J(f17);
        if (layout == null || i17 > layout.getLineCount() || layout.getLineCount() <= 0 || i17 < 0 || java.lang.Math.abs(J2 - i17) >= 2) {
            return J2;
        }
        int lineBottom = layout.getLineBottom(i17) - layout.getLineTop(i17);
        int max = java.lang.Math.max(0, java.lang.Math.max(this.Y, java.lang.Math.min(this.X, ((int) ((layout.getLineBottom(J2) - layout.getLineTop(J2)) * 0.5f)) + lineBottom)) - lineBottom);
        float y07 = customTextView.y0();
        return (J2 <= i17 || f17 < ((float) (layout.getLineBottom(i17) + max)) + y07) ? (J2 >= i17 || f17 > ((float) (layout.getLineTop(i17) - max)) + y07) ? i17 : J2 : J2;
    }

    public final android.view.inputmethod.InputMethodManager j() {
        return (android.view.inputmethod.InputMethodManager) this.U.getContext().getSystemService(android.view.inputmethod.InputMethodManager.class);
    }

    public gl5.w k() {
        if (!this.f272946d) {
            return null;
        }
        if (this.f272942a == null) {
            this.f272942a = new gl5.w(this);
            this.U.getViewTreeObserver().addOnTouchModeChangeListener(this.f272942a);
        }
        return this.f272942a;
    }

    public final int l(int i17, boolean z17) {
        android.text.Layout layout = this.U.getLayout();
        return layout == null ? i17 : z17 == layout.isRtlCharAt(i17) ? layout.getOffsetToLeftOf(i17) : layout.getOffsetToRightOf(i17);
    }

    public final long m(int i17, int i18) {
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.U;
        android.text.Layout layout = customTextView.getLayout();
        if (layout == null) {
            return jl5.b.a(-1, -1);
        }
        java.lang.CharSequence text = customTextView.getText();
        int lineForOffset = layout.getLineForOffset(i17);
        while (lineForOffset > 0 && text.charAt(layout.getLineEnd(lineForOffset - 1) - 1) != '\n') {
            lineForOffset--;
        }
        int lineForOffset2 = layout.getLineForOffset(i18);
        while (lineForOffset2 < layout.getLineCount() - 1 && text.charAt(layout.getLineEnd(lineForOffset2) - 1) != '\n') {
            lineForOffset2++;
        }
        return jl5.b.a(layout.getLineStart(lineForOffset), layout.getLineEnd(lineForOffset2));
    }

    public final gl5.z n() {
        if (this.f272941J == null) {
            this.f272941J = new gl5.z(this, null);
        }
        return this.f272941J;
    }

    public final gl5.e1 o() {
        if (this.D == null) {
            this.D = new gl5.e1(this);
        }
        return this.D;
    }

    public gl5.b0 p() {
        if (!this.f272947e) {
            return null;
        }
        if (this.f272944b == null) {
            this.f272944b = new gl5.b0(this);
            this.U.getViewTreeObserver().addOnTouchModeChangeListener(this.f272944b);
        }
        return this.f272944b;
    }

    public final kl5.b q() {
        kl5.b bVar = this.R;
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.U;
        if (bVar == null) {
            this.R = new kl5.b(customTextView.getTextServicesLocale());
            this.S = true;
        }
        if (this.S) {
            java.lang.CharSequence text = customTextView.getText();
            this.R.j(text, 0, text.length());
            this.S = false;
        }
        return this.R;
    }

    public void r() {
        gl5.u uVar;
        gl5.w wVar = this.f272942a;
        if (wVar == null || (uVar = wVar.f273105d) == null) {
            return;
        }
        uVar.i();
    }

    public void s() {
        android.view.ActionMode actionMode;
        gl5.u uVar;
        gl5.b0 b0Var = this.f272944b;
        if (b0Var != null) {
            gl5.a0 a0Var = b0Var.f272903d;
            if (a0Var != null) {
                a0Var.invalidate();
            }
            gl5.a0 a0Var2 = b0Var.f272904e;
            if (a0Var2 != null) {
                a0Var2.invalidate();
            }
        }
        gl5.w wVar = this.f272942a;
        if (wVar != null && (uVar = wVar.f273105d) != null) {
            uVar.invalidate();
        }
        if (t() || (actionMode = this.f272945c) == null) {
            return;
        }
        actionMode.invalidate();
    }

    public boolean t() {
        return this.f272945c == null && !this.f272943a0;
    }

    public final boolean u() {
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.U;
        for (android.text.style.SuggestionSpan suggestionSpan : (android.text.style.SuggestionSpan[]) ((android.text.Spannable) customTextView.getText()).getSpans(customTextView.getSelectionStart(), customTextView.getSelectionEnd(), android.text.style.SuggestionSpan.class)) {
            if ((suggestionSpan.getFlags() & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean v(float f17, float f18) {
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.U;
        android.text.Layout layout = customTextView.getLayout();
        if (layout == null) {
            return false;
        }
        int J2 = customTextView.J(f18);
        float C = customTextView.C(f17);
        return C >= layout.getLineLeft(J2) && C <= layout.getLineRight(J2);
    }

    public void w(boolean z17) {
        gl5.w k17;
        gl5.u uVar;
        gl5.b0 p17;
        gl5.a0 a0Var;
        android.graphics.drawable.Drawable drawable = this.I;
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.U;
        if (drawable == null || z17) {
            android.graphics.drawable.Drawable textSelectHandle = customTextView.getTextSelectHandle();
            this.I = textSelectHandle;
            if (textSelectHandle != null) {
                android.graphics.drawable.Drawable C = C(customTextView.getContext(), this.I, 23);
                this.I = C;
                C.setTint(customTextView.f211594j2);
            }
            if (this.f272946d && (uVar = (k17 = k()).f273105d) != null) {
                android.graphics.drawable.Drawable drawable2 = k17.f273106e.I;
                uVar.f273059e = drawable2;
                uVar.f273060f = drawable2;
                uVar.p(true);
            }
        }
        if (this.G == null || this.H == null || z17) {
            this.G = customTextView.getTextSelectHandleLeft();
            android.graphics.drawable.Drawable C2 = C(customTextView.getContext(), this.G, 21);
            this.G = C2;
            C2.setTint(customTextView.f211594j2);
            this.H = customTextView.getTextSelectHandleRight();
            android.graphics.drawable.Drawable C3 = C(customTextView.getContext(), this.H, 21);
            this.H = C3;
            C3.setTint(customTextView.f211594j2);
            if (!this.f272947e || (a0Var = (p17 = p()).f272903d) == null) {
                return;
            }
            gl5.e0 e0Var = p17.f272913q;
            android.graphics.drawable.Drawable drawable3 = e0Var.G;
            android.graphics.drawable.Drawable drawable4 = e0Var.H;
            a0Var.f273059e = drawable3;
            a0Var.f273060f = drawable4;
            a0Var.p(true);
            gl5.a0 a0Var2 = p17.f272904e;
            android.graphics.drawable.Drawable drawable5 = e0Var.H;
            android.graphics.drawable.Drawable drawable6 = e0Var.G;
            a0Var2.f273059e = drawable5;
            a0Var2.f273060f = drawable6;
            a0Var2.p(true);
        }
    }

    public void x() {
        boolean E = E();
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.U;
        if (!E) {
            gl5.n nVar = this.f272963u;
            if (nVar != null) {
                customTextView.removeCallbacks(nVar);
                return;
            }
            return;
        }
        this.f272961s = android.os.SystemClock.uptimeMillis();
        if (this.f272963u == null) {
            this.f272963u = new gl5.n(this, null);
        }
        customTextView.removeCallbacks(this.f272963u);
        customTextView.postDelayed(this.f272963u, 500L);
    }

    public final boolean y() {
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.U;
        if (customTextView.H instanceof android.text.method.PasswordTransformationMethod) {
            return true;
        }
        int inputType = customTextView.getInputType();
        int i17 = inputType & 15;
        int i18 = inputType & 4080;
        return i17 == 2 || i17 == 3 || i17 == 4 || i18 == 16 || i18 == 32 || i18 == 208 || i18 == 176;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z() {
        /*
            r5 = this;
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r5.U
            android.view.View r1 = r0.getRootView()
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r2 = r1 instanceof android.view.WindowManager.LayoutParams
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L1e
            android.view.WindowManager$LayoutParams r1 = (android.view.WindowManager.LayoutParams) r1
            int r1 = r1.type
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r1 < r2) goto L1c
            r2 = 1999(0x7cf, float:2.801E-42)
            if (r1 <= r2) goto L1e
        L1c:
            r1 = r3
            goto L1f
        L1e:
            r1 = r4
        L1f:
            if (r1 == 0) goto L29
            android.text.Layout r1 = r0.getLayout()
            if (r1 == 0) goto L29
            r1 = r3
            goto L2a
        L29:
            r1 = r4
        L2a:
            if (r1 == 0) goto L3d
            boolean r2 = r5.f272964v
            if (r2 == 0) goto L38
            boolean r2 = r0.V()
            if (r2 == 0) goto L38
            r2 = r3
            goto L39
        L38:
            r2 = r4
        L39:
            if (r2 == 0) goto L3d
            r2 = r3
            goto L3e
        L3d:
            r2 = r4
        L3e:
            r5.f272946d = r2
            if (r1 == 0) goto L49
            boolean r0 = r0.v0()
            if (r0 == 0) goto L49
            goto L4a
        L49:
            r3 = r4
        L4a:
            r5.f272947e = r3
            boolean r0 = r5.f272946d
            r1 = 0
            if (r0 != 0) goto L74
            r5.r()
            gl5.w r0 = r5.f272942a
            if (r0 == 0) goto L74
            gl5.e0 r2 = r0.f273106e
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r2 = r2.U
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
            r2.removeOnTouchModeChangeListener(r0)
            gl5.u r0 = r0.f273105d
            if (r0 == 0) goto L72
            java.lang.Runnable r2 = r0.Q
            if (r2 == 0) goto L72
            gl5.e0 r0 = r0.T
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r0.U
            r0.removeCallbacks(r2)
        L72:
            r5.f272942a = r1
        L74:
            boolean r0 = r5.f272947e
            if (r0 != 0) goto L8c
            r5.J()
            gl5.b0 r0 = r5.f272944b
            if (r0 == 0) goto L8c
            gl5.e0 r2 = r0.f272913q
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r2 = r2.U
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
            r2.removeOnTouchModeChangeListener(r0)
            r5.f272944b = r1
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gl5.e0.z():void");
    }
}
