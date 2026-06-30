package ko0;

/* loaded from: classes.dex */
public final class s extends com.tencent.live2.V2TXLivePremier.V2TXLivePremierObserver {
    @Override // com.tencent.live2.V2TXLivePremier.V2TXLivePremierObserver
    public void onLog(int i17, java.lang.String str) {
        if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreSdk", "[LiteAV][" + i17 + ']' + str);
            return;
        }
        if (i17 == 3) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiveCoreSdk", "[LiteAV][" + i17 + ']' + str);
            return;
        }
        if (i17 == 4 || i17 == 5 || i17 == 6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiveCoreSdk", "[LiteAV][" + i17 + ']' + str);
        }
    }
}
