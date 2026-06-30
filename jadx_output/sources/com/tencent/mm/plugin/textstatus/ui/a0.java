package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class a0 extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.LongTextView f173706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f173707e;

    public a0(com.tencent.mm.plugin.textstatus.ui.LongTextView longTextView, android.content.Context context) {
        this.f173706d = longTextView;
        this.f173707e = context;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/LongTextView$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/textstatus/ui/LongTextView$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/LongTextView$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mars.xlog.Log.i("LongTextView", "onDoubleTap: ");
        if (kotlin.jvm.internal.o.b(this.f173706d.c(), java.lang.Boolean.TRUE)) {
            qj4.s.m(qj4.s.f363958a, this.f173707e, 86L, null, null, 0L, 0L, 0L, 0L, null, null, 0L, 2044, null);
        }
        boolean onDoubleTap = super.onDoubleTap(e17);
        yj0.a.i(onDoubleTap, this, "com/tencent/mm/plugin/textstatus/ui/LongTextView$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/LongTextView$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/LongTextView$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent e17) {
        java.lang.Boolean valueOf;
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mars.xlog.Log.i("LongTextView", "onSingleTapUp: ");
        com.tencent.mm.plugin.textstatus.ui.LongTextView longTextView = this.f173706d;
        bk4.c2 textviewSuffixWrapper = longTextView.getTextviewSuffixWrapper();
        if (textviewSuffixWrapper != null && textviewSuffixWrapper.f21429t) {
            bk4.c2 textviewSuffixWrapper2 = longTextView.getTextviewSuffixWrapper();
            if (textviewSuffixWrapper2 != null) {
                textviewSuffixWrapper2.f21429t = false;
            }
        } else {
            bk4.c2 c2Var = longTextView.textviewSuffixWrapper;
            if (c2Var == null) {
                valueOf = null;
            } else {
                valueOf = java.lang.Boolean.valueOf(c2Var.f21423n);
            }
            boolean b17 = kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.TRUE);
            qj4.s sVar = qj4.s.f363958a;
            if (b17) {
                bk4.c2 c2Var2 = longTextView.textviewSuffixWrapper;
                if (c2Var2 != null) {
                    if (c2Var2.f21413d <= longTextView.maxLineCount) {
                        com.tencent.mars.xlog.Log.w("LongTextView", "textViewOnClick: can't click textview , fullTextLineCount:" + c2Var2.f21413d + "  maxLineCount:" + longTextView.maxLineCount);
                    } else if (longTextView.b(true)) {
                        android.content.Context context = longTextView.getContext();
                        kotlin.jvm.internal.o.f(context, "getContext(...)");
                        qj4.s.m(sVar, context, 82L, null, null, 0L, 0L, 0L, 0L, null, null, 0L, 2044, null);
                    }
                }
            } else {
                android.content.Context context2 = longTextView.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                qj4.s.m(sVar, context2, 84L, null, null, 0L, 0L, 0L, 0L, null, null, 0L, 2044, null);
                longTextView.a(true);
            }
        }
        return super.onSingleTapUp(e17);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/LongTextView$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        yj0.a.i(onSingleTapUp, this, "com/tencent/mm/plugin/textstatus/ui/LongTextView$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}
