package sm2;

/* loaded from: classes3.dex */
public final class q8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409675e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409674d = o4Var;
        this.f409675e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.o4 o4Var = this.f409674d;
        com.tencent.mm.plugin.finder.live.plugin.k80 k80Var = o4Var.f409611f0;
        if (k80Var == null) {
            k80Var = (com.tencent.mm.plugin.finder.live.plugin.k80) o4Var.N(new sm2.p8(this.f409675e));
        }
        o4Var.f409611f0 = k80Var;
        return k80Var;
    }
}
