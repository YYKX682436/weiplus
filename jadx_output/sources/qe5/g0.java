package qe5;

/* loaded from: classes12.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f362113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f362114e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qe5.m0 f362115f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(long j17, long j18, qe5.m0 m0Var) {
        super(0);
        this.f362113d = j17;
        this.f362114e = j18;
        this.f362115f = m0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        j75.f Q6;
        long j17 = this.f362113d;
        long j18 = this.f362114e;
        float f17 = j17 == 0 ? 0.0f : (((float) j18) * 100) / ((float) j17);
        qe5.m0 m0Var = this.f362115f;
        if (j18 < j17 && m0Var.Z6().v().getVisibility() != 0 && (Q6 = m0Var.Q6()) != null) {
            Q6.B3(new kd5.v(true));
        }
        m0Var.Z6().v().setProgress((int) f17);
        return jz5.f0.f302826a;
    }
}
