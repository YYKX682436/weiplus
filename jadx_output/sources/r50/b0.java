package r50;

/* loaded from: classes5.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r50.j0 f392569d;

    public b0(r50.j0 j0Var) {
        this.f392569d = j0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        a31.m mVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/forward/uic/ForwardMsgPreviewKeyboardUIC$onCreate$1$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r50.j0 j0Var = this.f392569d;
        if (j0Var.f392590i && (mVar = ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).f452619d) != null) {
            mVar.m(101);
        }
        j75.f Q6 = j0Var.Q6();
        if (Q6 != null) {
            Q6.B3(new wg5.d());
        }
        yj0.a.h(this, "com/tencent/mm/feature/forward/uic/ForwardMsgPreviewKeyboardUIC$onCreate$1$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
