package em1;

/* loaded from: classes7.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo f255072d;

    public r(com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo) {
        this.f255072d = wxaPkgV8SnapshotInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo snapshotInfo = this.f255072d;
        kotlin.jvm.internal.o.g(snapshotInfo, "snapshotInfo");
        com.tencent.mm.plugin.appbrand.v8_snapshot.d1 d1Var = (com.tencent.mm.plugin.appbrand.v8_snapshot.d1) i95.n0.c(com.tencent.mm.plugin.appbrand.v8_snapshot.d1.class);
        if (d1Var != null) {
            d1Var.u7(snapshotInfo);
        }
    }
}
