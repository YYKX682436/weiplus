package w24;

/* loaded from: classes11.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView f442636e;

    public p(com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView switchAccountGridView, java.lang.String str) {
        this.f442636e = switchAccountGridView;
        this.f442635d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        w24.t tVar = this.f442636e.f162060q;
        if (tVar != null) {
            com.tencent.mm.plugin.setting.ui.setting.om omVar = (com.tencent.mm.plugin.setting.ui.setting.om) tVar;
            com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI settingsSwitchAccountUI = omVar.f161400a;
            java.util.HashMap hashMap = (java.util.HashMap) settingsSwitchAccountUI.f160699v;
            java.lang.String str = this.f442635d;
            java.lang.String string = settingsSwitchAccountUI.getString(com.tencent.mm.R.string.f493088iz0, ((com.tencent.mm.plugin.setting.model.SwitchAccountModel) hashMap.get(str)).f160048e);
            com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI settingsSwitchAccountUI2 = omVar.f161400a;
            db5.e1.A(settingsSwitchAccountUI, string, settingsSwitchAccountUI2.getString(com.tencent.mm.R.string.f490573yv), settingsSwitchAccountUI2.getString(com.tencent.mm.R.string.f490608zu), settingsSwitchAccountUI2.getString(com.tencent.mm.R.string.f490503wx), new com.tencent.mm.plugin.setting.ui.setting.nm(omVar, str), null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
