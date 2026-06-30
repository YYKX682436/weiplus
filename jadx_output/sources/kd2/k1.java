package kd2;

/* loaded from: classes2.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kd2.p1 f306769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f306770e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(kd2.p1 p1Var, boolean z17) {
        super(0);
        this.f306769d = p1Var;
        this.f306770e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        vo2.d dVar;
        kd2.p1 p1Var = this.f306769d;
        kd2.q0 q0Var = p1Var.C;
        if ((q0Var != null ? q0Var.f306801b : 0L) > 0 && (dVar = p1Var.f306789z) != null) {
            long j17 = q0Var != null ? q0Var.f306801b : 0L;
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = ((vo2.c) dVar).f438559b;
            if (finderThumbPlayerProxy != null) {
                finderThumbPlayerProxy.f0(j17, true, 3);
            }
        }
        kd2.p1 p1Var2 = this.f306769d;
        if (!this.f306770e) {
            kd2.q0 q0Var2 = p1Var2.C;
            if (!(q0Var2 != null && q0Var2.f306808i)) {
                z17 = false;
                kd2.p1.T0(p1Var2, z17, true, false, 4, null);
                return jz5.f0.f302826a;
            }
        }
        z17 = true;
        kd2.p1.T0(p1Var2, z17, true, false, 4, null);
        return jz5.f0.f302826a;
    }
}
