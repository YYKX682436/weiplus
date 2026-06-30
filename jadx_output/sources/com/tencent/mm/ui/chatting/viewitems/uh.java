package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class uh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f205690f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f205691g;

    public uh(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, java.lang.String str, com.tencent.mm.storage.f9 f9Var, java.util.Map map) {
        this.f205691g = chattingItemDyeingTemplate;
        this.f205688d = str;
        this.f205689e = f9Var;
        this.f205690f = map;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$28", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f205691g;
        yb5.d dVar = chattingItemDyeingTemplate.f203175s;
        if (chattingItemDyeingTemplate.f203227h == null) {
            chattingItemDyeingTemplate.f203227h = new com.tencent.mm.ui.chatting.y5(dVar);
        }
        com.tencent.mm.ui.chatting.y5 y5Var = chattingItemDyeingTemplate.f203227h;
        if (y5Var != null) {
            y5Var.onClick(view);
        }
        tb5.a.f417025a.a(5, chattingItemDyeingTemplate.X, chattingItemDyeingTemplate.f203175s.x(), chattingItemDyeingTemplate.Y);
        chattingItemDyeingTemplate.s1(10, chattingItemDyeingTemplate.f203175s.x(), this.f205688d);
        yb5.d dVar2 = chattingItemDyeingTemplate.f203175s;
        com.tencent.mm.storage.f9 f9Var = this.f205689e;
        java.util.Map map = this.f205690f;
        tb5.o0.c(dVar2, f9Var, map, 10);
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.e0(chattingItemDyeingTemplate, (com.tencent.mm.ui.chatting.viewitems.er) view.getTag(), map);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$28", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
