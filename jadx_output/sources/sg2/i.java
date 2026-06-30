package sg2;

/* loaded from: classes10.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn.j f407904d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(dn.j jVar) {
        super(1);
        this.f407904d = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("FinderGesturesFilesManager", "#downloadCdnRes invokeOnCancellation");
        dn.k kVar = this.f407904d.f241787f;
        dn.d dVar = kVar instanceof dn.d ? (dn.d) kVar : null;
        if (dVar != null) {
            dVar.f241763d = null;
        }
        return jz5.f0.f302826a;
    }
}
