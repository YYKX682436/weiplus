package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class rh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f205449f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.xq f205450g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f205451h;

    public rh(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.util.Map map, com.tencent.mm.ui.chatting.viewitems.xq xqVar) {
        this.f205451h = chattingItemDyeingTemplate;
        this.f205447d = f9Var;
        this.f205448e = str;
        this.f205449f = map;
        this.f205450g = xqVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f205451h;
        com.tencent.mm.ui.chatting.n6 B = chattingItemDyeingTemplate.B(chattingItemDyeingTemplate.f203175s);
        if (B != null) {
            B.onClick(view);
        }
        com.tencent.mm.storage.f9 f9Var = this.f205447d;
        java.lang.String Q0 = f9Var.Q0();
        java.lang.String str = this.f205448e;
        chattingItemDyeingTemplate.s1(2, Q0, str);
        tb5.a.f417025a.a(2, chattingItemDyeingTemplate.X, chattingItemDyeingTemplate.f203175s.x(), chattingItemDyeingTemplate.Y);
        yb5.d dVar = chattingItemDyeingTemplate.f203175s;
        java.util.Map map = this.f205449f;
        tb5.o0.c(dVar, f9Var, map, 2);
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.h0(chattingItemDyeingTemplate, 8, str, 2, 0);
        chattingItemDyeingTemplate.o1(4, map, "");
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.g0(chattingItemDyeingTemplate, 6, f9Var);
        com.tencent.mm.ui.chatting.viewitems.xq xqVar = this.f205450g;
        if (((com.tencent.mm.ui.chatting.component.h0) ((sb5.g) chattingItemDyeingTemplate.f203175s.f460708c.a(sb5.g.class))).n0()) {
            try {
                com.tencent.mm.ui.chatting.viewitems.dk a17 = com.tencent.mm.ui.chatting.viewitems.dk.a(map);
                com.tencent.wechat.aff.brand_service.a aVar = com.tencent.wechat.aff.brand_service.a.f216045b;
                com.tencent.wechat.mm.brand_service.y yVar = new com.tencent.wechat.mm.brand_service.y();
                com.tencent.wechat.mm.brand_service.x xVar = new com.tencent.wechat.mm.brand_service.x();
                xVar.f219215g = com.tencent.wechat.mm.brand_service.w.Click;
                xVar.f219214f = java.lang.System.currentTimeMillis();
                xVar.f219213e = f9Var.Q0();
                xVar.f219212d = aVar.b();
                xVar.f219216h = "102_1";
                xVar.f219217i = "template_message";
                java.lang.String valueOf = java.lang.String.valueOf(f9Var.I0());
                if (valueOf == null) {
                    valueOf = "";
                }
                xVar.f219218m = valueOf;
                xVar.f219220o = java.lang.String.valueOf(xqVar.getAdapterPosition() + 1);
                cl0.g gVar = new cl0.g();
                java.lang.String str2 = a17.f203808f;
                if (str2 == null) {
                    str2 = "";
                }
                cl0.g h17 = gVar.h("content", str2);
                h17.p("send_timestamp", a17.f203805c);
                xVar.f219222q = h17.toString();
                yVar.f219254d = xVar;
                aVar.f(yVar);
            } catch (cl0.f e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", "json error: %s" + e17);
            }
        }
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.e0(chattingItemDyeingTemplate, (com.tencent.mm.ui.chatting.viewitems.er) view.getTag(), map);
        java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_header.ecs_overall_jump_info");
        java.lang.String str4 = str3 != null ? str3 : "";
        if (!android.text.TextUtils.isEmpty(str4)) {
            chattingItemDyeingTemplate.b(str4, "ecs_overall_jump_info_template_msg");
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
