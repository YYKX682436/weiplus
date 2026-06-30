package h71;

/* loaded from: classes14.dex */
public class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.security.ui.SecurityAccountIntroUI f279384d;

    public d0(com.tencent.mm.plugin.account.security.ui.SecurityAccountIntroUI securityAccountIntroUI) {
        this.f279384d = securityAccountIntroUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/security/ui/SecurityAccountIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.security.ui.SecurityAccountIntroUI securityAccountIntroUI = this.f279384d;
        com.tencent.mm.modelbase.m1 eVar = !securityAccountIntroUI.f73229i ? new h11.e(securityAccountIntroUI.f73226f, 10, "", 0, "", securityAccountIntroUI.f73225e) : new r61.e1(securityAccountIntroUI.f73226f, 10, "", 0, "", "");
        gm0.j1.d().g(eVar);
        com.tencent.mm.plugin.account.security.ui.SecurityAccountIntroUI securityAccountIntroUI2 = this.f279384d;
        securityAccountIntroUI2.f73230m = db5.e1.Q(securityAccountIntroUI2, securityAccountIntroUI2.getString(com.tencent.mm.R.string.f490573yv), securityAccountIntroUI.getString(com.tencent.mm.R.string.f492915i83), true, true, new h71.c0(this, eVar));
        yj0.a.h(this, "com/tencent/mm/plugin/account/security/ui/SecurityAccountIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
