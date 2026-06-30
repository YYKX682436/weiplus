package sm2;

/* loaded from: classes3.dex */
public final class u7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409740e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409739d = o4Var;
        this.f409740e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.t7 t7Var = new sm2.t7(this.f409740e);
        sm2.o4 o4Var = this.f409739d;
        com.tencent.mm.plugin.finder.live.plugin.q5 q5Var = (com.tencent.mm.plugin.finder.live.plugin.q5) o4Var.N(t7Var);
        o4Var.Y = q5Var;
        return q5Var;
    }
}
