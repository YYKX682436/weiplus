package ry2;

/* loaded from: classes8.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry2.q0 f401383d;

    public e0(ry2.q0 q0Var) {
        this.f401383d = q0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/widget/post/PostVideoWidget$initFakeVideoLogic$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ry2.q0 q0Var = this.f401383d;
        java.lang.String str = q0Var.C;
        q0Var.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.h70 h70Var = q0Var.B;
        if (h70Var != null) {
            linkedList.add(q0Var.t(h70Var));
        }
        q0Var.y(linkedList);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget$initFakeVideoLogic$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
