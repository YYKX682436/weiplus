package hb2;

/* loaded from: classes2.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.gc f280087d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(zy2.gc gcVar) {
        super(1);
        this.f280087d = gcVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.ri2 modUserInfo = (r45.ri2) obj;
        kotlin.jvm.internal.o.g(modUserInfo, "modUserInfo");
        zy2.gc gcVar = this.f280087d;
        if (gcVar != null) {
            r45.ix0 ix0Var = new r45.ix0();
            ix0Var.set(0, 1);
            ix0Var.set(1, -1);
            gcVar.r5(modUserInfo, ix0Var);
        }
        return jz5.f0.f302826a;
    }
}
