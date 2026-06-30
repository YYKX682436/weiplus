package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class sj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f205527d;

    public sj(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate) {
        this.f205527d = chattingItemDyeingTemplate;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(erVar.c().j(), "msg", null);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "values map is null.");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.template_op_type"), -1);
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f205527d;
        if (P == 1) {
            com.tencent.mm.storage.f9 c17 = erVar.c();
            ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).wi(chattingItemDyeingTemplate.f203175s.g(), new r01.b2(0, c17.j(), c17.I0(), c17.getMsgId(), erVar.f203906b, chattingItemDyeingTemplate.f203175s.x()));
            chattingItemDyeingTemplate.u0(9, chattingItemDyeingTemplate.I, chattingItemDyeingTemplate.H);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.String str = chattingItemDyeingTemplate.H;
            java.lang.String str2 = erVar.f203906b;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(chattingItemDyeingTemplate.P);
            java.lang.String str3 = chattingItemDyeingTemplate.N;
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.Y0(d17));
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(chattingItemDyeingTemplate.W0());
            j31.c cVar = chattingItemDyeingTemplate.X;
            java.lang.String str4 = cVar.f297374f;
            java.lang.Integer valueOf4 = java.lang.Integer.valueOf(chattingItemDyeingTemplate.F1(cVar.f297375g));
            j31.c cVar2 = chattingItemDyeingTemplate.X;
            g0Var.d(11608, str, str2, 0, valueOf, str3, valueOf2, valueOf3, str4, valueOf4, cVar2.f297376h, cVar2.f297380l, java.lang.Integer.valueOf(chattingItemDyeingTemplate.b1()));
        } else if (P == 2) {
            java.lang.String str5 = (java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.schedule_username");
            long V = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.schedule_messvrid"), -1L);
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.i0(chattingItemDyeingTemplate, view.getContext(), str5, V);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "[onClick] Remind! username:%s svrMsgId:%s", str5, java.lang.Long.valueOf(V));
        }
        chattingItemDyeingTemplate.s1(2, chattingItemDyeingTemplate.f203175s.x(), erVar.f203906b);
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.h0(chattingItemDyeingTemplate, 8, erVar.f203906b, P == 1 ? 1 : 2, 0);
        chattingItemDyeingTemplate.o1(4, d17, "");
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.g0(chattingItemDyeingTemplate, 6, erVar.c());
        tb5.a.f417025a.a(2, chattingItemDyeingTemplate.X, chattingItemDyeingTemplate.f203175s.x(), chattingItemDyeingTemplate.Y);
        tb5.o0.c(chattingItemDyeingTemplate.f203175s, erVar.c(), d17, 2);
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.e0(chattingItemDyeingTemplate, erVar, d17);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
