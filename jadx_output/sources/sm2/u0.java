package sm2;

/* loaded from: classes3.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409731e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(fm2.a aVar, sm2.o4 o4Var) {
        super(0);
        this.f409730d = aVar;
        this.f409731e = o4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.a aVar = this.f409730d;
        android.view.View findViewById = aVar.findViewById(com.tencent.mm.R.id.f39);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        fm2.a aVar2 = this.f409730d;
        com.tencent.mm.plugin.finder.live.util.o1 o1Var = ((mm2.c1) this.f409731e.c(mm2.c1.class)).f328806g;
        android.view.View findViewById2 = aVar.findViewById(com.tencent.mm.R.id.f38);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.ap((android.view.ViewGroup) findViewById, aVar2, o1Var, (android.view.ViewGroup) findViewById2, false, 16, null);
    }
}
