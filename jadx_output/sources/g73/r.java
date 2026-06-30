package g73;

/* loaded from: classes15.dex */
public final class r implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return mz5.a.b(java.lang.Long.valueOf(-((com.tencent.mm.plugin.handoff.model.HandOff) obj).getCreateTime()), java.lang.Long.valueOf(-((com.tencent.mm.plugin.handoff.model.HandOff) obj2).getCreateTime()));
    }
}
