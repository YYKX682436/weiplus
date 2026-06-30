package vw;

@j95.b
/* loaded from: classes6.dex */
public final class r extends i95.w {

    /* renamed from: e, reason: collision with root package name */
    public static volatile vw.r f440722e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f440723d = new java.util.concurrent.ConcurrentHashMap();

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        com.tencent.mars.xlog.Log.i("BrsLivePlayHelperService", "BrsLivePlayHelperService initialized");
        synchronized (vw.r.class) {
            if (f440722e == null) {
                f440722e = this;
            }
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("BrsLivePlayHelperService", "Initializing on main process");
        }
    }
}
