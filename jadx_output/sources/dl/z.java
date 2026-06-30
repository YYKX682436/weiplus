package dl;

/* loaded from: classes10.dex */
public final class z extends dl.b {

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f235162q = "MicroMsg.FilterArtist";

    @Override // dl.b
    public void A(java.lang.String editId) {
        kotlin.jvm.internal.o.g(editId, "editId");
    }

    @Override // dl.b
    public void C() {
    }

    @Override // dl.b
    public dl.a m() {
        return dl.a.FILTER;
    }

    @Override // dl.b
    public void t() {
        super.t();
        um.l lVar = (um.l) d();
        if (lVar == null) {
            return;
        }
        lVar.f428689g = ((l45.n) this.f235039a).f316465f;
    }

    @Override // dl.b
    public void v(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        um.l lVar = (um.l) d();
        if (lVar != null) {
            lVar.M(canvas, false);
        }
        com.tencent.mars.xlog.Log.i(this.f235162q, "lxl artist onDeadDraw");
    }

    @Override // dl.b
    public void y(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        um.l lVar = (um.l) d();
        if (lVar != null) {
            lVar.M(canvas, false);
        }
        com.tencent.mars.xlog.Log.i(this.f235162q, "lxl artist draw");
    }
}
