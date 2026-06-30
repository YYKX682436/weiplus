package z51;

/* loaded from: classes10.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public final y51.a f470234a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f470235b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f470236c;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f470237d;

    /* renamed from: e, reason: collision with root package name */
    public long f470238e;

    public x(y51.a pcContext) {
        kotlin.jvm.internal.o.g(pcContext, "pcContext");
        this.f470234a = pcContext;
        this.f470235b = c();
        this.f470236c = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
    }

    public final z51.x a(java.lang.Class clazz) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        return ((y51.b) this.f470234a).a(clazz);
    }

    public final android.content.Context b() {
        android.content.Context context = this.f470237d;
        if (context != null) {
            return context;
        }
        kotlin.jvm.internal.o.o("context");
        throw null;
    }

    public abstract java.lang.String c();

    public void d(a61.a config) {
        kotlin.jvm.internal.o.g(config, "config");
        java.lang.Long l17 = config.f1718b.f1722d;
        kotlin.jvm.internal.o.f(l17, "getMediaId(...)");
        this.f470238e = l17.longValue();
        android.content.Context playerContext = ((y51.b) this.f470234a).getPlayerContext();
        kotlin.jvm.internal.o.g(playerContext, "<set-?>");
        this.f470237d = playerContext;
        f(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    public final void e(java.lang.String msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.e(this.f470235b, hashCode() + " mediaId: " + this.f470238e + " >> " + msg);
    }

    public final void f(java.lang.String msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i(this.f470235b, hashCode() + " mediaId: " + this.f470238e + " >> " + msg);
    }

    public final void g(java.lang.String msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.w(this.f470235b, hashCode() + " mediaId: " + this.f470238e + " >> " + msg);
    }

    public void h() {
        f("pause");
    }

    public void i() {
    }

    public void j() {
        f("release");
        kotlinx.coroutines.z0.e(this.f470236c, null, 1, null);
    }
}
