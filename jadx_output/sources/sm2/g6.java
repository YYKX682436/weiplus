package sm2;

/* loaded from: classes3.dex */
public final class g6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409474e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409473d = o4Var;
        this.f409474e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.f6 f6Var = new sm2.f6(this.f409474e);
        sm2.o4 o4Var = this.f409473d;
        com.tencent.mm.plugin.finder.live.plugin.ty tyVar = (com.tencent.mm.plugin.finder.live.plugin.ty) o4Var.N(f6Var);
        o4Var.f409632r = tyVar;
        return tyVar;
    }
}
