package mp0;

/* loaded from: classes15.dex */
public abstract class h extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final ip0.a f330440f;

    /* renamed from: g, reason: collision with root package name */
    public final cp0.f f330441g;

    /* renamed from: h, reason: collision with root package name */
    public final vo0.h f330442h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.w1 f330443i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f330444m;

    /* renamed from: n, reason: collision with root package name */
    public fp0.u f330445n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f330446o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f330447p;

    /* renamed from: q, reason: collision with root package name */
    public hp0.e f330448q;

    public h(ip0.a url, cp0.f target, vo0.h REAPER, com.tencent.mm.sdk.platformtools.w1 w1Var) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(target, "target");
        kotlin.jvm.internal.o.g(REAPER, "REAPER");
        this.f330440f = url;
        this.f330441g = target;
        this.f330442h = REAPER;
        this.f330443i = w1Var;
        this.f330444m = "MicroMsg.Loader.ImageLoader.ImageLoadTask";
        this.f330445n = fp0.u.f265288d;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f330446o = concurrentLinkedQueue;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue2 = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f330447p = concurrentLinkedQueue2;
        ep0.c cVar = REAPER.f438477g;
        if (cVar != null) {
            concurrentLinkedQueue.add(cVar);
        }
        concurrentLinkedQueue2.add(REAPER.f438474d);
    }

    @Override // fp0.d
    public void a() {
        java.lang.System.currentTimeMillis();
        yo0.h fileType = this.f330442h.f438472b.f464099d;
        mp0.g gVar = new mp0.g(this);
        mp0.e eVar = (mp0.e) this;
        kotlin.jvm.internal.o.g(fileType, "fileType");
        try {
            eVar.h(fileType, gVar);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Loader.ImageLoadWorkTask", e17, "[ImageLoader execute] " + e17.getMessage() + " run error " + eVar.f330440f + " [debug info null]", new java.lang.Object[0]);
            gVar.b();
        }
    }

    @Override // fp0.d
    public boolean c(fp0.d newTask) {
        kotlin.jvm.internal.o.g(newTask, "newTask");
        boolean z17 = !(this.f330441g instanceof cp0.a);
        synchronized (this) {
            if (!z17) {
                if (newTask instanceof mp0.h) {
                    if (this.f330448q != null) {
                        com.tencent.mars.xlog.Log.i(this.f330444m, "[isCanReplaceCallback] task has end! url=" + this.f330440f);
                        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = ((mp0.h) newTask).f330446o;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj : concurrentLinkedQueue) {
                            if (obj instanceof ep0.c) {
                                arrayList.add(obj);
                            }
                        }
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((ep0.c) it.next()).a(this.f330440f, this.f330441g.f220745a, this.f330448q);
                        }
                        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue2 = ((mp0.h) newTask).f330447p;
                        java.util.ArrayList<ep0.e> arrayList2 = new java.util.ArrayList();
                        for (java.lang.Object obj2 : concurrentLinkedQueue2) {
                            if (obj2 instanceof ep0.e) {
                                arrayList2.add(obj2);
                            }
                        }
                        for (ep0.e eVar : arrayList2) {
                            ip0.a aVar = this.f330440f;
                            cp0.n nVar = this.f330441g.f220745a;
                            hp0.e eVar2 = this.f330448q;
                            eVar.a(aVar, nVar, eVar2 != null ? eVar2.f282910b : null);
                        }
                    } else {
                        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue3 = this.f330446o;
                        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue4 = ((mp0.h) newTask).f330446o;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        for (java.lang.Object obj3 : concurrentLinkedQueue4) {
                            if (obj3 instanceof ep0.c) {
                                arrayList3.add(obj3);
                            }
                        }
                        concurrentLinkedQueue3.addAll(arrayList3);
                        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue5 = this.f330447p;
                        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue6 = ((mp0.h) newTask).f330447p;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        for (java.lang.Object obj4 : concurrentLinkedQueue6) {
                            if (obj4 instanceof ep0.e) {
                                arrayList4.add(obj4);
                            }
                        }
                        concurrentLinkedQueue5.addAll(arrayList4);
                    }
                }
            }
        }
        return z17;
    }

    @Override // fp0.d
    public java.lang.String d() {
        java.lang.String aVar = this.f330440f.toString();
        kotlin.jvm.internal.o.f(aVar, "toString(...)");
        return aVar;
    }

    public final void e(hp0.i httpResponse, hp0.g source, hp0.g gVar, mp0.h task) {
        kotlin.jvm.internal.o.g(httpResponse, "httpResponse");
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(task, "task");
        vo0.h hVar = this.f330442h;
        yo0.i iVar = hVar.f438472b;
        if (iVar.f464097b) {
            hVar.f438480j.f(this.f330440f, httpResponse, source, gVar, iVar, hVar);
        }
    }

    public final void f(hp0.e eVar) {
        synchronized (this) {
            this.f330448q = eVar;
            java.util.Iterator it = this.f330446o.iterator();
            while (it.hasNext()) {
                ((ep0.c) it.next()).a(this.f330440f, this.f330441g.f220745a, eVar);
            }
            java.util.Iterator it6 = this.f330447p.iterator();
            while (it6.hasNext()) {
                ((ep0.e) it6.next()).a(this.f330440f, this.f330441g.f220745a, eVar != null ? eVar.f282910b : null);
            }
        }
    }

    public final void g(hp0.e resultData) {
        vo0.h hVar;
        ep0.d dVar;
        kotlin.jvm.internal.o.g(resultData, "resultData");
        if (!resultData.a()) {
            resultData = null;
        }
        if (resultData == null || (dVar = (hVar = this.f330442h).f438475e) == null) {
            return;
        }
        pm0.v.X(new ap0.f((ap0.g) dVar, hVar.a().f220745a));
    }
}
