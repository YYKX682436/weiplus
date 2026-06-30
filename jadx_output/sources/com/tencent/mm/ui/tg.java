package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public final class tg extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f209901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ProfileDispatchTouchEventLayout f209902e;

    public tg(com.tencent.mm.ui.ProfileDispatchTouchEventLayout profileDispatchTouchEventLayout) {
        this.f209902e = profileDispatchTouchEventLayout;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/ProfileDispatchTouchEventLayout$ProfileGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/ui/ProfileDispatchTouchEventLayout$ProfileGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/ProfileDispatchTouchEventLayout$ProfileGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        java.lang.String str = this.f209902e.f197047d;
        yj0.a.i(true, this, "com/tencent/mm/ui/ProfileDispatchTouchEventLayout$ProfileGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        java.lang.String str = this.f209902e.f197047d;
        return super.onDoubleTapEvent(e17);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mm.ui.ProfileDispatchTouchEventLayout profileDispatchTouchEventLayout = this.f209902e;
        java.lang.String str = profileDispatchTouchEventLayout.f197047d;
        this.f209901d = false;
        profileDispatchTouchEventLayout.f197050g = 0.0f;
        profileDispatchTouchEventLayout.f197051h = 0.0f;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/ProfileDispatchTouchEventLayout$ProfileGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        android.view.View backPreviewContent = this.f209902e.getBackPreviewContent();
        if (backPreviewContent != null) {
            backPreviewContent.dispatchTouchEvent(e17);
        }
        yj0.a.h(this, "com/tencent/mm/ui/ProfileDispatchTouchEventLayout$ProfileGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        kotlin.jvm.internal.o.g(e27, "e2");
        com.tencent.mm.ui.ProfileDispatchTouchEventLayout profileDispatchTouchEventLayout = this.f209902e;
        float f19 = profileDispatchTouchEventLayout.f197051h + f17;
        profileDispatchTouchEventLayout.f197051h = f19;
        profileDispatchTouchEventLayout.f197050g += f18;
        this.f209901d = java.lang.Math.abs(f19) <= java.lang.Math.abs(profileDispatchTouchEventLayout.f197050g) && java.lang.Math.abs(profileDispatchTouchEventLayout.f197050g) > profileDispatchTouchEventLayout.f197048e;
        return this.f209901d || ((java.lang.Math.abs(profileDispatchTouchEventLayout.f197050g) > java.lang.Math.abs(profileDispatchTouchEventLayout.f197051h) ? 1 : (java.lang.Math.abs(profileDispatchTouchEventLayout.f197050g) == java.lang.Math.abs(profileDispatchTouchEventLayout.f197051h) ? 0 : -1)) <= 0 && (java.lang.Math.abs(profileDispatchTouchEventLayout.f197051h) > profileDispatchTouchEventLayout.f197049f ? 1 : (java.lang.Math.abs(profileDispatchTouchEventLayout.f197051h) == profileDispatchTouchEventLayout.f197049f ? 0 : -1)) > 0);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/ProfileDispatchTouchEventLayout$ProfileGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        java.lang.String str = this.f209902e.f197047d;
        yj0.a.i(true, this, "com/tencent/mm/ui/ProfileDispatchTouchEventLayout$ProfileGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return true;
    }
}
