package zs5;

/* loaded from: classes15.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f475413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f475414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zs5.y f475415f;

    public j(int i17, long j17, zs5.y yVar) {
        this.f475413d = i17;
        this.f475414e = j17;
        this.f475415f = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AffScanDecodeQueue", "doInitQBar callback2 ret: " + this.f475413d + ", init cost: " + (java.lang.System.currentTimeMillis() - this.f475414e) + ", tryStartSessionWhenInited: " + this.f475415f.f475512m);
        zs5.y yVar = this.f475415f;
        int i17 = this.f475413d;
        yVar.f475505f = i17 == 0;
        zs5.b bVar = i17 == 0 ? zs5.b.f475321f : zs5.b.f475322g;
        yVar.f475506g = bVar;
        if (bVar == zs5.b.f475321f && yVar.f475512m) {
            yVar.f475512m = false;
            zs5.c cVar = yVar.f475516q;
            if (cVar != null) {
                this.f475415f.c(cVar.f475326a, cVar.f475327b, cVar.f475328c, cVar.f475329d);
            }
        }
    }
}
