package kl2;

/* loaded from: classes3.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl2.q f308802d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(kl2.q qVar) {
        super(1);
        this.f308802d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        kl2.q qVar = this.f308802d;
        jl2.a aVar = qVar.f308804h;
        if (booleanValue) {
            il2.s.f292086a.b(zl2.e5.f473750t, qVar.f308807n);
            zl2.j5.f473850a.e(qVar.f308807n);
            com.tencent.mars.xlog.Log.i("RestrictConsumeLicensePanel", "updateQuotaToastConfig reachAmountQuota: " + qVar.f308807n);
            ((mm2.v5) ((il2.r) aVar).S0().a(mm2.v5.class)).f329488n.postValue(mm2.u5.f329464a);
        } else {
            ((mm2.v5) ((il2.r) aVar).S0().a(mm2.v5.class)).f329488n.postValue(mm2.r5.f329380a);
        }
        if (booleanValue) {
            qVar.a();
        }
        return jz5.f0.f302826a;
    }
}
