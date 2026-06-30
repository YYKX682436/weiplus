package nc5;

/* loaded from: classes5.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nc5.o f336211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f336212e;

    public n(nc5.o oVar, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f336211d = oVar;
        this.f336212e = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI$showSettingPermissionDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nc5.o oVar = this.f336211d;
        android.view.View inflate = com.tencent.mm.ui.id.b(oVar.f336213a).inflate(com.tencent.mm.R.layout.bmb, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(oVar.f336213a, 0, 0, false, true);
        z2Var.j(inflate);
        z2Var.C();
        ((com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.cz7)).setOnClickListener(new nc5.i(z2Var, oVar));
        this.f336212e.B();
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Bi(105);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI$showSettingPermissionDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
