package w41;

/* loaded from: classes4.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f442874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k41.g0 f442875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f442876f;

    public o(android.view.ViewGroup viewGroup, k41.g0 g0Var, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f442874d = viewGroup;
        this.f442875e = g0Var;
        this.f442876f = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/openim/ui/dialog/OpenIMKefuLocReqDialog$initDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.ViewGroup viewGroup = this.f442874d;
        com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(viewGroup.getContext(), viewGroup.getContext().getString(com.tencent.mm.R.string.f490604zq), false, 3, null);
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        w41.n nVar = new w41.n(f17, this.f442876f);
        k41.g0 contact = this.f442875e;
        kotlin.jvm.internal.o.g(contact, "contact");
        l41.y1 y1Var = l41.y1.f315970a;
        java.lang.String str = contact.field_username;
        if (str == null) {
            str = "";
        }
        y1Var.a(context, str, false, new l41.n1(nVar, contact, context));
        yj0.a.h(this, "com/tencent/mm/openim/ui/dialog/OpenIMKefuLocReqDialog$initDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
