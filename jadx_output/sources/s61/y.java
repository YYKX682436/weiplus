package s61;

/* loaded from: classes15.dex */
public class y implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s61.a0 f403403d;

    public y(s61.a0 a0Var) {
        this.f403403d = a0Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        s61.a0 a0Var = this.f403403d;
        android.app.ProgressDialog progressDialog = a0Var.f403317d.f73136g;
        com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI findMContactInviteUI = a0Var.f403317d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            findMContactInviteUI.f73136g = null;
        }
        if (findMContactInviteUI.f73144r != null) {
            gm0.j1.d().q(com.tencent.wxmm.v2helper.EMethodSetSendToNetworkOn, findMContactInviteUI.f73144r);
            findMContactInviteUI.f73144r = null;
        }
        n71.a.e(findMContactInviteUI.f73148v);
        findMContactInviteUI.hideVKB();
        findMContactInviteUI.W6(1);
    }
}
