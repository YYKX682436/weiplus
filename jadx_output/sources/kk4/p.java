package kk4;

/* loaded from: classes15.dex */
public final class p implements ek4.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kk4.v f308563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ek4.s f308564b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dk4.a f308565c;

    public p(kk4.v vVar, ek4.s sVar, dk4.a aVar) {
        this.f308563a = vVar;
        this.f308564b = sVar;
        this.f308565c = aVar;
    }

    @Override // ek4.x
    public void a(int i17, dn.o oVar, dn.h hVar) {
        java.lang.String str = this.f308563a.f308576a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startCdnDownload() #onStop:");
        sb6.append(i17);
        sb6.append(", ");
        sb6.append(oVar != null ? oVar.field_mediaId : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
    }

    @Override // ek4.x
    public void b(int i17, dn.o oVar) {
        nk4.s sVar;
        yz5.p pVar;
        kk4.v vVar = this.f308563a;
        com.tencent.mars.xlog.Log.i(vVar.f308576a, "startCdnDownload()#onStart " + vVar.w() + ' ' + i17);
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_text_status_avoid_video_leak, true);
        boolean z17 = vVar.f308582g;
        dk4.a aVar = this.f308565c;
        if (!z17 && fj6) {
            java.lang.String mediaId = aVar.f234482s;
            kotlin.jvm.internal.o.f(mediaId, "mediaId");
            ek4.s sVar2 = this.f308564b;
            sVar2.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.TP.CdnTaskController", "stopStreamDownloadTaskForAvoidLeak ".concat(mediaId));
            pm0.v.O("MicroMsg.Cdn.ThreadName", new ek4.r(sVar2, mediaId));
            return;
        }
        if (i17 == 0) {
            vVar.S(true);
            ck4.b bVar = oVar instanceof ck4.b ? (ck4.b) oVar : null;
            if (bVar == null || (sVar = vVar.f308588m) == null) {
                return;
            }
            nk4.s.d(sVar, new nk4.b(bVar.f42534d2, android.os.SystemClock.uptimeMillis(), null, 4, null), null, 2, null);
            return;
        }
        if (i17 != 1) {
            return;
        }
        kk4.h hVar = vVar.f308580e;
        vVar.N = com.tencent.mm.vfs.w6.k(hVar != null ? hVar.f308546e : null);
        ck4.b bVar2 = oVar instanceof ck4.b ? (ck4.b) oVar : null;
        if (bVar2 != null) {
            kk4.h hVar2 = vVar.f308580e;
            long k17 = com.tencent.mm.vfs.w6.k(hVar2 != null ? hVar2.f308546e : null);
            bVar2.f42546p2 = k17;
            bVar2.f42547q2 = k17;
        }
        kk4.h hVar3 = vVar.f308580e;
        if (hVar3 != null) {
            hVar3.f308548g = true;
        }
        if (hVar3 != null) {
            hVar3.f308547f = true;
        }
        if (hVar3 != null && (pVar = hVar3.f308551m) != null) {
            pVar.invoke(aVar.f234482s, 0);
        }
        vVar.y(4);
    }
}
