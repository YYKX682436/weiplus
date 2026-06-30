package vp;

/* loaded from: classes16.dex */
public class t {

    /* renamed from: b, reason: collision with root package name */
    public final zp.l f438831b;

    /* renamed from: c, reason: collision with root package name */
    public final zp.i f438832c;

    /* renamed from: e, reason: collision with root package name */
    public volatile long f438834e = -1;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f438830a = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f438833d = new java.util.concurrent.atomic.AtomicBoolean(false);

    public t(zp.i iVar, vp.v vVar) {
        this.f438832c = iVar;
        this.f438831b = new zp.l(vVar, new vp.s(this));
    }

    public void a(wp.a aVar) {
        c();
        java.util.Objects.toString(aVar);
        zp.l lVar = this.f438831b;
        if (aVar == null) {
            lVar.getClass();
        } else {
            zp.j jVar = lVar.f474918a;
            zp.j jVar2 = jVar.f474917c;
            while (jVar2 != jVar) {
                if (lVar.f474919b.compare(jVar2.f474915a, aVar) <= 0) {
                    break;
                } else {
                    jVar2 = jVar2.f474917c;
                }
            }
            if (!aVar.equals(jVar2.f474915a)) {
                zp.j jVar3 = jVar2.f474916b;
                zp.j jVar4 = new zp.j(aVar, jVar3, jVar2);
                jVar3.f474917c = jVar4;
                jVar2.f474916b = jVar4;
                lVar.f474921d++;
            }
        }
        e();
    }

    public void b() {
        com.tencent.mars.xlog.Log.i("DanmakuDataSource", "clear danmaku queue");
        c();
        zp.l lVar = this.f438831b;
        zp.j jVar = lVar.f474918a;
        jVar.f474916b = jVar;
        jVar.f474917c = jVar;
        lVar.f474921d = 0;
        e();
    }

    public final void c() {
        while (!this.f438833d.compareAndSet(false, true)) {
            java.lang.Thread.yield();
        }
    }

    public void d() {
        c();
        zp.j jVar = this.f438831b.f474918a;
        zp.j jVar2 = jVar.f474917c;
        wp.a aVar = (wp.a) (jVar2 != jVar ? jVar2.f474915a : null);
        if (aVar == null) {
            this.f438834e = -1L;
        } else {
            this.f438834e = aVar.f448335f;
        }
        e();
    }

    public final void e() {
        while (!this.f438833d.compareAndSet(true, false)) {
            com.tencent.mars.xlog.Log.e("DanmakuDataSource", "update end is blocked! this can not happend!");
            java.lang.Thread.yield();
        }
    }
}
