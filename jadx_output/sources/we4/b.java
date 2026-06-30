package we4;

/* loaded from: classes11.dex */
public class b implements r35.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sport.ui.SportBlackListUI f445287a;

    public b(com.tencent.mm.plugin.sport.ui.SportBlackListUI sportBlackListUI) {
        this.f445287a = sportBlackListUI;
    }

    @Override // r35.d2
    public void a(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.tencent.mm.plugin.sport.ui.SportBlackListUI sportBlackListUI = this.f445287a;
        java.lang.String c17 = lz.a.c(sportBlackListUI.f171830d, i17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
            return;
        }
        ((java.util.ArrayList) sportBlackListUI.f171831e).remove(c17);
        sportBlackListUI.f171830d.Q(sportBlackListUI.f171831e);
        lz.f fVar = sportBlackListUI.f171830d.M;
        if (fVar != null) {
            ((r35.u1) fVar).f369274f.h();
        }
        c01.e2.E0(((com.tencent.mm.storage.k4) c01.d9.b().q()).n(c17, true));
        ve4.g.a(40);
    }

    @Override // r35.d2
    public void b(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
    }

    @Override // r35.d2
    public void c(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.tencent.mm.plugin.sport.ui.SportBlackListUI sportBlackListUI = this.f445287a;
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(sportBlackListUI.f171831e, ",");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", sportBlackListUI.getString(com.tencent.mm.R.string.f489934fx));
        intent.putExtra("list_type", 1);
        com.tencent.mm.ui.contact.i5.e();
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(com.tencent.mm.ui.contact.i5.f206782c, 1024));
        intent.putExtra("always_select_contact", c17);
        j45.l.v(sportBlackListUI, ".ui.contact.SelectContactUI", intent, 0);
    }

    @Override // r35.d2
    public void d(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        this.f445287a.f171830d.N();
    }

    @Override // r35.d2
    public void e(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.tencent.mm.plugin.sport.ui.SportBlackListUI sportBlackListUI = this.f445287a;
        java.lang.String c17 = lz.a.c(sportBlackListUI.f171830d, i17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", c17);
        j45.l.j(sportBlackListUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }
}
