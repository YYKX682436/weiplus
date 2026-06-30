package sm2;

/* loaded from: classes3.dex */
public final class v4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409756e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409755d = o4Var;
        this.f409756e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.u4 u4Var = new sm2.u4(this.f409756e);
        sm2.o4 o4Var = this.f409755d;
        com.tencent.mm.plugin.finder.live.plugin.l8 l8Var = (com.tencent.mm.plugin.finder.live.plugin.l8) o4Var.N(u4Var);
        o4Var.f409608d0 = l8Var;
        return l8Var;
    }
}
