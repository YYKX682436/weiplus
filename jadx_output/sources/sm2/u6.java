package sm2;

/* loaded from: classes3.dex */
public final class u6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409738e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409737d = o4Var;
        this.f409738e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.o4 o4Var = this.f409737d;
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = o4Var.f409607c0;
        if (hmVar == null) {
            hmVar = (com.tencent.mm.plugin.finder.live.plugin.hm) o4Var.N(new sm2.t6(this.f409738e));
        }
        o4Var.f409607c0 = hmVar;
        return hmVar;
    }
}
