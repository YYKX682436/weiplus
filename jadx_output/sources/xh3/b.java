package xh3;

/* loaded from: classes12.dex */
public abstract class b implements java.lang.Runnable {

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f454567n = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: d, reason: collision with root package name */
    public final rh3.p f454568d;

    /* renamed from: e, reason: collision with root package name */
    public final wh3.d f454569e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f454570f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f454571g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f454572h;

    /* renamed from: i, reason: collision with root package name */
    public xh3.a f454573i;

    /* renamed from: m, reason: collision with root package name */
    public final qh3.a f454574m;

    static {
        new java.util.concurrent.atomic.AtomicInteger(0);
    }

    public b(rh3.p onePlayContext, wh3.d mediaSource) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(onePlayContext, "onePlayContext");
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        this.f454568d = onePlayContext;
        this.f454569e = mediaSource;
        this.f454570f = "AbsMMMarsDownloaderTask";
        java.lang.String str2 = mediaSource.f445965a;
        this.f454571g = str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str2);
        sb6.append('_');
        if (this instanceof yh3.d) {
            str = "mmdownload_" + f454567n.getAndIncrement();
        } else {
            str = com.eclipsesource.mmv8.Platform.UNKNOWN;
        }
        sb6.append(str);
        this.f454572h = sb6.toString();
        this.f454573i = xh3.a.f454560d;
        this.f454574m = ((rh3.q) onePlayContext).e();
    }

    public final void a(xh3.a toState) {
        kotlin.jvm.internal.o.g(toState, "toState");
        com.tencent.mars.xlog.Log.i(b(), "changeTaskState from " + this.f454573i + " to " + toState);
        this.f454573i = toState;
    }

    public java.lang.String b() {
        return ((rh3.q) this.f454568d).f(this.f454570f);
    }

    public final boolean c() {
        yh3.c cVar;
        boolean z17 = false;
        if (this.f454573i == xh3.a.f454562f) {
            com.tencent.mars.xlog.Log.w(b(), "startDownload return for state:" + this.f454573i);
            return false;
        }
        if (this.f454574m.a()) {
            com.tencent.mars.xlog.Log.w(b(), "startDownload return for cacheCompete");
            return false;
        }
        dn.o oVar = this.f454569e.f445972c;
        if (oVar.field_fileId == null) {
            oVar.field_fileId = "";
        }
        if (oVar.field_aesKey == null) {
            oVar.field_aesKey = "";
        }
        oVar.f241786e = false;
        yh3.d dVar = (yh3.d) this;
        rh3.p pVar = dVar.f454568d;
        if (((xh3.h) pVar.c()).e(dVar)) {
            oVar.f241815c2 = dVar;
            dVar.f462405s = pVar.a();
            java.util.List c17 = ((xh3.h) pVar.c()).c(dVar.f454571g);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) c17).iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (true ^ kotlin.jvm.internal.o.b(((xh3.b) next).f454572h, dVar.f454572h)) {
                    arrayList.add(next);
                }
            }
            boolean z18 = !arrayList.isEmpty();
            wh3.d dVar2 = dVar.f454569e;
            rh3.f fVar = dVar.f462401o;
            if (z18) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    java.lang.Object next2 = it6.next();
                    if (next2 instanceof yh3.d) {
                        arrayList2.add(next2);
                    }
                }
                yh3.d dVar3 = (yh3.d) kz5.n0.X(arrayList2);
                com.tencent.mars.xlog.Log.i(dVar.b(), "syncDownloadTaskState source:" + dVar + " x[isMoovReady:" + dVar.f462403q + " taskState:" + dVar.f454573i + "] to target:" + dVar3 + " x[isMoovReady:" + dVar3.f462403q + " taskState:" + dVar3.f454573i + ']');
                boolean z19 = dVar3.f462403q;
                if (z19 && !dVar.f462403q && (cVar = dVar3.f462404r) != null) {
                    dVar.f462404r = cVar;
                }
                dVar.f462403q = z19;
                xh3.a aVar = dVar3.f454573i;
                kotlin.jvm.internal.o.g(aVar, "<set-?>");
                dVar.f454573i = aVar;
                dVar.f462402p = dVar3.f462402p;
                if (dVar.f462404r != null) {
                    java.lang.String b17 = dVar.b();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMoovReady rePlay offset=");
                    yh3.c cVar2 = dVar.f462404r;
                    kotlin.jvm.internal.o.d(cVar2);
                    sb6.append(cVar2.f462399a);
                    sb6.append(" length=");
                    yh3.c cVar3 = dVar.f462404r;
                    kotlin.jvm.internal.o.d(cVar3);
                    sb6.append(cVar3.f462400b);
                    sb6.append(' ');
                    sb6.append(dVar);
                    com.tencent.mars.xlog.Log.i(b17, sb6.toString());
                    if (fVar != null) {
                        yh3.c cVar4 = dVar.f462404r;
                        kotlin.jvm.internal.o.d(cVar4);
                        int i17 = (int) cVar4.f462399a;
                        yh3.c cVar5 = dVar.f462404r;
                        kotlin.jvm.internal.o.d(cVar5);
                        fVar.f(dVar2, i17, (int) cVar5.f462400b, false);
                    }
                }
                com.tencent.mars.xlog.Log.i(dVar.b(), "startDownloadInternal sync task:" + dVar + " list:" + arrayList);
            } else {
                yh3.b bVar = dVar.f462405s;
                int d17 = bVar != null ? bVar.d(oVar, oVar.H1) : -111;
                if (d17 == -21006) {
                    com.tencent.mars.xlog.Log.w(dVar.b(), "startDownloadInternal duplicate download ret:" + d17 + " task:" + oVar);
                    dVar.d();
                    yh3.b bVar2 = dVar.f462405s;
                    d17 = bVar2 != null ? bVar2.d(oVar, oVar.H1) : -1111;
                    ((xh3.h) pVar.c()).e(dVar);
                }
                if (d17 != 0) {
                    com.tencent.mars.xlog.Log.i(dVar.b(), "startDownloadInternal failed ret:" + d17 + " task:" + oVar);
                }
            }
            if (fVar != null) {
                fVar.k(dVar2);
            }
            com.tencent.mars.xlog.Log.i(dVar.b(), "startDownloadInternal success task:" + oVar);
            z17 = true;
        } else {
            com.tencent.mars.xlog.Log.w(dVar.b(), "startDownloadInternal failed for submitTask task:" + oVar);
        }
        if (z17) {
            a(xh3.a.f454562f);
        } else {
            a(xh3.a.f454565i);
        }
        return z17;
    }

    public java.lang.String toString() {
        return ((rh3.q) this.f454568d).f(this.f454570f) + '.' + this.f454572h;
    }
}
