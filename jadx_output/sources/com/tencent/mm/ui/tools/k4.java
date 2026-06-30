package com.tencent.mm.ui.tools;

/* loaded from: classes8.dex */
public class k4 extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.s4 f210530d;

    public k4(com.tencent.mm.ui.tools.s4 s4Var) {
        this.f210530d = s4Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/ImagePreviewAnimation$9", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/ui/tools/ImagePreviewAnimation$9", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/ImagePreviewAnimation$9", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        yj0.a.i(onDoubleTap, this, "com/tencent/mm/ui/tools/ImagePreviewAnimation$9", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        ot0.m1 m1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/ImagePreviewAnimation$9", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        com.tencent.mm.ui.tools.s4 s4Var = this.f210530d;
        s4Var.E = true;
        com.tencent.mm.ui.tools.p4 p4Var = s4Var.G;
        if (p4Var != null) {
            com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView = ((com.tencent.mm.plugin.webview.ui.tools.media.v) p4Var).f185828a;
            if (!mPVideoPlayFullScreenView.getForbidForward() && (m1Var = mPVideoPlayFullScreenView.f185725x) != null) {
                com.tencent.mm.plugin.webview.ui.tools.media.v0 v0Var = com.tencent.mm.plugin.webview.ui.tools.media.v0.f185829a;
                android.content.Context context = mPVideoPlayFullScreenView.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                v0Var.a(context, m1Var, 3);
            }
        }
        super.onLongPress(motionEvent);
        yj0.a.h(this, "com/tencent/mm/ui/tools/ImagePreviewAnimation$9", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/ImagePreviewAnimation$9", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.ui.tools.r4 r4Var = this.f210530d.H;
        if (r4Var != null) {
            com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView = ((com.tencent.mm.plugin.webview.ui.tools.media.w) r4Var).f185830a;
            if (mPVideoPlayFullScreenView.f185709f.getVisibility() == 0) {
                mPVideoPlayFullScreenView.p();
            } else {
                com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView.c(mPVideoPlayFullScreenView);
            }
        }
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        yj0.a.i(onSingleTapUp, this, "com/tencent/mm/ui/tools/ImagePreviewAnimation$9", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}
