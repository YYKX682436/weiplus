package te4;

/* loaded from: classes15.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.soter.ui.SoterTestUI f418603d;

    public j(com.tencent.mm.plugin.soter.ui.SoterTestUI soterTestUI) {
        this.f418603d = soterTestUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        zt5.k c17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/soter/ui/SoterTestUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        au5.b bVar = wt5.a.f449537c;
        if (bVar == null) {
            zt5.h.b("Soter.SoterCore", "soter: generateAuthKey IMPL is null, not support soter", new java.lang.Object[0]);
            c17 = new zt5.k(2);
        } else {
            c17 = bVar.c("sample_auth_key_name");
        }
        this.f418603d.f171766o.setText(c17.a() ? com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.STAGE_PASS : "not passed");
        yj0.a.h(this, "com/tencent/mm/plugin/soter/ui/SoterTestUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
