package hk5;

/* loaded from: classes.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f282005d;

    public h(com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f282005d = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/transmit/uic/preview/ForwardMsgPreviewAppBrandUIC$showTodoIntroduceDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f282005d.q();
        yj0.a.h(this, "com/tencent/mm/ui/transmit/uic/preview/ForwardMsgPreviewAppBrandUIC$showTodoIntroduceDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
