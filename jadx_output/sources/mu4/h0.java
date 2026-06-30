package mu4;

/* loaded from: classes7.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f331420a;

    /* renamed from: b, reason: collision with root package name */
    public final mu4.g0 f331421b;

    /* renamed from: c, reason: collision with root package name */
    public final long f331422c;

    public h0(long j17, mu4.g0 type) {
        kotlin.jvm.internal.o.g(type, "type");
        this.f331420a = j17;
        this.f331421b = type;
        this.f331422c = 1478L;
    }

    public final void a(mu4.f0 item) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        long j17 = this.f331422c;
        long j18 = item.f331407a;
        g0Var.B(j17, j18);
        long j19 = this.f331420a;
        if (j19 > 0) {
            g0Var.B(j19, j18);
        }
    }
}
