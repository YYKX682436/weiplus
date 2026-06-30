package hv1;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.h f285272e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hv1.d f285273f;

    public c(hv1.d dVar, java.lang.String str, dn.h hVar) {
        this.f285273f = dVar;
        this.f285271d = str;
        this.f285272e = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f285273f.f285277f;
        java.lang.String str = this.f285271d;
        dn.m mVar = (dn.m) concurrentHashMap.get(str);
        if (mVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnDownloadNativeService", " task in jni get info failed mediaid:%s", str);
            return;
        }
        dn.l lVar = mVar.f241796p0;
        if (lVar != null) {
            lVar.x(str, this.f285272e);
        }
    }
}
