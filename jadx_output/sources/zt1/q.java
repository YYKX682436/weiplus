package zt1;

/* loaded from: classes8.dex */
public class q extends com.tencent.mm.sdk.event.n {
    public q() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.GotoCardHomePageEvent gotoCardHomePageEvent = (com.tencent.mm.autogen.events.GotoCardHomePageEvent) iEvent;
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_ENTRANCE_SWITCH_INT_SYNC, 1)).intValue();
        int intValue2 = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_ENTRANCE_TRADE_AREA_INT_SYNC, 1)).intValue();
        boolean booleanValue = ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_ENTRANCE_SWITCH_V2_BOOLEAN_SYNC, java.lang.Boolean.TRUE)).booleanValue();
        com.tencent.mars.xlog.Log.i("GotoCardHomePageEventIListener", "goto card version: %s, trade area: %s, newVersion2: %s", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2), java.lang.Boolean.valueOf(booleanValue));
        if (booleanValue) {
            if (gotoCardHomePageEvent.f54425g.f6154a != null) {
                am.ah ahVar = gotoCardHomePageEvent.f54425g;
                android.content.Intent intent = new android.content.Intent(ahVar.f6154a, (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI.class);
                android.content.Context context = ahVar.f6154a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/card/model/listener/GotoCardHomePageEventIListener", "callback", "(Lcom/tencent/mm/autogen/events/GotoCardHomePageEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/card/model/listener/GotoCardHomePageEventIListener", "callback", "(Lcom/tencent/mm/autogen/events/GotoCardHomePageEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                wt1.f0.a();
                if (ahVar.f6156c == 1) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16322, 3);
                }
            }
        } else if (intValue2 == 2) {
            java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_ENTRANCE_TRADE_AREA_INFO_STRING_SYNC, "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                try {
                    r45.iu iuVar = (r45.iu) new r45.iu().parseFrom(str.getBytes(r26.c.f368867c));
                    lu1.d.f(iuVar.f377328d, iuVar.f377329e, iuVar.f377330f);
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("GotoCardHomePageEventIListener", e17, "", new java.lang.Object[0]);
                }
            }
        } else if (intValue != 1) {
            if (gotoCardHomePageEvent.f54425g.f6154a != null) {
                am.ah ahVar2 = gotoCardHomePageEvent.f54425g;
                android.content.Intent intent2 = new android.content.Intent(ahVar2.f6154a, (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.CardHomePageUI.class);
                intent2.putExtra("key_from_scene", 22);
                intent2.putExtra("key_home_page_from_scene", ahVar2.f6155b);
                android.content.Context context2 = ahVar2.f6154a;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/plugin/card/model/listener/GotoCardHomePageEventIListener", "callback", "(Lcom/tencent/mm/autogen/events/GotoCardHomePageEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context2, "com/tencent/mm/plugin/card/model/listener/GotoCardHomePageEventIListener", "callback", "(Lcom/tencent/mm/autogen/events/GotoCardHomePageEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                wt1.f0.a();
                if (ahVar2.f6156c == 1) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16322, 2);
                }
            }
            gotoCardHomePageEvent.f54426h.getClass();
        } else if (gotoCardHomePageEvent.f54425g.f6154a != null) {
            am.ah ahVar3 = gotoCardHomePageEvent.f54425g;
            android.content.Intent intent3 = new android.content.Intent(ahVar3.f6154a, (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI.class);
            android.content.Context context3 = ahVar3.f6154a;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent3);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(context3, arrayList3.toArray(), "com/tencent/mm/plugin/card/model/listener/GotoCardHomePageEventIListener", "callback", "(Lcom/tencent/mm/autogen/events/GotoCardHomePageEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context3.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(context3, "com/tencent/mm/plugin/card/model/listener/GotoCardHomePageEventIListener", "callback", "(Lcom/tencent/mm/autogen/events/GotoCardHomePageEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            wt1.f0.a();
            if (ahVar3.f6156c == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16322, 3);
            }
        }
        au1.n.f14063m.a(true);
        return true;
    }
}
