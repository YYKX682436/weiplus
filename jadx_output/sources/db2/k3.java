package db2;

/* loaded from: classes2.dex */
public final class k3 implements db2.e3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f228039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ db2.n3 f228040b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f228041c;

    public k3(kotlin.jvm.internal.c0 c0Var, db2.n3 n3Var, kotlin.coroutines.Continuation continuation) {
        this.f228039a = c0Var;
        this.f228040b = n3Var;
        this.f228041c = continuation;
    }

    public void a(int i17, int i18, java.lang.String str, r45.ny3 ny3Var) {
        kotlin.jvm.internal.c0 c0Var = this.f228039a;
        if (c0Var.f310112d) {
            return;
        }
        db2.n3 n3Var = this.f228040b;
        com.tencent.mars.xlog.Log.w(n3Var.A, "runTask: onConcurrentError tabType = " + n3Var.f228079d + ", pullType = " + n3Var.f228080e);
        db2.c3 c3Var = new db2.c3();
        c3Var.f227923n = 3;
        this.f228041c.resumeWith(kotlin.Result.m521constructorimpl(c3Var));
        c0Var.f310112d = true;
    }
}
