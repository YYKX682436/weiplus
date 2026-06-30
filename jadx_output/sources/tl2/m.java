package tl2;

/* loaded from: classes8.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl2.u f420257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.n1 f420258e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f420259f;

    public m(tl2.u uVar, com.tencent.mm.plugin.webview.ui.tools.widget.n1 n1Var, java.lang.String str) {
        this.f420257d = uVar;
        this.f420258e = n1Var;
        this.f420259f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tl2.u uVar = this.f420257d;
        int i17 = com.tencent.mm.ui.bl.b(uVar.f420274d).y;
        int h17 = uVar.h();
        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView = (com.tencent.rtmp.ui.TXCloudVideoView) ((jz5.n) uVar.f420280m).getValue();
        android.graphics.Rect rect = uVar.f420277g;
        if (tXCloudVideoView != null) {
            tXCloudVideoView.getGlobalVisibleRect(rect);
        }
        boolean n17 = uVar.n();
        com.tencent.mm.plugin.webview.ui.tools.widget.n1 n1Var = this.f420258e;
        int i18 = uVar.f420275e;
        android.graphics.Rect rect2 = uVar.f420278h;
        if (n17) {
            rect2.set(i18, 0, ((int) ((h17 * 0.5f) - i18)) + i18, i17);
        } else {
            rect2.set(0, i18, h17, ((int) (((1.0f - n1Var.f187418a) * (i17 - uVar.f420276f)) - i18)) + i18);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[calculateViewRect] wh=");
        sb6.append(uVar.h());
        sb6.append(':');
        android.app.Activity activity = uVar.f420274d;
        sb6.append(com.tencent.mm.ui.bl.b(activity).y);
        sb6.append(" targetRect=");
        sb6.append(rect2);
        sb6.append(" sourceRect=");
        sb6.append(rect);
        com.tencent.mars.xlog.Log.i("LiveRestrictVideoTransition", sb6.toString());
        java.lang.Object wi6 = ((yg0.s2) ((zg0.u2) i95.n0.c(zg0.u2.class))).wi(activity, this.f420259f, null, n1Var);
        com.tencent.mm.plugin.webview.ui.tools.widget.m1 m1Var = (com.tencent.mm.plugin.webview.ui.tools.widget.m1) wi6;
        m1Var.Q.add(new com.tencent.mm.plugin.webview.ui.tools.widget.a1(m1Var, uVar));
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) activity : null;
        if (mMFinderUI != null) {
            mMFinderUI.addOnConfigurationChangedListener(uVar.f420284q);
        }
        uVar.f420279i = new java.lang.ref.WeakReference(wi6);
        m1Var.show();
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).wk(1);
        ((hg5.d) wi6).f281406o = new tl2.l(uVar);
    }
}
