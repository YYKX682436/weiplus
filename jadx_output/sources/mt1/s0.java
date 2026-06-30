package mt1;

/* loaded from: classes5.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public long f331263a = java.lang.System.currentTimeMillis();

    public final void a(java.lang.String tag, java.lang.String message) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(message, "message");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i(tag, "(" + (currentTimeMillis - this.f331263a) + " ms) " + message);
        this.f331263a = currentTimeMillis;
    }
}
