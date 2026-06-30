package h71;

/* loaded from: classes5.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.security.ui.BindSafeDeviceUI f279380d;

    public b(com.tencent.mm.plugin.account.security.ui.BindSafeDeviceUI bindSafeDeviceUI) {
        this.f279380d = bindSafeDeviceUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/security/ui/BindSafeDeviceUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("bind_scene", 1);
        com.tencent.mm.plugin.account.security.ui.BindSafeDeviceUI bindSafeDeviceUI = this.f279380d;
        intent.setClass(bindSafeDeviceUI, com.tencent.mm.plugin.account.bind.ui.BindMContactUI.class);
        com.tencent.mm.ui.MMWizardActivity.X6(bindSafeDeviceUI, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/account/security/ui/BindSafeDeviceUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
