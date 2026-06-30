package com.tencent.mm.ui.widget.cropview;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u001b\b\u0016\u0012\u0006\u0010%\u001a\u00020$\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)B#\b\u0016\u0012\u0006\u0010%\u001a\u00020$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b(\u0010,R\"\u0010\t\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\"\u0010\u0011\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\"\u0010\u0014\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\"\u0010\u0017\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"¨\u0006-"}, d2 = {"Lcom/tencent/mm/ui/widget/cropview/TouchEventLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnTouchListener;", "Landroid/view/ScaleGestureDetector$OnScaleGestureListener;", "Landroid/view/GestureDetector$OnGestureListener;", "Landroid/view/GestureDetector$OnDoubleTapListener;", "", "d", "Z", "isEnableTouch", "()Z", "setEnableTouch", "(Z)V", "e", "isEnableScale", "setEnableScale", "f", "isEnableFling", "setEnableFling", "g", "isEnableOverScroll", "setEnableOverScroll", "h", "isEnableScroll", "setEnableScroll", "Landroid/view/ScaleGestureDetector;", "i", "Ljz5/g;", "getScaleDetector", "()Landroid/view/ScaleGestureDetector;", "scaleDetector", "Landroid/view/GestureDetector;", "m", "getTouchDetector", "()Landroid/view/GestureDetector;", "touchDetector", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class TouchEventLayout extends android.widget.FrameLayout implements android.view.View.OnTouchListener, android.view.ScaleGestureDetector.OnScaleGestureListener, android.view.GestureDetector.OnGestureListener, android.view.GestureDetector.OnDoubleTapListener {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean isEnableTouch;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isEnableScale;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean isEnableFling;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isEnableOverScroll;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean isEnableScroll;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final jz5.g scaleDetector;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final jz5.g touchDetector;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchEventLayout(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.isEnableTouch = true;
        this.isEnableScale = true;
        this.isEnableFling = true;
        this.isEnableOverScroll = true;
        this.isEnableScroll = true;
        this.scaleDetector = jz5.h.b(new ml5.j0(this));
        this.touchDetector = jz5.h.b(new ml5.k0(this));
    }

    private final android.view.ScaleGestureDetector getScaleDetector() {
        return (android.view.ScaleGestureDetector) this.scaleDetector.getValue();
    }

    public void c(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e1");
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i17) {
        return true;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i17) {
        return true;
    }

    public final android.view.GestureDetector getTouchDetector() {
        return (android.view.GestureDetector) this.touchDetector.getValue();
    }

    public boolean onDoubleTap(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/cropview/TouchEventLayout", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        yj0.a.i(true, this, "com/tencent/mm/ui/widget/cropview/TouchEventLayout", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        return true;
    }

    public boolean onDown(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        return true;
    }

    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        kotlin.jvm.internal.o.g(e27, "e2");
        return this.isEnableFling;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/cropview/TouchEventLayout", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        yj0.a.h(this, "com/tencent/mm/ui/widget/cropview/TouchEventLayout", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onScale(android.view.ScaleGestureDetector detector) {
        kotlin.jvm.internal.o.g(detector, "detector");
        return this.isEnableScale;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(android.view.ScaleGestureDetector detector) {
        kotlin.jvm.internal.o.g(detector, "detector");
        return this.isEnableScale;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(android.view.ScaleGestureDetector detector) {
        kotlin.jvm.internal.o.g(detector, "detector");
    }

    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        kotlin.jvm.internal.o.g(e27, "e2");
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        return true;
    }

    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/cropview/TouchEventLayout", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        yj0.a.i(true, this, "com/tencent/mm/ui/widget/cropview/TouchEventLayout", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    public boolean onTouch(android.view.View v17, android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(event, "event");
        if (!this.isEnableTouch) {
            return false;
        }
        if (this.isEnableScale) {
            getScaleDetector().onTouchEvent(event);
        }
        android.view.GestureDetector touchDetector = getTouchDetector();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(event);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(touchDetector, arrayList.toArray(), "com/tencent/mm/ui/widget/cropview/TouchEventLayout", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(touchDetector, touchDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/ui/widget/cropview/TouchEventLayout", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (event.getAction() == 3 || event.getAction() == 1) {
            c(event);
        }
        return true;
    }

    public void setEnableFling(boolean z17) {
        this.isEnableFling = z17;
    }

    public void setEnableOverScroll(boolean z17) {
        this.isEnableOverScroll = z17;
    }

    public void setEnableScale(boolean z17) {
        this.isEnableScale = z17;
    }

    public void setEnableScroll(boolean z17) {
        this.isEnableScroll = z17;
    }

    public void setEnableTouch(boolean z17) {
        this.isEnableTouch = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchEventLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.isEnableTouch = true;
        this.isEnableScale = true;
        this.isEnableFling = true;
        this.isEnableOverScroll = true;
        this.isEnableScroll = true;
        this.scaleDetector = jz5.h.b(new ml5.j0(this));
        this.touchDetector = jz5.h.b(new ml5.k0(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchEventLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.isEnableTouch = true;
        this.isEnableScale = true;
        this.isEnableFling = true;
        this.isEnableOverScroll = true;
        this.isEnableScroll = true;
        this.scaleDetector = jz5.h.b(new ml5.j0(this));
        this.touchDetector = jz5.h.b(new ml5.k0(this));
    }
}
