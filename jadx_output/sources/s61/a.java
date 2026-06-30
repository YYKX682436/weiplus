package s61;

/* loaded from: classes15.dex */
public class a implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI f403316d;

    public a(com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI findMContactAddUI) {
        this.f403316d = findMContactAddUI;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI findMContactAddUI = this.f403316d;
        android.app.ProgressDialog progressDialog = findMContactAddUI.f73118g;
        if (progressDialog != null) {
            progressDialog.dismiss();
            findMContactAddUI.f73118g = null;
        }
        if (findMContactAddUI.f73126r != null) {
            gm0.j1.d().q(30, findMContactAddUI.f73126r);
            findMContactAddUI.f73126r = null;
        }
        if (i17 == 4 && i18 == -24 && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            ((en.a) ((en.k) i95.n0.c(en.k.class))).aj(com.tencent.mm.sdk.platformtools.x2.f193071a, str);
            return;
        }
        java.lang.String str2 = findMContactAddUI.f73127s;
        if (str2 == null || !str2.contains("2")) {
            findMContactAddUI.a7();
            return;
        }
        android.content.Intent intent = new android.content.Intent(findMContactAddUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI.class);
        intent.putExtra("regsetinfo_ticket", findMContactAddUI.f73125q);
        intent.putExtra("login_type", findMContactAddUI.f73129u);
        intent.putExtra("regsetinfo_NextStyle", findMContactAddUI.f73128t);
        com.tencent.mm.ui.MMWizardActivity.X6(findMContactAddUI, intent);
    }
}
