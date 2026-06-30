package g85;

/* loaded from: classes16.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f269555a;

    static {
        h85.d dVar = new h85.d();
        h85.e eVar = new h85.e();
        h85.f fVar = new h85.f();
        h85.g gVar = new h85.g();
        h85.h hVar = new h85.h();
        h85.n nVar = new h85.n();
        h85.o oVar = new h85.o();
        h85.m mVar = new h85.m();
        h85.l lVar = new h85.l();
        h85.q qVar = new h85.q();
        h85.a aVar = new h85.a();
        h85.p pVar = new h85.p();
        h85.k kVar = new h85.k();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("getConnectionInfo", dVar);
        hashMap.put("getInstalledPackages", hVar);
        hashMap.put("getDeviceId", eVar);
        hashMap.put("getSubscriberId", nVar);
        hashMap.put("getDeviceIdWithFeature", fVar);
        hashMap.put("getImeiForSlot", gVar);
        hashMap.put("getSubscriberIdForSubscriber", oVar);
        hashMap.put("getSerialForPackage", mVar);
        hashMap.put("getSerial", lVar);
        hashMap.put("queryIntentActivities", qVar);
        hashMap.put("addPrimaryClipChangedListener", aVar);
        hashMap.put("listenForSubscriber", pVar);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            hashMap.put("getScanResults", kVar);
        }
        f269555a = hashMap;
    }
}
