package hz0;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f286257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f286258e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j17, int i17) {
        super(0);
        this.f286257d = j17;
        this.f286258e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String format = java.lang.String.format("%.1f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(((float) this.f286257d) / 1000.0f)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, r26.b0.b("\n                template video make done!\n                totalCost = [" + format + "s]\n                workType = [" + this.f286258e + "]\n                "), 1).show();
        return jz5.f0.f302826a;
    }
}
