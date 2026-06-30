package w24;

/* loaded from: classes11.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView f442634e;

    public o(com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView switchAccountGridView, java.lang.String str) {
        this.f442634e = switchAccountGridView;
        this.f442633d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        w24.s sVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView switchAccountGridView = this.f442634e;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(switchAccountGridView.f162050d);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(switchAccountGridView.f162051e);
        java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(switchAccountGridView.f162052f);
        java.lang.String str = this.f442633d;
        com.tencent.mars.xlog.Log.i("MicroMsg.SwitchAccountGridView", "click %s, deleteState %s, logoutState %s, loginState %s", str, valueOf, valueOf2, valueOf3);
        if (!switchAccountGridView.f162050d && !switchAccountGridView.f162051e && !switchAccountGridView.f162052f && (sVar = switchAccountGridView.f162059p) != null) {
            ((com.tencent.mm.plugin.setting.ui.setting.rm) sVar).a(str);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
