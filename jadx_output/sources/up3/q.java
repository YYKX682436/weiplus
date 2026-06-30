package up3;

/* loaded from: classes3.dex */
public class q implements java.util.concurrent.Callable {
    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        return java.lang.Boolean.valueOf(com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a));
    }
}
