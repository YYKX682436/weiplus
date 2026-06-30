package sm2;

/* loaded from: classes3.dex */
public final class o6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f409643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409644e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(android.view.ViewGroup viewGroup, fm2.a aVar) {
        super(0);
        this.f409643d = viewGroup;
        this.f409644e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup giftPlayRoot = this.f409643d;
        kotlin.jvm.internal.o.f(giftPlayRoot, "$giftPlayRoot");
        return new com.tencent.mm.plugin.finder.live.plugin.kn(giftPlayRoot, this.f409644e);
    }
}
