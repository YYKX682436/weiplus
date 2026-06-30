package sm2;

/* loaded from: classes3.dex */
public final class k6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409538e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(fm2.a aVar, sm2.o4 o4Var) {
        super(0);
        this.f409537d = aVar;
        this.f409538e = o4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.a aVar = this.f409537d;
        android.view.View findViewById = aVar.findViewById(com.tencent.mm.R.id.f_b);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.w00((android.view.ViewGroup) findViewById, aVar, (r45.qt2) ((jz5.n) this.f409538e.f19596d).getValue());
    }
}
