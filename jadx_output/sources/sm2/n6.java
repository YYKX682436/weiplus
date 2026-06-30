package sm2;

/* loaded from: classes3.dex */
public final class n6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409592e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409591d = o4Var;
        this.f409592e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.a aVar = this.f409592e;
        sm2.o4 o4Var = this.f409591d;
        com.tencent.mm.plugin.finder.live.plugin.ap apVar = (com.tencent.mm.plugin.finder.live.plugin.ap) o4Var.N(new sm2.m6(aVar, o4Var));
        o4Var.f409604J = apVar;
        return apVar;
    }
}
