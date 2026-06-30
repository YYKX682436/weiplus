package to;

/* loaded from: classes13.dex */
public class e extends android.media.AudioTrack {
    public e(int i17, int i18, int i19, int i27, int i28, int i29) {
        super(i17, i18, i19, i27, i28, i29);
        int hashCode = hashCode();
        to.f.f420891a++;
        com.tencent.mars.xlog.Log.e("MicroMsg.MMAudioManager", "mm audio track init [%d] mmInitCount[%d] mmReleaseCount[%d]", java.lang.Integer.valueOf(hashCode), java.lang.Integer.valueOf(to.f.f420891a), java.lang.Integer.valueOf(to.f.f420892b));
        java.util.HashMap hashMap = to.f.f420893c;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        hashMap.put(valueOf, com.tencent.mm.sdk.platformtools.z3.b(true));
        to.f.a();
    }

    @Override // android.media.AudioTrack
    public void release() {
        super.release();
        int hashCode = hashCode();
        to.f.f420892b++;
        com.tencent.mars.xlog.Log.e("MicroMsg.MMAudioManager", "mm audio track release [%d] mmInitCount[%d] mmReleaseCount[%d]", java.lang.Integer.valueOf(hashCode), java.lang.Integer.valueOf(to.f.f420891a), java.lang.Integer.valueOf(to.f.f420892b));
        to.f.f420893c.remove(java.lang.Integer.valueOf(hashCode));
    }
}
