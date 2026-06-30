package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class yg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.vq f206083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f206084e;

    public yg(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, com.tencent.mm.ui.chatting.viewitems.vq vqVar) {
        this.f206084e = chattingItemDyeingTemplate;
        this.f206083d = vqVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.viewitems.vq vqVar = this.f206083d;
        vqVar.f205887k.setVisibility(8);
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) vqVar.f205890n.f205957a.getTag();
        com.tencent.mm.storage.f9 c17 = erVar.c();
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f206084e;
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.g0(chattingItemDyeingTemplate, 3, c17);
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.p0(chattingItemDyeingTemplate, vqVar, erVar, erVar.d());
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
