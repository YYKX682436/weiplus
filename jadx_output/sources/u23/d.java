package u23;

/* loaded from: classes10.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u23.n f424040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u23.e f424041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f424042f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u23.s f424043g;

    public d(u23.n nVar, u23.e eVar, long j17, u23.s sVar) {
        this.f424040d = nVar;
        this.f424041e = eVar;
        this.f424042f = j17;
        this.f424043g = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u23.e eVar;
        java.lang.String a17;
        java.util.List list;
        boolean z17;
        java.util.LinkedList f17;
        u23.o oVar;
        u23.o oVar2;
        if (this.f424040d.f424101e) {
            com.tencent.mars.xlog.Log.i(this.f424041e.f424044a, "start: skip, controller[" + this.f424040d.hashCode() + "] isCancelled");
            return;
        }
        try {
            this.f424041e.e("【start】run start", this.f424042f);
            a17 = this.f424043g.f424106c.a();
            list = (java.util.List) ((java.util.HashMap) this.f424041e.f424048e).get(a17);
            z17 = true;
            if (list != null && this.f424040d.f424098b != null) {
                this.f424041e.e("【start】Post data with cache in ", this.f424042f);
                this.f424040d.b(list, true);
            }
            u23.n nVar = this.f424040d;
            if (nVar.f424098b != null && (oVar2 = nVar.f424098b) != null) {
                oVar2.c();
            }
            u23.e.b(this.f424041e, this.f424040d, this.f424043g);
            u23.e eVar2 = this.f424041e;
            eVar2.getClass();
            android.net.Uri uri = t23.o2.f415216e;
            f17 = t23.n2.f415209a.f();
            com.tencent.mars.xlog.Log.i(eVar2.f424044a, "loadPrivateAlbumData: " + f17.size());
            this.f424041e.getClass();
        } catch (java.lang.Throwable th6) {
            try {
                com.tencent.mars.xlog.Log.printErrStackTrace(this.f424041e.f424044a, th6, "start err!", new java.lang.Object[0]);
                this.f424040d.getClass();
                eVar = this.f424041e;
            } finally {
                this.f424040d.getClass();
                com.tencent.mars.xlog.Log.i(this.f424041e.f424044a, "【start】runnable end");
            }
        }
        if (this.f424040d.f424101e) {
            com.tencent.mars.xlog.Log.i(this.f424041e.f424044a, "【start】: skip post data");
            return;
        }
        if (list == null || this.f424040d.f424098b != null || this.f424040d.f424099c != null) {
            if (list == null) {
                u23.e eVar3 = this.f424041e;
                u23.s sVar = this.f424043g;
                java.util.List f18 = eVar3.f(sVar.f424104a, sVar.f424105b, kz5.n0.V0(f17), this.f424040d);
                if (this.f424040d.f424101e) {
                    com.tencent.mars.xlog.Log.i(this.f424041e.f424044a, "【start】: skip notifyPostDataFinish data");
                    return;
                }
                this.f424041e.e("【start】Post new data in ", this.f424042f);
                ((java.util.HashMap) this.f424041e.f424048e).put(a17, f18);
                u23.n nVar2 = this.f424040d;
                if (this.f424041e.f424053j) {
                    z17 = false;
                }
                nVar2.b(f18, z17);
                u23.n nVar3 = this.f424040d;
                if (nVar3.f424098b != null && (oVar = nVar3.f424098b) != null) {
                    oVar.a();
                }
            } else {
                com.tencent.mars.xlog.Log.i(this.f424041e.f424044a, "【start】No data changed");
            }
        }
        this.f424043g.f424104a.getClass();
        if (!this.f424041e.f424045b && !this.f424040d.f424101e) {
            u23.e eVar4 = this.f424041e;
            u23.n nVar4 = this.f424040d;
            u23.s sVar2 = this.f424043g;
            u23.e.a(eVar4, nVar4, sVar2.f424104a, sVar2.f424105b, this.f424042f);
        }
        this.f424040d.getClass();
        eVar = this.f424041e;
        com.tencent.mars.xlog.Log.i(eVar.f424044a, "【start】runnable end");
    }
}
