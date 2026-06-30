package ox0;

/* loaded from: classes.dex */
public final class u implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return mz5.a.b(java.lang.Float.valueOf(java.lang.Math.abs(((java.lang.Number) obj).floatValue())), java.lang.Float.valueOf(java.lang.Math.abs(((java.lang.Number) obj2).floatValue())));
    }
}
