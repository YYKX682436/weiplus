package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class wi implements com.tencent.mm.plugin.appbrand.service.o5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f205943a;

    public wi(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate) {
        this.f205943a = chattingItemDyeingTemplate;
    }

    public void a(java.lang.String str, int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "setServiceVoipSubIdStatus subId: %s, status: %d, success: %b", str, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f205943a;
        if (str.equals(chattingItemDyeingTemplate.Z) && z17) {
            chattingItemDyeingTemplate.f203173p0 = i17;
        }
    }
}
