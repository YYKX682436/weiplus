package dv4;

/* loaded from: classes.dex */
public class d implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dv4.f f244002d;

    public d(dv4.f fVar) {
        this.f244002d = fVar;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        com.tencent.mars.xlog.Log.i("FTSMatchContact", "syncMatchResultListener.onFTSSearchEnd " + vVar);
        dv4.a aVar = (dv4.a) vVar.f351157b.f351070m;
        if (aVar == null) {
            return;
        }
        java.util.concurrent.CountDownLatch countDownLatch = (java.util.concurrent.CountDownLatch) ((java.util.concurrent.ConcurrentHashMap) this.f244002d.f244004a).remove(aVar);
        int i17 = vVar.f351158c;
        if (i17 == -3 || i17 == -2 || i17 == -1) {
            aVar.a(java.util.Collections.emptyList());
        } else if (i17 == 0) {
            java.util.List list = vVar.f351160e;
            if (list == null || list.size() == 0) {
                com.tencent.mars.xlog.Log.i("FTSMatchContact", "local contact search size 0");
                aVar.a(java.util.Collections.emptyList());
                if (countDownLatch == null) {
                    com.tencent.mars.xlog.Log.w("FTSMatchContact", "syncMatchResultListener try to countDown in FTS_OK when latch is null");
                    return;
                }
                com.tencent.mars.xlog.Log.i("FTSMatchContact", "syncMatchResultListener FTS_OK countdown latch " + countDownLatch);
                countDownLatch.countDown();
                return;
            }
            aVar.a(vVar.f351160e);
        }
        if (countDownLatch == null) {
            com.tencent.mars.xlog.Log.w("FTSMatchContact", "syncMatchResultListener try to countDown in finally when latch is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("FTSMatchContact", "syncMatchResultListener finally countdown latch " + countDownLatch);
        countDownLatch.countDown();
    }
}
