package jz0;

/* loaded from: classes4.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz0.f0 f302571d;

    public e0(jz0.f0 f0Var) {
        this.f302571d = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_template/sns/backgroundwork/ui/MaasFakeVideoTitleBarUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jz0.f0 f0Var = this.f302571d;
        if (f0Var.f302574d) {
            androidx.appcompat.app.AppCompatActivity activity = f0Var.getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) activity).setTitleVisibility(f0Var.f302575e ? 8 : 0);
            f0Var.f302575e = !f0Var.f302575e;
        }
        yj0.a.h(this, "com/tencent/mm/mj_template/sns/backgroundwork/ui/MaasFakeVideoTitleBarUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
