package ea3;

/* loaded from: classes10.dex */
public class v implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ea3.p f250677a;

    public v(ea3.p pVar) {
        this.f250677a = pVar;
    }

    @Override // d85.k0
    public void onOp(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        d85.g0 g0Var = d85.g0.STORAGE;
        ea3.p pVar = this.f250677a;
        if (!booleanValue) {
            pVar.getClass();
            if (g0Var.f227192d == g0Var.f227192d) {
                pVar.p(java.lang.Boolean.FALSE);
                return;
            }
            return;
        }
        pVar.getClass();
        if (g0Var.f227192d == g0Var.f227192d) {
            pVar.f250655n = false;
            if (pVar.i()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "checkPermissionAndQuery: hadMediaStorage");
                pVar.o();
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "checkPermissionAndQuery: not hadMediaStorage");
                pVar.p(java.lang.Boolean.TRUE);
            }
        }
    }
}
