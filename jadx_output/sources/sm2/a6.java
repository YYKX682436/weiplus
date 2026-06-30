package sm2;

/* loaded from: classes3.dex */
public final class a6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409357e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409356d = o4Var;
        this.f409357e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.z5 z5Var = new sm2.z5(this.f409357e);
        sm2.o4 o4Var = this.f409356d;
        com.tencent.mm.plugin.finder.live.plugin.k5 k5Var = (com.tencent.mm.plugin.finder.live.plugin.k5) o4Var.N(z5Var);
        o4Var.f409631q = k5Var;
        return k5Var;
    }
}
