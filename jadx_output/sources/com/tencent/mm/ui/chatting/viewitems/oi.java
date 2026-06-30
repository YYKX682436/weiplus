package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class oi implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f205208d;

    public oi(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate) {
        this.f205208d = chattingItemDyeingTemplate;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f205208d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = chattingItemDyeingTemplate.f203185y1;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        chattingItemDyeingTemplate.f203185y1.dismiss();
    }
}
