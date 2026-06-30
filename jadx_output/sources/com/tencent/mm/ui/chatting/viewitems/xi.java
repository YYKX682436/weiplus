package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class xi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f205990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f205991e;

    public xi(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, java.util.Map map) {
        this.f205991e = chattingItemDyeingTemplate;
        this.f205990d = map;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$49", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.Map map = this.f205990d;
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.mmreader.template_header.finder_feedid");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_header.finder_nonceid");
        java.lang.String str4 = str3 == null ? "" : str3;
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f205991e;
        ((c61.l7) b6Var).vj(chattingItemDyeingTemplate.f203175s.g(), str2, str4, false, 16, qg0.h0.Fg(2));
        chattingItemDyeingTemplate.o1(3, map, "");
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$49", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
