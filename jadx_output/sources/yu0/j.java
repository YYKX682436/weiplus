package yu0;

/* loaded from: classes5.dex */
public final class j extends oz5.a implements kotlinx.coroutines.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yu0.m f465800d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kotlinx.coroutines.q0 q0Var, yu0.m mVar) {
        super(q0Var);
        this.f465800d = mVar;
    }

    @Override // kotlinx.coroutines.r0
    public void handleException(oz5.l lVar, java.lang.Throwable th6) {
        this.f465800d.b();
        com.tencent.mars.xlog.Log.e("MJAudioTaskManager", "Error occurred: " + th6.getMessage(), th6);
    }
}
