package iv1;

/* loaded from: classes8.dex */
public class b implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iv1.f f295104d;

    public b(iv1.f fVar) {
        this.f295104d = fVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        fv1.c aVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadClient", "onServiceConnected");
        iv1.f fVar = this.f295104d;
        int i17 = fv1.b.f266970d;
        if (iBinder == null) {
            aVar = null;
        } else {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
            aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof fv1.c)) ? new fv1.a(iBinder) : (fv1.c) queryLocalInterface;
        }
        fVar.f295111e = aVar;
        iv1.f fVar2 = this.f295104d;
        fVar2.getClass();
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadClient", "registerCallback");
            fVar2.f295111e.ca(fVar2.f295117n);
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CDNDownloadClient", "registerCallback: " + e17.getMessage());
        }
        iv1.f fVar3 = this.f295104d;
        fVar3.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadClient", "resumeTaskWhenSvrConnected");
        java.util.HashSet hashSet = (java.util.HashSet) fVar3.f295113g;
        if (hashSet.size() > 0) {
            fVar3.b();
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo cDNTaskInfo = (com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadClient", "resumeTaskWhenSvrConnected, url: %s, resume: %b", cDNTaskInfo.f95499e, java.lang.Boolean.valueOf(cDNTaskInfo.f95508q));
            try {
                if (cDNTaskInfo.f95508q) {
                    fVar3.f295111e.aa(cDNTaskInfo);
                } else {
                    fVar3.f295111e.y2(cDNTaskInfo);
                }
                ((iv1.d) fVar3.f295117n).L2(cDNTaskInfo.f95500f, 1, 0, "");
            } catch (android.os.RemoteException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CDNDownloadClient", "resumeTaskWhenSvrConnected: " + e18);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(710L, 0L, 1L, false);
            }
        }
        try {
            java.lang.Object obj = iv1.f.f295109p;
            synchronized (obj) {
                obj.notifyAll();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadClient", "onServiceDisconnected");
        iv1.f fVar = this.f295104d;
        if (((java.util.HashSet) fVar.f295113g).size() != 0) {
            java.util.Iterator it = ((java.util.HashSet) fVar.f295113g).iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo) it.next()).f95508q = true;
            }
        }
    }
}
