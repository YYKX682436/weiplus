package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class xj implements com.tencent.mm.ui.widget.dialog.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205992a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205993b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f205994c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.uj f205995d;

    public xj(com.tencent.mm.ui.chatting.viewitems.uj ujVar, java.lang.String str, com.tencent.mm.storage.f9 f9Var, java.util.Map map) {
        this.f205995d = ujVar;
        this.f205992a = str;
        this.f205993b = f9Var;
        this.f205994c = map;
    }

    @Override // com.tencent.mm.ui.widget.dialog.b1
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "cancel");
        com.tencent.mm.ui.chatting.viewitems.uj ujVar = this.f205995d;
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = ujVar.f205699e;
        boolean z17 = chattingItemDyeingTemplate.f203184y0;
        java.lang.String str = this.f205992a;
        if (z17) {
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.h0(chattingItemDyeingTemplate, 9, str, 0, 4);
        }
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate2 = ujVar.f205699e;
        com.tencent.mm.storage.f9 f9Var = this.f205993b;
        chattingItemDyeingTemplate2.s1(11, f9Var.Q0(), str);
        tb5.o0.c(ujVar.f205699e.f203175s, f9Var, this.f205994c, 11);
    }
}
