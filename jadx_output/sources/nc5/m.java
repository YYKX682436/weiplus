package nc5;

/* loaded from: classes5.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nc5.o f336210d;

    public m(nc5.o oVar) {
        this.f336210d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI$showSettingPermissionDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String obj = gm0.j1.u().c().l(274436, "").toString();
        nc5.o oVar = this.f336210d;
        java.lang.String string = oVar.f336213a.getString(com.tencent.mm.R.string.gbc, com.tencent.mm.sdk.platformtools.m2.d(), obj, "setting", 0, 0);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        c71.b.c(oVar.f336213a, string, 0, true);
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Bi(104);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI$showSettingPermissionDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
