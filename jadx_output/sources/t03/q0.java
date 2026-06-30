package t03;

/* loaded from: classes15.dex */
public final class q0 implements ek4.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t03.r0 f414500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f414501b;

    public q0(t03.r0 r0Var, yz5.a aVar) {
        this.f414500a = r0Var;
        this.f414501b = aVar;
    }

    @Override // ek4.z
    public void a(int i17, dn.o oVar, dn.h hVar) {
        nk4.s sVar;
        t03.r0 r0Var = this.f414500a;
        com.tencent.mars.xlog.Log.i(r0Var.f414505b0, "stopCdnDownload()#onStop(), real cancel download task " + r0Var.w() + ' ' + i17);
        ck4.b bVar = oVar instanceof ck4.b ? (ck4.b) oVar : null;
        if (bVar != null && (sVar = r0Var.f308588m) != null) {
            sVar.b(new nk4.i(bVar.f42534d2, oVar, hVar, android.os.SystemClock.uptimeMillis(), null, 16, null), ((ck4.b) oVar).field_mediaId);
        }
        this.f414501b.invoke();
    }
}
