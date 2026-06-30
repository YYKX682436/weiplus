package ma5;

/* loaded from: classes15.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ma5.e f325235d;

    public c(ma5.e eVar) {
        this.f325235d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ma5.e eVar = this.f325235d;
        if (eVar.f325232e == null) {
            eVar.f325232e = eVar.e();
        }
        androidx.appcompat.app.b bVar = eVar.f325232e;
        o.r rVar = new o.r(bVar != null ? bVar.m() : eVar.f325231d);
        rVar.f341784h = eVar;
        ma5.d dVar = eVar.f325239n;
        if (dVar != null && dVar.onCreatePanelMenu(0, rVar) && dVar.onPreparePanel(0, null, rVar)) {
            if (rVar != eVar.f325236h) {
                eVar.f325236h = rVar;
                androidx.appcompat.app.b bVar2 = eVar.f325232e;
                if (bVar2 != null) {
                    ((androidx.appcompat.widget.z2) ((ma5.k) bVar2).f325257e).f(rVar, eVar);
                }
            }
        } else if (eVar.f325236h != null) {
            eVar.f325236h = null;
            androidx.appcompat.app.b bVar3 = eVar.f325232e;
            if (bVar3 != null) {
                ((androidx.appcompat.widget.z2) ((ma5.k) bVar3).f325257e).f(null, eVar);
            }
        }
        rVar.p(true);
        eVar.f325240o = false;
    }
}
