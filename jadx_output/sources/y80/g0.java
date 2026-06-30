package y80;

/* loaded from: classes10.dex */
public final class g0 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y80.k0 f459846a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f459847b;

    public g0(y80.k0 k0Var, yz5.l lVar) {
        this.f459846a = k0Var;
        this.f459847b = lVar;
    }

    @Override // d85.k0
    public final void onOp(java.lang.Boolean bool) {
        com.tencent.mars.xlog.Log.i(this.f459846a.f459872d, "sensitivePermissionReqCallback: " + bool);
        kotlin.jvm.internal.o.d(bool);
        this.f459847b.invoke(bool);
    }
}
