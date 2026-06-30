package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ah extends com.tencent.mm.pluginsdk.ui.span.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.xq f203355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f203356e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, int i17, int i18, com.tencent.mm.ui.chatting.viewitems.xq xqVar) {
        super(i17, i18);
        this.f203356e = chattingItemDyeingTemplate;
        this.f203355d = xqVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        com.tencent.mm.ui.chatting.viewitems.ah ahVar;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$12", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "on footer action click, username: %s", erVar.f203906b);
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(erVar.c().j(), "msg", null);
        if (d17 == null || d17.size() == 0) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$12", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.msg_control_info.footer_action_type"), 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "on footer action click, footActionType: %d", java.lang.Integer.valueOf(P));
        if (P == 1) {
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f203356e;
            if (!com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.l0(chattingItemDyeingTemplate)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", "onFooterActionClick, checkNetwork no network");
                yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$12", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
                return;
            }
            java.lang.String str7 = (java.lang.String) d17.get(".msg.fromusername");
            if (str7 == null) {
                str7 = "";
            }
            boolean Bi = ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Bi(str7);
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate2 = this.f203356e;
            boolean z17 = chattingItemDyeingTemplate2.G.f247076b;
            com.tencent.mm.ui.chatting.viewitems.xq xqVar = this.f203355d;
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.m0(chattingItemDyeingTemplate2, d17, true, z17, xqVar.f206008d, str7, Bi);
            boolean s07 = ((com.tencent.mm.ui.chatting.component.g9) ((sb5.k0) chattingItemDyeingTemplate.f203175s.f460708c.a(sb5.k0.class))).s0();
            te5.t1 t1Var = te5.v1.f418757a;
            if (s07) {
                sb5.k0 k0Var = (sb5.k0) chattingItemDyeingTemplate.f203175s.f460708c.a(sb5.k0.class);
                com.tencent.mm.storage.f9 c17 = erVar.c();
                ((com.tencent.mm.ui.chatting.component.g9) k0Var).getClass();
                str5 = "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan";
                str6 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$12";
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingServiceNotifyComponent", "updateFooterMsgInfo, msgId: %d, talker: %s, showFooterWording: %b", java.lang.Long.valueOf(c17.getMsgId()), c17.Q0(), java.lang.Boolean.FALSE);
                java.lang.String a17 = t1Var.a(c17.j(), "msg", ".msg.appmsg.mmreader.template_detail.msg_control_info.need_footer", "0");
                if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingServiceNotifyComponent", "updateFooterMsgInfo, ret is null");
                } else {
                    com.tencent.mm.storage.f9 M1 = com.tencent.mm.storage.f9.M1(c17);
                    if (M1 != null) {
                        M1.d1(a17);
                        ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(M1.getMsgId(), M1, true);
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingServiceNotifyComponent", "updateFooterMsgInfo success");
                    }
                }
            } else {
                str5 = "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan";
                str6 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$12";
                sb5.g0 g0Var = (sb5.g0) chattingItemDyeingTemplate.f203175s.f460708c.a(sb5.g0.class);
                com.tencent.mm.storage.f9 c18 = erVar.c();
                ((com.tencent.mm.ui.chatting.component.n7) g0Var).getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingServiceNotifyComponent", "updateFooterMsgInfo, msgId: %d, talker: %s, showFooterWording: %b", java.lang.Long.valueOf(c18.getMsgId()), c18.Q0(), java.lang.Boolean.FALSE);
                java.lang.String a18 = t1Var.a(c18.j(), "msg", ".msg.appmsg.mmreader.template_detail.msg_control_info.need_footer", "0");
                if (com.tencent.mm.sdk.platformtools.t8.K0(a18)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingServiceNotifyComponent", "updateFooterMsgInfo, ret is null");
                } else {
                    com.tencent.mm.storage.f9 M12 = com.tencent.mm.storage.f9.M1(c18);
                    if (M12 != null) {
                        M12.d1(a18);
                        ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(M12.getMsgId(), M12, true);
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingServiceNotifyComponent", "updateFooterMsgInfo success");
                    }
                }
            }
            chattingItemDyeingTemplate.C0(xqVar, chattingItemDyeingTemplate.f203175s, erVar.c(), erVar.f203906b);
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.String str8 = chattingItemDyeingTemplate.H;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(chattingItemDyeingTemplate.P);
            java.lang.String str9 = chattingItemDyeingTemplate.N;
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.Y0(d17));
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(chattingItemDyeingTemplate.W0());
            j31.c cVar = chattingItemDyeingTemplate.X;
            java.lang.String str10 = cVar.f297374f;
            java.lang.Integer valueOf4 = java.lang.Integer.valueOf(chattingItemDyeingTemplate.F1(cVar.f297375g));
            j31.c cVar2 = chattingItemDyeingTemplate.X;
            g0Var2.d(11608, str8, str7, 888888, valueOf, str9, valueOf2, valueOf3, str10, valueOf4, cVar2.f297376h, cVar2.f297380l, java.lang.Integer.valueOf(chattingItemDyeingTemplate.b1()));
            chattingItemDyeingTemplate.r1(true, erVar.c(), d17, str7);
            ahVar = this;
            str = "(Landroid/view/View;)V";
            str2 = "onClick";
            str3 = str5;
            str4 = str6;
        } else {
            ahVar = this;
            str = "(Landroid/view/View;)V";
            str2 = "onClick";
            str3 = "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan";
            str4 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$12";
        }
        yj0.a.h(ahVar, str4, str3, str2, str);
    }
}
