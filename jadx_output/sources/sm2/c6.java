package sm2;

/* loaded from: classes3.dex */
public final class c6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409415e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409414d = o4Var;
        this.f409415e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.b6 b6Var = new sm2.b6(this.f409415e);
        sm2.o4 o4Var = this.f409414d;
        com.tencent.mm.plugin.finder.live.plugin.a5 a5Var = (com.tencent.mm.plugin.finder.live.plugin.a5) o4Var.N(b6Var);
        o4Var.f409640z = a5Var;
        return a5Var;
    }
}
