package sm2;

/* loaded from: classes3.dex */
public final class g5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409472e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409471d = o4Var;
        this.f409472e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.f5 f5Var = new sm2.f5(this.f409472e);
        sm2.o4 o4Var = this.f409471d;
        com.tencent.mm.plugin.finder.live.plugin.r30 r30Var = (com.tencent.mm.plugin.finder.live.plugin.r30) o4Var.N(f5Var);
        o4Var.X = r30Var;
        return r30Var;
    }
}
