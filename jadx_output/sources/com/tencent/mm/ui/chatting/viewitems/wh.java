package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class wh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f205942d;

    public wh(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate) {
        this.f205942d = chattingItemDyeingTemplate;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(erVar.c().j(), "msg", null);
        boolean z17 = false;
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f205942d;
        if (d17 != null && d17.size() != 0) {
            com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.template_ext.we_app_state"), 0);
            if (com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.f0(chattingItemDyeingTemplate, d17)) {
                z17 = com.tencent.mm.sdk.platformtools.t8.y((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.template_ext.block"), false);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "on app brand(%s) name click, blockProfile: %b", erVar.f203906b, java.lang.Boolean.valueOf(z17));
        if (!z17) {
            view.getContext();
            java.lang.String str = erVar.f203906b;
            chattingItemDyeingTemplate.getClass();
            k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(str);
            if (Bi != null) {
                chattingItemDyeingTemplate.u0(1, Bi.field_appId, chattingItemDyeingTemplate.H);
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_username", str);
            intent.putExtra("key_from_scene", 5);
            if (Bi != null) {
                k91.z5 z5Var = new k91.z5();
                z5Var.f305863a = Bi.field_appId;
                z5Var.f305872j = 6;
                intent.putExtra("key_scene_exposed_params", z5Var.a());
            }
            j45.l.j(chattingItemDyeingTemplate.f203175s.g(), "appbrand", ".ui.AppBrandProfileUI", intent, null);
            chattingItemDyeingTemplate.s1(10, chattingItemDyeingTemplate.f203175s.x(), erVar.f203906b);
        }
        tb5.a.f417025a.a(5, chattingItemDyeingTemplate.X, chattingItemDyeingTemplate.f203175s.x(), chattingItemDyeingTemplate.Y);
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.g0(chattingItemDyeingTemplate, 4, erVar.c());
        tb5.o0.c(chattingItemDyeingTemplate.f203175s, erVar.c(), d17, 10);
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.e0(chattingItemDyeingTemplate, erVar, d17);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
