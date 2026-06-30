package o14;

/* loaded from: classes.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.fixtools.FixToolsFileListUI f342276d;

    public f(com.tencent.mm.plugin.setting.ui.fixtools.FixToolsFileListUI fixToolsFileListUI) {
        this.f342276d = fixToolsFileListUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/fixtools/FixToolsFileListUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        j45.l.j(this.f342276d, "clean", ".ui.CleanUI", new android.content.Intent().putExtra("verbose", true), null);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsFileListUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
