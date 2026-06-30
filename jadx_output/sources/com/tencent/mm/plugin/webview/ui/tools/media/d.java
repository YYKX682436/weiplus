package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes3.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView f185752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f185753e;

    public d(com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView, android.content.Context context) {
        this.f185752d = mPVideoPlayFullScreenView;
        this.f185753e = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r0 != null ? r0.f373348p : null) != false) goto L9;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r7) {
        /*
            r6 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$3"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r7)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r6
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView r7 = r6.f185752d
            ot0.m1 r0 = r7.f185725x
            r1 = 0
            if (r0 == 0) goto L2e
            if (r0 == 0) goto L27
            java.lang.String r0 = r0.f373348p
            goto L28
        L27:
            r0 = r1
        L28:
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r0 == 0) goto L36
        L2e:
            java.lang.String r0 = r7.f185707d
            java.lang.String r2 = "srcUserName is null"
            com.tencent.mars.xlog.Log.w(r0, r2)
        L36:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            ot0.m1 r7 = r7.f185725x
            if (r7 == 0) goto L42
            java.lang.String r7 = r7.f373348p
            goto L43
        L42:
            r7 = r1
        L43:
            java.lang.String r2 = "Contact_User"
            r0.putExtra(r2, r7)
            java.lang.String r7 = "Contact_Scene"
            r2 = 163(0xa3, float:2.28E-43)
            r0.putExtra(r7, r2)
            java.lang.String r7 = "force_get_contact"
            r2 = 1
            r0.putExtra(r7, r2)
            java.lang.String r7 = "key_use_new_contact_profile"
            r0.putExtra(r7, r2)
            android.content.Context r7 = r6.f185753e
            java.lang.String r3 = "profile"
            java.lang.String r4 = ".ui.ContactInfoUI"
            j45.l.j(r7, r3, r4, r0, r1)
            com.tencent.mm.plugin.report.service.g0 r7 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            r1 = 18589(0x489d, float:2.6049E-41)
            r7.d(r1, r0)
            java.lang.String r7 = "onClick"
            java.lang.String r0 = "(Landroid/view/View;)V"
            java.lang.String r1 = "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$3"
            java.lang.String r2 = "android/view/View$OnClickListener"
            yj0.a.h(r6, r1, r2, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.media.d.onClick(android.view.View):void");
    }
}
