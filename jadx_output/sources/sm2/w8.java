package sm2;

/* loaded from: classes3.dex */
public final class w8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409776e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409775d = o4Var;
        this.f409776e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.v8 v8Var = new sm2.v8(this.f409776e);
        sm2.o4 o4Var = this.f409775d;
        com.tencent.mm.plugin.finder.live.plugin.t20 t20Var = (com.tencent.mm.plugin.finder.live.plugin.t20) o4Var.N(v8Var);
        o4Var.f409613g0 = t20Var;
        return t20Var;
    }
}
