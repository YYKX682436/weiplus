package f65;

/* loaded from: classes12.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f65.y f259908d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(f65.y yVar) {
        super(1);
        this.f259908d = yVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.pz6 videoReporterWrapper = (r45.pz6) obj;
        kotlin.jvm.internal.o.g(videoReporterWrapper, "videoReporterWrapper");
        videoReporterWrapper.f383507g = java.lang.System.currentTimeMillis();
        videoReporterWrapper.f383516s = this.f259908d.f260018d;
        return videoReporterWrapper;
    }
}
