package gx0;

/* loaded from: classes5.dex */
public final class df implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.gf f276343d;

    public df(gx0.gf gfVar) {
        this.f276343d = gfVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        wu5.c cVar;
        gx0.fd fdVar = (gx0.fd) obj;
        gx0.fd fdVar2 = gx0.fd.f276430f;
        gx0.gf gfVar = this.f276343d;
        if (fdVar == fdVar2) {
            gfVar.O6();
            return;
        }
        if ((fdVar != gx0.fd.f276429e && fdVar != gx0.fd.f276435n && fdVar != gx0.fd.f276434m) || gfVar.f276471d || (cVar = gfVar.f276474g) == null) {
            return;
        }
        try {
            cVar.cancel(true);
        } catch (java.lang.Exception unused) {
        }
        gfVar.f276474g = null;
    }
}
