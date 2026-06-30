package sm2;

/* loaded from: classes3.dex */
public final class b8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409382e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409381d = o4Var;
        this.f409382e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f409381d.f19594b.findViewById(com.tencent.mm.R.id.evz);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.w5((android.view.ViewGroup) findViewById, this.f409382e);
    }
}
