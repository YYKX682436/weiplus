package dh2;

/* loaded from: classes10.dex */
public final class r implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dh2.x f232459d;

    public r(dh2.x xVar) {
        this.f232459d = xVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i("KTVSongPlayManager", "voiceEarMonitorSwitch: " + booleanValue);
        dh2.x xVar = this.f232459d;
        xVar.f232469f.getAudioEffectManager().enableVoiceEarMonitor(booleanValue);
        xVar.n(((java.lang.Number) ((kotlinx.coroutines.flow.h3) ((om2.e) xVar.f232468e.a(om2.e.class)).f346291g).getValue()).intValue());
        return jz5.f0.f302826a;
    }
}
