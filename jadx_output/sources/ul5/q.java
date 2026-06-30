package ul5;

/* loaded from: classes9.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ul5.x f428641d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f428642e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f428643f;

    public q(ul5.x xVar, java.util.ArrayList arrayList, android.widget.TextView textView) {
        this.f428641d = xVar;
        this.f428642e = arrayList;
        this.f428643f = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/pulldown/NestScrollBounceSettingDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ul5.x xVar = this.f428641d;
        com.tencent.mm.ui.widget.picker.c0 c0Var = new com.tencent.mm.ui.widget.picker.c0(xVar.getContext(), this.f428642e);
        c0Var.i(xVar.f428656t);
        c0Var.f212259t = new ul5.p(c0Var, this.f428643f, xVar);
        c0Var.l();
        yj0.a.h(this, "com/tencent/mm/ui/widget/pulldown/NestScrollBounceSettingDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
