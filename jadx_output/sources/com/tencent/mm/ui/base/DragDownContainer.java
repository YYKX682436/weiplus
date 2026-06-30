package com.tencent.mm.ui.base;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\nB\u001d\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/ui/base/DragDownContainer;", "Landroid/widget/FrameLayout;", "Landroid/view/View;", "d", "Landroid/view/View;", "getGalleryBg", "()Landroid/view/View;", "setGalleryBg", "(Landroid/view/View;)V", "galleryBg", "Ldb5/k;", "scaleListener", "Ldb5/k;", "getScaleListener", "()Ldb5/k;", "setScaleListener", "(Ldb5/k;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class DragDownContainer extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public android.view.View galleryBg;

    /* renamed from: e, reason: collision with root package name */
    public float f197236e;

    /* renamed from: f, reason: collision with root package name */
    public float f197237f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.VelocityTracker f197238g;

    /* renamed from: h, reason: collision with root package name */
    public float f197239h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.VelocityTracker f197240i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f197241m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f197242n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragDownContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        setOnTouchListener(new db5.l(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if ((r8 == 0.0f) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(float r7, float r8) {
        /*
            r6 = this;
            r0 = 1
            float r1 = (float) r0
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r2 = r8 / r2
            float r1 = r1 - r2
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 <= 0) goto L11
            r1 = r2
        L11:
            r2 = 0
            android.view.View r3 = r6.getChildAt(r2)
            if (r3 == 0) goto L5b
            r4 = 0
            int r5 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r5 != 0) goto L1f
            r5 = r0
            goto L20
        L1f:
            r5 = r2
        L20:
            if (r5 == 0) goto L2b
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 != 0) goto L27
            goto L28
        L27:
            r0 = r2
        L28:
            if (r0 == 0) goto L2b
            goto L3b
        L2b:
            float r0 = java.lang.Math.abs(r7)
            r2 = 1092616192(0x41200000, float:10.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L3b
            float r0 = java.lang.Math.abs(r8)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
        L3b:
            int r0 = r6.getWidth()
            int r0 = r0 / 2
            float r0 = (float) r0
            r3.setPivotX(r0)
            int r0 = r6.getHeight()
            int r0 = r0 / 2
            float r0 = (float) r0
            r3.setPivotY(r0)
            r3.setScaleX(r1)
            r3.setScaleY(r1)
            r3.setTranslationX(r7)
            r3.setTranslationY(r8)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.base.DragDownContainer.a(float, float):void");
    }

    public final android.view.View getGalleryBg() {
        return this.galleryBg;
    }

    public final db5.k getScaleListener() {
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        boolean z17 = true;
        if (super.onInterceptTouchEvent(ev6)) {
            return true;
        }
        android.view.VelocityTracker velocityTracker = this.f197238g;
        if (velocityTracker == null) {
            velocityTracker = android.view.VelocityTracker.obtain();
            this.f197238g = velocityTracker;
        }
        velocityTracker.addMovement(ev6);
        velocityTracker.computeCurrentVelocity(1000);
        int xVelocity = (int) velocityTracker.getXVelocity();
        int yVelocity = (int) velocityTracker.getYVelocity();
        int action = ev6.getAction() & 255;
        boolean z18 = false;
        if (action == 0) {
            this.f197239h = ev6.getRawX();
            ev6.getRawY();
        } else if (action != 1 && action == 2) {
            float rawX = ev6.getRawX() - this.f197239h;
            ev6.getRawY();
            if (java.lang.Math.abs(rawX) > 250.0f || java.lang.Math.abs(yVelocity) <= java.lang.Math.abs(xVelocity) || java.lang.Math.abs(yVelocity) <= 0) {
                z17 = false;
            } else {
                com.tencent.mars.xlog.Log.i("DragDownContainer", "onInterceptTouchEvent action: %d", java.lang.Integer.valueOf(ev6.getAction()));
            }
            z18 = z17;
        }
        if (z18) {
            this.f197236e = ev6.getRawX();
            this.f197237f = ev6.getRawY();
        }
        return z18;
    }

    public final void setGalleryBg(android.view.View view) {
        this.galleryBg = view;
    }

    public final void setScaleListener(db5.k kVar) {
    }
}
