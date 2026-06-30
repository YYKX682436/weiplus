package w41;

/* loaded from: classes2.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f442871d;

    public m(android.view.ViewGroup viewGroup) {
        this.f442871d = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/openim/ui/dialog/OpenIMKefuLocReqDialog$initDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f442871d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(context);
        y1Var.j(com.tencent.mm.R.layout.bol);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.aa8)).setOnClickListener(new w41.t(y1Var));
        y1Var.s();
        yj0.a.h(this, "com/tencent/mm/openim/ui/dialog/OpenIMKefuLocReqDialog$initDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
