package sm2;

/* loaded from: classes3.dex */
public final class e8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409446e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409445d = o4Var;
        this.f409446e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.d8 d8Var = new sm2.d8(this.f409446e);
        sm2.o4 o4Var = this.f409445d;
        com.tencent.mm.plugin.finder.live.plugin.wh whVar = (com.tencent.mm.plugin.finder.live.plugin.wh) o4Var.N(d8Var);
        o4Var.f409606b0 = whVar;
        return whVar;
    }
}
