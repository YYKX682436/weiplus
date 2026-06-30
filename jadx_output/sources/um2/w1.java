package um2;

/* loaded from: classes3.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f429003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.c f429004e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(um2.x5 x5Var, fm2.c cVar) {
        super(0);
        this.f429003d = x5Var;
        this.f429004e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var = this.f429003d.f429038h;
        if (ob0Var != null) {
            return ob0Var;
        }
        fm2.c cVar = this.f429004e;
        android.view.View findViewById = cVar.findViewById(com.tencent.mm.R.id.ig7);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.ob0((android.view.ViewGroup) findViewById, cVar);
    }
}
