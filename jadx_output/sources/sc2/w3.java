package sc2;

/* loaded from: classes2.dex */
public final class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.z3 f406333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406334f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406335g;

    public w3(android.view.View view, sc2.z3 z3Var, android.view.View view2, android.view.View view3) {
        this.f406332d = view;
        this.f406333e = z3Var;
        this.f406334f = view2;
        this.f406335g = view3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f406332d;
        if (view instanceof android.view.ViewGroup) {
            int childCount = ((android.view.ViewGroup) view).getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = ((android.view.ViewGroup) view).getChildAt(i17);
                if (childAt != null) {
                    childAt.animate().alpha(0.0f).setDuration(250L).start();
                }
            }
        }
        sc2.z3 z3Var = this.f406333e;
        android.view.View view2 = this.f406332d;
        android.view.View view3 = this.f406334f;
        ad2.h.F(z3Var, view2, view3, 250L, null, new sc2.v3(this.f406335g, view3, view2), 8, null);
    }
}
