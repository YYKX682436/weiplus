package um2;

/* loaded from: classes3.dex */
public final class p5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.c f428922d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(fm2.c cVar) {
        super(0);
        this.f428922d = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.c cVar = this.f428922d;
        android.view.View genRootViewByStub = cVar.genRootViewByStub(com.tencent.mm.R.id.fqj, cVar);
        kotlin.jvm.internal.o.e(genRootViewByStub, "null cannot be cast to non-null type android.view.ViewGroup");
        return new com.tencent.mm.plugin.finder.live.plugin.gl0((android.view.ViewGroup) genRootViewByStub, cVar);
    }
}
