package em1;

/* loaded from: classes7.dex */
public final class s implements cl.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo f255073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ em1.t f255074b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.m f255075c;

    public s(com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo, em1.t tVar, com.tencent.mm.plugin.appbrand.jsapi.m mVar) {
        this.f255073a = wxaPkgV8SnapshotInfo;
        this.f255074b = tVar;
        this.f255075c = mVar;
    }

    @Override // cl.o
    public void a() {
        com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = this.f255073a;
        if (wxaPkgV8SnapshotInfo != null) {
            em1.t.o(this.f255074b, this.f255075c, new em1.r(wxaPkgV8SnapshotInfo));
        }
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.p(null, wxaPkgV8SnapshotInfo);
    }

    @Override // cl.o
    public void b(long j17, long j18) {
        com.tencent.mm.plugin.appbrand.jsapi.m mVar = this.f255075c;
        com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = this.f255073a;
        if (wxaPkgV8SnapshotInfo != null) {
            em1.t.o(this.f255074b, mVar, new em1.q(wxaPkgV8SnapshotInfo));
        }
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.o(null, this.f255073a, j17, j18, false, mVar instanceof com.tencent.luggage.sdk.jsapi.component.service.y ? (com.tencent.luggage.sdk.jsapi.component.service.y) mVar : null);
    }
}
