package nl4;

/* loaded from: classes11.dex */
public final /* synthetic */ class g extends kotlin.jvm.internal.m implements yz5.p {
    public g(java.lang.Object obj) {
        super(2, obj, nl4.r.class, "onStateChange", "onStateChange(II)V", 0);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ll4.a aVar;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        nl4.r rVar = (nl4.r) this.receiver;
        rVar.getClass();
        int i17 = 4;
        if (intValue2 == 4) {
            i17 = 2;
        } else if (intValue2 == 5) {
            i17 = 3;
        } else if (intValue2 == 6) {
            i17 = 5;
        } else if (intValue2 != 7) {
            i17 = (intValue2 == 9 && !rVar.f338235e) ? 11 : -1;
        }
        com.tencent.mars.xlog.Log.i(rVar.f338242l, "onStateChange curState:" + intValue2 + ", preState:" + intValue + ", event:" + i17);
        if (i17 > 0 && (aVar = rVar.f338231a) != null) {
            ll4.a.a(aVar, i17, null, 2, null);
        }
        return jz5.f0.f302826a;
    }
}
