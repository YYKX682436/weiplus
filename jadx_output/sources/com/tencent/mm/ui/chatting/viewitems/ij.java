package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ij implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f204185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f204186e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f204187f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204188g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204189h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f204190i;

    public ij(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, int i17, java.util.Map map, com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.lang.String str2) {
        this.f204190i = chattingItemDyeingTemplate;
        this.f204185d = i17;
        this.f204186e = map;
        this.f204187f = f9Var;
        this.f204188g = str;
        this.f204189h = str2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$57", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.Map map = this.f204186e;
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f204190i;
        int i17 = this.f204185d;
        if (i17 == 1) {
            java.lang.String str = (java.lang.String) map.get(".msg.appmsg.mmreader.category.item.schedule_username");
            long V = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map.get(".msg.appmsg.mmreader.category.item.schedule_messvrid"), -1L);
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.i0(chattingItemDyeingTemplate, view.getContext(), str, V);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(795L, 2L, 1L, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "[onClick] Remind! username:%s svrMsgId:%s", str, java.lang.Long.valueOf(V));
        } else if (i17 == 2) {
            j45.l.u(view.getContext(), ".ui.AllRemindMsgUI", new android.content.Intent(), null);
        }
        tb5.a.f417025a.a(3, chattingItemDyeingTemplate.X, chattingItemDyeingTemplate.f203175s.x(), chattingItemDyeingTemplate.Y);
        tb5.o0.c(chattingItemDyeingTemplate.f203175s, this.f204187f, map, 3);
        this.f204190i.p1(5, this.f204186e, this.f204188g, "", this.f204189h);
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.e0(chattingItemDyeingTemplate, erVar, map);
        chattingItemDyeingTemplate.s1(3, chattingItemDyeingTemplate.f203175s.x(), erVar.f203906b);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$57", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
