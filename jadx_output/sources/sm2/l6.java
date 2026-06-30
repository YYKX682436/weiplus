package sm2;

/* loaded from: classes3.dex */
public final class l6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409554e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409553d = o4Var;
        this.f409554e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.a aVar = this.f409554e;
        sm2.o4 o4Var = this.f409553d;
        com.tencent.mm.plugin.finder.live.plugin.w00 w00Var = (com.tencent.mm.plugin.finder.live.plugin.w00) o4Var.N(new sm2.k6(aVar, o4Var));
        o4Var.f409634t = w00Var;
        return w00Var;
    }
}
