package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes4.dex */
public class e implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.AbstractVideoView f190784d;

    public e(com.tencent.mm.pluginsdk.ui.AbstractVideoView abstractVideoView) {
        this.f190784d = abstractVideoView;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.pluginsdk.ui.AbstractVideoView abstractVideoView = this.f190784d;
        if (!abstractVideoView.isPlaying()) {
            return false;
        }
        if (abstractVideoView.f189750s) {
            com.tencent.mm.pluginsdk.ui.b1 b1Var = abstractVideoView.f189751t;
            if (b1Var != null) {
                b1Var.l(abstractVideoView.getSessionId(), abstractVideoView.getMediaId());
            }
            abstractVideoView.f189750s = false;
        }
        abstractVideoView.W(abstractVideoView.getCurrPosSec());
        abstractVideoView.X(abstractVideoView.isPlaying());
        if (abstractVideoView.P()) {
            return abstractVideoView.A();
        }
        return true;
    }
}
