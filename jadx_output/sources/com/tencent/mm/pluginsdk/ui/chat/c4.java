package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class c4 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190217d;

    public c4(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190217d = chatFooter;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        int s17;
        hv4.l lVar = com.tencent.mm.pluginsdk.ui.chat.ChatFooter.f189950x6;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190217d;
        chatFooter.getClass();
        try {
            int s18 = chatFooter.f189993h.s(14);
            if (s18 != -1 && s18 == chatFooter.f189993h.getCurScreen()) {
                com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = chatFooter.f189955a3;
                java.lang.String c17 = y4Var == null ? chatFooter.f189969d : y4Var.c();
                com.tencent.mm.autogen.mmdata.rpt.PanelEnterActionStruct panelEnterActionStruct = new com.tencent.mm.autogen.mmdata.rpt.PanelEnterActionStruct();
                panelEnterActionStruct.f59835d = panelEnterActionStruct.b("RoomName", c17, true);
                if (chatFooter.A.getVisibility() == 0) {
                    panelEnterActionStruct.f59836e = 1L;
                } else {
                    panelEnterActionStruct.f59836e = 0L;
                }
                panelEnterActionStruct.f59837f = panelEnterActionStruct.b("AppList", "19", true);
                panelEnterActionStruct.f59838g = s18 + 1;
                panelEnterActionStruct.k();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatFooter", "handleExposureReport Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
        try {
            int s19 = chatFooter.f189993h.s(11);
            if (s19 != -1 && s19 == chatFooter.f189993h.getCurScreen()) {
                com.tencent.mm.pluginsdk.ui.chat.y4 y4Var2 = chatFooter.f189955a3;
                java.lang.String c18 = y4Var2 == null ? chatFooter.f189969d : y4Var2.c();
                com.tencent.mm.autogen.mmdata.rpt.PanelEnterActionStruct panelEnterActionStruct2 = new com.tencent.mm.autogen.mmdata.rpt.PanelEnterActionStruct();
                panelEnterActionStruct2.f59835d = panelEnterActionStruct2.b("RoomName", c18, true);
                if (chatFooter.A.getVisibility() == 0) {
                    panelEnterActionStruct2.f59836e = 1L;
                } else {
                    panelEnterActionStruct2.f59836e = 0L;
                }
                panelEnterActionStruct2.f59837f = panelEnterActionStruct2.b("AppList", "11", true);
                panelEnterActionStruct2.f59838g = s19 + 1;
                if (com.tencent.mm.plugin.newtips.model.i.i(46)) {
                    panelEnterActionStruct2.f59839h = panelEnterActionStruct2.b("HasReddotAppList", "11", true);
                }
                panelEnterActionStruct2.k();
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatFooter", "handleExposureReport Exception:%s %s", e18.getClass().getSimpleName(), e18.getMessage());
        }
        try {
            com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = chatFooter.f189993h;
            if (appPanel != null && (s17 = appPanel.s(7)) != -1 && s17 == chatFooter.f189993h.getCurScreen()) {
                boolean i17 = com.tencent.mm.plugin.newtips.model.i.i(55);
                if (i17) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(182, 215);
                }
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("redenvelope_entry_has_reddot", java.lang.Boolean.valueOf(i17));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("redenvelope_entry", "view_exp", hashMap, 34068);
            }
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatFooter", "handle Luckymoney ExposureReport Exception:%s %s", e19.getClass().getSimpleName(), e19.getMessage());
        }
        chatFooter.f189993h.animate().setListener(null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
