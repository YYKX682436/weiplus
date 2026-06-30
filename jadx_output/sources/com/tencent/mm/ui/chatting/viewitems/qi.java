package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class qi implements com.tencent.mm.plugin.appbrand.service.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f205369a;

    public qi(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate) {
        this.f205369a = chattingItemDyeingTemplate;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.e6
    public void a(k91.v5 v5Var) {
        if (v5Var != null) {
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f205369a;
            java.lang.String str = chattingItemDyeingTemplate.I;
            chattingItemDyeingTemplate.I = v5Var.field_appId;
        }
    }
}
