package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class pi implements e31.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f205271a;

    public pi(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate) {
        this.f205271a = chattingItemDyeingTemplate;
    }

    @Override // e31.i
    public void a() {
        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", "switchSubscribeStatus onError");
        yb5.d dVar = this.f205271a.f203175s;
        if (dVar != null) {
            dVar.J();
        }
    }

    @Override // e31.i
    public void b(java.lang.String str, e31.j jVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "switchSubscribeStatus onFinish isSubscribed: %b, switchOpen: %b", java.lang.Boolean.valueOf(jVar.f247075a), java.lang.Boolean.valueOf(jVar.f247076b));
    }
}
