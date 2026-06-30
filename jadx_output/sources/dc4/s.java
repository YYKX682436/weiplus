package dc4;

/* loaded from: classes4.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dc4.u f228814d;

    public s(dc4.u uVar) {
        this.f228814d = uVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/detail/item/AdNormalSightDetailItem$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dc4.u uVar = this.f228814d;
        com.tencent.mm.plugin.sns.ui.g9 g9Var = uVar.f228835h;
        if (g9Var != null && g9Var.f168418h != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdNormalSightDetailItem", "on ad content click, snsid ");
            uVar.f228835h.f168418h.performClick();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/detail/item/AdNormalSightDetailItem$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem$3");
    }
}
