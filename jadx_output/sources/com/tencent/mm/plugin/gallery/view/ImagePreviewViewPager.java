package com.tencent.mm.plugin.gallery.view;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\f\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/plugin/gallery/view/ImagePreviewViewPager;", "Landroidx/viewpager/widget/ViewPager;", "Landroid/view/MotionEvent;", "e", "Ljz5/f0;", "handleSingleTap", "handleDoubleTap", "ev", "", "dispatchTouchEvent", "motionEvent", "onInterceptTouchEvent", "onTouchEvent", "Lk33/e;", "l", "setImagePreviewPageItemGestureListener", "", "TAG", "Ljava/lang/String;", "Landroid/view/GestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "onGestureEventListener", "Lk33/e;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ImagePreviewViewPager extends androidx.viewpager.widget.ViewPager {
    private final java.lang.String TAG;
    private byte _hellAccFlag_;
    private final android.view.GestureDetector gestureDetector;
    private k33.e onGestureEventListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ImagePreviewViewPager(android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleDoubleTap(android.view.MotionEvent motionEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSingleTap(android.view.MotionEvent motionEvent) {
        k33.e eVar = this.onGestureEventListener;
        if (eVar != null) {
            ((e33.f4) eVar).a(motionEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        android.view.GestureDetector gestureDetector = this.gestureDetector;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(ev6);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/gallery/view/ImagePreviewViewPager", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/gallery/view/ImagePreviewViewPager", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        ev6.getAction();
        return super.dispatchTouchEvent(ev6);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.TAG, e17, "onInterceptTouchEvent catch Exception", new java.lang.Object[0]);
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.TAG, e17, "onTouchEvent catch Exception", new java.lang.Object[0]);
            return false;
        }
    }

    public final void setImagePreviewPageItemGestureListener(k33.e eVar) {
        this.onGestureEventListener = eVar;
    }

    public /* synthetic */ ImagePreviewViewPager(android.content.Context context, android.util.AttributeSet attributeSet, int i17, kotlin.jvm.internal.i iVar) {
        this(context, (i17 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePreviewViewPager(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.TAG = "MicroMsg.ImagePreviewViewPager";
        this.gestureDetector = new android.view.GestureDetector(context, new k33.f(this));
    }
}
