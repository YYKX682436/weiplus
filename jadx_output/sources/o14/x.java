package o14;

/* loaded from: classes8.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI f342324d;

    public x(com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI fixToolsUplogUI) {
        this.f342324d = fixToolsUplogUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUplogUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.Z6(this.f342324d, true);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUplogUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
