package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes4.dex */
public class g implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.AbstractVideoView f190836d;

    public g(com.tencent.mm.pluginsdk.ui.AbstractVideoView abstractVideoView) {
        this.f190836d = abstractVideoView;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.pluginsdk.ui.AbstractVideoView abstractVideoView = this.f190836d;
        if (abstractVideoView.C <= 0) {
            return false;
        }
        if (!abstractVideoView.isPlaying()) {
            return true;
        }
        com.tencent.mars.xlog.Log.i(abstractVideoView.f189739e, "%s reset error count ", abstractVideoView.N());
        abstractVideoView.C = 0;
        abstractVideoView.H(600L, abstractVideoView.getReportIdkey() + 91, 1L, false);
        return false;
    }
}
