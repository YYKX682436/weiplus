package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class bk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.as f203494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f203495e;

    public bk(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, com.tencent.mm.ui.chatting.viewitems.lh lhVar) {
        this.f203495e = chattingItemDyeingTemplate;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$BizMoreViewOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view.getTag() instanceof com.tencent.mm.storage.f9)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemDyeingTemplate", "BizMoreViewOnClickListener#onClick, tag not msg.");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$BizMoreViewOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) view.getTag();
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemDyeingTemplate", "BizMoreViewOnClickListener#onClick, msg null.");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$BizMoreViewOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(f9Var.j(), "msg", null);
        if (d17 == null || d17.size() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemDyeingTemplate", "BizMoreViewOnClickListener#onClick, values null.");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$BizMoreViewOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String str = (java.lang.String) d17.get(".msg.fromusername");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.template_show_type"), 0);
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f203495e;
        e31.j jVar = chattingItemDyeingTemplate.G;
        boolean z18 = jVar.f247076b;
        boolean z19 = jVar.f247075a;
        boolean z27 = P != 0;
        com.tencent.mm.autogen.mmdata.rpt.BrandTmplExposeReportStruct brandTmplExposeReportStruct = new com.tencent.mm.autogen.mmdata.rpt.BrandTmplExposeReportStruct();
        brandTmplExposeReportStruct.f55457d = 1L;
        brandTmplExposeReportStruct.f55458e = java.lang.System.currentTimeMillis();
        brandTmplExposeReportStruct.f55459f = brandTmplExposeReportStruct.b(dm.i4.COL_USERNAME, str2, true);
        brandTmplExposeReportStruct.f55460g = brandTmplExposeReportStruct.b("templateId", chattingItemDyeingTemplate.H, true);
        brandTmplExposeReportStruct.f55461h = brandTmplExposeReportStruct.b("templateTitle", chattingItemDyeingTemplate.N, true);
        brandTmplExposeReportStruct.f55462i = brandTmplExposeReportStruct.b("templateContent", chattingItemDyeingTemplate.X.f297374f, true);
        brandTmplExposeReportStruct.f55464k = brandTmplExposeReportStruct.b("objectType", com.tencent.mm.ui.chatting.viewitems.qg.b(str2), true);
        brandTmplExposeReportStruct.k();
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.a(chattingItemDyeingTemplate, 4, d17, str2);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(view.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.ui.chatting.viewitems.zj(this, d17, z19, z18, view, str2, z27);
        k0Var.f211881s = new com.tencent.mm.ui.chatting.viewitems.ak(this, view, f9Var, d17, str2, z27, z18);
        if (((com.tencent.mm.ui.chatting.component.h0) ((sb5.g) chattingItemDyeingTemplate.f203175s.f460708c.a(sb5.g.class))).n0()) {
            k0Var.s(chattingItemDyeingTemplate.y0(str2), false);
        }
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$BizMoreViewOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
