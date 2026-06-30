package yc5;

/* loaded from: classes.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f460909d;

    public j(com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f460909d = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/helpers/MsgHistoryGalleryHelper$showConfirmBottomSheet$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f460909d.q();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/helpers/MsgHistoryGalleryHelper$showConfirmBottomSheet$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
