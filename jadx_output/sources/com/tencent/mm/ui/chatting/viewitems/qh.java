package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class qh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.er f205365e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f205366f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205367g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f205368h;

    public qh(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, java.lang.String str, com.tencent.mm.ui.chatting.viewitems.er erVar, java.util.Map map, com.tencent.mm.storage.f9 f9Var) {
        this.f205368h = chattingItemDyeingTemplate;
        this.f205364d = str;
        this.f205365e = erVar;
        this.f205366f = map;
        this.f205367g = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f205368h;
        chattingItemDyeingTemplate.b(this.f205364d, "ecs_overall_jump_info_template_msg");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.String str = chattingItemDyeingTemplate.H;
        java.lang.String str2 = this.f205365e.f203906b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(chattingItemDyeingTemplate.P);
        java.lang.String str3 = chattingItemDyeingTemplate.N;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.Y0(this.f205366f));
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(chattingItemDyeingTemplate.W0());
        j31.c cVar = chattingItemDyeingTemplate.X;
        java.lang.String str4 = cVar.f297374f;
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(chattingItemDyeingTemplate.F1(cVar.f297375g));
        j31.c cVar2 = chattingItemDyeingTemplate.X;
        g0Var.d(11608, str, str2, 0, valueOf, str3, valueOf2, valueOf3, str4, valueOf4, cVar2.f297376h, cVar2.f297380l, java.lang.Integer.valueOf(chattingItemDyeingTemplate.b1()));
        com.tencent.mm.storage.f9 f9Var = this.f205367g;
        if (f9Var.B2()) {
            ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).aj("view_clk", f9Var, "ecs_kf_card_template_body");
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
