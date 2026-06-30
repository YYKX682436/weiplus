package sm2;

/* loaded from: classes3.dex */
public final class a8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409361e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409360d = o4Var;
        this.f409361e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.z7 z7Var = new sm2.z7(this.f409361e);
        sm2.o4 o4Var = this.f409360d;
        com.tencent.mm.plugin.finder.live.plugin.f8 f8Var = (com.tencent.mm.plugin.finder.live.plugin.f8) o4Var.N(z7Var);
        o4Var.f409605a0 = f8Var;
        return f8Var;
    }
}
