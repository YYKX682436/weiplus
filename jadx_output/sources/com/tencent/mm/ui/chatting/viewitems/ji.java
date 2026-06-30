package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ji implements e31.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ki f204261a;

    public ji(com.tencent.mm.ui.chatting.viewitems.ki kiVar) {
        this.f204261a = kiVar;
    }

    @Override // e31.l
    public void d(int i17, int i18, java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", "updateSubscribeMsgList onError errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.tencent.mm.ui.chatting.viewitems.ki kiVar = this.f204261a;
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = kiVar.f204339d.f204484f;
        java.lang.String str2 = com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.B1;
        chattingItemDyeingTemplate.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.viewitems.oi(chattingItemDyeingTemplate));
        com.tencent.mm.ui.chatting.viewitems.li liVar = kiVar.f204339d;
        db5.t7.makeText(liVar.f204484f.f203175s.g(), liVar.f204484f.f203175s.g().getString(com.tencent.mm.R.string.hdd), 1).show();
    }

    @Override // e31.l
    public void e(java.lang.String str, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "updateSubscribeMsgList success");
        com.tencent.mm.ui.chatting.viewitems.ki kiVar = this.f204261a;
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = kiVar.f204339d.f204484f;
        java.lang.String str2 = com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.B1;
        chattingItemDyeingTemplate.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.viewitems.oi(chattingItemDyeingTemplate));
        yb5.d dVar = kiVar.f204339d.f204484f.f203175s;
        if (dVar != null) {
            dVar.J();
        }
    }
}
