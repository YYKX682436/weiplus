package dg5;

/* loaded from: classes11.dex */
public class d implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg5.g f232358d;

    public d(dg5.g gVar) {
        this.f232358d = gVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        dg5.g gVar = this.f232358d;
        if (itemId == 0) {
            long j17 = gVar.f232368m;
            com.tencent.mars.xlog.Log.i("BizChatConversationPresenter", "deleteChatroom");
            r01.q3.Ui().z0(j17);
            gVar.f232364f = false;
            dg5.i iVar = gVar.f232369n;
            com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI = iVar.f232370d;
            gVar.f232365g = db5.e1.Q(baseConversationUI, baseConversationUI.getString(com.tencent.mm.R.string.f490573yv), iVar.f232370d.getString(com.tencent.mm.R.string.f490604zq), true, true, new dg5.e(gVar));
            gm0.j1.e().j(new c01.h0(gVar.f232367i, j17, new dg5.f(gVar, j17)));
            return;
        }
        if (itemId == 1) {
            s01.b J0 = r01.q3.aj().J0(gVar.f232368m);
            J0.field_unReadCount = 1;
            J0.field_atCount = 0;
            J0.field_atAll = 0;
            r01.q3.aj().n1(J0);
            ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).Bi(true, J0.field_brandUserName, true);
            return;
        }
        if (itemId == 2) {
            r01.q3.aj().o1(gVar.f232368m);
            s01.b J02 = r01.q3.aj().J0(gVar.f232368m);
            ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).Bi(true, J02.field_brandUserName, false);
            return;
        }
        if (itemId != 3) {
            if (itemId != 4) {
                return;
            }
            com.tencent.mm.ui.o3.b(gVar.f232369n.f232370d, new dg5.c(this));
            return;
        }
        s01.b J03 = r01.q3.aj().J0(gVar.f232368m);
        s01.g aj6 = r01.q3.aj();
        if (aj6.f1(aj6.J0(gVar.f232368m))) {
            dg5.g.a(gVar, false, 16);
            r01.q3.aj().k1(gVar.f232368m);
            ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).Ai(true, J03.field_brandUserName, false);
            return;
        }
        dg5.g.a(gVar, true, 16);
        r01.q3.aj().i1(gVar.f232368m);
        ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).Ai(true, J03.field_brandUserName, true);
    }
}
