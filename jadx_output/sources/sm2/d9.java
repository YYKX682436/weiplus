package sm2;

/* loaded from: classes3.dex */
public final class d9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409432e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409431d = o4Var;
        this.f409432e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.c9 c9Var = new sm2.c9(this.f409432e);
        sm2.o4 o4Var = this.f409431d;
        com.tencent.mm.plugin.finder.live.plugin.d1 d1Var = (com.tencent.mm.plugin.finder.live.plugin.d1) o4Var.N(c9Var);
        o4Var.F = d1Var;
        return d1Var;
    }
}
