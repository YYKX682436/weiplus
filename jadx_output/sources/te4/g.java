package te4;

/* loaded from: classes15.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.soter.ui.SoterTestUI f418600d;

    public g(com.tencent.mm.plugin.soter.ui.SoterTestUI soterTestUI) {
        this.f418600d = soterTestUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        zt5.k b17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/soter/ui/SoterTestUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        au5.b bVar = wt5.a.f449537c;
        if (bVar == null) {
            zt5.h.b("Soter.SoterCore", "soter: generateAppGlobalSecureKey IMPL is null, not support soter", new java.lang.Object[0]);
            b17 = new zt5.k(2);
        } else {
            b17 = bVar.b();
        }
        this.f418600d.f171766o.setText(b17.a() ? "passed" : "not support");
        yj0.a.h(this, "com/tencent/mm/plugin/soter/ui/SoterTestUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
