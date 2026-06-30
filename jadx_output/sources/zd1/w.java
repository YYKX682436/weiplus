package zd1;

/* loaded from: classes7.dex */
public final class w implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zd1.a0 f471580d;

    public w(zd1.a0 a0Var) {
        this.f471580d = a0Var;
    }

    @Override // u81.f
    public final void D(java.lang.String str, u81.b bVar) {
        zd1.x xVar;
        int i17 = bVar == null ? -1 : zd1.v.f471579a[bVar.ordinal()];
        boolean z17 = false;
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SecuritySnapshotContext", "runtime(" + this.f471580d.f471521a.f74803n + ")->BACKGROUND, stop");
            this.f471580d.b(false);
            return;
        }
        zd1.a0 a0Var = this.f471580d;
        if (!a0Var.f471522b.get() && (xVar = (zd1.x) a0Var.f471525e.get()) != null) {
            a0Var.a(xVar.f471581a, xVar.f471582b);
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SecuritySnapshotContext", "runtime(" + this.f471580d.f471521a.f74803n + ")->FOREGROUND, started:" + z17);
    }
}
