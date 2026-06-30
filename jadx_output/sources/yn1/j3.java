package yn1;

/* loaded from: classes11.dex */
public final class j3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f463724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f463725e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(yn1.a4 a4Var, long j17) {
        super(1);
        this.f463724d = a4Var;
        this.f463725e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yn1.a4 a4Var = this.f463724d;
        java.lang.String str = a4Var.f463606a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[insertChatPackageAsync] Task is cancelled, taskId=");
        long j17 = this.f463725e;
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        com.tencent.wechat.aff.migration.a aVar = a4Var.f463609d;
        if (aVar != null) {
            aVar.v(j17);
        }
        return jz5.f0.f302826a;
    }
}
