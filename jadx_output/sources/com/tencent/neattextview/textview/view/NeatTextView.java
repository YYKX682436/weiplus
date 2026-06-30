package com.tencent.neattextview.textview.view;

/* loaded from: classes15.dex */
public class NeatTextView extends android.view.View implements com.tencent.neattextview.textview.view.a {
    public static final android.util.LruCache K = new android.util.LruCache(800);
    public static final android.os.Handler L;
    public com.tencent.neattextview.textview.view.i A;
    public boolean B;
    public com.tencent.neattextview.textview.view.f C;
    public int D;
    public android.text.TextUtils.TruncateAt E;
    public float F;
    public boolean G;
    public com.tencent.neattextview.textview.view.g H;
    public float[] I;

    /* renamed from: J, reason: collision with root package name */
    public ks5.a f215176J;

    /* renamed from: d, reason: collision with root package name */
    public ks5.c f215177d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f215178e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f215179f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.neattextview.textview.view.e f215180g;

    /* renamed from: h, reason: collision with root package name */
    public android.text.TextPaint f215181h;

    /* renamed from: i, reason: collision with root package name */
    public android.content.res.ColorStateList f215182i;

    /* renamed from: m, reason: collision with root package name */
    public android.content.res.ColorStateList f215183m;

    /* renamed from: n, reason: collision with root package name */
    public android.content.res.ColorStateList f215184n;

    /* renamed from: o, reason: collision with root package name */
    public int f215185o;

    /* renamed from: p, reason: collision with root package name */
    public int f215186p;

    /* renamed from: q, reason: collision with root package name */
    public int f215187q;

    /* renamed from: r, reason: collision with root package name */
    public int f215188r;

    /* renamed from: s, reason: collision with root package name */
    public int f215189s;

    /* renamed from: t, reason: collision with root package name */
    public int f215190t;

    /* renamed from: u, reason: collision with root package name */
    public int f215191u;

    /* renamed from: v, reason: collision with root package name */
    public float f215192v;

    /* renamed from: w, reason: collision with root package name */
    public float f215193w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.CharSequence f215194x;

    /* renamed from: y, reason: collision with root package name */
    public final android.text.Spannable.Factory f215195y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.CharSequence f215196z;

    /* loaded from: classes15.dex */
    public static class AdaptedTextView extends androidx.appcompat.widget.AppCompatTextView {

        /* renamed from: g, reason: collision with root package name */
        public com.tencent.neattextview.textview.view.d f215197g;

        public AdaptedTextView(android.content.Context context) {
            super(context, null);
        }

        @Override // android.view.View
        public void invalidate() {
            super.invalidate();
            com.tencent.neattextview.textview.view.d dVar = this.f215197g;
            if (dVar != null) {
                ((com.tencent.neattextview.textview.view.b) dVar).f215198a.invalidate();
            }
        }

        @Override // android.view.View
        public void postInvalidate() {
            super.postInvalidate();
            com.tencent.neattextview.textview.view.d dVar = this.f215197g;
            if (dVar != null) {
                ((com.tencent.neattextview.textview.view.b) dVar).f215198a.postInvalidate();
            }
        }

