package gl5;

/* loaded from: classes15.dex */
public final class a0 extends gl5.q {
    public final int N;
    public boolean P;
    public float Q;
    public float R;
    public boolean S;
    public final float T;
    public final int[] U;
    public final /* synthetic */ gl5.e0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(gl5.e0 e0Var, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, int i17, int i18) {
        super(e0Var, drawable, drawable2, i17, null);
        this.V = e0Var;
        this.P = false;
        this.S = false;
        this.U = new int[2];
        this.N = i18;
        this.T = android.view.ViewConfiguration.get(e0Var.U.getContext()).getScaledTouchSlop() * 4;
    }

    @Override // gl5.q
    public float e(android.text.Layout layout, int i17) {
        return t(layout, i17, u());
    }

    @Override // gl5.q
    public int f(boolean z17) {
        return z17 == u() ? 3 : 5;
    }

    @Override // gl5.q
    public int g(android.graphics.drawable.Drawable drawable, boolean z17) {
        return z17 == u() ? drawable.getIntrinsicWidth() / 4 : (drawable.getIntrinsicWidth() * 3) / 4;
    }

    @Override // gl5.q
    public int getCurrentCursorOffset() {
        boolean u17 = u();
        gl5.e0 e0Var = this.V;
        return u17 ? e0Var.U.getSelectionStart() : e0Var.U.getSelectionEnd();
    }

    @Override // gl5.q
    public int getMagnifierHandleTrigger() {
        return u() ? 1 : 2;
    }

    @Override // gl5.q
    public boolean j(android.text.Layout layout, int i17) {
        if (!u()) {
            i17 = java.lang.Math.max(i17 - 1, 0);
        }
        return layout.isRtlCharAt(i17);
    }

    @Override // gl5.q
    public void n(int i17, boolean z17, boolean z18) {
        boolean z19;
        super.n(i17, z17, z18);
        if (i17 != -1) {
            kl5.b q17 = this.V.q();
            q17.b(i17);
            if (!q17.f308980d.isBoundary(i17)) {
                z19 = true;
                this.P = z19;
            }
        }
        z19 = false;
        this.P = z19;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r0 != 3) goto L16;
     */
    @Override // gl5.q, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            gl5.e0 r0 = r3.V
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r0.U
            r1 = 1
            boolean r0 = r0.Q(r4, r1)
            if (r0 != 0) goto Lc
            return r1
        Lc:
            super.onTouchEvent(r4)
            int r0 = r4.getActionMasked()
            if (r0 == 0) goto L26
            if (r0 == r1) goto L22
            r2 = 2
            if (r0 == r2) goto L1e
            r4 = 3
            if (r0 == r4) goto L22
            goto L30
        L1e:
            r3.q(r4)
            goto L30
        L22:
            r3.c()
            goto L30
        L26:
            r0 = 0
            r3.Q = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.R = r0
            r3.q(r4)
        L30:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gl5.a0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x0102, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0100, code lost:
    
        if (r18 < ((r12[0] + r6.getPaddingLeft()) + r14)) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f0, code lost:
    
        if (r18 > (((r12[0] + r6.getWidth()) - r6.getPaddingRight()) - r14)) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0104, code lost:
    
        r12 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0122, code lost:
    
        if (r6.canScrollHorizontally(r13 ? -1 : 1) != false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x026a  */
    @Override // gl5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(float r18, float r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gl5.a0.r(float, float, boolean):void");
    }

    @Override // gl5.q
    public void s(int i17) {
        boolean u17 = u();
        gl5.e0 e0Var = this.V;
        if (u17) {
            android.text.Selection.setSelection((android.text.Spannable) e0Var.U.getText(), i17, e0Var.U.getSelectionEnd());
        } else {
            android.text.Selection.setSelection((android.text.Spannable) e0Var.U.getText(), e0Var.U.getSelectionStart(), i17);
        }
        p(false);
        android.view.ActionMode actionMode = e0Var.f272945c;
        if (actionMode == null || actionMode == null) {
            return;
        }
        actionMode.invalidate();
    }

    public final float t(android.text.Layout layout, int i17, boolean z17) {
        return layout.isRtlCharAt(z17 ? i17 : java.lang.Math.max(i17 + (-1), 0)) == (layout.getParagraphDirection(layout.getLineForOffset(i17)) == -1) ? layout.getPrimaryHorizontal(i17) : layout.getSecondaryHorizontal(i17);
    }

    public final boolean u() {
        return this.N == 0;
    }

    public final void v(int i17, boolean z17) {
        boolean u17 = u();
        gl5.e0 e0Var = this.V;
        int selectionEnd = u17 ? e0Var.U.getSelectionEnd() : e0Var.U.getSelectionStart();
        if ((u() && i17 >= selectionEnd) || (!u() && i17 <= selectionEnd)) {
            this.Q = 0.0f;
            android.text.Layout layout = e0Var.U.getLayout();
            if (layout != null && i17 != selectionEnd) {
                float t17 = t(layout, i17, u());
                float t18 = t(layout, selectionEnd, !u());
                float t19 = t(layout, this.f273077z, u());
                if ((t19 < t18 && t17 < t18) || (t19 > t18 && t17 > t18)) {
                    int currentCursorOffset = getCurrentCursorOffset();
                    if (!u()) {
                        java.lang.Math.max(currentCursorOffset - 1, 0);
                    }
                    n(u() ? (int) 0 : jl5.b.c(0L), false, z17);
                    return;
                }
            }
            i17 = e0Var.l(selectionEnd, !u());
        }
        n(i17, false, z17);
    }
}
