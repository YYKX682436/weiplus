package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ih implements e31.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f204183a;

    public ih(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate) {
        this.f204183a = chattingItemDyeingTemplate;
    }

    @Override // e31.i
    public void a() {
        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", "onSubscribeMsgNotifyStateChange onError");
        yb5.d dVar = this.f204183a.f203175s;
        if (dVar != null) {
            dVar.J();
        }
    }

    @Override // e31.i
    public void b(java.lang.String str, e31.j jVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "onSubscribeMsgNotifyStateChange onFinish isSubscribed: %b, switchOpen: %b, isAcceptWithNotify: %b", java.lang.Boolean.valueOf(jVar.f247075a), java.lang.Boolean.valueOf(jVar.f247076b), java.lang.Boolean.valueOf(jVar.f247082h));
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f204183a;
        chattingItemDyeingTemplate.G.f247082h = jVar.f247082h;
        yb5.d dVar = chattingItemDyeingTemplate.f203175s;
        if (dVar != null) {
            dVar.J();
            db5.t7.makeText(chattingItemDyeingTemplate.f203175s.g(), jVar.f247082h ? com.tencent.mm.R.string.peh : com.tencent.mm.R.string.pei, 0).show();
        }
    }
}
