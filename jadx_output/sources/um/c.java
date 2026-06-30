package um;

/* loaded from: classes10.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f428671a = new java.util.HashMap();

    public c(com.tencent.mm.cache.ArtistCacheManager artistCacheManager) {
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ArtistCacheManager", "clearAll: ");
        java.util.Iterator it = this.f428671a.entrySet().iterator();
        while (it.hasNext()) {
            ((um.m) ((java.util.Map.Entry) it.next()).getValue()).onDestroy();
        }
    }

    public um.m b(dl.a aVar) {
        java.util.HashMap hashMap = this.f428671a;
        if (!hashMap.containsKey(aVar)) {
            int ordinal = aVar.ordinal();
            um.m tVar = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 6 ? ordinal != 7 ? null : new um.t() : new um.l() : new um.d() : new um.g() : new um.s() : new um.e();
            if (tVar != null) {
                tVar.onCreate();
            }
            if (tVar != null && !hashMap.containsKey(aVar)) {
                hashMap.put(aVar, tVar);
            }
        }
        return (um.m) hashMap.get(aVar);
    }
}
