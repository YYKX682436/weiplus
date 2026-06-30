package dh2;

/* loaded from: classes10.dex */
public final class f implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dh2.x f232441d;

    public f(dh2.x xVar) {
        this.f232441d = xVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mars.xlog.Log.i("KTVSongPlayManager", "observeAccompanyVolumeChange: " + intValue);
        this.f232441d.o(new java.lang.Integer(intValue), new java.lang.Integer(intValue), dh2.c0.f232433d);
        return jz5.f0.f302826a;
    }
}
