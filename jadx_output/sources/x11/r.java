package x11;

/* loaded from: classes12.dex */
public final class r implements java.util.concurrent.ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public static final x11.r f451386d = new x11.r();

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", "tryBatchGetContact() new thread");
        return pu5.i.b("HighPriority-" + java.lang.System.currentTimeMillis(), runnable, 10);
    }
}
