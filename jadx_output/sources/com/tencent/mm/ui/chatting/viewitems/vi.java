package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class vi implements com.tencent.mm.plugin.appbrand.service.n5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f205860a;

    public vi(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate) {
        this.f205860a = chattingItemDyeingTemplate;
    }

    public void a(java.lang.String str, int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "getSubIdStatusCache subId: %s, status: %d, success: %b", str, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f205860a;
        if (str.equals(chattingItemDyeingTemplate.Z) && z17) {
            chattingItemDyeingTemplate.f203173p0 = i17;
        }
    }
}
