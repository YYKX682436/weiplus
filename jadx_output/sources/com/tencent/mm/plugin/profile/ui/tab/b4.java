package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class b4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.s4 f154255d;

    public b4(com.tencent.mm.plugin.profile.ui.tab.s4 s4Var) {
        this.f154255d = s4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.wl wlVar;
        r45.x6 x6Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = ((com.tencent.mm.plugin.profile.ui.tab.u0) this.f154255d.f154549c).f154603a;
        if (m0Var.f154459n != null && (wlVar = m0Var.f154462q) != null && (x6Var = wlVar.G) != null) {
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(x6Var.f389810g);
            com.tencent.mm.ui.MMActivity mMActivity = m0Var.f154456h;
            if (!K0) {
                java.lang.String username = m0Var.f154459n.d1();
                long j17 = m0Var.D;
                android.content.Intent intent = mMActivity.getIntent();
                int i17 = m0Var.L;
                int i18 = m0Var.f154467v;
                java.lang.String base64BizUin = m0Var.f154462q.G.f389810g;
                kotlin.jvm.internal.o.g(username, "username");
                kotlin.jvm.internal.o.g(base64BizUin, "base64BizUin");
                gr3.e.d(username, 2602, j17, intent, i17, i18, 0, null, "", base64BizUin, 0, 0, 3072, null);
            }
            java.lang.String str = m0Var.f154462q.G.f389811h;
            if (str.isEmpty()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ContactWidgetTabBizHeaderController", "goToAIChat extInfo empty");
            } else {
                try {
                    byte[] decode = android.util.Base64.decode(str, 0);
                    com.tencent.wechat.aff.chatbot.d0 d0Var = new com.tencent.wechat.aff.chatbot.d0();
                    d0Var.parseFrom(decode);
                    ((wx.u) ((wx.e1) i95.n0.c(wx.e1.class))).wi(mMActivity, d0Var, m0Var.j());
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetTabBizHeaderController", "goToAIChat error: " + e17);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
