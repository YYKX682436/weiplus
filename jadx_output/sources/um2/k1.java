package um2;

/* loaded from: classes3.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.c f428852d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(fm2.c cVar) {
        super(0);
        this.f428852d = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.c cVar = this.f428852d;
        android.view.View findViewById = cVar.findViewById(com.tencent.mm.R.id.fpw);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.kj0((android.view.ViewGroup) findViewById, cVar);
    }
}
