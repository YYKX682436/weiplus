package eu1;

/* loaded from: classes2.dex */
public class e implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardDataMgr", "begin to delelteAllIllegalStatusCard()");
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardInfoStorage", "delelteAllIllegalStatusCard updateRet is " + (xt1.t0.nj().f266845d.A("ShareCardInfo", "delete from ShareCardInfo where (status=1 OR status=2 OR status=3 OR status=4 OR status=6)") ? 1 : 0));
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardDataMgr", "end to delelteAllIllegalStatusCard()");
    }
}
