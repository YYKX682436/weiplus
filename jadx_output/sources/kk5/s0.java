package kk5;

/* loaded from: classes.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.v0 f308682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f308683e;

    public s0(kk5.v0 v0Var, wi5.n0 n0Var) {
        this.f308682d = v0Var;
        this.f308683e = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/uic/SelectMassSendContactUIC$onCreate$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rd0.g1 g1Var = (rd0.g1) i95.n0.c(rd0.g1.class);
        kk5.v0 v0Var = this.f308682d;
        androidx.appcompat.app.AppCompatActivity activity = v0Var.getActivity();
        androidx.appcompat.app.AppCompatActivity activity2 = v0Var.getActivity();
        wi5.n0 n0Var = this.f308683e;
        java.lang.String string = activity2.getString(com.tencent.mm.R.string.m67, java.lang.Integer.valueOf(n0Var.f446319o.size()));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.content.Intent Ai = ((qd0.u0) g1Var).Ai(activity, string, n0Var.f446319o);
        pf5.j0.a(Ai, kk5.v0.class);
        bh5.c cVar = new bh5.c();
        cVar.f20922a.f20924a = v0Var.getActivity();
        cVar.d(Ai);
        cVar.a("com.tencent.mm.ui.mvvm.MvvmContactListUI");
        cVar.h(7);
        yj0.a.h(this, "com/tencent/mm/ui/uic/SelectMassSendContactUIC$onCreate$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
