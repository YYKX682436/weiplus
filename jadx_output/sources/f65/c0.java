package f65;

/* loaded from: classes12.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f259872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f259873e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(int i17, int i18) {
        super(1);
        this.f259872d = i17;
        this.f259873e = i18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.pz6 videoReporterWrapper = (r45.pz6) obj;
        kotlin.jvm.internal.o.g(videoReporterWrapper, "videoReporterWrapper");
        videoReporterWrapper.f383505e = java.lang.System.currentTimeMillis();
        videoReporterWrapper.f383511n = this.f259872d;
        videoReporterWrapper.f383512o = this.f259873e;
        return videoReporterWrapper;
    }
}
