package sm2;

/* loaded from: classes3.dex */
public final class e6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409442e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409441d = o4Var;
        this.f409442e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.d6 d6Var = new sm2.d6(this.f409442e);
        sm2.o4 o4Var = this.f409441d;
        com.tencent.mm.plugin.finder.live.plugin.v5 v5Var = (com.tencent.mm.plugin.finder.live.plugin.v5) o4Var.N(d6Var);
        o4Var.f409614h = v5Var;
        return v5Var;
    }
}
