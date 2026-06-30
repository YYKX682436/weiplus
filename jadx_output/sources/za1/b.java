package za1;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final za1.b f470878a = new za1.b();

    /* renamed from: b, reason: collision with root package name */
    public static final long f470879b = java.util.concurrent.TimeUnit.DAYS.toMillis(1);

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f470880c = com.tencent.mm.sdk.platformtools.o4.M("jsapi_ipc_big_data_transfer");

    public final byte[] a(java.lang.String key, boolean z17) {
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mm.sdk.platformtools.o4 o4Var = f470880c;
        byte[] j17 = o4Var.j(key);
        kotlin.jvm.internal.o.d(j17);
        if (z17) {
            o4Var.remove(key);
        }
        return j17;
    }

    public final jz5.l b(byte[] data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data.length < 102400) {
            return new jz5.l(java.lang.Boolean.FALSE, "");
        }
        java.lang.String str = android.os.SystemClock.elapsedRealtimeNanos() + "";
        f470880c.H(str, data);
        return new jz5.l(java.lang.Boolean.TRUE, str);
    }
}
