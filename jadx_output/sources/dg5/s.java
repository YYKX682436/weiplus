package dg5;

/* loaded from: classes9.dex */
public class s implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg5.t f232396d;

    public s(dg5.t tVar) {
        this.f232396d = tVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        dg5.t tVar = this.f232396d;
        if (itemId == 0) {
            ((com.tencent.mm.storage.m4) c01.d9.b().r()).k(tVar.f232399f);
            return;
        }
        if (itemId != 1) {
            if (itemId == 2) {
                dg5.u uVar = tVar.f232400g;
                java.lang.String str = tVar.f232399f;
                com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI = uVar.f232401d;
                db5.e1.A(baseConversationUI, baseConversationUI.getString(com.tencent.mm.R.string.c17), "", baseConversationUI.getString(com.tencent.mm.R.string.f491127c16), baseConversationUI.getString(com.tencent.mm.R.string.f490347sg), new dg5.p(uVar, str, baseConversationUI), null);
                return;
            }
            if (itemId != 3) {
                return;
            }
            dg5.u uVar2 = tVar.f232400g;
            java.lang.String str2 = tVar.f232399f;
            uVar2.getClass();
            if (((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str2, true) == null) {
                com.tencent.mars.xlog.Log.e("EnterpriseConversationPresenter", "changed biz stick status failed, contact is null, talker = " + str2);
                return;
            } else if (((com.tencent.mm.storage.m4) c01.d9.b().r()).K(str2)) {
                c01.e2.B0(str2, true, true);
                return;
            } else {
                c01.i0.a(str2, true);
                return;
            }
        }
        dg5.u uVar3 = tVar.f232400g;
        java.lang.String str3 = tVar.f232399f;
        uVar3.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mars.xlog.Log.e("EnterpriseConversationPresenter", "Delete Conversation and messages fail because username is null or nil.");
            return;
        }
        com.tencent.mm.storage.f9 r66 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).r6(str3);
        r45.ac0 ac0Var = new r45.ac0();
        r45.du5 du5Var = new r45.du5();
        du5Var.f372756d = str3 == null ? "" : str3;
        du5Var.f372757e = true;
        ac0Var.f369912d = du5Var;
        ac0Var.f369914f = r66.I0();
        ((e21.z0) c01.d9.b().w()).c(new xg3.p0(8, ac0Var));
        uVar3.f232404g = false;
        com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI2 = uVar3.f232401d;
        c01.w9.h(str3, new dg5.r(uVar3, db5.e1.Q(baseConversationUI2, baseConversationUI2.getString(com.tencent.mm.R.string.f490573yv), baseConversationUI2.getString(com.tencent.mm.R.string.f490604zq), true, true, new dg5.q(uVar3))));
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        com.tencent.mm.modelsimple.g1.I(str3, 15);
        ((com.tencent.mm.storage.m4) c01.d9.b().r()).k(str3);
        c01.d9.b().k().b(r01.q3.cj().b1(str3).field_enterpriseFather);
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Ai(str3);
    }
}
