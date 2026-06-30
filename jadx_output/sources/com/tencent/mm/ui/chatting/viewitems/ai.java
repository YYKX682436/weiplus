package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ai implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f203358b;

    public ai(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, java.lang.String str) {
        this.f203358b = chattingItemDyeingTemplate;
        this.f203357a = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        final km5.b c17 = km5.u.c();
        final java.lang.String str = this.f203357a;
        qk.o b17 = r01.z.b(str);
        if (b17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(b17.field_appId)) {
            c17.c(java.lang.Boolean.TRUE);
            return null;
        }
        if (b17 == null) {
            qk.o oVar = new qk.o();
            oVar.field_username = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "insert stub bizInfo, username: %s, success: %b", str, java.lang.Boolean.valueOf(r01.q3.cj().update(oVar, new java.lang.String[0])));
        }
        com.tencent.mm.ui.chatting.viewitems.c.a(3);
        if (r01.q3.Ai().c(str, new r01.c() { // from class: com.tencent.mm.ui.chatting.viewitems.ai$$a
            @Override // r01.c
            public final void a(boolean z17, java.lang.String str2) {
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = com.tencent.mm.ui.chatting.viewitems.ai.this.f203358b;
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "flush bizInfo callback, username: %s, success: %b, isUpdatingBizInfo: %b", str2, valueOf, java.lang.Boolean.valueOf(chattingItemDyeingTemplate.W));
                boolean z18 = chattingItemDyeingTemplate.W;
                km5.b bVar = c17;
                if (!z18) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "callback when request interrupted by user");
                    bVar.a(new com.tencent.mm.ui.chatting.viewitems.b(2, "flush bizInfo fail"));
                    return;
                }
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str2 == null) {
                    str2 = "";
                }
                if (!str2.equals(str) || !z17) {
                    bVar.a(new com.tencent.mm.ui.chatting.viewitems.b(2, "flush bizInfo fail"));
                } else {
                    com.tencent.mm.ui.chatting.viewitems.c.a(13);
                    bVar.c(java.lang.Boolean.TRUE);
                }
            }
        })) {
            return null;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemDyeingTemplate", "try2UpdateBizAttributes fail");
        c17.a(new com.tencent.mm.ui.chatting.viewitems.b(2, "flush bizInfo fail"));
        return null;
    }
}
