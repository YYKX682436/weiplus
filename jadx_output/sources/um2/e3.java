package um2;

/* loaded from: classes3.dex */
public final class e3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.c f428776d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(fm2.c cVar) {
        super(0);
        this.f428776d = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.c cVar = this.f428776d;
        android.view.View findViewById = cVar.findViewById(com.tencent.mm.R.id.ej7);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.d1((android.view.ViewGroup) findViewById, cVar);
    }
}
