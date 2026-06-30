package cw2;

/* loaded from: classes15.dex */
public final class t7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.wa f224025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f224026e;

    public t7(cw2.wa waVar, long j17) {
        this.f224025d = waVar;
        this.f224026e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).updateVideoPlaybackTimetick(this.f224025d.f224096c, this.f224026e / 1000.0d);
    }
}
