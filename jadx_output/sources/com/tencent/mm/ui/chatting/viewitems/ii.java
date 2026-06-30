package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ii implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ki f204184d;

    public ii(com.tencent.mm.ui.chatting.viewitems.ki kiVar) {
        this.f204184d = kiVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult = (com.tencent.mm.msgsubscription.SubscribeMsgRequestResult) obj;
        com.tencent.mm.ui.chatting.viewitems.ki kiVar = this.f204184d;
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = kiVar.f204339d.f204484f;
        java.lang.String str = com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.B1;
        chattingItemDyeingTemplate.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.viewitems.oi(chattingItemDyeingTemplate));
        if (subscribeMsgRequestResult != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.viewitems.hi(this, subscribeMsgRequestResult));
            return null;
        }
        com.tencent.mm.ui.chatting.viewitems.li liVar = kiVar.f204339d;
        db5.t7.makeText(liVar.f204484f.f203175s.g(), liVar.f204484f.f203175s.g().getString(com.tencent.mm.R.string.hdd), 1).show();
        return null;
    }
}
