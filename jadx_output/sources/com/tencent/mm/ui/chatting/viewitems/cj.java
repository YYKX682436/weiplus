package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class cj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203735e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f203736f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f203737g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f203738h;

    public cj(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, java.lang.String str, java.lang.String str2, java.util.Map map, com.tencent.mm.storage.f9 f9Var) {
        this.f203738h = chattingItemDyeingTemplate;
        this.f203734d = str;
        this.f203735e = str2;
        this.f203736f = map;
        this.f203737g = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$53", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = this.f203734d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str);
            intent.putExtra("key_enable_teen_mode_check", true);
            intent.putExtra("key_enable_fts_quick", true);
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f203738h;
            com.tencent.mm.ui.chatting.viewitems.a0.h(intent, chattingItemDyeingTemplate.f203175s.x());
            j45.l.j(chattingItemDyeingTemplate.f203175s.g(), "webview", ".ui.tools.WebViewUI", intent, null);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.String str2 = chattingItemDyeingTemplate.H;
            java.lang.String str3 = this.f203735e;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(chattingItemDyeingTemplate.P);
            java.lang.String str4 = chattingItemDyeingTemplate.N;
            java.util.Map map = this.f203736f;
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.Y0(map));
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(chattingItemDyeingTemplate.W0());
            j31.c cVar = chattingItemDyeingTemplate.X;
            java.lang.String str5 = cVar.f297374f;
            java.lang.Integer valueOf4 = java.lang.Integer.valueOf(chattingItemDyeingTemplate.F1(cVar.f297375g));
            j31.c cVar2 = chattingItemDyeingTemplate.X;
            g0Var.d(11608, str2, str3, 2, valueOf, str4, valueOf2, valueOf3, str5, valueOf4, cVar2.f297376h, cVar2.f297380l, java.lang.Integer.valueOf(chattingItemDyeingTemplate.b1()));
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.g0(chattingItemDyeingTemplate, 7, erVar.c());
            tb5.a.f417025a.a(6, chattingItemDyeingTemplate.X, chattingItemDyeingTemplate.f203175s.x(), chattingItemDyeingTemplate.Y);
            yb5.d dVar = chattingItemDyeingTemplate.f203175s;
            com.tencent.mm.storage.f9 f9Var = this.f203737g;
            tb5.o0.c(dVar, f9Var, map, 3);
            if (f9Var.B2()) {
                ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).aj("view_clk", f9Var, "ecs_kf_card_template_bt2");
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$53", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
