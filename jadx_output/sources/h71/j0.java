package h71;

/* loaded from: classes14.dex */
public class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI f279396d;

    public j0(com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI securityAccountVerifyUI) {
        this.f279396d = securityAccountVerifyUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/security/ui/SecurityAccountVerifyUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI securityAccountVerifyUI = this.f279396d;
        securityAccountVerifyUI.f73238i.setVisibility(8);
        securityAccountVerifyUI.f73236g.setTag(60);
        securityAccountVerifyUI.f73242p.d();
        securityAccountVerifyUI.f73242p.c(1000L, 1000L);
        h11.e eVar = new h11.e(securityAccountVerifyUI.f73239m, 10, "", 0, "", securityAccountVerifyUI.f73240n);
        gm0.j1.d().g(eVar);
        securityAccountVerifyUI.f73243q = db5.e1.Q(securityAccountVerifyUI.getContext(), securityAccountVerifyUI.getString(com.tencent.mm.R.string.f490573yv), securityAccountVerifyUI.getString(com.tencent.mm.R.string.f492915i83), true, true, new h71.i0(this, eVar));
        yj0.a.h(this, "com/tencent/mm/plugin/account/security/ui/SecurityAccountVerifyUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
