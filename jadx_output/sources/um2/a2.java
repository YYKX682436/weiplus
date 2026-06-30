package um2;

/* loaded from: classes3.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.c f428712e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(um2.x5 x5Var, fm2.c cVar) {
        super(0);
        this.f428711d = x5Var;
        this.f428712e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.oz ozVar = this.f428711d.f429050l;
        if (ozVar != null) {
            return ozVar;
        }
        fm2.c cVar = this.f428712e;
        android.view.View findViewById = cVar.findViewById(com.tencent.mm.R.id.euw);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.oz((android.view.ViewGroup) findViewById, cVar);
    }
}
