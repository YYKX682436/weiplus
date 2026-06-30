package sm2;

/* loaded from: classes3.dex */
public final class o5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409641d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409642e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409641d = o4Var;
        this.f409642e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.n5 n5Var = new sm2.n5(this.f409642e);
        sm2.o4 o4Var = this.f409641d;
        com.tencent.mm.plugin.finder.live.plugin.c4 c4Var = (com.tencent.mm.plugin.finder.live.plugin.c4) o4Var.N(n5Var);
        o4Var.N = c4Var;
        return c4Var;
    }
}
