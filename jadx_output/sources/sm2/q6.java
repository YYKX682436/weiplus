package sm2;

/* loaded from: classes3.dex */
public final class q6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409671e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(fm2.a aVar, sm2.o4 o4Var) {
        super(0);
        this.f409670d = aVar;
        this.f409671e = o4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.a aVar = this.f409670d;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) aVar.findViewById(com.tencent.mm.R.id.f2r);
        boolean z17 = dk2.ef.f233404s;
        sm2.o4 o4Var = this.f409671e;
        if (z17) {
            com.tencent.mm.plugin.finder.live.plugin.kn knVar = (com.tencent.mm.plugin.finder.live.plugin.kn) o4Var.N(new sm2.o6(viewGroup, aVar));
            o4Var.I = knVar;
            return knVar;
        }
        com.tencent.mm.plugin.finder.live.plugin.bn bnVar = (com.tencent.mm.plugin.finder.live.plugin.bn) o4Var.N(new sm2.p6(viewGroup, aVar));
        o4Var.H = bnVar;
        return bnVar;
    }
}
