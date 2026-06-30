package o23;

/* loaded from: classes10.dex */
public final class h implements androidx.activity.result.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.ComponentActivity f342418a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342419b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f342420c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f342421d;

    public h(androidx.activity.ComponentActivity componentActivity, java.lang.String str, kotlin.jvm.internal.h0 h0Var, kotlinx.coroutines.q qVar) {
        this.f342418a = componentActivity;
        this.f342419b = str;
        this.f342420c = h0Var;
        this.f342421d = qVar;
    }

    @Override // androidx.activity.result.b
    public void a(java.lang.Object obj) {
        qc0.m1 m1Var = (qc0.m1) obj;
        androidx.activity.result.h activityResultRegistry = this.f342418a.getActivityResultRegistry();
        kotlin.jvm.internal.o.f(activityResultRegistry, "getActivityResultRegistry(...)");
        java.lang.String key = this.f342419b;
        kotlin.jvm.internal.o.g(key, "key");
        java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) activityResultRegistry.f9064c).get(key);
        int intValue = num != null ? num.intValue() : -1;
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryFeatureService", "ActivityResultCallback key:" + key + " requestCode:" + intValue);
        m1Var.f361410a = intValue;
        androidx.activity.result.c cVar = (androidx.activity.result.c) this.f342420c.f310123d;
        if (cVar != null) {
            cVar.b();
        }
        ((kotlinx.coroutines.r) this.f342421d).resumeWith(kotlin.Result.m521constructorimpl(m1Var));
    }
}
