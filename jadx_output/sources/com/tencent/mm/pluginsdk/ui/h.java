package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes4.dex */
public class h implements m34.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.AbstractVideoView f190860d;

    public h(com.tencent.mm.pluginsdk.ui.AbstractVideoView abstractVideoView) {
        this.f190860d = abstractVideoView;
    }

    @Override // m34.e
    public void a(int i17) {
        double d17 = i17;
        com.tencent.mm.pluginsdk.ui.AbstractVideoView abstractVideoView = this.f190860d;
        if (abstractVideoView.a(d17, true)) {
            com.tencent.mars.xlog.Log.i(abstractVideoView.f189738d, "onSeekTo, startTimer");
            abstractVideoView.U(false);
        }
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar videoPlayerSeekBar = abstractVideoView.f189746o;
        if (videoPlayerSeekBar != null) {
            videoPlayerSeekBar.setIsPlay(true);
        }
    }

    @Override // m34.e
    public void b() {
    }

    @Override // m34.e
    public void d(int i17) {
    }
}
