package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes4.dex */
public class f implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.AbstractVideoView f190831d;

    public f(com.tencent.mm.pluginsdk.ui.AbstractVideoView abstractVideoView) {
        this.f190831d = abstractVideoView;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.pluginsdk.ui.AbstractVideoView abstractVideoView = this.f190831d;
        boolean isPlaying = abstractVideoView.isPlaying();
        int currPosMs = abstractVideoView.getCurrPosMs();
        com.tencent.mars.xlog.Log.i(abstractVideoView.f189739e, "%s prepare start checker isplaying[%b] currPosMs[%d]", abstractVideoView.N(), java.lang.Boolean.valueOf(isPlaying), java.lang.Integer.valueOf(currPosMs));
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = abstractVideoView.f189748q;
        if (f4Var == null || currPosMs > 50) {
            return false;
        }
        f4Var.b(0.0d);
        return false;
    }
}
