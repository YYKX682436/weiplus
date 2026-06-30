package nc5;

/* loaded from: classes10.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nc5.o f336208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f336209e;

    public l(nc5.o oVar, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f336208d = oVar;
        this.f336209e = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI$showSettingPermissionDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).bj(true);
        nc5.o oVar = this.f336208d;
        oVar.f336216d = true;
        oVar.f336221i = true;
        this.f336209e.B();
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Di(1);
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Bi(102);
        oVar.f336223k = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new nc5.k(oVar, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI$showSettingPermissionDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
