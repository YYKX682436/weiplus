package nh5;

/* loaded from: classes3.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nh5.c0 f337162d;

    public t(nh5.c0 c0Var) {
        this.f337162d = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/matrix/MatrixOpenGLLeakResultUI$ResultViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nh5.c0 c0Var = this.f337162d;
        if (c0Var.f337137n) {
            c0Var.i().setVisibility(8);
            c0Var.l().setVisibility(8);
            c0Var.j().setVisibility(8);
            c0Var.k().setVisibility(8);
        } else {
            c0Var.i().setVisibility(0);
            c0Var.l().setVisibility(0);
            c0Var.j().setVisibility(0);
            c0Var.k().setVisibility(0);
        }
        c0Var.f337137n = !c0Var.f337137n;
        yj0.a.h(this, "com/tencent/mm/ui/matrix/MatrixOpenGLLeakResultUI$ResultViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
