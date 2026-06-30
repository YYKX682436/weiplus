package sm2;

/* loaded from: classes3.dex */
public final class j9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409528e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409527d = o4Var;
        this.f409528e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.i9 i9Var = new sm2.i9(this.f409528e);
        sm2.o4 o4Var = this.f409527d;
        com.tencent.mm.plugin.finder.live.plugin.de0 de0Var = (com.tencent.mm.plugin.finder.live.plugin.de0) o4Var.N(i9Var);
        o4Var.f409638x = de0Var;
        return de0Var;
    }
}
