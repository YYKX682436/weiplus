package to;

/* loaded from: classes13.dex */
public class d extends android.media.AudioRecord {
    public d(int i17, int i18, int i19, int i27, int i28) {
        super(i17, i18, i19, i27, i28);
        int hashCode = hashCode();
        to.f.f420894d++;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MMAudioManager", "mm audio record init [%d] mmInitCount[%d] mmReleaseCount[%d]", java.lang.Integer.valueOf(hashCode), java.lang.Integer.valueOf(to.f.f420894d), java.lang.Integer.valueOf(to.f.f420895e));
        java.util.HashMap hashMap = to.f.f420896f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        hashMap.put(valueOf, com.tencent.mm.sdk.platformtools.z3.b(true));
        to.f.a();
    }

    @Override // android.media.AudioRecord
    public void release() {
        super.release();
        int hashCode = hashCode();
        java.util.HashMap hashMap = to.f.f420896f;
        if (hashMap.containsKey(java.lang.Integer.valueOf(hashCode))) {
            to.f.f420895e++;
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MMAudioManager", "mm audio record release [%d] mmInitCount[%d] mmReleaseCount[%d]", java.lang.Integer.valueOf(hashCode), java.lang.Integer.valueOf(to.f.f420894d), java.lang.Integer.valueOf(to.f.f420895e));
            hashMap.remove(java.lang.Integer.valueOf(hashCode));
        }
    }
}
