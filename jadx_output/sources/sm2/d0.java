package sm2;

/* loaded from: classes3.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409421d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(sm2.o4 o4Var) {
        super(5);
        this.f409421d = o4Var;
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).intValue();
        java.lang.String errMsg = (java.lang.String) obj4;
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.i(this.f409421d.f409610f, "close live result:" + booleanValue);
        return jz5.f0.f302826a;
    }
}
