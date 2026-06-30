package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ph implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f205270f;

    public ph(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, java.lang.String str, com.tencent.mm.storage.f9 f9Var) {
        this.f205270f = chattingItemDyeingTemplate;
        this.f205268d = str;
        this.f205269e = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$23", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f205270f;
        com.tencent.mm.ui.chatting.n6 B = chattingItemDyeingTemplate.B(chattingItemDyeingTemplate.f203175s);
        if (B != null) {
            B.onClick(view);
        }
        if (chattingItemDyeingTemplate.f203184y0) {
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.h0(chattingItemDyeingTemplate, 8, this.f205268d, 2, 0);
        }
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.g0(chattingItemDyeingTemplate, 6, this.f205269e);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$23", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
