package el2;

/* loaded from: classes3.dex */
public final class u1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.y42 f253919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.c2 f253920e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(r45.y42 y42Var, el2.c2 c2Var) {
        super(1);
        this.f253919d = y42Var;
        this.f253920e = c2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.zs1 zs1Var = (r45.zs1) obj;
        r45.y42 y42Var = this.f253919d;
        com.tencent.mm.protobuf.g byteString = zs1Var != null ? zs1Var.getByteString(1) : y42Var.getByteString(2);
        el2.c2 c2Var = this.f253920e;
        el2.c2.k(c2Var, new el2.t1(c2Var, byteString, y42Var));
        return jz5.f0.f302826a;
    }
}
