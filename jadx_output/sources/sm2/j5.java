package sm2;

/* loaded from: classes3.dex */
public final class j5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409522e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409521d = o4Var;
        this.f409522e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.p4 p4Var = new sm2.p4(this.f409522e);
        sm2.o4 o4Var = this.f409521d;
        com.tencent.mm.plugin.finder.live.plugin.o9 o9Var = (com.tencent.mm.plugin.finder.live.plugin.o9) o4Var.N(p4Var);
        o4Var.f409616i = o9Var;
        return o9Var;
    }
}
