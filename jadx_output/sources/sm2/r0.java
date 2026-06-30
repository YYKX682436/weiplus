package sm2;

/* loaded from: classes3.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409678d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(fm2.a aVar) {
        super(0);
        this.f409678d = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.a aVar = this.f409678d;
        android.view.View findViewById = aVar.findViewById(com.tencent.mm.R.id.f2r);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.kn((android.view.ViewGroup) findViewById, aVar);
    }
}
