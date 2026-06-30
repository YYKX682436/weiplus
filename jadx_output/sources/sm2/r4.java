package sm2;

/* loaded from: classes3.dex */
public final class r4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409683e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409682d = o4Var;
        this.f409683e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.q4 q4Var = new sm2.q4(this.f409683e);
        sm2.o4 o4Var = this.f409682d;
        com.tencent.mm.plugin.finder.live.plugin.fa faVar = (com.tencent.mm.plugin.finder.live.plugin.fa) o4Var.N(q4Var);
        o4Var.R = faVar;
        return faVar;
    }
}
