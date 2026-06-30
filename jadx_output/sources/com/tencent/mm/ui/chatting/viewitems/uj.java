package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class uj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.as f205698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f205699e;

    public uj(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, com.tencent.mm.ui.chatting.viewitems.as asVar) {
        this.f205699e = chattingItemDyeingTemplate;
        this.f205698d = asVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        final com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) view.getTag(com.tencent.mm.R.id.k8v);
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemDyeingTemplate", "on more view click, but msg is null.");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(f9Var.j(), "msg", null);
        if (d17 == null || d17.size() == 0) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f205699e;
        chattingItemDyeingTemplate.c1(chattingItemDyeingTemplate.Z);
        tb5.a aVar = tb5.a.f417025a;
        java.lang.String x17 = chattingItemDyeingTemplate.f203175s.x();
        java.lang.String str = chattingItemDyeingTemplate.Y;
        j31.c cVar = chattingItemDyeingTemplate.X;
        aVar.a(4, cVar, x17, str);
        tb5.o0.c(chattingItemDyeingTemplate.f203175s, f9Var, d17, 4);
        java.lang.String str2 = (java.lang.String) d17.get(".msg.fromusername");
        if (str2 == null) {
            str2 = "";
        }
        final java.lang.String str3 = str2;
        boolean Bi = ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Bi(str3);
        com.tencent.mm.autogen.mmdata.rpt.BrandTmplExposeReportStruct brandTmplExposeReportStruct = new com.tencent.mm.autogen.mmdata.rpt.BrandTmplExposeReportStruct();
        brandTmplExposeReportStruct.f55457d = 1L;
        brandTmplExposeReportStruct.f55458e = java.lang.System.currentTimeMillis();
        brandTmplExposeReportStruct.f55459f = brandTmplExposeReportStruct.b(dm.i4.COL_USERNAME, str3, true);
        brandTmplExposeReportStruct.f55460g = brandTmplExposeReportStruct.b("templateId", chattingItemDyeingTemplate.H, true);
        brandTmplExposeReportStruct.f55461h = brandTmplExposeReportStruct.b("templateTitle", chattingItemDyeingTemplate.N, true);
        brandTmplExposeReportStruct.f55462i = brandTmplExposeReportStruct.b("templateContent", cVar.f297374f, true);
        brandTmplExposeReportStruct.f55464k = brandTmplExposeReportStruct.b("objectType", com.tencent.mm.ui.chatting.viewitems.qg.b(str3), true);
        brandTmplExposeReportStruct.k();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(view.getContext(), 1, false);
        chattingItemDyeingTemplate.f203181x0 = k0Var;
        k0Var.f211856e = new com.tencent.mm.ui.widget.dialog.d1() { // from class: com.tencent.mm.ui.chatting.viewitems.uj$$a
            @Override // com.tencent.mm.ui.widget.dialog.d1
            public final void onShow() {
                com.tencent.mm.ui.chatting.viewitems.uj ujVar = com.tencent.mm.ui.chatting.viewitems.uj.this;
                ujVar.getClass();
                ujVar.f205699e.s1(17, f9Var.Q0(), str3);
            }
        };
        k0Var.f211872n = new com.tencent.mm.ui.chatting.viewitems.vj(this, f9Var, d17);
        k0Var.f211881s = new com.tencent.mm.ui.chatting.viewitems.wj(this, f9Var, view, d17, str3, Bi);
        k0Var.C = new com.tencent.mm.ui.chatting.viewitems.xj(this, str3, f9Var, d17);
        k0Var.v();
        chattingItemDyeingTemplate.s1(4, f9Var.Q0(), str3);
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.g0(chattingItemDyeingTemplate, 5, f9Var);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
