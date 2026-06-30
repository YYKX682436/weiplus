package sm2;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.q f409463e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(sm2.o4 o4Var, km2.q qVar) {
        super(1);
        this.f409462d = o4Var;
        this.f409463e = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.plugin.x7 x7Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (!booleanValue && (x7Var = this.f409462d.M) != null) {
            x7Var.G1(booleanValue, this.f409463e);
        }
        return jz5.f0.f302826a;
    }
}
