package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class o7 extends com.tencent.mm.ui.bc {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.n7 f199624e;

    public o7(com.tencent.mm.ui.chatting.component.n7 n7Var) {
        this.f199624e = n7Var;
    }

    @Override // com.tencent.mm.ui.bc
    public void b(android.view.MenuItem menuItem) {
        e31.k a17;
        java.lang.String str = te5.v1.f418758b;
        int itemId = menuItem.getItemId();
        java.lang.String str2 = null;
        int i17 = 7;
        com.tencent.mm.ui.chatting.component.n7 n7Var = this.f199624e;
        if (itemId == 4) {
            android.content.Intent intent = new android.content.Intent();
            if (n7Var.t0()) {
                intent.putExtra("detail_username", n7Var.f199549e);
                intent.putExtra("Search_Scene", 3);
            } else {
                intent.putExtra("Search_Scene", 1);
                i17 = 1;
            }
            intent.putExtra("service_notify_session_id", str);
            u50.v vVar = (u50.v) i95.n0.c(u50.v.class);
            android.app.Activity g17 = n7Var.f198580d.g();
            ((s50.g0) vVar).getClass();
            o13.n.q(g17, ".ui.FTSServiceNotifyUI", intent);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23903, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), null, 0, str);
            return;
        }
        if (menuItem.getItemId() == 5) {
            if (!n7Var.t0()) {
                android.content.Intent intent2 = new android.content.Intent(n7Var.f198580d.g(), (java.lang.Class<?>) com.tencent.mm.ui.conversation.ServiceNotifyConversationUI.class);
                intent2.putExtra("container_enter_scene", 1);
                android.app.Activity g18 = n7Var.f198580d.g();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(g18, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/ChattingServiceNotifyComponent$1", "onRealClick", "(Landroid/view/MenuItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                g18.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(g18, "com/tencent/mm/ui/chatting/component/ChattingServiceNotifyComponent$1", "onRealClick", "(Landroid/view/MenuItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21825, 1, null, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), null, null, 0, 0, 0, 0, str);
                return;
            }
            java.lang.String str3 = n7Var.f199549e;
            if (com.tencent.mm.storage.z3.z3(str3)) {
                a17 = e31.n.f247087a.a("name_wxa");
                k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(str3);
                if (Bi != null) {
                    str2 = Bi.field_nickname;
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ChattingServiceNotifyComponent", "attrs is null");
                }
            } else {
                a17 = e31.n.f247087a.a("name_biz");
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                str2 = c01.a2.e(str3);
            }
            java.lang.String str4 = str2;
            if (a17 != null) {
                a17.b(n7Var.f198580d.g(), 4, str3, str4, str);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingServiceNotifyComponent", "service is null");
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21825, 7, str3, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), null, null, 0, 0, 0, java.lang.Integer.valueOf(com.tencent.mm.ui.chatting.viewitems.qg.c(str3)), str);
        }
    }
}
