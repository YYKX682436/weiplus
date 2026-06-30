package gl5;

/* loaded from: classes15.dex */
public abstract class q extends android.view.View implements gl5.d0 {
    public boolean A;
    public final int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public float G;
    public final int H;
    public final long[] I;

    /* renamed from: J, reason: collision with root package name */
    public final int[] f273057J;
    public int K;
    public int L;
    public final /* synthetic */ gl5.e0 M;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.drawable.Drawable f273058d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.drawable.Drawable f273059e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.Drawable f273060f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.PopupWindow f273061g;

    /* renamed from: h, reason: collision with root package name */
    public int f273062h;

    /* renamed from: i, reason: collision with root package name */
    public int f273063i;

    /* renamed from: m, reason: collision with root package name */
    public int f273064m;

    /* renamed from: n, reason: collision with root package name */
    public int f273065n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f273066o;

    /* renamed from: p, reason: collision with root package name */
    public float f273067p;

    /* renamed from: q, reason: collision with root package name */
    public float f273068q;

    /* renamed from: r, reason: collision with root package name */
    public int f273069r;

    /* renamed from: s, reason: collision with root package name */
    public int f273070s;

    /* renamed from: t, reason: collision with root package name */
    public final float f273071t;

    /* renamed from: u, reason: collision with root package name */
    public final float f273072u;

    /* renamed from: v, reason: collision with root package name */
    public int f273073v;

    /* renamed from: w, reason: collision with root package name */
    public int f273074w;

    /* renamed from: x, reason: collision with root package name */
    public int f273075x;

    /* renamed from: y, reason: collision with root package name */
    public int f273076y;

