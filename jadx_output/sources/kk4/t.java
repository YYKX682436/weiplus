package kk4;

/* loaded from: classes15.dex */
public final class t implements ek4.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kk4.v f308571a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f308572b;

    public t(kk4.v vVar, yz5.a aVar) {
        this.f308571a = vVar;
        this.f308572b = aVar;
    }

    @Override // ek4.z
    public void a(int i17, dn.o oVar, dn.h hVar) {
        nk4.s sVar;
        kk4.v vVar = this.f308571a;
        com.tencent.mars.xlog.Log.i(vVar.f308576a, "stopCdnDownload()#onStop(), real cancel download task " + vVar.w() + ' ' + i17);
        ck4.b bVar = oVar instanceof ck4.b ? (ck4.b) oVar : null;
        if (bVar != null && (sVar = vVar.f308588m) != null) {
            nk4.s.c(sVar, new nk4.i(bVar.f42534d2, oVar, hVar, android.os.SystemClock.uptimeMillis(), null, 16, null), null, 2, null);
        }
        this.f308572b.invoke();
    }
}
