package x41;

/* loaded from: classes15.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.openim.ui.view.BaseDialogView f451777d;

    public i(com.tencent.mm.openim.ui.view.BaseDialogView baseDialogView) {
        this.f451777d = baseDialogView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/openim/ui/view/BaseDialogView$initDialogBg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.openim.ui.view.BaseDialogView baseDialogView = this.f451777d;
        if (!baseDialogView.f72314p0) {
            yj0.a.h(this, "com/tencent/mm/openim/ui/view/BaseDialogView$initDialogBg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        x41.a aVar = baseDialogView.f72316r;
        if (aVar != null) {
            aVar.a(3);
        }
        yj0.a.h(this, "com/tencent/mm/openim/ui/view/BaseDialogView$initDialogBg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
