package nl4;

/* loaded from: classes11.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl4.r f338208d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(nl4.r rVar) {
        super(3);
        this.f338208d = rVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        nl4.r rVar = this.f338208d;
        com.tencent.mars.xlog.Log.e(rVar.f338242l, "TingFinderPlayerCore-Trace onTPPlayError, errorCode:" + intValue + ", errorType:" + intValue2);
        java.lang.String str = "errorType:" + intValue2 + "|errorCode:" + intValue;
        ll4.a aVar = rVar.f338231a;
        if (aVar != null) {
            ((kl4.n) aVar).b(12, str);
        }
        return jz5.f0.f302826a;
    }
}
