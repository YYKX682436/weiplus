package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes4.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.AbstractVideoView f190878d;

    public j(com.tencent.mm.pluginsdk.ui.AbstractVideoView abstractVideoView) {
        this.f190878d = abstractVideoView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.AbstractVideoView abstractVideoView = this.f190878d;
        abstractVideoView.M = true;
        android.widget.ProgressBar progressBar = abstractVideoView.f189744m;
        if (progressBar != null && progressBar.getVisibility() != 0) {
            com.tencent.mars.xlog.Log.i(abstractVideoView.f189739e, "%s show loading", abstractVideoView.N());
            abstractVideoView.f189744m.setVisibility(0);
        }
        com.tencent.mm.pluginsdk.ui.b1 b1Var = abstractVideoView.f189751t;
        if (b1Var != null) {
            b1Var.N5(abstractVideoView.getSessionId(), abstractVideoView.getMediaId(), java.lang.Boolean.FALSE);
        }
    }
}
