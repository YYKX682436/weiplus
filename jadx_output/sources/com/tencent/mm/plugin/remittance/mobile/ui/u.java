package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class u implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.v f156722d;

    public u(com.tencent.mm.plugin.remittance.mobile.ui.v vVar) {
        this.f156722d = vVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$HistoryRecordAdapter$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.remittance.mobile.ui.x xVar = this.f156722d.f156730m;
        if (xVar == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$HistoryRecordAdapter$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        com.tencent.mm.plugin.remittance.mobile.ui.l lVar = (com.tencent.mm.plugin.remittance.mobile.ui.l) xVar;
        lVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "mHistroyRecordRv longclick!");
        r45.ow3 ow3Var = (r45.ow3) view.getTag();
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI mobileRemitHistoryRecodUI = lVar.f156688a;
        rl5.r rVar = new rl5.r(mobileRemitHistoryRecodUI, view);
        com.tencent.mm.plugin.remittance.mobile.ui.j jVar = new com.tencent.mm.plugin.remittance.mobile.ui.j(lVar);
        com.tencent.mm.plugin.remittance.mobile.ui.k kVar = new com.tencent.mm.plugin.remittance.mobile.ui.k(lVar, ow3Var);
        int[] iArr = mobileRemitHistoryRecodUI.f156572p;
        rVar.h(view, jVar, kVar, iArr[0], iArr[1]);
        yj0.a.i(true, this, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$HistoryRecordAdapter$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
