package wh2;

/* loaded from: classes10.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn.j f445961d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(dn.j jVar) {
        super(1);
        this.f445961d = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wh2.u uVar = wh2.u.f445962a;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveSVGLoader", "invokeOnCancellation");
        dn.k kVar = this.f445961d.f241787f;
        dn.d dVar = kVar instanceof dn.d ? (dn.d) kVar : null;
        if (dVar != null) {
            dVar.f241763d = null;
        }
        return jz5.f0.f302826a;
    }
}
