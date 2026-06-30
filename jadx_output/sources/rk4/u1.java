package rk4;

/* loaded from: classes11.dex */
public final class u1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f397000d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f397000d = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.s0 s0Var = (bw5.s0) obj;
        if (s0Var != null) {
            this.f397000d.f310123d = new com.tencent.pigeon.ting.TingPoiInfo(java.lang.Double.valueOf(s0Var.f32738d), java.lang.Double.valueOf(s0Var.f32739e), java.lang.Double.valueOf(s0Var.f32740f), null, 8, null);
        }
        return jz5.f0.f302826a;
    }
}
