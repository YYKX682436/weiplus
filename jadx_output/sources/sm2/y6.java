package sm2;

/* loaded from: classes3.dex */
public final class y6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409802e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409801d = o4Var;
        this.f409802e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.x6 x6Var = new sm2.x6(this.f409802e);
        sm2.o4 o4Var = this.f409801d;
        com.tencent.mm.plugin.finder.live.plugin.v70 v70Var = (com.tencent.mm.plugin.finder.live.plugin.v70) o4Var.N(x6Var);
        o4Var.L = v70Var;
        return v70Var;
    }
}
