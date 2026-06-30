package dh2;

/* loaded from: classes10.dex */
public final class p implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dh2.x f232456d;

    public p(dh2.x xVar) {
        this.f232456d = xVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        om2.m mVar = (om2.m) obj;
        com.tencent.mars.xlog.Log.i("KTVSongPlayManager", "voiceEarMonitorSwitch: " + mVar);
        dh2.x xVar = this.f232456d;
        xVar.f232479s.b(mVar);
        xVar.f232480t.b(mVar);
        return jz5.f0.f302826a;
    }
}
