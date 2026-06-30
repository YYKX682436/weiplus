package kf3;

/* loaded from: classes5.dex */
public class y implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kf3.j0 f307462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kf3.k0 f307463e;

    public y(kf3.k0 k0Var, kf3.j0 j0Var) {
        this.f307463e = k0Var;
        this.f307462d = j0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        kf3.j0 j0Var = this.f307462d;
        j0Var.f307365c.setBackgroundColor(view.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_1));
        kf3.k0 k0Var = this.f307463e;
        k0Var.getClass();
        if (j0Var.f307372j == null) {
            j0Var.f307372j = new rl5.r(k0Var.f307381t, j0Var.f307365c);
        }
        rl5.r rVar = j0Var.f307372j;
        rVar.C = true;
        rVar.f397355y = new kf3.v(k0Var);
        rVar.f397354x = new kf3.w(k0Var, j0Var);
        rVar.L = new kf3.x(k0Var, j0Var);
        int[] iArr = new int[2];
        j0Var.f307365c.getLocationInWindow(iArr);
        int i17 = iArr[0];
        j0Var.f307372j.n((i17 + j0Var.f307365c.getWidth()) / 2, iArr[1]);
        yj0.a.i(true, this, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
