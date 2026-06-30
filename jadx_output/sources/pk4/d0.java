package pk4;

/* loaded from: classes4.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f356470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f356471e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f356472f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(int i17, long j17, long j18) {
        super(1);
        this.f356470d = i17;
        this.f356471e = j17;
        this.f356472f = j18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ok4.d report = (ok4.d) obj;
        kotlin.jvm.internal.o.g(report, "$this$report");
        report.t(this.f356470d, this.f356471e, this.f356472f);
        return jz5.f0.f302826a;
    }
}
