package es2;

/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f256399d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ es2.h0 f256400e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(long j17, es2.h0 h0Var) {
        super(1);
        this.f256399d = j17;
        this.f256400e = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cs2.p it = (cs2.p) obj;
        kotlin.jvm.internal.o.g(it, "it");
        long j17 = it.f222089f2;
        long j18 = this.f256399d;
        boolean z17 = j17 == j18;
        if (z17) {
            com.tencent.mars.xlog.Log.i(this.f256400e.f256375h, "cancel remove waiting feed:".concat(pm0.v.u(j18)));
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
