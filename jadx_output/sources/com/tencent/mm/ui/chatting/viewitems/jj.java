package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class jj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl0.g f204262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f204263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204264f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204265g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f204266h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f204267i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f204268m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f204269n;

    public jj(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, cl0.g gVar, java.util.Map map, java.lang.String str, java.lang.String str2, int i17, com.tencent.mm.storage.f9 f9Var, int i18) {
        this.f204269n = chattingItemDyeingTemplate;
        this.f204262d = gVar;
        this.f204263e = map;
        this.f204264f = str;
        this.f204265g = str2;
        this.f204266h = i17;
        this.f204267i = f9Var;
        this.f204268m = i18;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$58", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cl0.g gVar = this.f204262d;
        if (gVar != null) {
            java.lang.String optString = gVar.optString("feedID");
            java.lang.String optString2 = gVar.optString("nonceID");
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f204269n;
            ((c61.l7) b6Var).vj(chattingItemDyeingTemplate.f203175s.g(), optString, optString2, false, 16, qg0.h0.Fg(2));
            this.f204269n.p1(5, this.f204263e, this.f204264f, optString, this.f204265g);
            if (this.f204266h == 1) {
                com.tencent.mm.ui.chatting.viewitems.ar.f203405a.a(this.f204267i, java.lang.Integer.valueOf(this.f204268m));
            }
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.e0(chattingItemDyeingTemplate, (com.tencent.mm.ui.chatting.viewitems.er) view.getTag(), this.f204263e);
            chattingItemDyeingTemplate.s1(3, chattingItemDyeingTemplate.f203175s.x(), "");
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$58", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
