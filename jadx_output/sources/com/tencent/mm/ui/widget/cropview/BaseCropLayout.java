package com.tencent.mm.ui.widget.cropview;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0001\u0011B\u001b\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eB#\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\u001d\u0010!R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lcom/tencent/mm/ui/widget/cropview/BaseCropLayout;", "Lcom/tencent/mm/ui/widget/cropview/TouchEventLayout;", "", "n", "Z", "isHasBorder", "()Z", "setHasBorder", "(Z)V", "Landroid/view/View;", "o", "Landroid/view/View;", "getBorderView", "()Landroid/view/View;", "setBorderView", "(Landroid/view/View;)V", "borderView", "Lml5/a;", "p", "Lml5/a;", "getOnBorderVisibilityCallback", "()Lml5/a;", "setOnBorderVisibilityCallback", "(Lml5/a;)V", "onBorderVisibilityCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public abstract class BaseCropLayout extends com.tencent.mm.ui.widget.cropview.TouchEventLayout {

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean isHasBorder;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public android.view.View borderView;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public ml5.a onBorderVisibilityCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCropLayout(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.isHasBorder = true;
        setOnTouchListener(this);
    }

    @Override // com.tencent.mm.ui.widget.cropview.TouchEventLayout
    public void c(android.view.MotionEvent e17) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator startDelay;
        com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout operationLayout;
        kotlin.jvm.internal.o.g(e17, "e1");
        boolean z17 = this.isHasBorder;
        if (z17 && z17) {
            ml5.a aVar = this.onBorderVisibilityCallback;
            if (aVar != null) {
                operationLayout = ((d33.z0) aVar).f226305a.getOperationLayout();
                com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout.d(operationLayout, 0, 0L, 2, null);
            }
            android.view.View view = this.borderView;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/widget/cropview/BaseCropLayout", "dismissBorder", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/ui/widget/cropview/BaseCropLayout", "dismissBorder", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            android.view.View view2 = this.borderView;
            if (view2 == null || (animate = view2.animate()) == null || (alpha = animate.alpha(0.0f)) == null || (duration = alpha.setDuration(300L)) == null || (startDelay = duration.setStartDelay(1000L)) == null) {
                return;
            }
            startDelay.start();
        }
    }

    public final android.view.View getBorderView() {
        return this.borderView;
    }

    public final ml5.a getOnBorderVisibilityCallback() {
        return this.onBorderVisibilityCallback;
    }

    @Override // com.tencent.mm.ui.widget.cropview.TouchEventLayout, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent e17) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator startDelay;
        com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout operationLayout;
        kotlin.jvm.internal.o.g(e17, "e");
        boolean z17 = this.isHasBorder;
        if (!z17 || !z17) {
            return true;
        }
        ml5.a aVar = this.onBorderVisibilityCallback;
        if (aVar != null) {
            operationLayout = ((d33.z0) aVar).f226305a.getOperationLayout();
            operationLayout.c(255, 0L);
        }
        android.view.View view = this.borderView;
        if (view == null || (animate = view.animate()) == null || (alpha = animate.alpha(1.0f)) == null || (duration = alpha.setDuration(300L)) == null || (startDelay = duration.setStartDelay(0L)) == null) {
            return true;
        }
        startDelay.start();
        return true;
    }

    public final void setBorderView(android.view.View view) {
        this.borderView = view;
    }

    public final void setHasBorder(boolean z17) {
        this.isHasBorder = z17;
    }

    public final void setOnBorderVisibilityCallback(ml5.a aVar) {
        this.onBorderVisibilityCallback = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCropLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.isHasBorder = true;
        setOnTouchListener(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCropLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.isHasBorder = true;
        setOnTouchListener(this);
    }
}
