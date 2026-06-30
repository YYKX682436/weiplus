package sm2;

/* loaded from: classes3.dex */
public final class p6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f409658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409659e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(android.view.ViewGroup viewGroup, fm2.a aVar) {
        super(0);
        this.f409658d = viewGroup;
        this.f409659e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup giftPlayRoot = this.f409658d;
        kotlin.jvm.internal.o.f(giftPlayRoot, "$giftPlayRoot");
        return new com.tencent.mm.plugin.finder.live.plugin.bn(giftPlayRoot, this.f409659e);
    }
}
