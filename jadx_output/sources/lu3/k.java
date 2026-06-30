package lu3;

/* loaded from: classes.dex */
public final class k implements ei3.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f321413d;

    public k(kotlin.coroutines.Continuation continuation) {
        this.f321413d = continuation;
    }

    @Override // ei3.k
    public final void j(int i17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.CameraKitRecorder", "stopRecord >> errorCallback: " + i17);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f321413d.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(-2, null)));
    }
}
