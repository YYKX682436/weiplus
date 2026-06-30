package tm2;

/* loaded from: classes3.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.b f420559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f420560e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(fm2.b bVar, tm2.s2 s2Var) {
        super(0);
        this.f420559d = bVar;
        this.f420560e = s2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.b bVar = this.f420559d;
        android.view.View findViewById = bVar.findViewById(com.tencent.mm.R.id.f39);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        fm2.b bVar2 = this.f420559d;
        com.tencent.mm.plugin.finder.live.util.o1 o1Var = ((mm2.c1) this.f420560e.c(mm2.c1.class)).f328806g;
        android.view.View findViewById2 = bVar.findViewById(com.tencent.mm.R.id.f38);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.ap((android.view.ViewGroup) findViewById, bVar2, o1Var, (android.view.ViewGroup) findViewById2, false, 16, null);
    }
}
