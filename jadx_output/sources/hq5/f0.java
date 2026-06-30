package hq5;

/* loaded from: classes5.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq5.k0 f283229d;

    public f0(hq5.k0 k0Var) {
        this.f283229d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wedrop/ui/uic/ui/WeDropProgressUIC$onStateChange$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hq5.k0 k0Var = this.f283229d;
        com.tencent.mars.xlog.Log.i(k0Var.f283239d, "click guide btn");
        j75.f Q6 = k0Var.Q6();
        if (Q6 != null) {
            Q6.B3(new eq5.b());
        }
        yj0.a.h(this, "com/tencent/mm/wedrop/ui/uic/ui/WeDropProgressUIC$onStateChange$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
