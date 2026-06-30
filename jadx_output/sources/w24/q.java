package w24;

/* loaded from: classes11.dex */
public class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView f442637d;

    public q(com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView switchAccountGridView) {
        this.f442637d = switchAccountGridView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.SwitchAccountGridView", "click addBtn");
        com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView switchAccountGridView = this.f442637d;
        w24.s sVar = switchAccountGridView.f162059p;
        if (sVar != null && !switchAccountGridView.f162051e && !switchAccountGridView.f162050d) {
            ((com.tencent.mm.plugin.setting.ui.setting.rm) sVar).a(null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
