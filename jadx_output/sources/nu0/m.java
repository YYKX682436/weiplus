package nu0;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.p f340013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.imagestudio.MJImageLayer f340015f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(nu0.p pVar, java.lang.String str, com.tencent.maas.imagestudio.MJImageLayer mJImageLayer) {
        super(1);
        this.f340013d = pVar;
        this.f340014e = str;
        this.f340015f = mJImageLayer;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.ze2 ze2Var = (r45.ze2) obj;
        java.lang.String str = this.f340014e;
        nu0.p pVar = this.f340013d;
        if (ze2Var == null) {
            pVar.q7().f7(str);
        } else {
            this.f340015f.d(by0.h.b(ze2Var));
            nu0.q0.Y6(pVar.q7(), false, new nu0.j(null, pVar, str), 1, null);
            pVar.r7(str);
        }
        return jz5.f0.f302826a;
    }
}
