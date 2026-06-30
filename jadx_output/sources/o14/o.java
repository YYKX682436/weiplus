package o14;

/* loaded from: classes5.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUpLogUploadingUI f342297d;

    public o(com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUpLogUploadingUI fixToolsUpLogUploadingUI) {
        this.f342297d = fixToolsUpLogUploadingUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUpLogUploadingUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUpLogUploadingUI fixToolsUpLogUploadingUI = this.f342297d;
        if (fixToolsUpLogUploadingUI.f160067e) {
            fixToolsUpLogUploadingUI.setResult(-1);
        }
        fixToolsUpLogUploadingUI.W6(1);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUpLogUploadingUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
