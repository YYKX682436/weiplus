package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class zg extends com.tencent.mm.pluginsdk.ui.span.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.xq f206144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f206145e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, int i17, int i18, com.tencent.mm.ui.chatting.viewitems.xq xqVar) {
        super(i17, i18);
        this.f206145e = chattingItemDyeingTemplate;
        this.f206144d = xqVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$11", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "on fold action click, username: %s", erVar.f203906b);
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(erVar.c().j(), "msg", null);
        if (d17 == null || d17.size() == 0) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$11", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String str3 = (java.lang.String) d17.get(".msg.fromusername");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = str3;
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f206145e;
        boolean s07 = ((com.tencent.mm.ui.chatting.component.g9) ((sb5.k0) chattingItemDyeingTemplate.f203175s.f460708c.a(sb5.k0.class))).s0();
        te5.t1 t1Var = te5.v1.f418757a;
        if (s07) {
            sb5.k0 k0Var = (sb5.k0) chattingItemDyeingTemplate.f203175s.f460708c.a(sb5.k0.class);
            com.tencent.mm.storage.f9 c17 = erVar.c();
            ((com.tencent.mm.ui.chatting.component.g9) k0Var).getClass();
            str = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$11";
            str2 = str4;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingServiceNotifyComponent", "updateFoldMsgInfo, msgId: %d, talker: %s, showFoldStyle: %b", java.lang.Long.valueOf(c17.getMsgId()), c17.Q0(), java.lang.Boolean.FALSE);
            java.lang.String a17 = t1Var.a(c17.j(), "msg", ".msg.appmsg.mmreader.template_detail.msg_control_info.need_fold", "0");
            if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingServiceNotifyComponent", "updateFoldMsgInfo, ret is null");
            } else {
                com.tencent.mm.storage.f9 M1 = com.tencent.mm.storage.f9.M1(c17);
                if (M1 != null) {
                    M1.d1(a17);
                    ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(M1.getMsgId(), M1, true);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingServiceNotifyComponent", "updateFoldMsgInfo success");
                }
            }
        } else {
            str = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$11";
            str2 = str4;
            sb5.g0 g0Var = (sb5.g0) chattingItemDyeingTemplate.f203175s.f460708c.a(sb5.g0.class);
            com.tencent.mm.storage.f9 c18 = erVar.c();
            ((com.tencent.mm.ui.chatting.component.n7) g0Var).getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingServiceNotifyComponent", "updateFoldMsgInfo, msgId: %d, talker: %s, showFoldStyle: %b", java.lang.Long.valueOf(c18.getMsgId()), c18.Q0(), java.lang.Boolean.FALSE);
            java.lang.String a18 = t1Var.a(c18.j(), "msg", ".msg.appmsg.mmreader.template_detail.msg_control_info.need_fold", "0");
            if (com.tencent.mm.sdk.platformtools.t8.K0(a18)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingServiceNotifyComponent", "updateFoldMsgInfo, ret is null");
            } else {
                com.tencent.mm.storage.f9 M12 = com.tencent.mm.storage.f9.M1(c18);
                if (M12 != null) {
                    M12.d1(a18);
                    ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(M12.getMsgId(), M12, true);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingServiceNotifyComponent", "updateFoldMsgInfo success");
                }
            }
        }
        chattingItemDyeingTemplate.C0(this.f206144d, chattingItemDyeingTemplate.f203175s, erVar.c(), erVar.f203906b);
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.String str5 = chattingItemDyeingTemplate.H;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(chattingItemDyeingTemplate.P);
        java.lang.String str6 = chattingItemDyeingTemplate.N;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.Y0(d17));
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(chattingItemDyeingTemplate.W0());
        j31.c cVar = chattingItemDyeingTemplate.X;
        java.lang.String str7 = cVar.f297374f;
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(chattingItemDyeingTemplate.F1(cVar.f297375g));
        j31.c cVar2 = chattingItemDyeingTemplate.X;
        g0Var2.d(11608, str5, str2, 777777, valueOf, str6, valueOf2, valueOf3, str7, valueOf4, cVar2.f297376h, cVar2.f297380l, java.lang.Integer.valueOf(chattingItemDyeingTemplate.b1()));
        yj0.a.h(this, str, "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
