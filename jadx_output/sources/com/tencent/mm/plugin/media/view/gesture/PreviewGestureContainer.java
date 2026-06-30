package com.tencent.mm.plugin.media.view.gesture;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010,\u001a\u00020+\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\b\b\u0002\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016R\u001a\u0010\u000f\u001a\u00020\u00038\u0014X\u0094D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00038\u0014X\u0094D¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u00063"}, d2 = {"Lcom/tencent/mm/plugin/media/view/gesture/PreviewGestureContainer;", "Lcom/tencent/mm/ui/widget/cropview/CropLayout;", "Lmg3/b;", "", "isLongVertical", "Ljz5/f0;", "setLongVertical", "", "getCurrentScaleRatio", "getMinScaleRatio", "getMaxScaleRatio", "p1", "Z", "getContentIsChild", "()Z", "contentIsChild", "x1", "getOnlyNotifyCallbackWhenUserTouch", "onlyNotifyCallbackWhenUserTouch", "Lmg3/d;", "y1", "Lmg3/d;", "getGestureListener", "()Lmg3/d;", "setGestureListener", "(Lmg3/d;)V", "gestureListener", "Lmg3/l;", "z1", "Lmg3/l;", "getScaleConfig", "()Lmg3/l;", "setScaleConfig", "(Lmg3/l;)V", "scaleConfig", "Lmg3/f;", "A1", "Lmg3/f;", "getOnScaleChangedListener", "()Lmg3/f;", "setOnScaleChangedListener", "(Lmg3/f;)V", "onScaleChangedListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class PreviewGestureContainer extends com.tencent.mm.ui.widget.cropview.CropLayout implements mg3.b {
    public static final /* synthetic */ int E1 = 0;

    /* renamed from: A1, reason: from kotlin metadata */
    public mg3.f onScaleChangedListener;
    public float B1;
    public boolean C1;
    public final mg3.c D1;

    /* renamed from: p1, reason: collision with root package name and from kotlin metadata */
    public final boolean contentIsChild;

    /* renamed from: x1, reason: collision with root package name and from kotlin metadata */
    public final boolean onlyNotifyCallbackWhenUserTouch;

    /* renamed from: y1, reason: collision with root package name and from kotlin metadata */
    public mg3.d gestureListener;

    /* renamed from: z1, reason: collision with root package name and from kotlin metadata */
    public mg3.l scaleConfig;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreviewGestureContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.ui.widget.cropview.CropLayout
    public void H(android.animation.Animator.AnimatorListener animatorListener) {
        android.animation.Animator flingAnimator = getFlingAnimator();
        if (flingAnimator != null && flingAnimator.isRunning()) {
            android.animation.Animator flingAnimator2 = getFlingAnimator();
            if (flingAnimator2 != null) {
                flingAnimator2.cancel();
            }
            super.H(animatorListener);
            return;
        }
        android.animation.Animator edgeAnimation = getEdgeAnimation();
        if (edgeAnimation != null && edgeAnimation.isRunning()) {
            return;
        }
        super.H(animatorListener);
    }

    @Override // com.tencent.mm.ui.widget.cropview.CropLayout
    public void L(float f17, float f18, float f19) {
        mg3.f fVar;
        sy3.b bVar;
        float currentScaleRatio = getCurrentScaleRatio();
        super.L(f17, f18, f19);
        float currentScaleRatio2 = getCurrentScaleRatio();
        if ((currentScaleRatio2 == currentScaleRatio) || (fVar = this.onScaleChangedListener) == null || (bVar = ((vh5.h) fVar).f437217a) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageOCRZoomHelper", "alvinluo gesture ScaleChanged, oldScale " + currentScaleRatio + ", newScale: " + currentScaleRatio2);
        double d17 = (double) currentScaleRatio2;
        kz3.w wVar = ((kz3.t) bVar).f313928a;
        if (d17 >= 1.1d) {
            wVar.b(2);
        } else {
            wVar.b(1);
        }
    }

    public boolean N() {
        float f17;
        float f18 = getContentRectF().top;
        if (getViewScale() >= 1.0d) {
            f17 = (float) (((getContentRectF().top + getContentRectF().bottom) * 0.5d) - ((getContentRectF().height() / getViewScale()) * 0.5d));
        } else {
            android.graphics.RectF P = P();
            if (P == null) {
                return false;
            }
            f17 = P.top;
        }
        return getVisibilityRect().top < f17 || java.lang.Math.abs(getVisibilityRect().top - f17) <= this.B1;
    }

    public final void O(android.view.View container, float f17, float f18, boolean z17) {
        kotlin.jvm.internal.o.g(container, "container");
        if (!z17 && kotlin.jvm.internal.o.b(container, getContentView())) {
            if (f17 == getViewWidthScale()) {
                if (f18 == getViewScale()) {
                    return;
                }
            }
        }
        setViewWidthScale(f17);
        setViewScale(f18);
        F();
        setMinScaleFactor(1.0f);
        mg3.l lVar = this.scaleConfig;
        if (lVar != null) {
            setMinScaleValue(lVar.f326244b);
            setMaxScaleValue(lVar.f326245c);
        }
        this.B1 = 0.0f;
        android.view.View contentView = getContentView();
        if (contentView != null) {
            contentView.setScaleX(1.0f);
            contentView.setScaleY(1.0f);
            contentView.setTranslationX(0.0f);
            contentView.setTranslationY(0.0f);
        }
        if (getChildCount() != 1 || !kotlin.jvm.internal.o.b(container, getChildAt(0))) {
            throw new java.lang.RuntimeException("container must be the only child of PreviewGestureContainer");
        }
        G(container, container.getWidth(), container.getHeight(), new android.graphics.Matrix(), ml5.k.f328431e, new mg3.g(this));
    }

    public final android.graphics.RectF P() {
        android.graphics.PointF translationValues;
        android.view.KeyEvent.Callback contentView = getContentView();
        rf3.g gVar = contentView instanceof rf3.g ? (rf3.g) contentView : null;
        if (gVar == null || (translationValues = gVar.getTranslationValues()) == null) {
            return null;
        }
        float f17 = getContentViewScale()[0];
        android.graphics.Matrix matrix = new android.graphics.Matrix(getMainMatrix());
        matrix.postTranslate(translationValues.x * f17, translationValues.y * f17);
        android.graphics.RectF rectF = new android.graphics.RectF();
        rectF.set(getContentBaseRect());
        matrix.mapRect(rectF);
        rectF.bottom = rectF.top + (rectF.height() / getViewScale());
        return rectF;
    }

    public final boolean Q(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        android.graphics.PointF translationValues;
        android.view.KeyEvent.Callback contentView = getContentView();
        rf3.g gVar = contentView instanceof rf3.g ? (rf3.g) contentView : null;
        if (gVar == null || (translationValues = gVar.getTranslationValues()) == null) {
            return false;
        }
        float f19 = getContentViewScale()[0] / 1;
        android.graphics.Matrix matrix = new android.graphics.Matrix(getMainMatrix());
        android.graphics.Matrix matrix2 = new android.graphics.Matrix(getMainMatrix());
        float f27 = translationValues.x * f19;
        float f28 = translationValues.y * f19;
        matrix.postTranslate(f27, f28);
        matrix2.postTranslate(f27, f28);
        float f29 = -f18;
        matrix.postTranslate(-f17, f29);
        android.graphics.RectF rectF = new android.graphics.RectF(getContentBaseRect());
        matrix.mapRect(rectF);
        android.graphics.RectF rectF2 = new android.graphics.RectF(getContentBaseRect());
        matrix2.mapRect(rectF2);
        float f37 = rectF.top;
        float height = (rectF.height() / getViewScale()) + f37;
        java.util.Objects.toString(getVisibilityRect());
        rectF2.toString();
        rectF.toString();
        float f38 = f29 / f19;
        if (getVisibilityRect().top < f37 && f18 < 0.0f) {
            this.B1 = java.lang.Math.abs(getVisibilityRect().top - rectF2.top);
            f38 = 0.0f;
        }
        if (getVisibilityRect().bottom > height && f18 > 0.0f) {
            f38 = 0.0f;
        }
        gVar.a(0.0f, f38);
        super.onScroll(motionEvent, motionEvent2, f17, 0.0f);
        return true;
    }

    @Override // com.tencent.mm.ui.widget.cropview.CropLayout
    public boolean getContentIsChild() {
        return this.contentIsChild;
    }

    @Override // mg3.b
    public float getCurrentScaleRatio() {
        return getContentViewScale()[0];
    }

    public mg3.d getGestureListener() {
        return this.gestureListener;
    }

    public float getMaxScaleRatio() {
        return getMaxScaleValue();
    }

    @Override // mg3.b
    public float getMinScaleRatio() {
        return getMinScaleValue();
    }

    public final mg3.f getOnScaleChangedListener() {
        return this.onScaleChangedListener;
    }

    @Override // com.tencent.mm.ui.widget.cropview.CropLayout
    public boolean getOnlyNotifyCallbackWhenUserTouch() {
        return this.onlyNotifyCallbackWhenUserTouch;
    }

    public final mg3.l getScaleConfig() {
        return this.scaleConfig;
    }

    @Override // com.tencent.mm.ui.widget.cropview.TouchEventLayout, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        float b17 = db5.s.b(e17, 0);
        float c17 = db5.s.c(e17, 0);
        mg3.l lVar = this.scaleConfig;
        setMaxScaleValue(lVar != null ? lVar.f326245c : 5.0f);
        float f17 = getContentViewScale()[0];
        mg3.l lVar2 = this.scaleConfig;
        float f18 = lVar2 != null ? lVar2.f326246d : 2.0f;
        if (f17 > 1.0f) {
            com.tencent.mm.ui.widget.cropview.CropLayout.K(this, null, null, 3, null);
            android.view.KeyEvent.Callback contentView = getContentView();
            rf3.g gVar = contentView instanceof rf3.g ? (rf3.g) contentView : null;
            if (gVar == null) {
                return true;
            }
            gVar.c(getCurrentScaleRatio());
            return true;
        }
        kotlin.jvm.internal.e0 e0Var = new kotlin.jvm.internal.e0();
        e0Var.f310115d = b17;
        kotlin.jvm.internal.e0 e0Var2 = new kotlin.jvm.internal.e0();
        e0Var2.f310115d = c17;
        if (getViewScale() >= 1.0d) {
            android.graphics.RectF rectF = new android.graphics.RectF();
            rectF.top = ((getContentRect().top + getContentRect().bottom) * 0.5f) - ((getContentRect().height() / getViewScale()) * 0.5f);
            rectF.bottom = ((getContentRect().top + getContentRect().bottom) * 0.5f) + ((getContentRect().height() / getViewScale()) * 0.5f);
            rectF.left = ((getContentRect().left + getContentRect().right) * 0.5f) - ((getContentRect().width() / getViewWidthScale()) * 0.5f);
            rectF.right = ((getContentRect().left + getContentRect().right) * 0.5f) + ((getContentRect().width() / getViewWidthScale()) * 0.5f);
            if (!rectF.isEmpty() && !rectF.contains(b17, c17)) {
                float f19 = rectF.top;
                if (c17 < f19 || c17 > rectF.bottom) {
                    e0Var2.f310115d = (f19 + rectF.bottom) / 2;
                } else {
                    float f27 = rectF.left;
                    if (b17 < f27 || b17 > rectF.right) {
                        e0Var.f310115d = (f27 + rectF.right) / 2;
                    }
                }
            }
        }
        java.util.Objects.toString(getContentRectF());
        if (!getContentRectF().isEmpty()) {
            D(f18, getContentViewScale()[0], e0Var.f310115d, e0Var2.f310115d, null);
            return true;
        }
        requestLayout();
        post(new mg3.i(this, f18, e0Var, e0Var2, null));
        return true;
    }

    @Override // com.tencent.mm.ui.widget.cropview.CropLayout, com.tencent.mm.ui.widget.cropview.TouchEventLayout, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        android.graphics.RectF P;
        kotlin.jvm.internal.o.g(e27, "e2");
        android.animation.Animator edgeAnimation = getEdgeAnimation();
        if (edgeAnimation != null && edgeAnimation.isRunning()) {
            return false;
        }
        if (!this.C1) {
            return super.onFling(motionEvent, e27, f17, f18);
        }
        if (this.isEnableFling) {
            float f19 = f17 * 0.5f;
            float f27 = f18 * 0.5f;
            if (!getHasMorePoint() && (java.lang.Math.abs(f19) >= 1000.0f || java.lang.Math.abs(f27) >= 1000.0f)) {
                boolean t17 = t();
                boolean u17 = u();
                v();
                x();
                if ((!t17 || !u17) && (P = P()) != null) {
                    if ((P.left >= getVisibilityRect().left && f19 > 0.0f) || (P.right <= getVisibilityRect().right && f19 < 0.0f)) {
                        if (getScaleType() != ml5.k.f328430d && getScaleType() != ml5.k.f328432f) {
                            f19 = 0.0f;
                        }
                    }
                    if ((P.top >= getVisibilityRect().top && f27 > 0.0f) || (P.bottom <= getVisibilityRect().bottom && f27 < 0.0f)) {
                        if (getScaleType() != ml5.k.f328430d && getScaleType() != ml5.k.f328432f) {
                            f27 = 0.0f;
                        }
                    }
                    android.animation.Animator flingAnimator = getFlingAnimator();
                    if (flingAnimator != null) {
                        flingAnimator.cancel();
                    }
                    float[] fArr = {0.0f, 0.0f};
                    android.graphics.RectF P2 = P();
                    if (P2 != null) {
                        float f28 = P2.left;
                        float f29 = P2.right - getVisibilityRect().right;
                        float f37 = getVisibilityRect().left - f28;
                        if (f19 < 0.0f) {
                            fArr[0] = -java.lang.Math.min(java.lang.Math.abs(f19), java.lang.Math.abs(f29));
                        } else {
                            fArr[0] = java.lang.Math.min(java.lang.Math.abs(f19), java.lang.Math.abs(f37));
                        }
                        float f38 = P2.top;
                        float f39 = P2.bottom - getVisibilityRect().bottom;
                        float f47 = getVisibilityRect().top - f38;
                        if (f27 < 0.0f) {
                            fArr[1] = -java.lang.Math.min(java.lang.Math.abs(f27), java.lang.Math.abs(f39));
                        } else {
                            fArr[1] = java.lang.Math.min(java.lang.Math.abs(f27), java.lang.Math.abs(f47));
                        }
                    }
                    android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofFloat("transX", 0.0f, fArr[0]), android.animation.PropertyValuesHolder.ofFloat("transY", 0.0f, fArr[1]));
                    ofPropertyValuesHolder.addUpdateListener(new mg3.j(this, motionEvent, e27));
                    ofPropertyValuesHolder.addListener(new mg3.k(this));
                    ofPropertyValuesHolder.setInterpolator(new android.view.animation.DecelerateInterpolator());
                    ofPropertyValuesHolder.setDuration(400L);
                    ofPropertyValuesHolder.start();
                    setFlingAnimator(ofPropertyValuesHolder);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ef  */
    @Override // com.tencent.mm.ui.widget.cropview.CropLayout, com.tencent.mm.ui.widget.cropview.TouchEventLayout, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onScroll(android.view.MotionEvent r17, android.view.MotionEvent r18, float r19, float r20) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    public void setGestureListener(mg3.d dVar) {
        this.gestureListener = dVar;
    }

    public final void setLongVertical(boolean z17) {
        this.C1 = z17;
    }

    public final void setOnScaleChangedListener(mg3.f fVar) {
        this.onScaleChangedListener = fVar;
    }

    public final void setScaleConfig(mg3.l lVar) {
        this.scaleConfig = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewGestureContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.contentIsChild = true;
        this.onlyNotifyCallbackWhenUserTouch = true;
        this.B1 = 5.0f;
        this.D1 = new mg3.h(this);
    }
}
