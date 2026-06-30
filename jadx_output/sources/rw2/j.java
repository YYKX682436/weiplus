package rw2;

/* loaded from: classes10.dex */
public final class j implements rm5.k {

    /* renamed from: j, reason: collision with root package name */
    public static final android.util.LruCache f400604j = new android.util.LruCache(200);

    /* renamed from: a, reason: collision with root package name */
    public final rw2.k f400605a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f400606b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f400607c;

    /* renamed from: d, reason: collision with root package name */
    public final rw2.t f400608d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f400609e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f400610f;

    /* renamed from: g, reason: collision with root package name */
    public kk4.v f400611g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f400612h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Bitmap f400613i;

    public j(rw2.k trackInfo, kk4.h hVar) {
        kotlin.jvm.internal.o.g(trackInfo, "trackInfo");
        this.f400605a = trackInfo;
        this.f400606b = trackInfo.f400614n.f234484u;
        java.lang.String str = "MicroMsg.TPTrackThumbFetcher@" + hashCode();
        this.f400607c = str;
        this.f400608d = new rw2.t(trackInfo.f311071a, trackInfo.f311072b);
        this.f400609e = new java.util.LinkedList();
        if (com.tencent.mm.vfs.w6.j(trackInfo.f400614n.f234473j)) {
            d();
            com.tencent.mars.xlog.Log.i(str, "init check first thumb exist");
        } else {
            java.lang.String thumbPath = trackInfo.f400614n.f234473j;
            kotlin.jvm.internal.o.f(thumbPath, "thumbPath");
            if (thumbPath.length() > 0) {
                java.lang.String thumbUrl = trackInfo.f400614n.f234471h;
                kotlin.jvm.internal.o.f(thumbUrl, "thumbUrl");
                if (thumbUrl.length() > 0) {
                    o11.f fVar = new o11.f();
                    fVar.f342082f = trackInfo.f400614n.f234473j;
                    fVar.f342078b = true;
                    fVar.f342077a = true;
                    n11.a.b().d(trackInfo.f400614n.f234471h, fVar.a(), new rw2.b(this));
                }
            }
        }
        java.lang.Object obj = new java.lang.Object();
        ((ku5.t0) ku5.t0.f312615d).B(new rw2.f(this, hVar, obj));
        synchronized (obj) {
            try {
                obj.wait();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(this.f400607c, e17, "wait init thumb fetcher error", new java.lang.Object[0]);
            }
        }
        com.tencent.mars.xlog.Log.i(this.f400607c, "init thumb fetcher finished");
    }

    @Override // rm5.k
    public void a(java.util.List times, yz5.p callback) {
        boolean z17;
        kotlin.jvm.internal.o.g(times, "times");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : times) {
            long longValue = ((java.lang.Number) obj).longValue();
            com.tencent.mars.xlog.Log.i(this.f400607c, "requestFrames: " + longValue);
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) f400604j.get(this.f400606b + '-' + longValue);
            if (bitmap != null) {
                callback.invoke(java.lang.Long.valueOf(longValue), bitmap);
                z17 = false;
            } else {
                if (this.f400613i != null && longValue == 0) {
                    callback.invoke(java.lang.Long.valueOf(longValue), this.f400613i);
                }
                z17 = true;
            }
            if (z17) {
                arrayList.add(obj);
            }
        }
        java.util.List Q = kz5.n0.Q(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(Q, 10));
        java.util.Iterator it = Q.iterator();
        while (it.hasNext()) {
            arrayList2.add(new rw2.g(((java.lang.Number) it.next()).longValue(), callback, null, 4, null));
        }
        if (arrayList2.isEmpty()) {
            com.tencent.mars.xlog.Log.i(this.f400607c, "requestFrames: no new request");
            return;
        }
        synchronized (this.f400609e) {
            this.f400609e.addAll(arrayList2);
        }
        c();
    }

    @Override // rm5.k
    public void b(long j17) {
        synchronized (this.f400609e) {
            kz5.h0.B(this.f400609e, new rw2.h(j17));
        }
    }

    public final void c() {
        kk4.v vVar;
        synchronized (this.f400609e) {
            if (this.f400610f) {
                return;
            }
            if (!this.f400609e.isEmpty()) {
                java.lang.Object obj = this.f400609e.get(0);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                long j17 = ((rw2.g) obj).f400596a;
                this.f400608d.f400639p = j17;
                if (this.f400612h && (vVar = this.f400611g) != null) {
                    kk4.b.f(vVar, (int) j17, true, null, 4, null);
                }
                this.f400610f = true;
            } else {
                com.tencent.mars.xlog.Log.i(this.f400607c, "finished request all frames");
                destroy();
            }
        }
    }

    public final void d() {
        android.graphics.Bitmap c17 = com.tencent.mm.graphics.e.c(this.f400605a.f400614n.f234473j);
        if (c17 != null) {
            this.f400613i = android.graphics.Bitmap.createScaledBitmap(c17, (int) (120 * (c17.getWidth() / c17.getHeight())), 120, true);
            c17.recycle();
        }
    }

    @Override // rm5.k
    public void destroy() {
        com.tencent.mars.xlog.Log.i(this.f400607c, "destroy");
        kk4.v vVar = this.f400611g;
        kk4.h hVar = vVar != null ? vVar.f308580e : null;
        if (hVar != null) {
            hVar.f308551m = null;
        }
        if (vVar != null) {
            vVar.P();
            vVar.recycle();
        }
        this.f400611g = null;
        rw2.t tVar = this.f400608d;
        tVar.getClass();
        tVar.b(new rw2.q(tVar));
    }

    @Override // rm5.k
    public void setSize(int i17, int i18) {
        rw2.t tVar = this.f400608d;
        if (tVar.f400624a != i17 || tVar.f400625b != i18) {
            tVar.f400637n = true;
        }
        tVar.f400624a = i17;
        tVar.f400625b = i18;
    }
}
