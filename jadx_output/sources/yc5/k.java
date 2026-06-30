package yc5;

/* loaded from: classes3.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f460910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ em.v1 f460911e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f460912f;

    public k(yz5.l lVar, em.v1 v1Var, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f460910d = lVar;
        this.f460911e = v1Var;
        this.f460912f = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/helpers/MsgHistoryGalleryHelper$showConfirmBottomSheet$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f460910d.invoke(java.lang.Boolean.valueOf(this.f460911e.a().isChecked()));
        this.f460912f.q();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/helpers/MsgHistoryGalleryHelper$showConfirmBottomSheet$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
