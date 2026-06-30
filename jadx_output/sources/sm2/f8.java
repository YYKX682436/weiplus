package sm2;

/* loaded from: classes3.dex */
public final class f8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409459d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(fm2.a aVar) {
        super(0);
        this.f409459d = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.a aVar = this.f409459d;
        android.view.View findViewById = aVar.findViewById(com.tencent.mm.R.id.f484558en4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.xh((android.view.ViewGroup) findViewById, aVar);
    }
}
