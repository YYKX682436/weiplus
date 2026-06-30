package com.tencent.mm.ui.bizchat;

/* loaded from: classes11.dex */
public class n implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI f197970d;

    public n(com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI) {
        this.f197970d = bizChatConversationFmUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI = this.f197970d;
        if (itemId == 0) {
            long j17 = bizChatConversationFmUI.f197911u;
            com.tencent.mars.xlog.Log.i("MicroMsg.BizChatConversationFmUI", "deleteChatroom");
            r01.q3.Ui().z0(j17);
            bizChatConversationFmUI.f197907q = false;
            bizChatConversationFmUI.f197900g = db5.e1.Q(bizChatConversationFmUI.thisActivity(), bizChatConversationFmUI.getString(com.tencent.mm.R.string.f490573yv), bizChatConversationFmUI.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.ui.bizchat.d(bizChatConversationFmUI));
            gm0.j1.e().j(new c01.h0(bizChatConversationFmUI.f197903m, j17, new com.tencent.mm.ui.bizchat.e(bizChatConversationFmUI, j17)));
            return;
        }
        if (itemId == 1) {
            s01.b J0 = r01.q3.aj().J0(bizChatConversationFmUI.f197911u);
            J0.field_unReadCount = 1;
            J0.field_atCount = 0;
            J0.field_atAll = 0;
            r01.q3.aj().n1(J0);
            ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).Bi(true, J0.field_brandUserName, true);
            return;
        }
        if (itemId == 2) {
            r01.q3.aj().o1(bizChatConversationFmUI.f197911u);
            s01.b J02 = r01.q3.aj().J0(bizChatConversationFmUI.f197911u);
            ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).Bi(true, J02.field_brandUserName, false);
            return;
        }
        if (itemId != 3) {
            if (itemId != 4) {
                return;
            }
            com.tencent.mm.ui.o3.b(bizChatConversationFmUI.thisActivity(), new com.tencent.mm.ui.bizchat.m(this));
            return;
        }
        s01.b J03 = r01.q3.aj().J0(bizChatConversationFmUI.f197911u);
        s01.g aj6 = r01.q3.aj();
        if (aj6.f1(aj6.J0(bizChatConversationFmUI.f197911u))) {
            r01.q3.aj().k1(bizChatConversationFmUI.f197911u);
            ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).Ai(true, J03.field_brandUserName, false);
            return;
        }
        r01.q3.aj().i1(bizChatConversationFmUI.f197911u);
        ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).Ai(true, J03.field_brandUserName, true);
    }
}
