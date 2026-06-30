package lj2;

/* loaded from: classes10.dex */
public final class h implements ep0.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lj2.j f318860a;

    public h(lj2.j jVar) {
        this.f318860a = jVar;
    }

    @Override // ep0.f
    public void a(long j17) {
        com.tencent.mars.xlog.Log.i(this.f318860a.getTAG(), "reportReadCacheTime time: " + j17);
    }

    @Override // ep0.f
    public void b(long j17) {
        com.tencent.mars.xlog.Log.i(this.f318860a.getTAG(), "reportDownloadTime time: " + j17);
    }
}
