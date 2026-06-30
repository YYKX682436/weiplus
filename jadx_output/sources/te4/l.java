package te4;

/* loaded from: classes15.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.soter.ui.SoterTestUI f418605d;

    public l(com.tencent.mm.plugin.soter.ui.SoterTestUI soterTestUI) {
        this.f418605d = soterTestUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/soter/ui/SoterTestUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zt5.r e17 = wt5.a.e("sample_auth_key_name");
        com.tencent.mm.plugin.soter.ui.SoterTestUI soterTestUI = this.f418605d;
        if (e17 == null) {
            soterTestUI.f171766o.setText("not passed: no certificate");
            yj0.a.h(this, "com/tencent/mm/plugin/soter/ui/SoterTestUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        soterTestUI.f171766o.setText("model available: " + e17.toString());
        yj0.a.h(this, "com/tencent/mm/plugin/soter/ui/SoterTestUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
