package yo4;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yo4.p f464253d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yo4.p pVar) {
        super(1);
        this.f464253d = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        iu3.h hVar;
        yz5.l lVar = (yz5.l) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[clipProgressRegistrar] register listener=");
        sb6.append(lVar != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditAddMusicPlugin", sb6.toString());
        iu3.i iVar = this.f464253d.f464285p;
        if (lVar != null) {
            iVar.getClass();
            hVar = new iu3.h(lVar);
        } else {
            hVar = null;
        }
        iVar.f295010f = hVar;
        iVar.f295011g = 100L;
        kk4.v vVar = iVar.f295008c;
        if (vVar != null) {
            vVar.I(hVar, 100L);
        }
        return jz5.f0.f302826a;
    }
}
