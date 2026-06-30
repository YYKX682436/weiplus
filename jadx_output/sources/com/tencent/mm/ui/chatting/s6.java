package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public final class s6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.t6 f202663d;

    public s6(com.tencent.mm.ui.chatting.t6 t6Var) {
        this.f202663d = t6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingQQAssistantFooterHandler$setupSettingBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        er3.b bVar = er3.c.f256022f;
        r45.zl3 a17 = bVar.a();
        java.lang.String str = a17 != null ? a17.f392193d : null;
        java.lang.String str2 = a17 != null ? a17.f392197h : null;
        java.lang.String str3 = a17 != null ? a17.f392194e : null;
        com.tencent.mm.ui.chatting.t6 t6Var = this.f202663d;
        t6Var.getClass();
        if (!(str == null)) {
            if (!(str2 == null)) {
                if (!(str3 == null)) {
                    java.lang.String t17 = r26.i0.t(str2, "{weapp_param}", str3, false);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingQQAssistantFooterHandler", "jump to:" + str + " pathWithParam: " + t17);
                    try {
                        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
                        appBrandStatObject.f87790f = 1035;
                        appBrandStatObject.f87791g = "gh_051d9102de63";
                        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).Vi(t6Var.f202704b, "", str.toString(), j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigQQAssistantJumpDevMiniApp()) == 1 ? 2 : 0, 0, t17, appBrandStatObject, "");
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingQQAssistantFooterHandler", "Error when jumpToMiniApp: " + th6);
                    }
                    yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingQQAssistantFooterHandler$setupSettingBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingQQAssistantFooterHandler", "need path or appID.");
        bVar.c();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingQQAssistantFooterHandler$setupSettingBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
