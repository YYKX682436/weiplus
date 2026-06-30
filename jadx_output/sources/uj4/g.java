package uj4;

/* loaded from: classes11.dex */
public final class g extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC f428433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f428434e;

    public g(com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC textStatusCardFeedUIC, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        this.f428433d = textStatusCardFeedUIC;
        this.f428434e = appCompatActivity;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent e17) {
        cj4.l1 l1Var;
        in5.s0 s0Var;
        in5.s0 s0Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC textStatusCardFeedUIC = this.f428433d;
        java.lang.ref.WeakReference weakReference = textStatusCardFeedUIC.f173783q;
        android.view.View view = (weakReference == null || (s0Var2 = (in5.s0) weakReference.get()) == null) ? null : s0Var2.itemView;
        android.widget.RelativeLayout relativeLayout = view instanceof android.widget.RelativeLayout ? (android.widget.RelativeLayout) view : null;
        if (relativeLayout != null) {
            androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f428434e;
            com.tencent.mm.view.MMPAGView mMPAGView = new com.tencent.mm.view.MMPAGView(appCompatActivity);
            int dimension = (int) appCompatActivity.getResources().getDimension(com.tencent.mm.R.dimen.f479683ci);
            relativeLayout.addView(mMPAGView);
            int i17 = dimension / 2;
            textStatusCardFeedUIC.T6(relativeLayout, ((int) e17.getX()) - i17, ((int) e17.getY()) - i17, true);
            java.lang.ref.WeakReference weakReference2 = textStatusCardFeedUIC.f173783q;
            java.lang.Object obj = (weakReference2 == null || (s0Var = (in5.s0) weakReference2.get()) == null) ? null : s0Var.f293124h;
            com.tencent.mm.plugin.textstatus.ui.q3 q3Var = obj instanceof com.tencent.mm.plugin.textstatus.ui.q3 ? (com.tencent.mm.plugin.textstatus.ui.q3) obj : null;
            if (q3Var != null && (l1Var = q3Var.C) != null) {
                l1Var.k(true, true);
            }
        }
        boolean onDoubleTap = super.onDoubleTap(e17);
        yj0.a.i(onDoubleTap, this, "com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent e17) {
        in5.s0 s0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        super.onLongPress(e17);
        java.lang.ref.WeakReference weakReference = this.f428433d.f173783q;
        java.lang.Object obj = (weakReference == null || (s0Var = (in5.s0) weakReference.get()) == null) ? null : s0Var.f293124h;
        com.tencent.mm.plugin.textstatus.ui.q3 q3Var = obj instanceof com.tencent.mm.plugin.textstatus.ui.q3 ? (com.tencent.mm.plugin.textstatus.ui.q3) obj : null;
        if (q3Var != null) {
            q3Var.A();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        yj0.a.i(onSingleTapUp, this, "com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}
