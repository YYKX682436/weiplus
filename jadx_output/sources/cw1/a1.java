package cw1;

/* loaded from: classes12.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI f222714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw1.v0 f222715e;

    public a1(com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI cleanCacheNewUI, cw1.v0 v0Var) {
        this.f222714d = cleanCacheNewUI;
        this.f222715e = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$ItemViewHolder$bind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI cleanCacheNewUI = this.f222714d;
        android.content.Intent intent = new android.content.Intent(cleanCacheNewUI, (java.lang.Class<?>) com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheSubListUI.class);
        cw1.v0 v0Var = this.f222715e;
        android.content.Intent putExtra = intent.putExtra("size", v0Var.f223360b).putExtra("checked", v0Var.f223361c).putExtra("appIds", cleanCacheNewUI.f95668s);
        kotlin.jvm.internal.o.f(putExtra, "putExtra(...)");
        lk5.s.e(putExtra, true);
        cleanCacheNewUI.startActivityForResult(putExtra, 4);
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$ItemViewHolder$bind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
