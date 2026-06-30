package sm2;

/* loaded from: classes3.dex */
public final class x4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409783e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409782d = o4Var;
        this.f409783e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.w4 w4Var = new sm2.w4(this.f409783e);
        sm2.o4 o4Var = this.f409782d;
        com.tencent.mm.plugin.finder.live.plugin.c6 c6Var = (com.tencent.mm.plugin.finder.live.plugin.c6) o4Var.N(w4Var);
        o4Var.f409609e0 = c6Var;
        return c6Var;
    }
}
