package kf4;

/* loaded from: classes4.dex */
public final class m implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        long j17 = ((nf4.f) obj2).field_updateTime;
        if (j17 == 0) {
            j17 = r9.field_storyPostTime * 1000;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        long j18 = ((nf4.f) obj).field_updateTime;
        if (j18 == 0) {
            j18 = r8.field_storyPostTime * 1000;
        }
        return mz5.a.b(valueOf, java.lang.Long.valueOf(j18));
    }
}
