package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class ao implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f146722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.bo f146723e;

    public ao(com.tencent.mm.plugin.luckymoney.ui.bo boVar, boolean z17) {
        this.f146723e = boVar;
        this.f146722d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.bo boVar = this.f146723e;
        boVar.f146768b.K.setVisibility(8);
        android.app.Dialog dialog = boVar.f146768b.M.B;
        if (dialog != null && dialog.isShowing()) {
            boVar.f146768b.M.B.dismiss();
        }
        r45.wv3 wv3Var = boVar.f146767a;
        if (wv3Var.f389503i == 1 || wv3Var.f389507p == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "envelope has expired do nothing");
            return;
        }
        com.tencent.mm.plugin.luckymoney.ui.co coVar = boVar.f146768b;
        if (coVar.f146809e == 1) {
            android.view.View view = coVar.D;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$9$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$9$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (this.f146722d) {
            android.view.View view2 = coVar.D;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$9$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$9$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = coVar.D;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$9$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$9$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boVar.f146768b.E.setVisibility(0);
        boVar.f146768b.F.setVisibility(8);
        boVar.f146768b.G.setVisibility(0);
    }
}
