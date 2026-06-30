package sm2;

/* loaded from: classes3.dex */
public final class q7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409673e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409672d = o4Var;
        this.f409673e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.p7 p7Var = new sm2.p7(this.f409673e);
        sm2.o4 o4Var = this.f409672d;
        com.tencent.mm.plugin.finder.live.plugin.ww wwVar = (com.tencent.mm.plugin.finder.live.plugin.ww) o4Var.N(p7Var);
        o4Var.O = wwVar;
        return wwVar;
    }
}
