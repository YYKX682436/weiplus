package tl4;

/* loaded from: classes11.dex */
public abstract class e extends android.support.v4.media.session.v {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.unit_rc.WeakPtr f420301f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f420302g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final int f420303h = 3000;

    /* renamed from: i, reason: collision with root package name */
    public final int f420304i = 10;

    /* renamed from: j, reason: collision with root package name */
    public bw5.jq0 f420305j;

    public e(com.tencent.unit_rc.WeakPtr weakPtr) {
        this.f420301f = weakPtr;
    }

    @Override // android.support.v4.media.session.v
    public void d() {
        if (!l()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingPlayAppBaseMediaSessionCallBack", "onPause call too much, just return");
            return;
        }
        b66.n n17 = n();
        if ((n17 != null ? ((b66.q) n17).n() : null) == bw5.pq0.Idle) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingPlayAppBaseMediaSessionCallBack", "onPause call but now is idle");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingPlayAppBaseMediaSessionCallBack", "onPause");
            d75.b.g(new tl4.b(this));
        }
    }

    @Override // android.support.v4.media.session.v
    public void e() {
        if (!l()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingPlayAppBaseMediaSessionCallBack", "onPlay call too much, just return");
            return;
        }
        b66.n n17 = n();
        if ((n17 != null ? ((b66.q) n17).n() : null) == bw5.pq0.Idle) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingPlayAppBaseMediaSessionCallBack", "onPlay call but now is idle");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingPlayAppBaseMediaSessionCallBack", "onPlay");
            d75.b.g(new tl4.c(this));
        }
    }

    @Override // android.support.v4.media.session.v
    public void f(java.lang.String str, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingPlayAppBaseMediaSessionCallBack", "onPlayFromMediaId mediaId: " + str);
    }

    @Override // android.support.v4.media.session.v
    public void j() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingPlayAppBaseMediaSessionCallBack", "onStop");
        d75.b.g(new tl4.d(this));
    }

    public final synchronized boolean l() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        while (!this.f420302g.isEmpty()) {
            java.lang.Object first = this.f420302g.getFirst();
            kotlin.jvm.internal.o.f(first, "getFirst(...)");
            if (java.lang.Math.abs(currentTimeMillis - ((java.lang.Number) first).longValue()) <= this.f420303h) {
                break;
            }
            this.f420302g.removeFirst();
        }
        if (this.f420302g.size() >= this.f420304i) {
            return false;
        }
        this.f420302g.addLast(java.lang.Long.valueOf(currentTimeMillis));
        return true;
    }

    public abstract bw5.eq0 m();

    public b66.n n() {
        b66.g gVar;
        com.tencent.unit_rc.WeakPtr weakPtr = this.f420301f;
        if (weakPtr == null || (gVar = (b66.g) weakPtr.lock()) == null) {
            return null;
        }
        return ((b66.i) gVar).a();
    }
}
