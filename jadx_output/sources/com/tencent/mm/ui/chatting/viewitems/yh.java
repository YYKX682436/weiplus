package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class yh implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f206085a;

    public yh(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate) {
        this.f206085a = chattingItemDyeingTemplate;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f206085a;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = chattingItemDyeingTemplate.f203176t;
        if (u3Var != null) {
            u3Var.dismiss();
            chattingItemDyeingTemplate.f203176t = null;
        }
        chattingItemDyeingTemplate.W = false;
        if (obj instanceof com.tencent.mm.ui.chatting.viewitems.b) {
            com.tencent.mm.ui.chatting.viewitems.b bVar = (com.tencent.mm.ui.chatting.viewitems.b) obj;
            int i17 = bVar.f203444a;
            if (i17 == 0) {
                com.tencent.mm.ui.chatting.viewitems.c.a(15);
            } else if (i17 == 1) {
                com.tencent.mm.ui.chatting.viewitems.c.a(12);
            } else if (i17 == 2) {
                com.tencent.mm.ui.chatting.viewitems.c.a(14);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", bVar.f203445b);
        }
    }
}
