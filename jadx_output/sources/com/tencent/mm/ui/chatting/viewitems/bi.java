package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class bi implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f203480b;

    public bi(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, java.lang.String str) {
        this.f203480b = chattingItemDyeingTemplate;
        this.f203479a = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        final km5.b c17 = km5.u.c();
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        final java.lang.String str = this.f203479a;
        com.tencent.mm.storage.z3 n17 = Bi.n(str, true);
        if (n17 == null || ((int) n17.E2) == 0 || !n17.k2()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "contact do not exist.(username : %s)", str);
            com.tencent.mm.ui.chatting.viewitems.c.a(2);
            ((c01.k7) c01.n8.a()).b(str, 5, new c01.o8() { // from class: com.tencent.mm.ui.chatting.viewitems.bi$$a
                @Override // c01.o8
                public final void a(java.lang.String str2, boolean z17) {
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
                    com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = com.tencent.mm.ui.chatting.viewitems.bi.this.f203480b;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "flush contact callback, username: %s, success: %b, isUpdatingBizInfo: %b", str2, valueOf, java.lang.Boolean.valueOf(chattingItemDyeingTemplate.W));
                    boolean z18 = chattingItemDyeingTemplate.W;
                    km5.b bVar = c17;
                    if (!z18) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "callback when request interrupted by user");
                        bVar.a(new com.tencent.mm.ui.chatting.viewitems.b(1, "flush contact fail"));
                        return;
                    }
                    boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    java.lang.String str3 = str;
                    if (str3 == null) {
                        str3 = "";
                    }
                    if (!str3.equals(str2) || !z17) {
                        bVar.a(new com.tencent.mm.ui.chatting.viewitems.b(1, "flush contact fail"));
                    } else {
                        com.tencent.mm.ui.chatting.viewitems.c.a(11);
                        bVar.c(java.lang.Boolean.TRUE);
                    }
                }
            });
        } else {
            c17.c(java.lang.Boolean.TRUE);
        }
        return java.lang.Boolean.FALSE;
    }
}
