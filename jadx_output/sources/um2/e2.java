package um2;

/* loaded from: classes3.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.c f428774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428775e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(fm2.c cVar, um2.x5 x5Var) {
        super(0);
        this.f428774d = cVar;
        this.f428775e = x5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.c cVar = this.f428774d;
        android.view.View findViewById = cVar.findViewById(com.tencent.mm.R.id.f485639ig1);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.nd0((android.view.ViewGroup) findViewById, cVar, this.f428775e.f19608e);
    }
}
