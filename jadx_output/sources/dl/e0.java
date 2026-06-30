package dl;

/* loaded from: classes10.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dl.d0 f235092e;

    public e0(dl.d0 d0Var, java.lang.String str) {
        this.f235092e = d0Var;
        this.f235091d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        dl.d0 d0Var = this.f235092e;
        if (d0Var.l() != null && (str = this.f235091d) != null) {
            hk0.w0 e17 = d0Var.l().f281818i.e(str);
            if (e17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MosaicArtist", "undoMosaicWithEraser edit data error");
                return;
            }
            hk0.z0 z0Var = hk0.z0.f281865g;
            xk0.k kVar = e17.f281837d;
            if (e17.f281836c == z0Var) {
                xk0.i iVar = xk0.i.TWO;
                if (kVar != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MosaicArtist", "undoEraser single");
                    kVar.f454990h = false;
                    if (kVar.f454986d == iVar) {
                        kVar.f454991i = true;
                    }
                    d0Var.d().add(kVar);
                    d0Var.E(false);
                } else {
                    java.util.ArrayList arrayList = e17.f281838e;
                    if (arrayList != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MosaicArtist", "undoEraser list");
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            xk0.k kVar2 = (xk0.k) it.next();
                            if (kVar2.f454986d == iVar) {
                                kVar2.f454991i = true;
                            }
                            kVar2.f454990h = false;
                            d0Var.d().add(kVar2);
                        }
                        d0Var.E(true);
                    }
                }
            } else {
                if (kVar != null) {
                    d0Var.d().b(kVar);
                }
                d0Var.E(true);
            }
        }
        d0Var.r();
        d0Var.f235048j = null;
    }
}
