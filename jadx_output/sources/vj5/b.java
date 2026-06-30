package vj5;

/* loaded from: classes7.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vj5.h f437690d;

    public b(vj5.h hVar) {
        this.f437690d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        vj5.h hVar = this.f437690d;
        if (!hVar.f437709o) {
            hVar.v();
            return;
        }
        vj5.n nVar = hVar.f437702e;
        if (nVar != null) {
            nVar.f(hVar);
            hVar.f437702e = null;
        }
        hVar.f437703f = null;
        hVar.f437710p = true;
    }
}
