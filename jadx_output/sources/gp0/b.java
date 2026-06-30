package gp0;

/* loaded from: classes10.dex */
public final class b implements gp0.d {

    /* renamed from: a, reason: collision with root package name */
    public final int f274167a;

    /* renamed from: b, reason: collision with root package name */
    public final hp0.f f274168b = new hp0.f(100);

    public b(int i17, int i18) {
        this.f274167a = i17;
    }

    @Override // gp0.d
    public boolean a(fp0.d task) {
        boolean k17;
        kotlin.jvm.internal.o.g(task, "task");
        java.lang.String d17 = task.d();
        hp0.f fVar = this.f274168b;
        synchronized (fVar) {
            kk.j jVar = fVar.f282912a;
            if (jVar == null) {
                throw new java.lang.NullPointerException("mData == null");
            }
            k17 = ((lt0.f) jVar).k(d17);
        }
        if (k17) {
            long i17 = com.tencent.mm.sdk.platformtools.t8.i1();
            java.lang.String d18 = task.d();
            kk.j jVar2 = fVar.f282912a;
            if (jVar2 == null) {
                throw new java.lang.NullPointerException("mData == null");
            }
            gp0.a aVar = (gp0.a) ((lt0.f) jVar2).i(d18);
            if (aVar.f274166b >= this.f274167a && i17 - aVar.f274165a < Integer.MAX_VALUE) {
                com.tencent.mars.xlog.Log.w("DefaultRetrySg", "check block by recentdown: " + task.d() + " count " + aVar.f274166b + "  time: " + (i17 - aVar.f274165a));
                return false;
            }
            if (i17 - aVar.f274165a > Integer.MAX_VALUE) {
                task.d();
                aVar = new gp0.a(this, i17, 0);
            }
            aVar.f274166b++;
            aVar.f274165a = i17;
            fVar.a(task.d(), aVar);
        } else {
            fVar.a(task.d(), new gp0.a(this, com.tencent.mm.sdk.platformtools.t8.i1(), 1));
        }
        return true;
    }
}
