package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class f2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190305d;

    public f2(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190305d = chatFooter;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Integer num;
        com.tencent.mm.pluginsdk.ui.chat.z4 z4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$38", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = 0;
        u35.b.f424430b = 0;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190305d;
        chatFooter.B.getClass();
        rn3.i.Di().a(59);
        android.widget.ImageButton imageButton = chatFooter.f190103z;
        int i18 = -1;
        if (chatFooter.getAppPanelUnCertainEnterArrayList() != null && chatFooter.getAppPanelUnCertainEnterArrayList().size() > 0) {
            int i19 = -1;
            for (int i27 = 0; i27 < chatFooter.getAppPanelUnCertainEnterArrayList().size(); i27++) {
                com.tencent.mm.pluginsdk.ui.chat.x xVar = chatFooter.getAppPanelUnCertainEnterArrayList().get(i27);
                if (xVar.f190714h2 == 1) {
                    if (!com.tencent.mm.sdk.platformtools.o4.M("plus_uncertain_enter").getBoolean(xVar.f190713g2, false)) {
                        java.lang.String str = xVar.f190713g2;
                        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("plus_uncertain_enter");
                        M.getClass();
                        M.putBoolean(str, true);
                        if (i19 == -1) {
                            i19 = i27;
                        }
                    }
                }
            }
            i18 = i19;
        }
        chatFooter.r1(true);
        imageButton.setTag(java.lang.Integer.valueOf(i18));
        chatFooter.v(view);
        if (c01.z1.H().booleanValue() && (z4Var = chatFooter.Q2) != null) {
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            ((com.tencent.mm.ui.chatting.component.hm) z4Var).f199176a.m0(bool, bool);
        }
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = chatFooter.f189955a3;
        if (y4Var != null && com.tencent.mm.storage.z3.L3(y4Var.c())) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("chat_name", chatFooter.f189955a3.c());
            hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(chatFooter.f189955a3.d())));
            hashMap.put("enter_sessionid", chatFooter.f189955a3.b());
            hashMap.put("view_id", "yuanbao_plus_button");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
        }
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var2 = chatFooter.f189955a3;
        if (y4Var2 != null && y4Var2.a() != null) {
            c00.m3 m3Var = (c00.m3) i95.n0.c(c00.m3.class);
            boolean D = chatFooter.f189955a3.a().D();
            com.tencent.mm.storage.z3 u17 = chatFooter.f189955a3.a().u();
            j00.d2 d2Var = (j00.d2) m3Var;
            if (d2Var.Vi(D) && d2Var.Bi(D, u17)) {
                if (D) {
                    n00.g gVar = n00.g.f333821a;
                    gVar.getClass();
                    f06.v[] vVarArr = n00.g.f333822b;
                    n00.g.f333826f.c(gVar, vVarArr[3], java.lang.Boolean.TRUE);
                    bw5.s8 b17 = gVar.b().b();
                    if (b17 != null) {
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(b17.f32854r);
                        num = valueOf.intValue() > 0 ? valueOf : null;
                        if (num != null) {
                            i17 = num.intValue();
                        }
                    }
                    n00.g.f333832l.c(gVar, vVarArr[9], java.lang.Integer.valueOf(i17));
                } else {
                    n00.g gVar2 = n00.g.f333821a;
                    gVar2.getClass();
                    f06.v[] vVarArr2 = n00.g.f333822b;
                    n00.g.f333825e.c(gVar2, vVarArr2[2], java.lang.Boolean.TRUE);
                    bw5.s8 c17 = gVar2.b().c();
                    if (c17 != null) {
                        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(c17.f32854r);
                        num = valueOf2.intValue() > 0 ? valueOf2 : null;
                        if (num != null) {
                            i17 = num.intValue();
                        }
                    }
                    n00.g.f333831k.c(gVar2, vVarArr2[8], java.lang.Integer.valueOf(i17));
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$38", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
