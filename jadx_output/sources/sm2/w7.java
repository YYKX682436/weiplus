package sm2;

/* loaded from: classes3.dex */
public final class w7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409774e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409773d = o4Var;
        this.f409774e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.v7 v7Var = new sm2.v7(this.f409774e);
        sm2.o4 o4Var = this.f409773d;
        com.tencent.mm.plugin.finder.live.plugin.x5 x5Var = (com.tencent.mm.plugin.finder.live.plugin.x5) o4Var.N(v7Var);
        o4Var.Z = x5Var;
        return x5Var;
    }
}
