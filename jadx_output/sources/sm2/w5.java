package sm2;

/* loaded from: classes3.dex */
public final class w5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409770e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409769d = o4Var;
        this.f409770e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.v5 v5Var = new sm2.v5(this.f409770e);
        sm2.o4 o4Var = this.f409769d;
        com.tencent.mm.plugin.finder.live.plugin.kh khVar = (com.tencent.mm.plugin.finder.live.plugin.kh) o4Var.N(v5Var);
        o4Var.f409622l = khVar;
        return khVar;
    }
}
