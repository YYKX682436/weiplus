package nl4;

/* loaded from: classes11.dex */
public final class h implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl4.r f338207d;

    public h(nl4.r rVar) {
        this.f338207d = rVar;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener
    public final void onInfo(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, long j17, long j18, java.lang.Object obj) {
        if (i17 == 1006 || i17 == 503) {
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f338207d.f338242l, "TingFinderPlayerCore-Trace on OnInfo, what:" + i17 + ", arg1:" + j17 + ", arg2:" + j18);
    }
}
