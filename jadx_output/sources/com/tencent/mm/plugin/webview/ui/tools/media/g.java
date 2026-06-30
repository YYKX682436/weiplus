package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes8.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f185775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView f185776e;

    public g(android.content.Context context, com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
        this.f185775d = context;
        this.f185776e = mPVideoPlayFullScreenView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f185775d;
        boolean z17 = context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f185776e;
        if (!z17 || mPVideoPlayFullScreenView.f185725x == null) {
            com.tencent.mars.xlog.Log.w(mPVideoPlayFullScreenView.f185707d, "should not be here");
        } else {
            if (com.tencent.mm.pluginsdk.ui.tools.e9.l()) {
                com.tencent.mm.plugin.webview.ui.tools.media.v0 v0Var = com.tencent.mm.plugin.webview.ui.tools.media.v0.f185829a;
                ot0.m1 m1Var = mPVideoPlayFullScreenView.f185725x;
                kotlin.jvm.internal.o.d(m1Var);
                v0Var.a(context, m1Var, 5);
            } else {
                com.tencent.mm.plugin.webview.ui.tools.media.n0 n0Var = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context).f183811d3;
                ot0.m1 m1Var2 = mPVideoPlayFullScreenView.f185725x;
                n0Var.f185807a = m1Var2;
                com.tencent.mm.plugin.webview.ui.tools.media.j0 j0Var = com.tencent.mm.plugin.webview.ui.tools.media.j0.f185786a;
                kotlin.jvm.internal.o.d(m1Var2);
                java.lang.String str = m1Var2.f373343h;
                ot0.m1 m1Var3 = mPVideoPlayFullScreenView.f185725x;
                kotlin.jvm.internal.o.d(m1Var3);
                java.lang.String str2 = m1Var3.f373342g;
                ot0.m1 m1Var4 = mPVideoPlayFullScreenView.f185725x;
                kotlin.jvm.internal.o.d(m1Var4);
                j0Var.b(context, str, "", str2, m1Var4.f373339d, 2);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18589, 16, 3);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
