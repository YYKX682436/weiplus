package cw1;

/* loaded from: classes8.dex */
public final class p1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheProgressUI f223212d;

    public p1(com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheProgressUI cleanCacheProgressUI) {
        this.f223212d = cleanCacheProgressUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheProgressUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f223212d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheProgressUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
