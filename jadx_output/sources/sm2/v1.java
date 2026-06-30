package sm2;

/* loaded from: classes3.dex */
public final class v1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409752d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(fm2.a aVar) {
        super(0);
        this.f409752d = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.a aVar = this.f409752d;
        android.view.View findViewById = aVar.findViewById(com.tencent.mm.R.id.elf);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.f8((android.view.ViewGroup) findViewById, aVar);
    }
}
