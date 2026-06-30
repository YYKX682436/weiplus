package vu0;

/* loaded from: classes5.dex */
public final class q implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return mz5.a.b(java.lang.Long.valueOf(((vu0.l) obj).f440115b.getTimeRange().getStartTime().getFlicks()), java.lang.Long.valueOf(((vu0.l) obj2).f440115b.getTimeRange().getStartTime().getFlicks()));
    }
}
