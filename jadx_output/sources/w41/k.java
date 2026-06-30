package w41;

/* loaded from: classes15.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.openim.ui.dialog.OpenIMKefuConfirmDialogView f442869d;

    public k(com.tencent.mm.openim.ui.dialog.OpenIMKefuConfirmDialogView openIMKefuConfirmDialogView) {
        this.f442869d = openIMKefuConfirmDialogView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/openim/ui/dialog/OpenIMKefuConfirmDialogView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        v41.r rVar = this.f442869d.D1;
        if (rVar != null) {
            v41.h hVar = (v41.h) rVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConfirmDialogUIModelImpl", "showConfirmDialog onConfirmClick");
            l41.m mVar = hVar.f433212a.f433205e;
            if (mVar != null) {
                ((l41.j1) mVar).d(hVar.f433213b);
            }
        }
        yj0.a.h(this, "com/tencent/mm/openim/ui/dialog/OpenIMKefuConfirmDialogView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
