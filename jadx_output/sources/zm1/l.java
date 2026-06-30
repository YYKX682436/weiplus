package zm1;

/* loaded from: classes10.dex */
public final class l extends androidx.activity.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zm1.m f474157a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(zm1.m mVar) {
        super(true);
        this.f474157a = mVar;
    }

    @Override // androidx.activity.g
    public void handleOnBackPressed() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioFloatBallAnimationUICWrapper", "handleOnBackPressed");
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new zm1.k(this.f474157a, null), 3, null);
    }
}
