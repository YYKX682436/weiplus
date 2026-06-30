package ey2;

/* loaded from: classes2.dex */
public final class e2 extends pf5.o0 {

    /* renamed from: i, reason: collision with root package name */
    public static final ey2.d2 f257356i = new ey2.d2(null);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f257357e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f257358f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f257359g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f257360h = new java.util.HashSet();

    public final void N6(boolean z17) {
        com.tencent.mars.xlog.Log.i("Finder.StreamCardVM", "clearAlbumReadFeeds... size=" + this.f257359g.size());
        synchronized (this.f257359g) {
            this.f257359g.clear();
            if (z17) {
                this.f257360h.clear();
            }
        }
    }
}
