package dl4;

/* loaded from: classes3.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.w1 f235429e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(java.lang.String str, com.tencent.mm.sdk.platformtools.w1 w1Var) {
        super(1);
        this.f235428d = str;
        this.f235429e = w1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ff0.z zVar = (ff0.z) obj;
        java.lang.String str = this.f235428d;
        pm0.v.X(new dl4.j1(zVar, str));
        java.util.HashMap hashMap = dl4.m1.f235436a;
        ((ku5.t0) ku5.t0.f312615d).h(new dl4.g1(str, zVar, this.f235429e), "MicroMsg.TingPickImageColorManager");
        return jz5.f0.f302826a;
    }
}
