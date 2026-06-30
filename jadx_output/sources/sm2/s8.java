package sm2;

/* loaded from: classes3.dex */
public final class s8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409701e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409700d = o4Var;
        this.f409701e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.r8 r8Var = new sm2.r8(this.f409701e);
        sm2.o4 o4Var = this.f409700d;
        com.tencent.mm.plugin.finder.live.plugin.f10 f10Var = (com.tencent.mm.plugin.finder.live.plugin.f10) o4Var.N(r8Var);
        o4Var.f409617i0 = f10Var;
        return f10Var;
    }
}
