package fr5;

/* loaded from: classes15.dex */
public final class p0 implements hr5.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f266007a;

    /* renamed from: b, reason: collision with root package name */
    public fr5.j f266008b;

    /* renamed from: c, reason: collision with root package name */
    public fr5.h f266009c;

    public p0(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f266007a = view;
    }

    public java.lang.Object a(gr5.d dVar, yz5.l lVar, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        er5.d dVar2 = dVar instanceof er5.d ? (er5.d) dVar : null;
        if (dVar2 == null) {
            dVar2 = er5.d.f256233c;
        }
        fr5.j jVar = new fr5.j(this.f266007a, 0.0f, 1.0f, dVar2.f256235a, dVar2.f256236b, lVar, new fr5.l0(rVar));
        this.f266008b = jVar;
        if (!jVar.f265976j) {
            jVar.f265976j = true;
            long j17 = 0;
            jVar.f265975i = java.lang.System.currentTimeMillis() + j17;
            jVar.f265967a.postDelayed(jVar.f265974h, j17);
        }
        rVar.m(new fr5.k0(jVar));
        java.lang.Object j18 = rVar.j();
        return j18 == pz5.a.f359186d ? j18 : jz5.f0.f302826a;
    }

    public java.lang.Object b(long j17, zq5.n nVar, long j18, java.util.Map map, yz5.l lVar, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        fr5.h hVar = new fr5.h(this.f266007a, zq5.d.a(a06.d.b(zq5.l.b(j17)), a06.d.b(zq5.l.c(j17))), nVar != null ? zq5.o.d(nVar) : null, zq5.d.a(a06.d.b(zq5.l.b(j18)), a06.d.b(zq5.l.c(j18))), new fr5.n0(lVar), new fr5.o0(rVar), null);
        this.f266009c = hVar;
        if (!hVar.f265958i) {
            hVar.f265958i = true;
            android.widget.OverScroller overScroller = hVar.f265956g;
            long j19 = hVar.f265951b;
            int i17 = (int) (j19 >> 32);
            int a17 = zq5.c.a(j19);
            long j27 = hVar.f265953d;
            int i18 = (int) (j27 >> 32);
            int a18 = zq5.c.a(j27);
            zq5.e eVar = hVar.f265952c;
            overScroller.fling(i17, a17, i18, a18, eVar != null ? eVar.f475061a : 0, eVar != null ? eVar.f475063c : 0, eVar != null ? eVar.f475062b : 0, eVar != null ? eVar.f475064d : 0, 0, 0);
            hVar.f265950a.postOnAnimation(hVar.f265957h);
        }
        rVar.m(new fr5.m0(hVar));
        java.lang.Object j28 = rVar.j();
        return j28 == pz5.a.f359186d ? j28 : jz5.f0.f302826a;
    }
}
