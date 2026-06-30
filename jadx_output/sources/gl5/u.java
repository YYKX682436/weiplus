package gl5;

/* loaded from: classes15.dex */
public class u extends gl5.q {
    public float N;
    public float P;
    public java.lang.Runnable Q;
    public boolean R;
    public final int S;
    public final /* synthetic */ gl5.e0 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(gl5.e0 e0Var, android.graphics.drawable.Drawable drawable) {
        super(e0Var, drawable, drawable, com.tencent.mm.R.id.hdx, null);
        this.T = e0Var;
        this.R = false;
        this.S = 255;
    }

    @Override // gl5.q
    public void b() {
        super.b();
        this.R = false;
    }

    @Override // gl5.q
    public int d(android.text.Layout layout, int i17) {
        gl5.e0 e0Var = this.T;
        if (e0Var.F == null) {
            return super.d(layout, i17);
        }
        return e0Var.c(e0Var.F, layout.getPrimaryHorizontal(i17)) + e0Var.T.left;
    }

    @Override // gl5.q
    public int f(boolean z17) {
        return 1;
    }

    @Override // gl5.q
    public int g(android.graphics.drawable.Drawable drawable, boolean z17) {
        return drawable.getIntrinsicWidth() / 2;
    }

    @Override // gl5.q
    public int getCurrentCursorOffset() {
        return this.T.U.getSelectionStart();
    }

    @Override // gl5.q
    public int getCursorOffset() {
        int cursorOffset = super.getCursorOffset();
        gl5.e0 e0Var = this.T;
        android.graphics.drawable.Drawable drawable = e0Var.F;
        if (drawable == null) {
            return cursorOffset;
        }
        drawable.getPadding(e0Var.T);
        int intrinsicWidth = e0Var.F.getIntrinsicWidth();
        android.graphics.Rect rect = e0Var.T;
        return cursorOffset + (((intrinsicWidth - rect.left) - rect.right) / 2);
    }

    @Override // gl5.q
    public int getMagnifierHandleTrigger() {
        return 0;
    }

    @Override // gl5.q
    public boolean k() {
        if (this.R) {
            return false;
        }
        return super.k();
    }

    @Override // gl5.q
    public void l() {
        java.lang.Runnable runnable = this.Q;
        if (runnable != null) {
            this.T.U.removeCallbacks(runnable);
        }
    }

    @Override // gl5.q
    public void m() {
        java.lang.Runnable runnable = this.Q;
        if (runnable != null) {
            this.T.U.removeCallbacks(runnable);
        }
    }

    @Override // gl5.q
    public void o() {
        super.o();
        this.R = false;
        this.f273058d.setAlpha(this.S);
    }

    @Override // gl5.q, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r1 != 3) goto L32;
     */
    @Override // gl5.q, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            gl5.e0 r0 = r7.T
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r1 = r0.U
            r2 = 1
            boolean r1 = r1.Q(r8, r2)
            if (r1 != 0) goto Lc
            return r2
        Lc:
            super.onTouchEvent(r8)
            int r1 = r8.getActionMasked()
            if (r1 == 0) goto L70
            if (r1 == r2) goto L22
            r0 = 2
            if (r1 == r0) goto L1e
            r8 = 3
            if (r1 == r8) goto L69
            goto L7f
        L1e:
            r7.q(r8)
            goto L7f
        L22:
            int r1 = r7.L
            r3 = 0
            if (r1 <= r2) goto L29
            r1 = r2
            goto L2a
        L29:
            r1 = r3
        L2a:
            if (r1 != 0) goto L62
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r1 = r0.U
            android.content.Context r1 = r1.getContext()
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            float r4 = r7.N
            float r5 = r7.P
            float r6 = r8.getRawX()
            float r8 = r8.getRawY()
            int r1 = r1.getScaledTouchSlop()
            float r6 = r6 - r4
            float r8 = r8 - r5
            float r6 = r6 * r6
            float r8 = r8 * r8
            float r6 = r6 + r8
            int r1 = r1 * r1
            float r8 = (float) r1
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 > 0) goto L52
            r3 = r2
        L52:
            if (r3 == 0) goto L69
            boolean r8 = r0.t()
            if (r8 != 0) goto L5e
            r0.J()
            goto L69
        L5e:
            r0.H()
            goto L69
        L62:
            android.view.ActionMode r8 = r0.f272945c
            if (r8 == 0) goto L69
            r8.invalidateContentRect()
        L69:
            r7.t()
            r7.c()
            goto L7f
        L70:
            float r0 = r8.getRawX()
            r7.N = r0
            float r0 = r8.getRawY()
            r7.P = r0
            r7.q(r8)
        L7f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: gl5.u.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // gl5.q
    public void p(boolean z17) {
        super.p(z17);
        this.f273058d.setAlpha(this.S);
    }

    @Override // gl5.q
    public void r(float f17, float f18, boolean z17) {
        gl5.e0 e0Var = this.T;
        android.text.Layout layout = e0Var.U.getLayout();
        int i17 = -1;
        if (layout != null) {
            if (this.D == -1) {
                this.D = e0Var.U.J(f18);
            }
            int i18 = e0Var.i(layout, this.D, f18);
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.M.U;
            i17 = customTextView.getLayout().getOffsetForHorizontal(i18, customTextView.C(f17));
            this.D = i18;
        }
        n(i17, false, z17);
        android.view.ActionMode actionMode = e0Var.f272945c;
        if (actionMode == null || actionMode == null) {
            return;
        }
        actionMode.invalidate();
    }

    @Override // gl5.q
    public void s(int i17) {
        android.text.Selection.setSelection((android.text.Spannable) this.T.U.getText(), i17);
    }

    public final void t() {
        java.lang.Runnable runnable = this.Q;
        gl5.e0 e0Var = this.T;
        if (runnable == null) {
            this.Q = new gl5.t(this);
        } else if (runnable != null) {
            e0Var.U.removeCallbacks(runnable);
        }
        e0Var.U.postDelayed(this.Q, 4000L);
    }
}
