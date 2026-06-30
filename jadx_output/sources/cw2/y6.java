package cw2;

/* loaded from: classes10.dex */
public final class y6 implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return mz5.a.b(java.lang.Long.valueOf(((com.tencent.mars.mm.ConnectRecord) obj).beginTimestampMs), java.lang.Long.valueOf(((com.tencent.mars.mm.ConnectRecord) obj2).beginTimestampMs));
    }
}
