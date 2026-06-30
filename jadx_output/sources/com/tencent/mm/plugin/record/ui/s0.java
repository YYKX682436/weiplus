package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class s0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.t0 f155479d;

    public s0(com.tencent.mm.plugin.record.ui.t0 t0Var) {
        this.f155479d = t0Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.record.ui.t0 t0Var = this.f155479d;
        if (itemId == 0) {
            if (((java.lang.Boolean) c01.d9.b().p().l(327714, java.lang.Boolean.FALSE)).booleanValue()) {
                com.tencent.mm.plugin.record.ui.RecordMsgDetailUI.i7(t0Var.f155486e);
            } else {
                c01.d9.b().p().w(327714, java.lang.Boolean.TRUE);
                com.tencent.mm.plugin.record.ui.RecordMsgDetailUI recordMsgDetailUI = t0Var.f155486e;
                com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
                aVar.f211729s = t0Var.f155486e.getResources().getString(com.tencent.mm.R.string.f492780hu2);
                aVar.f211709a = t0Var.f155486e.getResources().getString(com.tencent.mm.R.string.f490573yv);
                aVar.f211732v = of5.b.a(recordMsgDetailUI).getString(com.tencent.mm.R.string.f492294fz1);
                aVar.E = new com.tencent.mm.plugin.record.ui.r0(this);
                com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(recordMsgDetailUI, com.tencent.mm.R.style.f494791wd);
                j0Var.e(aVar);
                com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
                if (d0Var != null) {
                    d0Var.a(j0Var.f211837r);
                }
                j0Var.show();
            }
            com.tencent.mm.modelstat.b.b(t0Var.f155486e.f155278w, 2);
            return;
        }
        if (itemId == 2) {
            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
            com.tencent.mm.plugin.record.ui.RecordMsgDetailUI recordMsgDetailUI2 = t0Var.f155486e;
            com.tencent.mm.pluginsdk.model.a2.i(doFavoriteEvent, recordMsgDetailUI2.f155279x, recordMsgDetailUI2.f155280y);
            am.c4 c4Var = doFavoriteEvent.f54090g;
            c4Var.f6327m = 9;
            c4Var.f6323i = t0Var.f155486e;
            doFavoriteEvent.e();
            return;
        }
        if (itemId != 3) {
            return;
        }
        android.content.Intent putExtra = new android.content.Intent(t0Var.f155486e, (java.lang.Class<?>) com.tencent.mm.ui.chatting.ChattingUI.class).putExtra("msg_local_id", t0Var.f155486e.f155279x).putExtra("finish_direct", true).putExtra("show_search_chat_content_result", true).putExtra("need_hight_item", true).putExtra("Chat_User", t0Var.f155486e.f155278w.Q0());
        com.tencent.mm.plugin.record.ui.RecordMsgDetailUI recordMsgDetailUI3 = t0Var.f155486e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(putExtra);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recordMsgDetailUI3, arrayList.toArray(), "com/tencent/mm/plugin/record/ui/RecordMsgDetailUI$4$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        recordMsgDetailUI3.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(recordMsgDetailUI3, "com/tencent/mm/plugin/record/ui/RecordMsgDetailUI$4$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
