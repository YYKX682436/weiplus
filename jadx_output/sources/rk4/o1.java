package rk4;

/* loaded from: classes11.dex */
public final class o1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f396871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f396871d = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.pigeon.ting.TingUserContactInfo tingUserContactInfo;
        bw5.y0 y0Var = (bw5.y0) obj;
        if (y0Var != null) {
            boolean[] zArr = y0Var.f35298h;
            tingUserContactInfo = new com.tencent.pigeon.ting.TingUserContactInfo(zArr[1] ? y0Var.f35294d : "", zArr[2] ? y0Var.f35295e : "", zArr[3] ? y0Var.f35296f : "", null, 8, null);
        } else {
            tingUserContactInfo = null;
        }
        this.f396871d.f310123d = tingUserContactInfo;
        return jz5.f0.f302826a;
    }
}
