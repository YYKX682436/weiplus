package sm2;

/* loaded from: classes3.dex */
public final class e7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409444e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409443d = o4Var;
        this.f409444e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.d7 d7Var = new sm2.d7(this.f409444e);
        sm2.o4 o4Var = this.f409443d;
        com.tencent.mm.plugin.finder.live.plugin.na naVar = (com.tencent.mm.plugin.finder.live.plugin.na) o4Var.N(d7Var);
        o4Var.W = naVar;
        return naVar;
    }
}
