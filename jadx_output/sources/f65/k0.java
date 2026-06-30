package f65;

/* loaded from: classes12.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f259893d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(int i17) {
        super(1);
        this.f259893d = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.pz6 videoReporterWrapper = (r45.pz6) obj;
        kotlin.jvm.internal.o.g(videoReporterWrapper, "videoReporterWrapper");
        videoReporterWrapper.f383508h = java.lang.System.currentTimeMillis() - videoReporterWrapper.f383507g;
        videoReporterWrapper.f383514q = this.f259893d;
        return videoReporterWrapper;
    }
}
