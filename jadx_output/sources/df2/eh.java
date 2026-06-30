package df2;

/* loaded from: classes3.dex */
public final class eh implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f230060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.hh f230061e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f230062f;

    public eh(com.tencent.mm.view.MMPAGView mMPAGView, df2.hh hhVar, android.view.View view) {
        this.f230060d = mMPAGView;
        this.f230061e = hhVar;
        this.f230062f = view;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveDoubleClickLikeGuideController$showAnimGuide$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveDoubleClickLikeGuideController$showAnimGuide$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/LiveDoubleClickLikeGuideController$showAnimGuide$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.view.MMPAGView mMPAGView = this.f230060d;
        if (mMPAGView != null) {
            mMPAGView.h();
        }
        this.f230061e.f230330q = true;
        boolean z17 = this.f230062f.getVisibility() == 0;
        yj0.a.i(z17, this, "com/tencent/mm/plugin/finder/live/controller/LiveDoubleClickLikeGuideController$showAnimGuide$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
