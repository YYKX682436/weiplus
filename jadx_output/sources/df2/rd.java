package df2;

/* loaded from: classes3.dex */
public final class rd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ud f231244d;

    public rd(df2.ud udVar) {
        this.f231244d = udVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBubbleController$initView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.ud udVar = this.f231244d;
        java.lang.Integer num = udVar.f231518u;
        if (num != null) {
            r45.d62 a17 = r45.d62.a(num.intValue());
            kotlin.jvm.internal.o.f(a17, "forNumber(...)");
            android.view.View Z6 = udVar.Z6(a17);
            if (Z6 != null && Z6.hasOnClickListeners()) {
                Z6.performClick();
            } else {
                java.lang.Object parent = Z6 != null ? Z6.getParent() : null;
                android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
                if (view2 != null && view2.hasOnClickListeners()) {
                    java.lang.Object parent2 = Z6.getParent();
                    android.view.View view3 = parent2 instanceof android.view.View ? (android.view.View) parent2 : null;
                    if (view3 != null) {
                        view3.performClick();
                    }
                }
            }
        }
        df2.od.f230952w.a(udVar.getStore().getLiveRoomData(), 2, 6, udVar.f231519v, udVar.f231518u);
        android.view.View view4 = udVar.f231512o;
        if (view4 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBubbleController$initView$2$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBubbleController$initView$2$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBubbleController$initView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
