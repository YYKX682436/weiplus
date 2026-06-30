package o23;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final o23.b f342411a = new o23.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f342412b = new java.util.HashMap();

    public final void a(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        java.util.HashMap hashMap = f342412b;
        hashMap.remove(sessionId);
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumResultDispatcher", "unregisterCallback: count " + hashMap.size());
    }
}
