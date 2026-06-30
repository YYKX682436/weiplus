package yn2;

/* loaded from: classes2.dex */
public final class b implements cw2.xa {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f463962d;

    public b(com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout) {
        this.f463962d = finderVideoLayout;
    }

    @Override // cw2.xa
    public void b(boolean z17) {
        boolean z18 = vn2.u0.f438387a.h() || z17;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f463962d;
        if (finderVideoLayout.isMute != z18) {
            finderVideoLayout.setMute(z18);
            cw2.da videoView = finderVideoLayout.getVideoView();
            if (videoView != null) {
                videoView.setMute(z18);
            }
        }
    }
}
