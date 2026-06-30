package te4;

/* loaded from: classes15.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.soter.ui.SoterTestUI f418608d;

    public n(com.tencent.mm.plugin.soter.ui.SoterTestUI soterTestUI) {
        this.f418608d = soterTestUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/soter/ui/SoterTestUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.security.Signature d17 = wt5.a.d("sample_auth_key_name");
        com.tencent.mm.plugin.soter.ui.SoterTestUI soterTestUI = this.f418608d;
        try {
            if (d17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SoterTestUI", "hy: signature is null. do sign failed");
                yj0.a.h(this, "com/tencent/mm/plugin/soter/ui/SoterTestUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            d17.update("challenge".getBytes());
            d17.sign();
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterTestUI", "hy: should NOT happen if no exception");
            soterTestUI.f171766o.setText("not passed: signature success without fingerprint authentication");
            yj0.a.h(this, "com/tencent/mm/plugin/soter/ui/SoterTestUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } catch (java.security.SignatureException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterTestUI", "hy: occurred exception when sign: " + e17.toString());
            xt5.f fVar = xt5.h.f457167a;
            if (fVar.isHardwareDetected(soterTestUI) && fVar.b(soterTestUI)) {
                fVar.a(soterTestUI, new xt5.e(d17), 0, null, new te4.m(this, d17), null);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.SoterTestUI", "hy: no hardware detected or no fingerprint registered");
            }
            yj0.a.h(this, "com/tencent/mm/plugin/soter/ui/SoterTestUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
