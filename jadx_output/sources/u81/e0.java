package u81;

/* loaded from: classes7.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    public int f425412a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u81.f0 f425413b;

    public e0(u81.f0 f0Var, u81.k kVar) {
        this.f425413b = f0Var;
    }

    public static void a(u81.e0 e0Var, int i17) {
        e0Var.f425412a |= i17;
        u81.f0 f0Var = e0Var.f425413b;
        com.tencent.mars.xlog.Log.i(f0Var.f425423u, "addSuspendFlag, appId:%s, flag: %d, result: %d", f0Var.f425424v.f74803n, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(e0Var.f425412a));
    }

    public static void b(u81.e0 e0Var, int i17) {
        e0Var.f425412a &= ~i17;
        u81.f0 f0Var = e0Var.f425413b;
        com.tencent.mars.xlog.Log.i(f0Var.f425423u, "removeSuspendFlag, appId:%s, flag: %d, result: %d", f0Var.f425424v.f74803n, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(e0Var.f425412a));
    }
}
