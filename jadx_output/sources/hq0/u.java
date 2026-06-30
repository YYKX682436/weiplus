package hq0;

/* loaded from: classes7.dex */
public final class u implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return mz5.a.b(java.lang.Long.valueOf(((com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer) obj).getActiveTime()), java.lang.Long.valueOf(((com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer) obj2).getActiveTime()));
    }
}
