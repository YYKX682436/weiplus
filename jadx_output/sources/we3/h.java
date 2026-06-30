package we3;

/* loaded from: classes7.dex */
public final class h implements com.tencent.rtmp.ITXLivePlayListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ we3.k f445276d;

    public h(we3.k kVar) {
        this.f445276d = kVar;
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onNetStatus(android.os.Bundle bundle) {
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onPlayEvent(int i17, android.os.Bundle bundle) {
        if (i17 == 2012) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPlayEvent, event: ");
        sb6.append(i17);
        sb6.append(", playId: ");
        we3.k kVar = this.f445276d;
        sb6.append(kVar.f445280b);
        com.tencent.mars.xlog.Log.i("MicroMsg.MBFinderLivePlayerItem", sb6.toString());
        if (i17 == 2003) {
            ve3.q.c(kVar, "onLiveFirstFrame", null, 2, null);
        } else if (i17 == 2006) {
            ve3.q.c(kVar, "onLiveEnd", null, 2, null);
        } else {
            if (i17 != 2103) {
                return;
            }
            ve3.q.c(kVar, "onLiveWarningReconnect", null, 2, null);
        }
    }
}
