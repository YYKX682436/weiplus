package yn1;

/* loaded from: classes11.dex */
public final class f3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f463667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f463668e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f463669f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(yn1.a4 a4Var, long j17, long j18) {
        super(1);
        this.f463667d = a4Var;
        this.f463668e = j17;
        this.f463669f = j18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yn1.a4 a4Var = this.f463667d;
        com.tencent.mars.xlog.Log.i(a4Var.f463606a, "[getChatPackageAsync] Task is cancelled, taskId=" + this.f463668e);
        com.tencent.wechat.aff.migration.a aVar = a4Var.f463609d;
        if (aVar != null) {
            aVar.a(this.f463668e, true, this.f463669f, new bw5.w0());
        }
        return jz5.f0.f302826a;
    }
}
