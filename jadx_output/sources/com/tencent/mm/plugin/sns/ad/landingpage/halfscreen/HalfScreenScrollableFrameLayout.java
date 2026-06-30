package com.tencent.mm.plugin.sns.ad.landingpage.halfscreen;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fB#\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\u001e\u0010\"R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/landingpage/halfscreen/HalfScreenScrollableFrameLayout;", "Lcom/tencent/mm/plugin/sns/ad/landingpage/halfscreen/ScrollableFrameLayout;", "Ln54/q;", "y", "Ln54/q;", "getChildScrollableListener", "()Ln54/q;", "setChildScrollableListener", "(Ln54/q;)V", "childScrollableListener", "Ln54/s;", "z", "Ln54/s;", "getHalfScreenContainerDoGesture", "()Ln54/s;", "setHalfScreenContainerDoGesture", "(Ln54/s;)V", "halfScreenContainerDoGesture", "", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "F", "getContentViewHeight", "()F", "setContentViewHeight", "(F)V", "contentViewHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class HalfScreenScrollableFrameLayout extends com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout {

    /* renamed from: A, reason: from kotlin metadata */
    public float contentViewHeight;

    /* renamed from: x, reason: collision with root package name */
    public final int f163060x;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public n54.q childScrollableListener;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public n54.s halfScreenContainerDoGesture;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HalfScreenScrollableFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout
    public float d(n54.o animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcTranslationY", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        kotlin.jvm.internal.o.g(animation, "animation");
        int ordinal = animation.ordinal();
        float f17 = 0.0f;
        if (ordinal == 0) {
            float f18 = this.contentViewHeight;
            f17 = f18 <= 0.0f ? getHeight() : f18;
        } else if (ordinal == 1) {
            f17 = 0.0f - getSpaceHolderHeight();
        } else if (ordinal != 2) {
            if (ordinal != 3) {
                jz5.j jVar = new jz5.j();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcTranslationY", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
                throw jVar;
            }
            f17 = getKeyBoardShowToTopHeight();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcTranslationY", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        return f17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        if ((r4 != null && r4.b() == 5) != false) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout.g(android.view.MotionEvent):boolean");
    }

    public final n54.q getChildScrollableListener() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChildScrollableListener", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        n54.q qVar = this.childScrollableListener;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChildScrollableListener", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        return qVar;
    }

    public final float getContentViewHeight() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentViewHeight", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        float f17 = this.contentViewHeight;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentViewHeight", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        return f17;
    }

    public final n54.s getHalfScreenContainerDoGesture() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHalfScreenContainerDoGesture", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        n54.s sVar = this.halfScreenContainerDoGesture;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHalfScreenContainerDoGesture", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        return sVar;
    }

    @Override // com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout
    public boolean h(android.view.MotionEvent event) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchActionDown", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        kotlin.jvm.internal.o.g(event, "event");
        n54.s sVar = this.halfScreenContainerDoGesture;
        if (sVar != null) {
            ((y54.h) sVar).a(n54.p.f335150d);
        }
        super.h(event);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchActionDown", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout
    public boolean i(android.view.MotionEvent event) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchActionMove", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        kotlin.jvm.internal.o.g(event, "event");
        float rawY = event.getRawY() - getPointerY();
        event.getRawX();
        getPointerX();
        if (f() || java.lang.Math.abs(rawY) >= getTouchSlop()) {
            float initTranslationY = rawY + getInitTranslationY();
            if ((initTranslationY == 0.0f) || ((initTranslationY > 0.0f && java.lang.Math.abs(initTranslationY) < getHeight()) || (initTranslationY < 0.0f && java.lang.Math.abs(initTranslationY) < getSpaceHolderHeight()))) {
                setBeingDragged(true);
                n54.s sVar = this.halfScreenContainerDoGesture;
                if (sVar != null) {
                    ((y54.h) sVar).a(n54.p.f335151e);
                }
                getCanScrollToTop();
                if (getCanScrollToTop() || initTranslationY >= 0.0f) {
                    k(initTranslationY);
                } else if (!getCanScrollToTop() && initTranslationY < 0.0f) {
                    k(0.0f);
                }
            }
        }
        boolean f17 = f();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchActionMove", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        return f17;
    }

    @Override // com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout
    public boolean j(android.view.MotionEvent event) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchActionUpOrCancel", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("HalfScreenScrollableFrameLayout", "onTouchActionUpOrCancel is called!!!");
        n54.s sVar = this.halfScreenContainerDoGesture;
        if (sVar != null) {
            ((y54.h) sVar).a(n54.p.f335152f);
        }
        if (f()) {
            float translationY = getTranslationY();
            if (getHasArrivedTop()) {
                if (translationY >= 0.0f || java.lang.Math.abs(translationY) <= getSpaceHolderHeight() / 2) {
                    m();
                } else {
                    n();
                }
            } else if (translationY < 0.0f) {
                n();
            } else if (translationY <= this.f163060x) {
                k(0.0f);
            } else {
                m();
            }
        }
        setBeingDragged(false);
        setPointerX(0.0f);
        setPointerY(0.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchActionUpOrCancel", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        return false;
    }

    public final void setChildScrollableListener(n54.q qVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setChildScrollableListener", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        this.childScrollableListener = qVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setChildScrollableListener", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
    }

    public final void setContentViewHeight(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContentViewHeight", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        this.contentViewHeight = f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContentViewHeight", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
    }

    public final void setHalfScreenContainerDoGesture(n54.s sVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHalfScreenContainerDoGesture", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        this.halfScreenContainerDoGesture = sVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHalfScreenContainerDoGesture", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HalfScreenScrollableFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        kotlin.jvm.internal.o.g(context, "context");
        this.f163060x = i65.a.b(getContext(), 60);
    }
}
