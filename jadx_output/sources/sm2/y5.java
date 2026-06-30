package sm2;

/* loaded from: classes3.dex */
public final class y5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409800e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409799d = o4Var;
        this.f409800e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.x5 x5Var = new sm2.x5(this.f409800e);
        sm2.o4 o4Var = this.f409799d;
        com.tencent.mm.plugin.finder.live.plugin.a80 a80Var = (com.tencent.mm.plugin.finder.live.plugin.a80) o4Var.N(x5Var);
        o4Var.f409630p = a80Var;
        return a80Var;
    }
}
