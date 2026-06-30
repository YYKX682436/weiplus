package sc2;

/* loaded from: classes2.dex */
public final class k5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406021f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(android.view.View view, android.view.View view2, android.view.View view3) {
        super(0);
        this.f406019d = view;
        this.f406020e = view2;
        this.f406021f = view3;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f406019d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver$expandAnimateViewChange$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver$expandAnimateViewChange$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f406019d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver$expandAnimateViewChange$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver$expandAnimateViewChange$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view3 = this.f406020e;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver$expandAnimateViewChange$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver$expandAnimateViewChange$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f406021f;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver$expandAnimateViewChange$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view4.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver$expandAnimateViewChange$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view5 = this.f406021f;
        view5.animate().cancel();
        view5.animate().alpha(1.0f).setDuration(100L).start();
        return jz5.f0.f302826a;
    }
}
