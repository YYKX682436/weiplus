package zw1;

/* loaded from: classes15.dex */
public class j4 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zw1.k4 f476677d;

    public j4(zw1.k4 k4Var) {
        this.f476677d = k4Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI$25$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        zw1.k4 k4Var = this.f476677d;
        ww1.a3 a3Var = k4Var.f476689d;
        a3Var.f450112v = 3;
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = k4Var.f476692g;
        r45.vf5 vf5Var = a3Var.f450096f;
        int i17 = com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.Q;
        walletCollectQrCodeUI.K7(vf5Var);
        if (k4Var.f476689d.f450096f != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20032, "wxface2face", "LongClick", "", "", "", "", 3, java.lang.Integer.valueOf(k4Var.f476689d.f450096f.f388187d), 0, k4Var.f476692g.q7(), java.lang.Integer.valueOf(k4Var.f476692g.s7(0)), k4Var.f476692g.r7(0));
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25983, 13, java.lang.Integer.valueOf(k4Var.f476690e));
        yj0.a.i(true, this, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI$25$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
