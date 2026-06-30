package fi1;

/* loaded from: classes8.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi1.q f262793d;

    public p(fi1.q qVar) {
        this.f262793d = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        fi1.t tVar = this.f262793d.f262794d.f86279m;
        if (tVar != null) {
            fi1.e eVar = (fi1.e) tVar;
            eVar.getClass();
            try {
                super/*android.app.Dialog*/.dismiss();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.HybridOpenMaterialDialog", "super#dismiss, fail since " + e17);
            }
        }
    }
}
