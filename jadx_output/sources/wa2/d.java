package wa2;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f444106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f444107e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f444108f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f444109g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f444110h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.view.View view, android.view.View view2, android.content.Intent intent, android.view.View view3, android.app.Activity activity) {
        super(1);
        this.f444106d = view;
        this.f444107e = view2;
        this.f444108f = intent;
        this.f444109g = view3;
        this.f444110h = activity;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.animation.Animator it = (android.animation.Animator) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.view.View view = this.f444106d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$enterAnimation$1$2", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$enterAnimation$1$2", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f444107e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$enterAnimation$1$2", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$enterAnimation$1$2", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.content.Intent intent = this.f444108f;
        intent.removeExtra("key_intent_animating_flag");
        if (!intent.hasExtra("KEY_INTENT_ENTER_ITEM_ID")) {
            wa2.u uVar = wa2.u.f444181d;
            android.view.View view3 = this.f444109g;
            kotlin.jvm.internal.o.e(view3, "null cannot be cast to non-null type android.view.ViewGroup");
            intent.putExtra("KEY_INTENT_ENTER_ITEM_ID", uVar.Bi((android.view.ViewGroup) view3));
        }
        com.tencent.mm.autogen.events.ActivityToggleAnimEndEvent activityToggleAnimEndEvent = new com.tencent.mm.autogen.events.ActivityToggleAnimEndEvent();
        activityToggleAnimEndEvent.f53967g.f6715a = this.f444110h.hashCode();
        activityToggleAnimEndEvent.e();
        return jz5.f0.f302826a;
    }
}
