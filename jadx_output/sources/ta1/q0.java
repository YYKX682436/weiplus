package ta1;

/* loaded from: classes7.dex */
public class q0 {

    /* renamed from: g, reason: collision with root package name */
    public static volatile java.util.Map f416663g = new java.util.HashMap(1);

    /* renamed from: h, reason: collision with root package name */
    public static final ta1.m0 f416664h = ta1.m0.Hardware;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f416665a;

    /* renamed from: b, reason: collision with root package name */
    public final ta1.b f416666b;

    /* renamed from: c, reason: collision with root package name */
    public final com.hilive.mediasdk.MediaSdk f416667c = new com.hilive.mediasdk.MediaSdk();

    /* renamed from: d, reason: collision with root package name */
    public ta1.o0 f416668d = ta1.o0.NotInit;

    /* renamed from: e, reason: collision with root package name */
    public ta1.r0 f416669e = null;

    /* renamed from: f, reason: collision with root package name */
    public ta1.r0 f416670f = null;

    public q0(com.tencent.mm.plugin.appbrand.e9 e9Var) {
        android.content.Context context = e9Var.getContext();
        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3("wegame_screen_recorder_worker");
        this.f416665a = n3Var;
        if (f416664h != ta1.m0.Software) {
            this.f416666b = new ta1.f(e9Var);
        }
        n3Var.postToWorker(new ta1.w(this, context));
    }

    public static boolean a(ta1.q0 q0Var) {
        ta1.o0 o0Var = q0Var.f416668d;
        if (o0Var != ta1.o0.NotInit && o0Var != ta1.o0.Inited) {
            q0Var.f416666b.getClass();
            ta1.r0 r0Var = q0Var.f416669e;
            if (r0Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(((ma1.c) r0Var).f325152a)) {
                return true;
            }
        }
        return false;
    }

    public static ta1.q0 b(java.lang.String str, com.tencent.mm.plugin.appbrand.e9 e9Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            throw new java.lang.RuntimeException("Null or nil appid");
        }
        ta1.q0 q0Var = null;
        if (!((java.util.HashMap) f416663g).containsKey(str)) {
            synchronized (ta1.q0.class) {
                if (!((java.util.HashMap) f416663g).containsKey(str)) {
                    q0Var = new ta1.q0(e9Var);
                    ((java.util.HashMap) f416663g).put(str, q0Var);
                }
            }
        }
        return q0Var == null ? (ta1.q0) ((java.util.HashMap) f416663g).get(str) : q0Var;
    }
}
