package sp2;

/* loaded from: classes2.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411049d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(sp2.o2 o2Var) {
        super(1);
        this.f411049d = o2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Throwable) obj) instanceof java.util.concurrent.CancellationException) {
            com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", "invokeOnCompletion: cgi is cancel");
            java.lang.String cacheBusinessKey = this.f411049d.V;
            kotlin.jvm.internal.o.g(cacheBusinessKey, "cacheBusinessKey");
            by1.d a17 = by1.c.f36353b.a().a("7312+0+" + cacheBusinessKey + "+0");
            aq2.k kVar = a17 instanceof aq2.k ? (aq2.k) a17 : null;
            if (kVar != null) {
                kVar.g();
            }
        }
        return jz5.f0.f302826a;
    }
}
