package tm2;

/* loaded from: classes3.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.b f420631d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f420632e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(fm2.b bVar, tm2.s2 s2Var) {
        super(0);
        this.f420631d = bVar;
        this.f420632e = s2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.b bVar = this.f420631d;
        android.view.View findViewById = bVar.findViewById(com.tencent.mm.R.id.f_b);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.w00((android.view.ViewGroup) findViewById, bVar, (r45.qt2) ((jz5.n) this.f420632e.f19602d).getValue());
    }
}