    /* renamed from: z, reason: collision with root package name */
    public int f273077z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(gl5.e0 e0Var, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, int i17, gl5.k kVar) {
        super(e0Var.U.getContext());
        this.M = e0Var;
        this.f273077z = -1;
        this.A = true;
        this.C = -1;
        this.D = -1;
        this.E = -1.0f;
        this.I = new long[5];
        this.f273057J = new int[5];
        this.K = 0;
        this.L = 0;
        com.tencent.mm.ui.zk.a(getContext(), 18);
        setId(i17);
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = e0Var.U;
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(customTextView.getContext(), (android.util.AttributeSet) null, com.tencent.mm.R.style.f494443nb);
        this.f273061g = popupWindow;
        popupWindow.setSplitTouchEnabled(true);
        popupWindow.setClippingEnabled(false);
        androidx.core.widget.r.d(popupWindow, 1002);
        popupWindow.setWidth(-2);
        popupWindow.setHeight(-2);
        popupWindow.setContentView(this);
        this.f273059e = drawable;
        this.f273060f = drawable2;
        p(true);
        this.B = customTextView.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.abu);
        float preferredHeight = getPreferredHeight();
        float f17 = (-0.3f) * preferredHeight;
        this.f273071t = f17;
        float f18 = preferredHeight * 0.7f;
        this.f273072u = f18;
        this.H = (int) (f18 - f17);
    }

    private int getDrawHeight() {
        return this.f273058d.getIntrinsicHeight();
    }

    private int getDrawWidth() {
        return this.f273058d.getIntrinsicWidth();
    }

    private int getHorizontalOffset() {
        int preferredWidth = getPreferredWidth();
        int drawWidth = getDrawWidth();
        int i17 = this.f273070s;
        if (i17 != 3) {
            return i17 != 5 ? (preferredWidth - drawWidth) / 2 : preferredWidth - drawWidth;
        }
        return 0;
    }

    private gl5.q getOtherSelectionHandle() {
        gl5.b0 p17 = this.M.p();
        if (p17 == null || !p17.a()) {
            return null;
        }
        gl5.a0 a0Var = p17.f272903d;
        return a0Var != this ? a0Var : p17.f272904e;
    }

    private void setVisible(boolean z17) {
        android.view.View contentView = this.f273061g.getContentView();
        int i17 = z17 ? 0 : 4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/ui/widget/cedit/edit/Editor$HandleView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/ui/widget/cedit/edit/Editor$HandleView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r2.f273090c > 0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    @Override // gl5.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r4, int r5, boolean r6, boolean r7) {
        /*
            r3 = this;
            int r0 = r3.getCurrentCursorOffset()
            r1 = 0
            r3.n(r0, r7, r1)
            if (r6 != 0) goto Le
            boolean r6 = r3.A
            if (r6 == 0) goto L91
        Le:
            boolean r6 = r3.f273066o
            if (r6 == 0) goto L33
            int r6 = r3.f273073v
            if (r4 != r6) goto L1a
            int r7 = r3.f273074w
            if (r5 == r7) goto L30
        L1a:
            float r7 = r3.f273067p
            int r6 = r4 - r6
            float r6 = (float) r6
            float r7 = r7 + r6
            r3.f273067p = r7
            float r6 = r3.f273068q
            int r7 = r3.f273074w
            int r7 = r5 - r7
            float r7 = (float) r7
            float r6 = r6 + r7
            r3.f273068q = r6
            r3.f273073v = r4
            r3.f273074w = r5
        L30:
            r3.m()
        L33:
            boolean r6 = r3.f273066o
            r7 = 1
            gl5.e0 r0 = r3.M
            if (r6 == 0) goto L3b
            goto L67
        L3b:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r6 = r0.U
            gl5.e0 r6 = r6.f211589g2
            if (r6 != 0) goto L42
            goto L4b
        L42:
            gl5.s r2 = r6.f272953k
            if (r2 == 0) goto L4d
            int r6 = r2.f273090c
            if (r6 <= 0) goto L4b
            goto L4f
        L4b:
            r7 = r1
            goto L4f
        L4d:
            boolean r7 = r6.f272967y
        L4f:
            if (r7 == 0) goto L53
            r7 = r1
            goto L67
        L53:
            int r6 = r3.f273062h
            int r7 = r3.f273069r
            int r6 = r6 + r7
            int r7 = r3.getHorizontalOffset()
            int r6 = r6 + r7
            float r6 = (float) r6
            int r7 = r3.f273063i
            float r7 = (float) r7
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r2 = r0.U
            boolean r7 = r2.T(r6, r7)
        L67:
            if (r7 == 0) goto L86
            int r6 = r3.f273062h
            int r4 = r4 + r6
            int r6 = r3.f273063i
            int r5 = r5 + r6
            r3.f273064m = r4
            r3.f273065n = r5
            boolean r6 = r3.k()
            android.widget.PopupWindow r7 = r3.f273061g
            if (r6 == 0) goto L80
            r6 = -1
            r7.update(r4, r5, r6, r6)
            goto L8f
        L80:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r6 = r0.U
            r7.showAtLocation(r6, r1, r4, r5)
            goto L8f
        L86:
            boolean r4 = r3.k()
            if (r4 == 0) goto L8f
            r3.b()
        L8f:
            r3.A = r1
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gl5.q.a(int, int, boolean, boolean):void");
    }

    public void b() {
        this.f273066o = false;
        this.f273061g.dismiss();
        l();
    }

    public final void c() {
        gl5.e0 e0Var = this.M;
        gl5.y yVar = e0Var.f272948f;
        if (yVar != null) {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                yVar.f273110a.dismiss();
            }
            yVar.f273111b.cancel();
            yVar.f273112c = false;
            e0Var.f272962t = false;
            gl5.n nVar = e0Var.f272963u;
            if (nVar != null) {
                nVar.f273045d = false;
                e0Var.x();
            }
            setVisible(true);
            gl5.q otherSelectionHandle = getOtherSelectionHandle();
            if (otherSelectionHandle != null) {
                otherSelectionHandle.setVisible(true);
            }
        }
    }

    public int d(android.text.Layout layout, int i17) {
        return (int) (e(layout, i17) - 0.5f);
    }

    public float e(android.text.Layout layout, int i17) {
        return layout.getPrimaryHorizontal(i17);
    }

    public abstract int f(boolean z17);

    public abstract int g(android.graphics.drawable.Drawable drawable, boolean z17);

    public abstract int getCurrentCursorOffset();

    public int getCursorOffset() {
        return 0;
    }

    public final int getIdealFingerToCursorOffset() {
        return this.H;
    }

    public float getIdealVerticalOffset() {
        return this.f273072u;
    }

    public abstract int getMagnifierHandleTrigger();

    public final int getPreferredHeight() {
        return java.lang.Math.max(getDrawWidth(), this.B);
    }

    public final int getPreferredWidth() {
        return java.lang.Math.max(getDrawWidth(), this.B);
    }

    public final boolean h(gl5.q qVar, android.graphics.Rect rect) {
        android.widget.PopupWindow popupWindow = qVar.f273061g;
        int i17 = this.f273064m;
        return android.graphics.Rect.intersects(new android.graphics.Rect(i17, this.f273065n, popupWindow.getContentView().getWidth() + i17, this.f273065n + popupWindow.getContentView().getHeight()), rect);
    }

    public void i() {
        b();
        this.M.n().b(this);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (k()) {
            n(getCurrentCursorOffset(), true, false);
        }
    }

    public boolean j(android.text.Layout layout, int i17) {
        return layout.isRtlCharAt(i17);
    }

    public boolean k() {
        return this.f273061g.isShowing();
    }

    public void l() {
    }

    public void m() {
    }

    public void n(int i17, boolean z17, boolean z18) {
        gl5.e0 e0Var = this.M;
        if (e0Var.U.getLayout() == null) {
            e0Var.z();
            return;
        }
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = e0Var.U;
        android.text.Layout layout = customTextView.getLayout();
        boolean z19 = i17 != this.f273077z;
        if (z19 || z17) {
            if (z19) {
                s(i17);
                int i18 = (this.K + 1) % 5;
                this.K = i18;
                this.f273057J[i18] = i17;
                this.I[i18] = android.os.SystemClock.uptimeMillis();
                this.L++;
            }
            int lineForOffset = layout.getLineForOffset(i17);
            this.C = lineForOffset;
            this.f273062h = ((d(layout, i17) - this.f273069r) - getHorizontalOffset()) + getCursorOffset();
            this.f273063i = layout.getLineBottom(lineForOffset);
            this.f273062h += customTextView.getCompoundPaddingLeft() - customTextView.getScrollX();
            this.f273063i += customTextView.y0();
            this.f273077z = i17;
            this.A = true;
        }
    }

    public void o() {
        if (k()) {
            return;
        }
        this.M.n().a(this, true);
        this.f273077z = -1;
        n(getCurrentCursorOffset(), false, false);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int drawWidth = getDrawWidth();
        int drawHeight = getDrawHeight();
        int horizontalOffset = getHorizontalOffset();
        this.f273058d.setBounds(horizontalOffset, 0, drawWidth + horizontalOffset, drawHeight);
        this.f273058d.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        setMeasuredDimension(getPreferredWidth(), getPreferredHeight());
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(java.util.Collections.singletonList(new android.graphics.Rect(0, 0, i17, i18)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0066, code lost:
    
        if (r1 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r1 != 3) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0060  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gl5.q.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(boolean z17) {
        if (z17 || !this.f273066o) {
            gl5.e0 e0Var = this.M;
            android.text.Layout layout = e0Var.U.getLayout();
            if (layout == null) {
                return;
            }
            int currentCursorOffset = getCurrentCursorOffset();
            boolean j17 = j(layout, currentCursorOffset);
            android.graphics.drawable.Drawable drawable = this.f273058d;
            android.graphics.drawable.Drawable drawable2 = j17 ? this.f273060f : this.f273059e;
            this.f273058d = drawable2;
            this.f273069r = g(drawable2, j17);
            this.f273070s = f(j17);
            if (drawable == this.f273058d || !k()) {
                return;
            }
            int d17 = ((d(layout, currentCursorOffset) - this.f273069r) - getHorizontalOffset()) + getCursorOffset();
            this.f273062h = d17;
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = e0Var.U;
            this.f273062h = d17 + (customTextView.getCompoundPaddingLeft() - customTextView.getScrollX());
            this.A = true;
            a(this.f273073v, this.f273074w, false, false);
            postInvalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gl5.q.q(android.view.MotionEvent):void");
    }

    public abstract void r(float f17, float f18, boolean z17);

    public abstract void s(int i17);

    public void setTargetWidth(int i17) {
    }
}
