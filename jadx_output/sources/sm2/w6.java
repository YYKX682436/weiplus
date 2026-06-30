package sm2;

/* loaded from: classes3.dex */
public final class w6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409772e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409771d = o4Var;
        this.f409772e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.v6 v6Var = new sm2.v6(this.f409772e);
        sm2.o4 o4Var = this.f409771d;
        com.tencent.mm.plugin.finder.live.plugin.v6 v6Var2 = (com.tencent.mm.plugin.finder.live.plugin.v6) o4Var.N(v6Var);
        o4Var.f409639y = v6Var2;
        return v6Var2;
    }
}
