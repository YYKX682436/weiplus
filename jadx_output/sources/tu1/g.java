package tu1;

/* loaded from: classes13.dex */
public final class g extends android.media.projection.MediaProjection.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tu1.o f422098a;

    public g(tu1.o oVar) {
        this.f422098a = oVar;
    }

    @Override // android.media.projection.MediaProjection.Callback
    public void onStop() {
        super.onStop();
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenCastManager", "createMediaProjection callback onStop");
        this.f422098a.d();
    }
}
