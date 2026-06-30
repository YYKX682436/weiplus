package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes4.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.AbstractVideoView f190882d;

    public k(com.tencent.mm.pluginsdk.ui.AbstractVideoView abstractVideoView) {
        this.f190882d = abstractVideoView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.AbstractVideoView abstractVideoView = this.f190882d;
        if (abstractVideoView.M) {
            abstractVideoView.M = false;
            com.tencent.mm.pluginsdk.ui.b1 b1Var = abstractVideoView.f189751t;
            if (b1Var != null) {
                b1Var.m2(abstractVideoView.getSessionId(), abstractVideoView.getMediaId(), true);
            }
            android.widget.ProgressBar progressBar = abstractVideoView.f189744m;
            if (progressBar == null || progressBar.getVisibility() == 8) {
                return;
            }
            com.tencent.mars.xlog.Log.i(abstractVideoView.f189739e, "%s hide loading", abstractVideoView.N());
            abstractVideoView.f189744m.setVisibility(8);
        }
    }
}
