package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class zh implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f206146a;

    public zh(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate) {
        this.f206146a = chattingItemDyeingTemplate;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f206146a;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = chattingItemDyeingTemplate.f203176t;
        if (u3Var != null) {
            u3Var.dismiss();
            chattingItemDyeingTemplate.f203176t = null;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(bool.booleanValue() & chattingItemDyeingTemplate.W);
        chattingItemDyeingTemplate.W = false;
        return valueOf;
    }
}
