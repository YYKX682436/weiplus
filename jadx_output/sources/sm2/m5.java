package sm2;

/* loaded from: classes3.dex */
public final class m5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409569e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409568d = o4Var;
        this.f409569e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.l5 l5Var = new sm2.l5(this.f409569e);
        sm2.o4 o4Var = this.f409568d;
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = (com.tencent.mm.plugin.finder.live.plugin.mg) o4Var.N(l5Var);
        o4Var.f409628o = mgVar;
        return mgVar;
    }
}
