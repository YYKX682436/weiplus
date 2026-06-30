package cw2;

/* loaded from: classes15.dex */
public final class s7 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f224007d;

    public s7(com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy) {
        this.f224007d = finderThumbPlayerProxy;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        zy2.ub videoViewCallback;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f224007d;
        long j17 = finderThumbPlayerProxy.Z1;
        long j18 = finderThumbPlayerProxy.f130645a2;
        int propertyLong = (int) ((kk4.f0) finderThumbPlayerProxy.getPlayer()).getPropertyLong(206);
        finderThumbPlayerProxy.Z1 = ((kk4.f0) finderThumbPlayerProxy.getPlayer()).getPropertyLong(208);
        long propertyLong2 = ((kk4.f0) finderThumbPlayerProxy.getPlayer()).getPropertyLong(209);
        finderThumbPlayerProxy.f130645a2 = propertyLong2;
        if (j17 <= 0 || j18 <= 0) {
            return true;
        }
        long j19 = finderThumbPlayerProxy.Z1;
        if (j19 > 999999 || j19 < 0 || propertyLong2 < 0 || propertyLong2 > 999999) {
            return true;
        }
        long j27 = j19 - j17;
        if (j27 - propertyLong > 10 || j27 < 0 || propertyLong2 - j18 < 0 || (videoViewCallback = finderThumbPlayerProxy.getVideoViewCallback()) == null) {
            return true;
        }
        cw2.wa waVar = finderThumbPlayerProxy.mediaSource;
        videoViewCallback.v3("", waVar != null ? waVar.f224096c : null, propertyLong, (int) (finderThumbPlayerProxy.Z1 - j17), (int) (finderThumbPlayerProxy.f130645a2 - j18));
        return true;
    }
}
