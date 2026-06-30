package te4;

/* loaded from: classes15.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.soter.ui.SoterTestUI f418602d;

    public i(com.tencent.mm.plugin.soter.ui.SoterTestUI soterTestUI) {
        this.f418602d = soterTestUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/soter/ui/SoterTestUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zt5.r c17 = wt5.a.c();
        com.tencent.mm.plugin.soter.ui.SoterTestUI soterTestUI = this.f418602d;
        if (c17 == null) {
            soterTestUI.f171766o.setText("not passed: no certificate");
            yj0.a.h(this, "com/tencent/mm/plugin/soter/ui/SoterTestUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        soterTestUI.f171766o.setText("model available: " + c17.toString());
        yj0.a.h(this, "com/tencent/mm/plugin/soter/ui/SoterTestUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
