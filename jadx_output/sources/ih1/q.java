package ih1;

/* loaded from: classes7.dex */
public final class q extends oz5.a implements kotlinx.coroutines.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ih1.u f291520d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(kotlinx.coroutines.q0 q0Var, ih1.u uVar) {
        super(q0Var);
        this.f291520d = uVar;
    }

    @Override // kotlinx.coroutines.r0
    public void handleException(oz5.l lVar, java.lang.Throwable th6) {
        com.tencent.mars.xlog.Log.e("MagicAdMiniProgramInstaller", "appId[" + this.f291520d.f291530a + "], heartbeat uncaught", th6);
    }
}
