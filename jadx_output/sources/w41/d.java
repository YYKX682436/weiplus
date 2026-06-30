package w41;

/* loaded from: classes15.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.openim.ui.dialog.OpenIMConfirmDialogView f442854d;

    public d(com.tencent.mm.openim.ui.dialog.OpenIMConfirmDialogView openIMConfirmDialogView) {
        this.f442854d = openIMConfirmDialogView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/openim/ui/dialog/OpenIMConfirmDialogView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ab0.r rVar = this.f442854d.C1;
        if (rVar != null) {
            com.tencent.mm.plugin.profile.n0 n0Var = (com.tencent.mm.plugin.profile.n0) rVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.NewContactWidgetNormal", "confirmDialog onConfirmClick");
            n0Var.f153539e.d(n0Var.f153536b, n0Var.f153537c, n0Var.f153538d, true, "");
            ((w41.c) n0Var.f153535a).dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/openim/ui/dialog/OpenIMConfirmDialogView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
