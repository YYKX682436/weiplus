package sm2;

/* loaded from: classes3.dex */
public final class t5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409717e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409716d = o4Var;
        this.f409717e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.s5 s5Var = new sm2.s5(this.f409717e);
        sm2.o4 o4Var = this.f409716d;
        com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var = (com.tencent.mm.plugin.finder.live.plugin.nd0) o4Var.N(s5Var);
        o4Var.f409620k = nd0Var;
        return nd0Var;
    }
}
