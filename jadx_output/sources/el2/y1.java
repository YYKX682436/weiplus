package el2;

/* loaded from: classes3.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.y42 f253950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.c2 f253951e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.b0 f253952f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(r45.y42 y42Var, el2.c2 c2Var, cm2.b0 b0Var) {
        super(1);
        this.f253950d = y42Var;
        this.f253951e = c2Var;
        this.f253952f = b0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.zs1 zs1Var = (r45.zs1) obj;
        com.tencent.mm.protobuf.g byteString = zs1Var != null ? zs1Var.getByteString(1) : this.f253950d.getByteString(2);
        cm2.b0 b0Var = this.f253952f;
        el2.c2 c2Var = this.f253951e;
        el2.c2.k(c2Var, new el2.x1(b0Var, c2Var, byteString));
        return jz5.f0.f302826a;
    }
}
