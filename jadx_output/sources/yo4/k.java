package yo4;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yo4.p f464242d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yo4.p pVar) {
        super(3);
        this.f464242d = pVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo changedInfo = (com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) obj;
        long longValue = ((java.lang.Number) obj2).longValue();
        long longValue2 = ((java.lang.Number) obj3).longValue();
        kotlin.jvm.internal.o.g(changedInfo, "changedInfo");
        yo4.p pVar = this.f464242d;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = pVar.f464287r;
        java.lang.String a17 = audioCacheInfo != null ? audioCacheInfo.a() : null;
        java.lang.String a18 = changedInfo.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onMusicClipChange] changedMusicId=");
        sb6.append(changedInfo.f155711e);
        sb6.append(" currentMusicId=");
        sb6.append(audioCacheInfo != null ? java.lang.Integer.valueOf(audioCacheInfo.f155711e) : null);
        sb6.append(" sameKey=");
        sb6.append(kotlin.jvm.internal.o.b(a17, a18));
        sb6.append(" start=");
        sb6.append(longValue);
        sb6.append(" duration=");
        sb6.append(longValue2);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditAddMusicPlugin", sb6.toString());
        if (a17 == null || !kotlin.jvm.internal.o.b(a17, a18)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EditAddMusicPlugin", "[onMusicClipChange] not currently playing this music, skip trim");
        } else {
            changedInfo.G = java.lang.Long.valueOf(longValue);
            changedInfo.H = java.lang.Long.valueOf(longValue2);
            audioCacheInfo.G = java.lang.Long.valueOf(longValue);
            audioCacheInfo.H = java.lang.Long.valueOf(longValue2);
            long j17 = longValue2 + longValue;
            iu3.i iVar = pVar.f464285p;
            kk4.v vVar = iVar.f295008c;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("setPlayRange [");
            sb7.append(longValue);
            sb7.append(", ");
            sb7.append(j17);
            sb7.append("] playerNonNull=");
            sb7.append(vVar != null);
            sb7.append(" isPlaying=");
            sb7.append(vVar != null ? java.lang.Boolean.valueOf(vVar.s()) : null);
            com.tencent.mars.xlog.Log.i(iVar.f295007b, sb7.toString());
            if (vVar != null) {
                vVar.A(true);
            }
            if (vVar != null) {
                vVar.H(longValue, j17);
            }
            if (vVar != null) {
                vVar.z((int) longValue, true, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
