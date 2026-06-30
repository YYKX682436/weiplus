package te2;

/* loaded from: classes3.dex */
public final class t5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f418435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418436e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(java.lang.Integer num, te2.p8 p8Var) {
        super(1);
        this.f418435d = num;
        this.f418436e = p8Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.h32 it = (r45.h32) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("originSendType:");
        java.lang.Integer num = this.f418435d;
        sb6.append(num);
        sb6.append(" change send Type to: ");
        sb6.append(it.getInteger(18));
        com.tencent.mars.xlog.Log.i("FinderLiveNoticeQRCodeUIC", sb6.toString());
        int integer = it.getInteger(18);
        if (num == null || num.intValue() != integer) {
            te2.p8 p8Var = this.f418436e;
            te2.p8.n7(p8Var, 11, 0, 2, null);
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new te2.s5(p8Var, it, num, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
