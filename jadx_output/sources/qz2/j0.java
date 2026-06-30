package qz2;

/* loaded from: classes3.dex */
public class j0 implements android.view.View.OnClickListener {
    public j0(com.tencent.mm.plugin.fingerprint.ui.SoterPayTestUI soterPayTestUI) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fingerprint/ui/SoterPayTestUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterPayTestUI", "hy: regen and upload ask");
        cu5.b.d(new qz2.i0(this), false, null);
        yj0.a.h(this, "com/tencent/mm/plugin/fingerprint/ui/SoterPayTestUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
