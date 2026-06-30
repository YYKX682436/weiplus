package nc5;

/* loaded from: classes5.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f336203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nc5.o f336204e;

    public i(com.tencent.mm.ui.widget.dialog.z2 z2Var, nc5.o oVar) {
        this.f336203d = z2Var;
        this.f336204e = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI$showPermissionTipsDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f336203d.B();
        this.f336204e.d();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI$showPermissionTipsDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
