package d9;

/* loaded from: classes15.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d9.t f227378d;

    public m(d9.t tVar) {
        this.f227378d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        d9.t tVar = this.f227378d;
        if (tVar.P || tVar.A || tVar.f227414w == null || !tVar.f227417z) {
            return;
        }
        for (d9.f0 f0Var : tVar.f227415x) {
            if (f0Var.i() == null) {
                return;
            }
        }
        t9.g gVar = tVar.f227409r;
        synchronized (gVar) {
            gVar.f416512a = false;
        }
        int length = tVar.f227415x.length;
        d9.k0[] k0VarArr = new d9.k0[length];
        tVar.H = new boolean[length];
        tVar.G = new boolean[length];
        tVar.F = tVar.f227414w.g();
        int i17 = 0;
        while (true) {
            boolean z17 = true;
            if (i17 >= length) {
                tVar.E = new d9.l0(k0VarArr);
                tVar.A = true;
                ((d9.v) tVar.f227403i).g(tVar.F, tVar.f227414w.c());
                tVar.f227413v.a(tVar);
                return;
            }
            com.google.android.exoplayer2.Format i18 = tVar.f227415x[i17].i();
            k0VarArr[i17] = new d9.k0(i18);
            java.lang.String str = i18.f44080i;
            if (!t9.k.e(str) && !t9.k.d(str)) {
                z17 = false;
            }
            tVar.H[i17] = z17;
            tVar.I = z17 | tVar.I;
            i17++;
        }
    }
}
