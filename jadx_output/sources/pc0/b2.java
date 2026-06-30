package pc0;

/* loaded from: classes10.dex */
public final class b2 implements androidx.activity.result.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.ComponentActivity f353233a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353234b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f353235c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pc0.e2 f353236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f353237e;

    public b2(androidx.activity.ComponentActivity componentActivity, java.lang.String str, kotlin.jvm.internal.h0 h0Var, pc0.e2 e2Var, kotlinx.coroutines.q qVar) {
        this.f353233a = componentActivity;
        this.f353234b = str;
        this.f353235c = h0Var;
        this.f353236d = e2Var;
        this.f353237e = qVar;
    }

    @Override // androidx.activity.result.b
    public void a(java.lang.Object obj) {
        qc0.m1 m1Var = (qc0.m1) obj;
        androidx.activity.result.h activityResultRegistry = this.f353233a.getActivityResultRegistry();
        kotlin.jvm.internal.o.f(activityResultRegistry, "getActivityResultRegistry(...)");
        java.lang.String key = this.f353234b;
        kotlin.jvm.internal.o.g(key, "key");
        java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) activityResultRegistry.f9064c).get(key);
        int intValue = num != null ? num.intValue() : -1;
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaOptService", "ActivityResultCallback key:" + key + " requestCode:" + intValue);
        m1Var.f361410a = intValue;
        androidx.activity.result.c cVar = (androidx.activity.result.c) this.f353235c.f310123d;
        if (cVar != null) {
            cVar.b();
        }
        this.f353236d.f353249d.remove(key);
        ((kotlinx.coroutines.r) this.f353237e).resumeWith(kotlin.Result.m521constructorimpl(m1Var));
    }
}
