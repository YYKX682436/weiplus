package yn1;

/* loaded from: classes9.dex */
public final class a2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f463601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f463602e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(yn1.r2 r2Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463601d = r2Var;
        this.f463602e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.a2(this.f463601d, this.f463602e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yn1.a2 a2Var = (yn1.a2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int b17 = ih.a.b("clicfg_win_version_num", 1661404671);
        int b18 = ih.a.b("clicfg_mac_version_num", 319095048);
        int b19 = ih.a.b("clicfg_linux_version_num", Integer.MAX_VALUE);
        int b27 = ih.a.b("clicfg_xwechat_ohos_version_num_solid", -223080448);
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "[getPcMinVersionAsync] win=" + b17 + ", mac=" + b18 + ", linux=" + b19 + ", ohosPc=" + b27);
        com.tencent.wechat.aff.migration.g gVar = this.f463601d.f463810a;
        if (gVar != null) {
            gVar.j1(this.f463602e, b17, b18, b19, b27);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("callback");
        throw null;
    }
}
