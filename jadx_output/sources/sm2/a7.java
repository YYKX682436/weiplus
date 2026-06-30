package sm2;

/* loaded from: classes3.dex */
public final class a7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409359e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409358d = o4Var;
        this.f409359e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.z6 z6Var = new sm2.z6(this.f409359e);
        sm2.o4 o4Var = this.f409358d;
        zi2.w wVar = (zi2.w) o4Var.N(z6Var);
        o4Var.P = wVar;
        return wVar;
    }
}
