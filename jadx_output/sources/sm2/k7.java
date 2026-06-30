package sm2;

/* loaded from: classes3.dex */
public final class k7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409540e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409539d = o4Var;
        this.f409540e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.j7 j7Var = new sm2.j7(this.f409540e);
        sm2.o4 o4Var = this.f409539d;
        com.tencent.mm.plugin.finder.live.plugin.b9 b9Var = (com.tencent.mm.plugin.finder.live.plugin.b9) o4Var.N(j7Var);
        o4Var.V = b9Var;
        return b9Var;
    }
}
