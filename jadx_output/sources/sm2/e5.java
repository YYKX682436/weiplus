package sm2;

/* loaded from: classes3.dex */
public final class e5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409440e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409439d = o4Var;
        this.f409440e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.d5 d5Var = new sm2.d5(this.f409440e);
        sm2.o4 o4Var = this.f409439d;
        com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = (com.tencent.mm.plugin.finder.live.plugin.x7) o4Var.N(d5Var);
        o4Var.M = x7Var;
        return x7Var;
    }
}
