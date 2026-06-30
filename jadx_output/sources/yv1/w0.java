package yv1;

/* loaded from: classes3.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f466180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f466181e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f466182f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f466183g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(long j17, long j18, long j19, long j27) {
        super(1);
        this.f466180d = j17;
        this.f466181e = j18;
        this.f466182f = j19;
        this.f466183g = j27;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (r26.i0.y(it, "1:", false)) {
            return "1:" + (this.f466180d + this.f466181e);
        }
        if (r26.i0.y(it, "2:", false)) {
            return "2:" + this.f466182f;
        }
        if (!r26.i0.y(it, "3:", false)) {
            return it;
        }
        return "3:" + this.f466183g;
    }
}
