package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class vh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f205858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f205859f;

    public vh(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, java.lang.String str, java.util.Map map) {
        this.f205859f = chattingItemDyeingTemplate;
        this.f205857d = str;
        this.f205858e = map;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$29", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f205859f;
        ((c61.l7) b6Var).xj(chattingItemDyeingTemplate.f203175s.g(), this.f205857d, 16, qg0.h0.Fg(2));
        java.util.Map map = this.f205858e;
        chattingItemDyeingTemplate.o1(2, map, "");
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.e0(chattingItemDyeingTemplate, (com.tencent.mm.ui.chatting.viewitems.er) view.getTag(), map);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$29", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
