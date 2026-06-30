package xf1;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454232e;

    public d(java.lang.String str, java.lang.String str2) {
        this.f454231d = str;
        this.f454232e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f454231d;
        java.lang.String str2 = this.f454232e;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLiveFileLoadHelper", "doCallback url:%s, localPath:%s", str, str2);
        java.util.HashMap hashMap = (java.util.HashMap) xf1.f.f454234b;
        java.util.List list = (java.util.List) hashMap.get(str);
        if (list == null || list.size() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLiveFileLoadHelper", "doCallback callbacks nil");
            return;
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            ((xf1.e) list.get(i17)).a(str2);
        }
        hashMap.remove(str);
    }
}
