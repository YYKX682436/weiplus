package vo4;

/* loaded from: classes10.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo4.i f438628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vo4.t f438629e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(vo4.i iVar, vo4.t tVar) {
        super(0);
        this.f438628d = iVar;
        this.f438629e = tVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        vo4.i iVar = this.f438628d;
        int i17 = iVar.f438645p;
        vo4.r rVar = iVar.f438634e;
        int i18 = iVar.f438646q;
        int i19 = iVar.f438631b;
        int i27 = iVar.f438630a;
        if (i17 <= 0 || i18 <= 0) {
            rVar.b(i27, i19);
        } else {
            rVar.b(i17, i18);
        }
        iVar.f438635f = new os0.b(0, 0, iVar.f438630a, iVar.f438631b, 1, 4);
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogDirector", iVar.hashCode() + " setVLogSurface, updateDrawViewSize:[" + i27 + ", " + i19 + ']');
        os0.b bVar = iVar.f438635f;
        if (bVar != null) {
            bVar.u(i27, i19);
        }
        int i28 = iVar.f438645p;
        if (i28 <= 0 || i18 <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogDirector", iVar.hashCode() + " setVLogSurface, update texture and draw size:[" + i27 + ", " + i19 + ']');
            os0.b bVar2 = iVar.f438635f;
            if (bVar2 != null) {
                bVar2.w(i27, i19);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogDirector", iVar.hashCode() + " setVLogSurface, update texture size from texture:[" + i28 + ", " + i18 + ']');
            os0.b bVar3 = iVar.f438635f;
            if (bVar3 != null) {
                bVar3.w(i28, i18);
            }
        }
        os0.b bVar4 = iVar.f438635f;
        if (bVar4 != null) {
            bVar4.Z = 3553;
        }
        if (bVar4 != null) {
            is0.c cVar = this.f438629e.f438689c;
            bVar4.D = cVar != null ? cVar.f294395e : -1;
        }
        android.graphics.Rect rect = iVar.f438647r;
        if (rect != null && bVar4 != null) {
            bVar4.f348008q = rect;
        }
        if (bVar4 != null) {
            bVar4.f348009r = new vo4.g(iVar);
        }
        return jz5.f0.f302826a;
    }
}
