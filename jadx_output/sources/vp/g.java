package vp;

/* loaded from: classes16.dex */
public class g implements vp.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vp.d f438772a;

    public g(vp.d dVar) {
        this.f438772a = dVar;
    }

    @Override // vp.c0
    public void a(wp.a aVar) {
        vp.t tVar = this.f438772a.f438746i;
        tVar.c();
        com.tencent.mars.xlog.Log.i("DanmakuDataSource", "addNow: danmaku = " + aVar);
        zp.l lVar = tVar.f438831b;
        if (aVar == null) {
            lVar.getClass();
        } else {
            zp.j jVar = lVar.f474918a;
            zp.j jVar2 = jVar.f474916b;
            while (jVar2 != jVar) {
                if (lVar.f474919b.compare(jVar2.f474915a, aVar) >= 0) {
                    break;
                } else {
                    jVar2 = jVar2.f474916b;
                }
            }
            if (!aVar.equals(jVar2.f474915a)) {
                zp.j jVar3 = jVar2.f474917c;
                zp.j jVar4 = new zp.j(aVar, jVar2, jVar3);
                jVar3.f474916b = jVar4;
                jVar2.f474917c = jVar4;
                lVar.f474921d++;
            }
        }
        tVar.e();
    }
}
