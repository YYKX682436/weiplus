package t00;

/* loaded from: classes7.dex */
public final class m2 implements com.tencent.mm.feature.ecs.share.t {

    /* renamed from: a, reason: collision with root package name */
    public c00.n3 f414319a;

    public void a(java.lang.String errorText) {
        kotlin.jvm.internal.o.g(errorText, "errorText");
        com.tencent.mars.xlog.Log.w("ShareToContactsEcsActionHandler", "onFail： ".concat(errorText));
        c00.n3 n3Var = this.f414319a;
        if (n3Var != null) {
            n3Var.a();
        }
        this.f414319a = null;
    }
}
