package sm2;

/* loaded from: classes3.dex */
public final class f9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409461e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409460d = o4Var;
        this.f409461e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.e9 e9Var = new sm2.e9(this.f409461e);
        sm2.o4 o4Var = this.f409460d;
        com.tencent.mm.plugin.finder.live.plugin.f1 f1Var = (com.tencent.mm.plugin.finder.live.plugin.f1) o4Var.N(e9Var);
        o4Var.G = f1Var;
        return f1Var;
    }
}
