package sm2;

/* loaded from: classes3.dex */
public final class z4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409814e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409813d = o4Var;
        this.f409814e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.y4 y4Var = new sm2.y4(this.f409814e);
        sm2.o4 o4Var = this.f409813d;
        com.tencent.mm.plugin.finder.live.plugin.r9 r9Var = (com.tencent.mm.plugin.finder.live.plugin.r9) o4Var.N(y4Var);
        o4Var.T = r9Var;
        return r9Var;
    }
}
