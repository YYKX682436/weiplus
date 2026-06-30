package vp;

/* loaded from: classes16.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f438872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vp.a0 f438873e;

    public z(vp.a0 a0Var, java.util.List list) {
        this.f438873e = a0Var;
        this.f438872d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (android.util.Pair pair : this.f438872d) {
            wp.a aVar = (wp.a) pair.first;
            yp.o oVar = (yp.o) pair.second;
            vp.a0 a0Var = this.f438873e;
            if (oVar != null) {
                xp.d dVar = a0Var.f438731f.f438766d;
                if (!aVar.n()) {
                    wp.b e17 = dVar.c(aVar).e(aVar, oVar);
                    aVar.f448338i = e17.f448356a + (xp.d.f().f455848e * 2);
                    aVar.f448339j = e17.f448357b + (xp.d.f().f455847d * 2);
                    wp.f fVar = (wp.f) aVar;
                    fVar.f448352w = false;
                    fVar.G = ((int) (fVar.h() + fVar.f448338i)) / ((float) fVar.f448334e.f474913a);
                }
            }
            vp.c0 c0Var = a0Var.f438730e;
            if (c0Var != null) {
                c0Var.a(aVar);
            }
        }
    }
}