        public AdaptedTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public AdaptedTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
            super(context, attributeSet, i17);
        }
    }

    static {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("PreMeasuredThread", -8);
        handlerThread.start();
        android.os.Looper looper = handlerThread.getLooper();
        if (looper != null) {
            L = new android.os.Handler(looper);
        }
    }

    public NeatTextView(android.content.Context context) {
        super(context);
        this.f215180g = new com.tencent.neattextview.textview.view.e(this, null);
        this.f215187q = Integer.MAX_VALUE;
        this.f215188r = Integer.MAX_VALUE;
        this.f215189s = Integer.MAX_VALUE;
        this.f215190t = 0;
        this.f215191u = 0;
        this.f215192v = 0.0f;
        this.f215193w = 1.0f;
        this.f215194x = "";
        android.widget.TextView.BufferType bufferType = android.widget.TextView.BufferType.NORMAL;
        this.f215195y = android.text.Spannable.Factory.getInstance();
        this.B = true;
        this.D = 8388659;
        this.G = true;
        g(context, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public android.text.Layout getWrappedTxtLayout() {
        android.widget.TextView wrappedTextView = getWrappedTextView();
        if (wrappedTextView != null) {
            return wrappedTextView.getLayout();
        }
        return null;
    }

    private void setRawTextSize(float f17) {
        if (f17 != this.f215181h.getTextSize()) {
            this.f215181h.setTextSize(f17);
            if (this.f215177d != null) {
                e();
                requestLayout();
                invalidate();
            }
        }
    }

    public java.lang.CharSequence a() {
        java.lang.CharSequence charSequence = this.f215194x;
        return charSequence == null ? "" : charSequence;
    }

    public void b(java.lang.CharSequence charSequence) {
        c(charSequence, android.widget.TextView.BufferType.NORMAL, null);
    }

    public void c(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType, java.lang.Boolean bool) {
        boolean z17;
        if (charSequence == null) {
            charSequence = "";
        }
        if (bufferType == android.widget.TextView.BufferType.NORMAL) {
            charSequence = android.text.TextUtils.stringOrSpannedString(charSequence);
        } else if (bufferType == android.widget.TextView.BufferType.SPANNABLE) {
            charSequence = this.f215195y.newSpannable(charSequence);
        }
        this.f215194x = charSequence;
        boolean z18 = true;
        if (h()) {
            if (bool != null) {
                z17 = bool.booleanValue();
            } else {
                java.lang.String charSequence2 = charSequence.toString();
                android.util.LruCache lruCache = K;
                com.tencent.neattextview.textview.view.h hVar = (com.tencent.neattextview.textview.view.h) lruCache.get(f(charSequence2));
                if (hVar == null) {
                    boolean z19 = !charSequence2.matches("^[\\u0001-\\u00b7\\u4E00-\\u9FA5\\ue001-\\ue537\\u2005-\\u2027\\u3001-\\u3011\\uff01-\\uffe5\\u2100-\\u2900[\\ud83c\\udc00-\\ud83c\\udfff]|[\\ud83d\\udc00-\\ud83d\\udfff]]+$");
                    lruCache.put(f(charSequence2), new com.tencent.neattextview.textview.view.h(z19, null));
                    z17 = z19;
                } else {
                    z17 = hVar.f215206a;
                }
            }
            if (!z17) {
                z18 = false;
            }
        }
        this.f215178e = z18;
        if (z18) {
            if (getLayoutParams() != null) {
                getWrappedTextView().setLayoutParams(getLayoutParams());
            }
            getWrappedTextView().setText(charSequence, bufferType);
            this.f215194x = getWrappedTextView().getText();
            requestLayout();
            invalidate();
        } else {
            e();
        }
        java.lang.CharSequence charSequence3 = this.f215194x;
        if (charSequence3 instanceof android.text.Spannable) {
            ((android.text.Spannable) charSequence3).setSpan(this.f215180g, 0, charSequence.length(), 18);
        }
    }

    public final void e() {
        java.lang.CharSequence charSequence;
        this.f215177d = null;
        android.os.Handler handler = L;
        if (handler != null) {
            java.lang.CharSequence charSequence2 = this.f215194x;
            if (charSequence2 == null && (charSequence = this.f215196z) != null) {
                com.tencent.neattextview.textview.view.g gVar = new com.tencent.neattextview.textview.view.g(charSequence.toString(), this.f215181h);
                this.H = gVar;
                handler.post(gVar);
            } else {
                if (charSequence2 == null) {
                    return;
                }
                com.tencent.neattextview.textview.view.g gVar2 = new com.tencent.neattextview.textview.view.g(charSequence2.toString(), this.f215181h);
                this.H = gVar2;
                handler.post(gVar2);
            }
        }
        requestLayout();
        invalidate();
    }

    public final java.lang.String f(java.lang.String str) {
        return str + "#" + this.f215181h.getTextSize();
    }

    /* JADX WARN: Finally extract failed */
    public final void g(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        int i18;
        this.A = new com.tencent.neattextview.textview.view.i(getContext(), this, new android.os.Handler(android.os.Looper.getMainLooper()));
        com.tencent.neattextview.textview.view.NeatTextView.AdaptedTextView adaptedTextView = new com.tencent.neattextview.textview.view.NeatTextView.AdaptedTextView(context);
        adaptedTextView.setClickable(true);
        adaptedTextView.setFocusable(true);
        adaptedTextView.f215197g = new com.tencent.neattextview.textview.view.b(this);
        this.f215179f = adaptedTextView;
        this.f215181h = getWrappedTextView().getPaint();
        boolean z17 = false;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hs5.a.f284635a, i17, 0);
        try {
            int indexCount = obtainStyledAttributes.getIndexCount();
            int i19 = -16777216;
            java.lang.String str = null;
            int i27 = 0;
            int i28 = -16777216;
            int i29 = -1;
            int i37 = 15;
            int i38 = -16776961;
            int i39 = -7829368;
            while (i27 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i27);
                if (index == 0) {
                    i37 = obtainStyledAttributes.getDimensionPixelSize(index, 15);
                } else if (index == 3) {
                    i28 = obtainStyledAttributes.getColor(index, i19);
                } else {
                    if (index == 23) {
                        setMaxLines(obtainStyledAttributes.getBoolean(index, z17) ? 1 : this.f215187q);
                    } else if (index == 20) {
                        setLines(obtainStyledAttributes.getInt(index, Integer.MAX_VALUE));
                    } else if (index == 7) {
                        setTextGravity(obtainStyledAttributes.getInt(index, 16));
                    } else if (index == 13) {
                        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(index, this.f215188r));
                    } else if (index == 24) {
                        setSpacingAdd(obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f215192v));
                    } else if (index == 25) {
                        k(obtainStyledAttributes.getDimensionPixelSize(index, 1), this.f215192v);
                    } else if (index == 15) {
                        setMinWidth(obtainStyledAttributes.getDimensionPixelSize(index, this.f215190t));
                    } else if (index == 16) {
                        setMinHeight(obtainStyledAttributes.getDimensionPixelSize(index, this.f215191u));
                    } else if (index == 14) {
                        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(index, this.f215189s));
                    } else if (index == 19) {
                        setMaxLines(obtainStyledAttributes.getInt(index, Integer.MAX_VALUE));
                    } else if (index == 17) {
                        str = obtainStyledAttributes.getString(index);
                    } else if (index == 22) {
                        setWidth(obtainStyledAttributes.getDimensionPixelSize(index, -1));
                    } else if (index == 21) {
                        setHeight(obtainStyledAttributes.getDimensionPixelSize(index, -1));
                    } else if (index == 18) {
                        setHint(obtainStyledAttributes.getText(index));
                    } else if (index == 4) {
                        i39 = obtainStyledAttributes.getColor(index, -7829368);
                    } else {
                        if (index == 5) {
                            i38 = obtainStyledAttributes.getColor(index, -16776961);
                        } else if (index == 6) {
                            i29 = obtainStyledAttributes.getInt(index, i29);
                        } else {
                            i18 = i29;
                            if (index == 27) {
                                this.G = obtainStyledAttributes.getBoolean(index, true);
                            }
                            i29 = i18;
                        }
                        i27++;
                        z17 = false;
                        i19 = -16777216;
                    }
                    i18 = i29;
                    i29 = i18;
                    i27++;
                    z17 = false;
                    i19 = -16777216;
                }
                i27++;
                z17 = false;
                i19 = -16777216;
            }
            int i47 = i29;
            obtainStyledAttributes.recycle();
            setTextColor(i28);
            setRawTextSize(i37);
            setLinkTextColor(i38);
            setHintTextColor(i39);
            if (i47 == 1) {
                setEllipsize(android.text.TextUtils.TruncateAt.START);
            } else if (i47 == 2) {
                setEllipsize(android.text.TextUtils.TruncateAt.MIDDLE);
            } else if (i47 == 3) {
                setEllipsize(android.text.TextUtils.TruncateAt.END);
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                b(str);
            }
            getWrappedTextView().setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        } catch (java.lang.Throwable th6) {
            obtainStyledAttributes.recycle();
            throw th6;
        }
    }

    public final int getCurrentHintTextColor() {
        return this.f215183m != null ? this.f215186p : this.f215185o;
    }

    public final int getCurrentTextColor() {
        return this.f215185o;
    }

    public float getExtraEllipsizeWidth() {
        return this.F;
    }

    public java.lang.CharSequence getHint() {
        return this.f215196z;
    }

    @Override // com.tencent.neattextview.textview.view.a
    public float getHorizontalOffset() {
        return ((this.D & 7) == 3 || this.f215177d == null) ? getPaddingLeft() : (getMeasuredWidth() - this.f215177d.t()[0]) / 2.0f;
    }

    @Override // com.tencent.neattextview.textview.view.a
    public ks5.a getLayout() {
        ks5.a aVar = this.f215176J;
        if (aVar != null) {
            return aVar;
        }
        com.tencent.neattextview.textview.view.c cVar = new com.tencent.neattextview.textview.view.c(this);
        this.f215176J = cVar;
        return cVar;
    }

    public int getLineCount() {
        ks5.c cVar = this.f215177d;
        if (cVar != null) {
            return cVar.f311814j.size();
        }
        return 0;
    }

    public int getLineHeight() {
        return java.lang.Math.round((this.f215181h.getFontMetricsInt(null) * this.f215193w) + this.f215192v);
    }

    public float getLineSpacingExtra() {
        return this.f215192v;
    }

    public float getLineSpacingMultiplier() {
        return this.f215193w;
    }

    public int getMaxHeight() {
        return this.f215189s;
    }

    public int getMaxLines() {
        return this.f215187q;
    }

    public int getMaxWidth() {
        return this.f215188r;
    }

    @Override // com.tencent.neattextview.textview.view.a
    public com.tencent.neattextview.textview.view.f getOnDoubleClickListener() {
        return this.C;
    }

    public android.text.TextPaint getPaint() {
        return this.f215181h;
    }

    public int getTextGravity() {
        return this.D;
    }

    public float getTextSize() {
        return getPaint().getTextSize();
    }

    public float getVerticalOffset() {
        return ((this.D & 112) == 48 || this.f215177d == null) ? getPaddingTop() : (getMeasuredHeight() - this.f215177d.t()[1]) / 2.0f;
    }

    public android.widget.TextView getWrappedTextView() {
        return this.f215179f;
    }

    public boolean h() {
        return this.B;
    }

    public ks5.a i(int i17, int i18) {
        if (android.text.TextUtils.isEmpty(this.f215194x)) {
            return null;
        }
        com.tencent.neattextview.textview.layout.NeatLayout neatLayout = new com.tencent.neattextview.textview.layout.NeatLayout(this.f215194x, null);
        neatLayout.r(getPaint(), i17, i18, getPaddingLeft(), getPaddingTop(), getLineHeight(), this.f215187q, this.E, this.F, this.G, this.D);
        return neatLayout;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
    }

    public void j(android.text.TextUtils.TruncateAt truncateAt, float f17) {
        this.F = f17;
        this.E = truncateAt;
        getWrappedTextView().setEllipsize(this.E);
        if (this.f215177d != null) {
            this.f215177d = null;
            requestLayout();
            invalidate();
        }
    }

    public void k(float f17, float f18) {
        this.f215192v = f17;
        this.f215193w = f18;
        getWrappedTextView().setLineSpacing(f17, f18);
        requestLayout();
        invalidate();
    }

    public void l(int i17, float f17) {
        android.content.Context context = getContext();
        setRawTextSize(android.util.TypedValue.applyDimension(i17, f17, (context == null ? android.content.res.Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r1.length() != 0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r6 = this;
            android.content.res.ColorStateList r0 = r6.f215182i
            int[] r1 = r6.getDrawableState()
            r2 = 0
            int r0 = r0.getColorForState(r1, r2)
            int r1 = r6.f215185o
            r3 = 1
            if (r0 == r1) goto L14
            r6.f215185o = r0
            r0 = r3
            goto L15
        L14:
            r0 = r2
        L15:
            android.content.res.ColorStateList r1 = r6.f215184n
            if (r1 == 0) goto L2a
            int[] r4 = r6.getDrawableState()
            int r1 = r1.getColorForState(r4, r2)
            android.text.TextPaint r4 = r6.f215181h
            int r5 = r4.linkColor
            if (r1 == r5) goto L2a
            r4.linkColor = r1
            r0 = r3
        L2a:
            android.content.res.ColorStateList r1 = r6.f215183m
            if (r1 == 0) goto L47
            int[] r4 = r6.getDrawableState()
            int r1 = r1.getColorForState(r4, r2)
            int r2 = r6.f215186p
            if (r1 == r2) goto L47
            r6.f215186p = r1
            java.lang.CharSequence r1 = r6.f215194x
            if (r1 == 0) goto L48
            int r1 = r1.length()
            if (r1 != 0) goto L47
            goto L48
        L47:
            r3 = r0
        L48:
            if (r3 == 0) goto L4d
            r6.invalidate()
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.neattextview.textview.view.NeatTextView.m():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0188, code lost:
    
        if (r2 != false) goto L55;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r31) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.neattextview.textview.view.NeatTextView.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0106  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r24, int r25) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.neattextview.textview.view.NeatTextView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.neattextview.textview.view.i iVar = this.A;
        if (iVar == null || !iVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public void postInvalidate() {
        super.postInvalidate();
    }

    public void setEllipsize(android.text.TextUtils.TruncateAt truncateAt) {
        if (this.E != truncateAt) {
            this.E = truncateAt;
            getWrappedTextView().setEllipsize(this.E);
            if (this.f215177d != null) {
                this.f215177d = null;
                requestLayout();
                invalidate();
            }
        }
    }

    public void setHeight(int i17) {
        this.f215189s = i17;
        getWrappedTextView().setMaxHeight(i17);
        requestLayout();
        invalidate();
    }

    public final void setHint(int i17) {
        setHint(getContext().getResources().getText(i17));
    }

    public final void setHintTextColor(int i17) {
        this.f215183m = android.content.res.ColorStateList.valueOf(i17);
        getWrappedTextView().setHintTextColor(i17);
        m();
    }

    public void setLineEndExtraWidths(float[] fArr) {
        this.I = fArr;
    }

    public void setLines(int i17) {
        this.f215187q = i17;
        getWrappedTextView().setLines(i17);
        requestLayout();
        invalidate();
    }

    public final void setLinkTextColor(int i17) {
        this.f215184n = android.content.res.ColorStateList.valueOf(i17);
        m();
    }

    public void setMaxHeight(int i17) {
        this.f215189s = i17;
        getWrappedTextView().setMaxHeight(i17);
        requestLayout();
        invalidate();
    }

    public void setMaxLines(int i17) {
        this.f215187q = i17;
        getWrappedTextView().setMaxLines(i17);
        requestLayout();
        invalidate();
    }

    public void setMaxWidth(int i17) {
        this.f215188r = i17;
        getWrappedTextView().setMaxWidth(i17);
        requestLayout();
        invalidate();
    }

    public void setMinHeight(int i17) {
        this.f215191u = i17;
        getWrappedTextView().setMinHeight(i17);
        requestLayout();
        invalidate();
    }

    public void setMinWidth(int i17) {
        this.f215190t = i17;
        getWrappedTextView().setMinWidth(i17);
        requestLayout();
        invalidate();
    }

    public void setNeatEnable(boolean z17) {
        this.B = z17;
    }

    public void setOnDoubleClickListener(com.tencent.neattextview.textview.view.f fVar) {
        this.C = fVar;
    }

    @Override // android.view.View
    public void setPadding(int i17, int i18, int i19, int i27) {
        if (i17 != getPaddingLeft() || i19 != getPaddingRight() || i18 != getPaddingTop() || i27 != getPaddingBottom()) {
            this.f215177d = null;
        }
        super.setPadding(i17, i18, i19, i27);
        getWrappedTextView().setPadding(i17, i18, i19, i27);
        invalidate();
    }

    public void setSmartLetterEnable(boolean z17) {
        this.G = z17;
    }

    public void setSpacingAdd(int i17) {
        float f17 = i17;
        this.f215192v = f17;
        getWrappedTextView().setLineSpacing(f17, this.f215193w);
        requestLayout();
        invalidate();
    }

    public void setTextColor(int i17) {
        this.f215182i = android.content.res.ColorStateList.valueOf(i17);
        getWrappedTextView().setTextColor(i17);
        m();
    }

    public void setTextGravity(int i17) {
        getWrappedTextView().setGravity(i17);
        if ((8388615 & i17) == 0) {
            i17 |= 8388611;
        }
        if ((i17 & 112) == 0) {
            i17 |= 48;
        }
        this.D = i17;
    }

    public void setTextSize(float f17) {
        l(2, f17);
    }

    public void setWidth(int i17) {
        this.f215188r = i17;
        getWrappedTextView().setMaxWidth(i17);
        requestLayout();
        invalidate();
    }

    public final void setHint(java.lang.CharSequence charSequence) {
        this.f215196z = android.text.TextUtils.stringOrSpannedString(charSequence);
        getWrappedTextView().setHint(this.f215196z);
        if (android.text.TextUtils.isEmpty(this.f215194x)) {
            e();
        }
    }

    public NeatTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f215180g = new com.tencent.neattextview.textview.view.e(this, null);
        this.f215187q = Integer.MAX_VALUE;
        this.f215188r = Integer.MAX_VALUE;
        this.f215189s = Integer.MAX_VALUE;
        this.f215190t = 0;
        this.f215191u = 0;
        this.f215192v = 0.0f;
        this.f215193w = 1.0f;
        this.f215194x = "";
        android.widget.TextView.BufferType bufferType = android.widget.TextView.BufferType.NORMAL;
        this.f215195y = android.text.Spannable.Factory.getInstance();
        this.B = true;
        this.D = 8388659;
        this.G = true;
        g(context, attributeSet, 0);
    }

    public NeatTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f215180g = new com.tencent.neattextview.textview.view.e(this, null);
        this.f215187q = Integer.MAX_VALUE;
        this.f215188r = Integer.MAX_VALUE;
        this.f215189s = Integer.MAX_VALUE;
        this.f215190t = 0;
        this.f215191u = 0;
        this.f215192v = 0.0f;
        this.f215193w = 1.0f;
        this.f215194x = "";
        android.widget.TextView.BufferType bufferType = android.widget.TextView.BufferType.NORMAL;
        this.f215195y = android.text.Spannable.Factory.getInstance();
        this.B = true;
        this.D = 8388659;
        this.G = true;
        g(context, attributeSet, i17);
    }
}
