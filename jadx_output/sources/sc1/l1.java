package sc1;

/* loaded from: classes10.dex */
public class l1 extends com.tencent.live2.V2TXLivePremier.V2TXLivePremierObserver {
    @Override // com.tencent.live2.V2TXLivePremier.V2TXLivePremierObserver
    public void onLog(int i17, java.lang.String str) {
        if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Live", str);
            return;
        }
        if (i17 == 3) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.Live", str);
        } else if (i17 == 4) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Live", str);
        } else {
            if (i17 != 5) {
                return;
            }
            com.tencent.mars.xlog.Log.f("MicroMsg.AppBrand.Live", str);
        }
    }
}
