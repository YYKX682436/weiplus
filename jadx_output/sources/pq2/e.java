package pq2;

/* loaded from: classes2.dex */
public final class e extends pq2.c implements cp2.e {

    /* renamed from: u, reason: collision with root package name */
    public static int f357587u = -1;

    /* renamed from: o, reason: collision with root package name */
    public final int f357588o;

    /* renamed from: p, reason: collision with root package name */
    public final r45.dd2 f357589p;

    /* renamed from: q, reason: collision with root package name */
    public final int f357590q;

    /* renamed from: r, reason: collision with root package name */
    public r45.qt2 f357591r;

    /* renamed from: s, reason: collision with root package name */
    public final oq2.a f357592s;

    /* renamed from: t, reason: collision with root package name */
    public cp2.m f357593t;

    public e(int i17, r45.dd2 tabInfo, int i18) {
        kotlin.jvm.internal.o.g(tabInfo, "tabInfo");
        this.f357588o = i17;
        this.f357589p = tabInfo;
        this.f357590q = i18;
        this.f357592s = new oq2.a();
    }

    @Override // cp2.e
    public void a(cp2.m rsp, cp2.l request) {
        kotlin.jvm.internal.o.g(rsp, "rsp");
        kotlin.jvm.internal.o.g(request, "request");
        java.lang.String str = this.f357578d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd errType:");
        sb6.append(rsp.getErrType());
        sb6.append(" errCode:");
        sb6.append(rsp.getErrCode());
        sb6.append(" errMsg:");
        sb6.append(rsp.getErrMsg());
        sb6.append(" rsp:");
        sb6.append(hc2.o0.p(rsp.getIncrementList()));
        sb6.append("}pullType: ");
        int i17 = request.f220834a;
        sb6.append(i17);
        sb6.append(" + prefetchMinInterval: ");
        sb6.append(rsp.f220850c);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (i17 == 16) {
            this.f357593t = rsp;
            return;
        }
        this.f357584m.c("onFetchDone");
        this.f357581g = new az2.w(rsp.getErrType(), rsp.getErrCode(), rsp.getErrMsg(), rsp, android.os.SystemClock.elapsedRealtime());
        int i18 = request.f220837d;
        java.util.ArrayList arrayList = (java.util.ArrayList) rsp.getIncrementList();
        com.tencent.mm.protobuf.g lastBuffer = rsp.getLastBuffer();
        oq2.a aVar = this.f357592s;
        aVar.getClass();
        if (arrayList == null) {
            com.tencent.mars.xlog.Log.i("PreloadCacheManager", "store memoryCacheFlag:" + i18 + " return for dataList is null.");
        } else {
            com.tencent.mars.xlog.Log.i("PreloadCacheManager", "store memoryCacheFlag:" + i18 + " dataList:" + arrayList.size() + " lastBuffer:" + lastBuffer);
            ey2.c3.S6(aVar.f347372a, i18, 0, 0, arrayList, null, lastBuffer, true, 0, null, 400, null);
            aVar.f347372a.R6(i18);
        }
        f357587u = rsp.f220850c * 1000;
        int integer = this.f357589p.getInteger(0) + 1005000 + this.f357588o;
        switch (this.f357590q) {
            case 9:
            case 10:
                this.f357592s.a(integer, android.os.SystemClock.elapsedRealtime(), 0L, 0L);
                break;
            case 11:
                this.f357592s.a(integer, 0L, android.os.SystemClock.elapsedRealtime(), 0L);
                break;
            case 12:
            case 14:
            case 15:
                this.f357592s.a(integer, 0L, 0L, android.os.SystemClock.elapsedRealtime());
                break;
        }
        c(this.f357581g, pq2.d.f357586d);
    }

    @Override // pq2.c
    public void b() {
        this.f357584m.c("fetchInternal");
        r45.dd2 dd2Var = this.f357589p;
        cp2.l lVar = new cp2.l(this.f357590q, this.f357589p, null, dd2Var.getInteger(0) + 1005000 + this.f357588o, dd2Var.getInteger(0) + 1001, this.f357588o, null, 0, 0L, null, 0, com.tencent.mm.compatible.util.Exif.PARSE_EXIF_ERROR_UNKNOWN_BYTEALIGN, null);
        j(lVar, null);
        com.tencent.mars.xlog.Log.i(this.f357578d, "fetchInternal request:" + lVar);
    }

    @Override // pq2.c
    public az2.w e() {
        az2.w e17 = super.e();
        if (e17 != null) {
            new db2.x(2, ((com.tencent.mm.plugin.finder.feed.model.internal.IResponse) e17.f16160d).getLastBuffer()).l();
        }
        return e17;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0136  */
    @Override // pq2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h() {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pq2.e.h():void");
    }

    public final void j(cp2.l lVar, cp2.g gVar) {
        tq2.c.f421220i.a(lVar.f220837d).f421225d = java.lang.System.currentTimeMillis();
        r45.qt2 qt2Var = this.f357591r;
        if (qt2Var != null) {
            new cp2.f(qt2Var).E0(lVar, this, gVar);
        } else {
            kotlin.jvm.internal.o.o("contextObj");
            throw null;
        }
    }

    public final void k() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f357578d);
        sb6.append("_@");
        r45.dd2 dd2Var = this.f357589p;
        sb6.append(dd2Var.getInteger(0));
        sb6.append('-');
        sb6.append(dd2Var.getString(1));
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.g(sb7, "<set-?>");
        this.f357578d = sb7;
    }
}
