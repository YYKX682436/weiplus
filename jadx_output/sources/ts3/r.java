package ts3;

/* loaded from: classes9.dex */
public class r implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.readerapp.ui.ReaderAppUI f421697d;

    public r(com.tencent.mm.plugin.readerapp.ui.ReaderAppUI readerAppUI) {
        this.f421697d = readerAppUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int groupId = menuItem.getGroupId();
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.readerapp.ui.ReaderAppUI readerAppUI = this.f421697d;
        if (itemId == 0) {
            if (readerAppUI.f155060h == 20) {
                java.util.ArrayList arrayList = (java.util.ArrayList) ss3.d0.Di().z0(((ts3.d0) readerAppUI.f155059g).getItem(groupId), readerAppUI.f155060h);
                if (arrayList.size() > 0) {
                    c01.ta taVar = (c01.ta) arrayList.get(0);
                    ot0.q qVar = new ot0.q();
                    qVar.f348654f = taVar.f();
                    qVar.f348658g = taVar.d();
                    qVar.f348662h = "view";
                    qVar.f348666i = 5;
                    qVar.f348674k = taVar.h();
                    java.lang.String u17 = ot0.q.u(qVar, null, null);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("Retr_Msg_content", u17);
                    intent.putExtra("Retr_Msg_Type", 2);
                    intent.putExtra("Retr_Msg_thumb_path", tv.a.b(taVar.c()));
                    intent.putExtra("Retr_Msg_Id", 7377812);
                    java.lang.String a17 = c01.n2.a("" + taVar.f37483p);
                    intent.putExtra("reportSessionId", a17);
                    c01.l2 c17 = c01.n2.d().c(a17, true);
                    c17.i("prePublishId", "msg_" + taVar.f37483p);
                    c17.i("preUsername", "newsapp");
                    c17.i("preChatName", "newsapp");
                    c17.i("preMsgIndex", 0);
                    c17.i("sendAppMsgScene", 1);
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.v(intent, readerAppUI);
                    return;
                }
                return;
            }
            return;
        }
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            java.lang.String item = ((ts3.d0) readerAppUI.f155059g).getItem(groupId);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(item)) {
                int i18 = readerAppUI.f155060h;
                ss3.d0.Bi(ss3.d0.Di().z0(item, i18), i18);
                c01.ua Di = ss3.d0.Di();
                int i19 = readerAppUI.f155060h;
                Di.getClass();
                java.lang.String str = "reserved3 = " + d95.b0.O(item);
                Di.s0(str);
                if (Di.f37510d.A(Di.L0(i19), "delete from " + Di.L0(i19) + " where " + str)) {
                    Di.W0(i19);
                    Di.doNotify();
                }
            }
            readerAppUI.U6();
            return;
        }
        if (readerAppUI.f155060h == 20) {
            java.lang.String item2 = ((ts3.d0) readerAppUI.f155059g).getItem(groupId);
            java.util.ArrayList arrayList2 = (java.util.ArrayList) ss3.d0.Di().z0(item2, readerAppUI.f155060h);
            if (arrayList2.isEmpty()) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ReaderAppUI", "fav functionId %s, index %d, size %d", item2, java.lang.Integer.valueOf(readerAppUI.f155065p), java.lang.Integer.valueOf(arrayList2.size()));
            if (readerAppUI.f155065p >= arrayList2.size()) {
                readerAppUI.f155065p = 0;
            }
            c01.ta taVar2 = (c01.ta) arrayList2.get(readerAppUI.f155065p);
            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
            java.lang.String a18 = c01.n2.a("" + taVar2.f37483p);
            c01.l2 c18 = c01.n2.d().c(a18, true);
            c18.i("prePublishId", "msg_" + taVar2.f37483p);
            c18.i("preUsername", "newsapp");
            c18.i("preChatName", "newsapp");
            c18.i("preMsgIndex", 0);
            c18.i("sendAppMsgScene", 1);
            am.c4 c4Var = doFavoriteEvent.f54090g;
            c4Var.f6322h = a18;
            ss3.q.a(doFavoriteEvent, taVar2, readerAppUI.f155065p);
            c4Var.f6327m = 7;
            c4Var.f6323i = readerAppUI;
            doFavoriteEvent.e();
        }
    }
}
