package et2;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: f, reason: collision with root package name */
    public static final et2.e f256583f = et2.c.f256579a;

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f256584a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f256585b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f256586c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f256587d;

    /* renamed from: e, reason: collision with root package name */
    public int f256588e;

    public e(kotlin.jvm.internal.i iVar) {
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f256584a = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a));
        this.f256585b = new java.util.concurrent.ConcurrentHashMap();
        this.f256586c = new java.util.concurrent.ConcurrentHashMap();
        this.f256587d = new java.util.HashMap();
        android.content.Context applicationContext = com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext();
        kotlin.jvm.internal.o.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) applicationContext).registerActivityLifecycleCallbacks(new et2.b(this));
    }
}
