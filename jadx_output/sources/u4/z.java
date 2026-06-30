package u4;

/* loaded from: classes11.dex */
public class z implements u4.b1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f424595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f424596e;

    public z(u4.c0 c0Var, android.view.View view, java.util.ArrayList arrayList) {
        this.f424595d = view;
        this.f424596e = arrayList;
    }

    @Override // u4.b1
    public void a(androidx.transition.Transition transition) {
    }

    @Override // u4.b1
    public void b(androidx.transition.Transition transition) {
    }

    @Override // u4.b1
    public void c(androidx.transition.Transition transition) {
    }

    @Override // u4.b1
    public void d(androidx.transition.Transition transition) {
        transition.E(this);
        android.view.View view = this.f424595d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "androidx/transition/FragmentTransitionSupport$2", "onTransitionEnd", "(Landroidx/transition/Transition;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "androidx/transition/FragmentTransitionSupport$2", "onTransitionEnd", "(Landroidx/transition/Transition;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList2 = this.f424596e;
        int size = arrayList2.size();
        for (int i17 = 0; i17 < size; i17++) {
            android.view.View view2 = (android.view.View) arrayList2.get(i17);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "androidx/transition/FragmentTransitionSupport$2", "onTransitionEnd", "(Landroidx/transition/Transition;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "androidx/transition/FragmentTransitionSupport$2", "onTransitionEnd", "(Landroidx/transition/Transition;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
