package o14;

/* loaded from: classes.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.fixtools.FixToolsFileListUI f342277d;

    public g(com.tencent.mm.plugin.setting.ui.fixtools.FixToolsFileListUI fixToolsFileListUI) {
        this.f342277d = fixToolsFileListUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/fixtools/FixToolsFileListUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.fixtools.FixToolsFileListUI fixToolsFileListUI = this.f342277d;
        android.content.Intent intent = new android.content.Intent(fixToolsFileListUI, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.class);
        intent.putExtra("entry_fix_tools_uplog", 9);
        com.tencent.mm.ui.MMWizardActivity.X6(fixToolsFileListUI, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsFileListUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
