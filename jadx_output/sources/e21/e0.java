package e21;

/* loaded from: classes11.dex */
public final class e0 {

    /* renamed from: d, reason: collision with root package name */
    public static final e21.w f246510d = new e21.w(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f246511a = new java.util.LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f246512b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f246513c = jz5.h.b(e21.d0.f246503d);

    public final void a(xg3.q0 operation, int i17) {
        kotlin.jvm.internal.o.g(operation, "operation");
        ((ku5.t0) ku5.t0.f312615d).r(new e21.a0(this, operation, i17), "oplog_reporter_serial_tag");
    }

    public final void b(xg3.q0 op6, java.lang.Integer num, int i17) {
        kotlin.jvm.internal.o.g(op6, "op");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((ku5.t0) ku5.t0.f312615d).r(new e21.b0(op6, currentTimeMillis, this, num, i17), "oplog_reporter_serial_tag");
    }

    public final void c(xg3.q0 op6, java.lang.Integer num, int i17, e21.x reason) {
        kotlin.jvm.internal.o.g(op6, "op");
        kotlin.jvm.internal.o.g(reason, "reason");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((ku5.t0) ku5.t0.f312615d).r(new e21.c0(op6, this, currentTimeMillis, reason, num, i17), "oplog_reporter_serial_tag");
    }
}
