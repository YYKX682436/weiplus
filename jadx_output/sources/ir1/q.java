package ir1;

/* loaded from: classes3.dex */
public final class q implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.conversation.ui.BizFansBlackListUI f294034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.d04 f294035e;

    public q(com.tencent.mm.plugin.brandservice.conversation.ui.BizFansBlackListUI bizFansBlackListUI, r45.d04 d04Var) {
        this.f294034d = bizFansBlackListUI;
        this.f294035e = d04Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1001) {
            jr1.i iVar = jr1.i.f301360a;
            com.tencent.mm.plugin.brandservice.conversation.ui.BizFansBlackListUI bizFansBlackListUI = this.f294034d;
            int i18 = bizFansBlackListUI.f93945t;
            r45.d04 d04Var = this.f294035e;
            java.lang.String identity_name = d04Var.f371979d.f372894h;
            kotlin.jvm.internal.o.f(identity_name, "identity_name");
            iVar.d(i18, "", identity_name, d04Var.f371979d.f372893g, true, new ir1.p(bizFansBlackListUI, d04Var));
        }
    }
}
