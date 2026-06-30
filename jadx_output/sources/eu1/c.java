package eu1;

/* loaded from: classes15.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f256747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eu1.d f256748e;

    public c(eu1.d dVar, java.util.ArrayList arrayList) {
        this.f256748e = dVar;
        this.f256747d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map = (java.util.Map) xt1.t0.Di().a("key_share_user_info_map");
        if (map == null) {
            map = new java.util.HashMap();
        }
        map.put(this.f256748e.f256749d, this.f256747d);
        xt1.t0.Di().b("key_share_user_info_map", map);
    }
}
