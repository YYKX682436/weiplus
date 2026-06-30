package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ni implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f204928d;

    public ni(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate) {
        this.f204928d = chattingItemDyeingTemplate;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f204928d;
        if (chattingItemDyeingTemplate.f203185y1 == null) {
            chattingItemDyeingTemplate.f203185y1 = db5.e1.P(chattingItemDyeingTemplate.f203175s.g(), chattingItemDyeingTemplate.f203175s.g().getString(com.tencent.mm.R.string.f490573yv), 3, chattingItemDyeingTemplate.f203175s.g().getString(com.tencent.mm.R.string.f492653hd1), true, false, new com.tencent.mm.ui.chatting.viewitems.mi(this));
        }
        chattingItemDyeingTemplate.f203185y1.show();
    }
}
