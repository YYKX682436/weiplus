package qp1;

/* loaded from: classes14.dex */
public class y implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        long j17 = ((com.tencent.mm.plugin.ball.model.BallInfo) obj).C;
        long j18 = ((com.tencent.mm.plugin.ball.model.BallInfo) obj2).C;
        if (j17 > j18) {
            return -1;
        }
        return j17 < j18 ? 1 : 0;
    }
}
