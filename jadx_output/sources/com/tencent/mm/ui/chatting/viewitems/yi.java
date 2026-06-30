package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class yi implements yn.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f206086d;

    public yi(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate) {
        this.f206086d = chattingItemDyeingTemplate;
    }

    @Override // yn.l
    public void E() {
    }

    @Override // yn.l
    public void J() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "onChattingExitAnimEnd, then remove AppBrandTmplMsgReceivingSwitchListener.");
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f206086d;
        chattingItemDyeingTemplate.C.dead();
        yb5.d dVar = chattingItemDyeingTemplate.f203175s;
        if (dVar != null) {
            ((com.tencent.mm.ui.chatting.component.y4) ((yn.j) dVar.f460708c.a(yn.j.class))).c(this);
        }
    }

    @Override // yn.l
    public void K() {
    }

    @Override // yn.l
    public void a() {
    }

    @Override // yn.l
    public void x() {
    }

    @Override // yn.l
    public void y() {
    }

    @Override // yn.l
    public void z() {
    }
}
