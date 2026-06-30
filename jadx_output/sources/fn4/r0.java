package fn4;

/* loaded from: classes15.dex */
public class r0 {

    /* renamed from: a, reason: collision with root package name */
    public fn4.b f264600a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f264601b;

    /* renamed from: e, reason: collision with root package name */
    public int f264604e = 0;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f264602c = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f264603d = java.util.Collections.synchronizedSet(new java.util.HashSet());

    public final long a(long j17, long j18) {
        if (j18 != 0) {
            return (j17 * 100) / j18;
        }
        return 0L;
    }

    public void b() {
        java.util.Iterator it = this.f264603d.iterator();
        while (it.hasNext()) {
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di((java.lang.String) it.next());
        }
    }

    public void c(fn4.b bVar) {
        int i17 = this.f264604e + 1;
        this.f264604e = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryPreloadMgr", "onUICreate %d", java.lang.Integer.valueOf(i17));
        this.f264600a = bVar;
        this.f264601b = pm4.w.j(bVar.r0().f387512r);
    }

    public void d() {
        int i17 = this.f264604e - 1;
        this.f264604e = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryPreloadMgr", "onUIDestroy %d", java.lang.Integer.valueOf(i17));
        if (this.f264604e <= 0) {
            b();
            this.f264603d.clear();
            s75.d.b(new fn4.o0(this, this.f264601b), "TopStory.DeleteVideoFolderTask");
            this.f264600a = null;
        }
    }
}
