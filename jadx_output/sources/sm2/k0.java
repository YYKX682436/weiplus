package sm2;

/* loaded from: classes3.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409530d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(fm2.a aVar) {
        super(0);
        this.f409530d = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.a aVar = this.f409530d;
        android.view.View findViewById = aVar.findViewById(com.tencent.mm.R.id.eva);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.mg((android.view.ViewGroup) findViewById, aVar, null);
    }
}
