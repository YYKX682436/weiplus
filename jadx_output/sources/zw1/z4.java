package zw1;

/* loaded from: classes15.dex */
public class z4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jv3 f476868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476869e;

    public z4(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, r45.jv3 jv3Var) {
        this.f476869e = walletCollectQrCodeUI;
        this.f476868d = jv3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI$35", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.wf5 wf5Var = this.f476868d.f378126g;
        int i17 = com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.Q;
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476869e;
        walletCollectQrCodeUI.U6(wf5Var, null);
        com.tencent.mm.ui.widget.dialog.y1 y1Var = walletCollectQrCodeUI.G;
        if (y1Var != null && y1Var.f()) {
            walletCollectQrCodeUI.G.q();
            walletCollectQrCodeUI.G = null;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI$35", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
