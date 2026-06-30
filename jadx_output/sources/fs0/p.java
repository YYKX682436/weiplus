package fs0;

/* loaded from: classes4.dex */
public final class p implements fs0.d {
    @Override // fs0.d
    public void a(long j17, java.util.List frames, int i17, int i18, java.util.Map parents, java.util.Map outPts) {
        kotlin.jvm.internal.o.g(frames, "frames");
        kotlin.jvm.internal.o.g(parents, "parents");
        kotlin.jvm.internal.o.g(outPts, "outPts");
        com.tencent.mars.xlog.Log.i("DecodeStrategy", "use passthrough decode strategy");
        java.util.Iterator it = frames.iterator();
        long j18 = -1;
        while (it.hasNext()) {
            long longValue = ((java.lang.Number) it.next()).longValue();
            if (longValue >= j17) {
                parents.put(java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(j18));
                outPts.put(java.lang.Long.valueOf(longValue), kz5.c0.k(java.lang.Long.valueOf(longValue)));
                j18 = longValue;
            }
        }
    }
}
