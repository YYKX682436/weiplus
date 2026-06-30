package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class oh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205204e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205205f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f205206g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f205207h;

    public oh(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, yb5.d dVar, java.lang.String str, com.tencent.mm.storage.f9 f9Var, java.util.Map map) {
        this.f205207h = chattingItemDyeingTemplate;
        this.f205203d = dVar;
        this.f205204e = str;
        this.f205205f = f9Var;
        this.f205206g = map;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f205207h;
        com.tencent.mm.ui.chatting.y5 y5Var = chattingItemDyeingTemplate.f203227h;
        yb5.d dVar = this.f205203d;
        if (y5Var == null) {
            chattingItemDyeingTemplate.f203227h = new com.tencent.mm.ui.chatting.y5(dVar);
        }
        com.tencent.mm.ui.chatting.y5 y5Var2 = chattingItemDyeingTemplate.f203227h;
        if (y5Var2 != null) {
            y5Var2.onClick(view);
        }
        chattingItemDyeingTemplate.s1(10, dVar.x(), this.f205204e);
        tb5.a.f417025a.a(5, chattingItemDyeingTemplate.X, dVar.x(), chattingItemDyeingTemplate.Y);
        com.tencent.mm.storage.f9 f9Var = this.f205205f;
        tb5.o0.c(dVar, f9Var, this.f205206g, 10);
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.g0(chattingItemDyeingTemplate, 4, f9Var);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
