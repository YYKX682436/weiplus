package t03;

/* loaded from: classes15.dex */
public final class p0 implements ek4.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t03.r0 f414496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kk4.h f414497b;

    public p0(t03.r0 r0Var, kk4.h hVar) {
        this.f414496a = r0Var;
        this.f414497b = hVar;
    }

    @Override // ek4.x
    public void a(int i17, dn.o oVar, dn.h hVar) {
        java.lang.String str = this.f414496a.f414505b0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startCdnDownload() #onStop:");
        sb6.append(i17);
        sb6.append(", ");
        sb6.append(oVar != null ? oVar.field_mediaId : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
    }

    @Override // ek4.x
    public void b(int i17, dn.o oVar) {
        nk4.s sVar;
        t03.r0 r0Var = this.f414496a;
        com.tencent.mars.xlog.Log.i(r0Var.f414505b0, "startCdnDownload()#onStart " + r0Var.w() + ' ' + i17);
        if (i17 == 0) {
            r0Var.S(true);
            ck4.b bVar = oVar instanceof ck4.b ? (ck4.b) oVar : null;
            if (bVar == null || (sVar = r0Var.f308588m) == null) {
                return;
            }
            sVar.a(new nk4.b(bVar.f42534d2, android.os.SystemClock.uptimeMillis(), null, 4, null), ((ck4.b) oVar).field_mediaId);
            return;
        }
        if (i17 != 1) {
            return;
        }
        kk4.h hVar = r0Var.f308580e;
        r0Var.N = com.tencent.mm.vfs.w6.k(hVar != null ? hVar.f308546e : null);
        ck4.b bVar2 = oVar instanceof ck4.b ? (ck4.b) oVar : null;
        if (bVar2 != null) {
            kk4.h hVar2 = r0Var.f308580e;
            long k17 = com.tencent.mm.vfs.w6.k(hVar2 != null ? hVar2.f308546e : null);
            bVar2.f42546p2 = k17;
            bVar2.f42547q2 = k17;
        }
        kk4.h hVar3 = this.f414497b;
        hVar3.f308548g = true;
        hVar3.f308547f = true;
        yz5.p pVar = hVar3.f308551m;
        if (pVar != null) {
            dn.o oVar2 = r0Var.f308581f;
            pVar.invoke(oVar2 != null ? oVar2.field_fileId : null, 0);
        }
        r0Var.y(4);
    }
}
