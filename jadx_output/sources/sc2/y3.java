package sc2;

/* loaded from: classes2.dex */
public final class y3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ad2.h f406384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ad2.h f406385e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sc2.z3 f406386f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f406387g;

    public y3(ad2.h hVar, ad2.h hVar2, sc2.z3 z3Var, long j17) {
        this.f406384d = hVar;
        this.f406385e = hVar2;
        this.f406386f = z3Var;
        this.f406387g = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View findViewById;
        ad2.h hVar = this.f406384d;
        android.view.View view = hVar.f3143d;
        ad2.h hVar2 = this.f406385e;
        android.view.View view2 = hVar2.f3143d;
        sc2.z3 z3Var = this.f406386f;
        long j17 = this.f406387g;
        if (view == null || view2 == null) {
            return;
        }
        r45.wf6 wf6Var = hVar.f3149m;
        if (wf6Var != null && wf6Var.getInteger(2) == 0) {
            r45.wf6 wf6Var2 = hVar2.f3149m;
            if (wf6Var2 != null && wf6Var2.getInteger(2) == 5) {
                android.view.View view3 = hVar.f3143d;
                android.view.View view4 = hVar2.f3143d;
                if (view3 == null || view4 == null) {
                    return;
                }
                r45.wf6 wf6Var3 = hVar2.f3149m;
                z3Var.G(j17, wf6Var3 != null ? wf6Var3.getInteger(2) : -1);
                android.view.View findViewById2 = view3.findViewById(com.tencent.mm.R.id.h1u);
                if (findViewById2 == null || (findViewById = view4.findViewById(com.tencent.mm.R.id.h1u)) == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver", "handleExpand", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver", "handleExpand", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver", "handleExpand", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                findViewById.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver", "handleExpand", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                findViewById.post(new sc2.w3(findViewById2, z3Var, findViewById, view4));
                return;
            }
        }
        hVar.g(200L, view, true, new sc2.x3(z3Var, j17, hVar2, view2));
    }
}
