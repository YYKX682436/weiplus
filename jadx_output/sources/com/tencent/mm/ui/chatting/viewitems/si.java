package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class si implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ti f205526d;

    public si(com.tencent.mm.ui.chatting.viewitems.ti tiVar) {
        this.f205526d = tiVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.viewitems.ti tiVar = this.f205526d;
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = tiVar.f205610g;
        chattingItemDyeingTemplate.e1(tiVar.f205604a, tiVar.f205605b, tiVar.f205606c, true, chattingItemDyeingTemplate.G, false);
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.r0(tiVar.f205610g, tiVar.f205607d, tiVar.f205604a, tiVar.f205608e, tiVar.f205609f);
    }
}
