package dk2;

/* loaded from: classes3.dex */
public final class t6 implements com.tencent.mm.sdk.platformtools.a4 {
    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        java.lang.Runnable runnable = dk2.u6.f234172b;
        if (runnable == null) {
            return false;
        }
        pm0.v.O("Finder.FinderLiveFeedFlowReporter:onVideoRealPlay", new dk2.s6(runnable));
        return false;
    }
}
