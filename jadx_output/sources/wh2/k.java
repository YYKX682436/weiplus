package wh2;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn.j f445954d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(dn.j jVar) {
        super(1);
        this.f445954d = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePagLoader", "invokeOnCancellation");
        dn.k kVar = this.f445954d.f241787f;
        dn.d dVar = kVar instanceof dn.d ? (dn.d) kVar : null;
        if (dVar != null) {
            dVar.f241763d = null;
        }
        return jz5.f0.f302826a;
    }
}
