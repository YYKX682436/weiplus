package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class lh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f204481d;

    public lh(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate) {
        this.f204481d = chattingItemDyeingTemplate;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "on header (%s) name click", erVar.f203906b);
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(erVar.c().j(), "msg", null);
        java.lang.String str = (java.lang.String) d17.get(".msg.fromusername");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f204481d;
        java.lang.String str2 = chattingItemDyeingTemplate.H;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(chattingItemDyeingTemplate.P);
        java.lang.String str3 = chattingItemDyeingTemplate.N;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.Y0(d17));
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(chattingItemDyeingTemplate.W0());
        j31.c cVar = chattingItemDyeingTemplate.X;
        java.lang.String str4 = cVar.f297374f;
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(chattingItemDyeingTemplate.F1(cVar.f297375g));
        j31.c cVar2 = chattingItemDyeingTemplate.X;
        g0Var.d(11608, str2, str, 66666, valueOf, str3, valueOf2, valueOf3, str4, valueOf4, cVar2.f297376h, cVar2.f297380l, java.lang.Integer.valueOf(chattingItemDyeingTemplate.b1()));
        java.lang.String str5 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.weapp_username");
        java.lang.String str6 = str5 == null ? "" : str5;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
            java.lang.String str7 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.header_jump_url");
            if (str7 == null) {
                str7 = "";
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", str7);
                intent.putExtra("key_enable_teen_mode_check", true);
                intent.putExtra("key_enable_fts_quick", true);
                com.tencent.mm.ui.chatting.viewitems.a0.h(intent, chattingItemDyeingTemplate.f203175s.x());
                j45.l.j(chattingItemDyeingTemplate.f203175s.g(), "webview", ".ui.tools.WebViewUI", intent, null);
            }
        } else {
            java.lang.String str8 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.weapp_path");
            java.lang.String str9 = str8 == null ? "" : str8;
            int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.weapp_state"), 0);
            int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.weapp_version"), 0);
            java.lang.String str10 = (java.lang.String) d17.get(".msg.appmsg.template_id");
            if (str10 == null) {
                str10 = "";
            }
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
            appBrandStatObject.f87791g = erVar.c().I0() + ":" + erVar.f203906b + ":" + chattingItemDyeingTemplate.f203175s.x() + ":" + str10;
            appBrandStatObject.f87790f = com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.d0(str10);
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).aj(chattingItemDyeingTemplate.f203175s.g(), str6, null, P, P2, str9, appBrandStatObject);
        }
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.e0(chattingItemDyeingTemplate, erVar, d17);
        chattingItemDyeingTemplate.s1(10, chattingItemDyeingTemplate.f203175s.x(), str);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
