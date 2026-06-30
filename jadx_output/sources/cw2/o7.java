package cw2;

/* loaded from: classes12.dex */
public final class o7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f223899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f223900e;

    public o7(kotlin.jvm.internal.h0 h0Var, long j17) {
        this.f223899d = h0Var;
        this.f223900e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).updateVideoPlaybackTimetick((java.lang.String) this.f223899d.f310123d, this.f223900e / 1000.0d);
    }
}
