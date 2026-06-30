package s65;

/* loaded from: classes12.dex */
public class d1 implements s65.w {
    public d1(s65.b1 b1Var) {
        pv1.c cVar;
        com.tencent.mm.xwebutil.y0.c();
        synchronized (pv1.c.class) {
            if (pv1.c.f358569c == null) {
                pv1.c.f358569c = new pv1.c();
            }
            hv1.d.f();
            cVar = pv1.c.f358569c;
        }
        by5.c4.f("WXFileDownloaderBridge", "setFileDownloaderProxy:" + cVar);
        rx5.c.f401350b = cVar;
    }

    @Override // s65.w
    public boolean d() {
        boolean l17 = com.tencent.xweb.a3.l();
        com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.WCWebDownloadMgr", "isBusy = " + l17);
        return l17;
    }

    @Override // s65.w
    public boolean e(android.content.Intent intent) {
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra("intent_extra_download_type", 4);
        com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.WCWebDownloadMgr", "handleCommand, downloadType:%d [4:timer/5:notify/6:config/7:auto]", java.lang.Integer.valueOf(intExtra));
        java.util.HashMap hashMap = new java.util.HashMap();
        if (intExtra == 5) {
            hashMap.put("UpdaterCheckType", "1");
        } else if (intExtra == 6) {
            hashMap.put("UpdaterCheckType", "5");
        } else if (intExtra == 7) {
            hashMap.put("UpdaterCheckType", "7");
        } else {
            hashMap.put("UpdaterCheckType", "0");
        }
        com.tencent.xweb.a3.A(com.tencent.mm.sdk.platformtools.x2.f193071a, hashMap);
        return true;
    }

    @Override // s65.w
    public void g(boolean z17) {
    }

    @Override // s65.w
    public void onDestroy() {
    }
}
