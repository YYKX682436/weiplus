package f65;

/* loaded from: classes12.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f259886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f259887e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(int i17, boolean z17) {
        super(1);
        this.f259886d = i17;
        this.f259887e = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.pz6 videoReporterWrapper = (r45.pz6) obj;
        kotlin.jvm.internal.o.g(videoReporterWrapper, "videoReporterWrapper");
        videoReporterWrapper.f383513p = this.f259886d;
        if (!this.f259887e) {
            videoReporterWrapper.f383505e = java.lang.System.currentTimeMillis();
        }
        return videoReporterWrapper;
    }
}
