package sm2;

/* loaded from: classes3.dex */
public final class s6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409697e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409696d = o4Var;
        this.f409697e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.o4 o4Var = this.f409696d;
        com.tencent.mm.plugin.finder.live.plugin.dq dqVar = o4Var.K;
        if (dqVar == null) {
            dqVar = (com.tencent.mm.plugin.finder.live.plugin.dq) o4Var.N(new sm2.r6(this.f409697e));
        }
        o4Var.K = dqVar;
        return dqVar;
    }
}
