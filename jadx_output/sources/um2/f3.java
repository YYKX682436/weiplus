package um2;

/* loaded from: classes3.dex */
public final class f3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.c f428793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428794e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(fm2.c cVar, um2.x5 x5Var) {
        super(0);
        this.f428793d = cVar;
        this.f428794e = x5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.c cVar = this.f428793d;
        android.view.View findViewById = cVar.findViewById(com.tencent.mm.R.id.f39);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        fm2.c cVar2 = this.f428793d;
        com.tencent.mm.plugin.finder.live.util.o1 o1Var = ((mm2.c1) this.f428794e.c(mm2.c1.class)).f328806g;
        android.view.View findViewById2 = cVar.findViewById(com.tencent.mm.R.id.f38);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.ap((android.view.ViewGroup) findViewById, cVar2, o1Var, (android.view.ViewGroup) findViewById2, true);
    }
}
