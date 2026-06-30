package t21;

/* loaded from: classes4.dex */
public class m0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelvideo.MMVideoView f414834d;

    public m0(com.tencent.mm.modelvideo.MMVideoView mMVideoView) {
        this.f414834d = mMVideoView;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        boolean z17;
        int i17 = com.tencent.mm.modelvideo.MMVideoView.N1;
        com.tencent.mm.modelvideo.MMVideoView mMVideoView = this.f414834d;
        if (mMVideoView.f189748q == null) {
            return false;
        }
        boolean isPlaying = mMVideoView.isPlaying();
        if (isPlaying) {
            mMVideoView.D();
        }
        try {
            int currentPosition = mMVideoView.f189748q.getCurrentPosition() / 1000;
            com.tencent.mars.xlog.Log.i(mMVideoView.f189738d, "onTimerExpired, updateUI, playSec is " + currentPosition);
            mMVideoView.W(currentPosition);
            z17 = mMVideoView.b0(currentPosition);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(mMVideoView.f189739e, "%s online video timer check error [%s] ", mMVideoView.N(), e17.toString());
            z17 = false;
        }
        java.lang.String str = mMVideoView.f189739e;
        mMVideoView.N();
        return mMVideoView.P() ? z17 && isPlaying && mMVideoView.A() : z17 && isPlaying;
    }
}
