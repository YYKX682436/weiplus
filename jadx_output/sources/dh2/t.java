package dh2;

/* loaded from: classes10.dex */
public final class t implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dh2.x f232462d;

    public t(dh2.x xVar) {
        this.f232462d = xVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mars.xlog.Log.i("KTVSongPlayManager", "observeVoiceVolumeChange: " + intValue);
        dh2.x xVar = this.f232462d;
        xVar.m(intValue);
        xVar.n(intValue);
        return jz5.f0.f302826a;
    }
}
