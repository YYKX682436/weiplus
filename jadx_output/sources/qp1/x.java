package qp1;

/* loaded from: classes14.dex */
public class x implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) obj;
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = (com.tencent.mm.plugin.ball.model.BallInfo) obj2;
        boolean z17 = ballInfo.I;
        if (z17 && !ballInfo2.I) {
            return 1;
        }
        if (z17 || !ballInfo2.I) {
            long j17 = ballInfo.C;
            long j18 = ballInfo2.C;
            if (j17 <= j18) {
                return j17 < j18 ? 1 : 0;
            }
        }
        return -1;
    }
}
