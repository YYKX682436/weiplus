package sm2;

/* loaded from: classes3.dex */
public final class r5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409685e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409684d = o4Var;
        this.f409685e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.k5 k5Var = new sm2.k5(this.f409685e);
        sm2.o4 o4Var = this.f409684d;
        com.tencent.mm.plugin.finder.live.plugin.j90 j90Var = (com.tencent.mm.plugin.finder.live.plugin.j90) o4Var.N(k5Var);
        o4Var.f409618j = j90Var;
        return j90Var;
    }
}
