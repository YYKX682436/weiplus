package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI f173109d;

    public q0(com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI bindGuardianMsgUI) {
        this.f173109d = bindGuardianMsgUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/BindGuardianMsgUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI.f172816q;
        com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI bindGuardianMsgUI = this.f173109d;
        bindGuardianMsgUI.getClass();
        if (bindGuardianMsgUI != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", "https://help.wechat.com/cgi-bin/newreadtemplate?t=help_center/feedback_form&plat=&Channel=TeenExpired");
            if (!com.tencent.mm.sdk.platformtools.x2.n() || !gm0.j1.a()) {
                intent.putExtra("neverGetA8Key", true);
            }
            j45.l.j(bindGuardianMsgUI, "webview", ".ui.tools.WebViewUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/BindGuardianMsgUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
