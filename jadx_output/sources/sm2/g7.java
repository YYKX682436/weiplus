package sm2;

/* loaded from: classes3.dex */
public final class g7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409476e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409475d = o4Var;
        this.f409476e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.f7 f7Var = new sm2.f7(this.f409476e);
        sm2.o4 o4Var = this.f409475d;
        com.tencent.mm.plugin.finder.live.plugin.bb0 bb0Var = (com.tencent.mm.plugin.finder.live.plugin.bb0) o4Var.N(f7Var);
        o4Var.Q = bb0Var;
        return bb0Var;
    }
}
