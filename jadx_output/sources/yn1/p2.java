package yn1;

/* loaded from: classes9.dex */
public final class p2 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f463790d;

    public p2(yn1.r2 r2Var) {
        this.f463790d = r2Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "[toggleFlutterPage] refreshQrcodeEvents, forceRestartTask=" + ((java.lang.Boolean) obj).booleanValue());
        com.tencent.wechat.aff.migration.g gVar = this.f463790d.f463810a;
        if (gVar != null) {
            gVar.O();
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("callback");
        throw null;
    }
}
