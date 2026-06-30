package rh3;

/* loaded from: classes12.dex */
public class q implements rh3.p {

    /* renamed from: a, reason: collision with root package name */
    public qh3.a f395678a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.Surface f395679b;

    /* renamed from: c, reason: collision with root package name */
    public int f395680c = 2;

    static {
        new java.util.concurrent.ConcurrentSkipListSet();
    }

    @Override // rh3.p
    public yh3.b a() {
        return new yh3.a();
    }

    @Override // rh3.p
    public xh3.c c() {
        ((cf0.t) ((df0.r) i95.n0.c(df0.r.class))).getClass();
        return (xh3.h) ((jz5.n) ((cf0.z) i95.n0.c(cf0.z.class)).f40865g).getValue();
    }

    public final void d(wh3.b mediaSource, qh3.a videoFileStateCache) {
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        kotlin.jvm.internal.o.g(videoFileStateCache, "videoFileStateCache");
        this.f395678a = videoFileStateCache;
    }

    public qh3.a e() {
        qh3.a aVar = this.f395678a;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.o.o("videoFileStateCache");
        throw null;
    }

    public java.lang.String f(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "MM-OPC";
        }
        return "MM-OPC-" + str;
    }
}
