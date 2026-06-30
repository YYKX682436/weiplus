package e84;

/* loaded from: classes4.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e84.t f250280d;

    public s(e84.t tVar) {
        this.f250280d = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$setClickEvent$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adSingleProduct/AdSingleProductComponent$setClickEvent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        e84.t tVar = this.f250280d;
        tVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        w64.n nVar = tVar.f250285r;
        if (nVar != null) {
            nVar.k(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/adSingleProduct/AdSingleProductComponent$setClickEvent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$setClickEvent$3");
    }
}
