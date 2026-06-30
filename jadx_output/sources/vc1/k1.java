package vc1;

/* loaded from: classes13.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vc1.n1 f434999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vc1.q2 f435000e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mapsdk.raster.model.MarkerOptions f435001f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vc1.l1 f435002g;

    public k1(vc1.l1 l1Var, vc1.n1 n1Var, vc1.q2 q2Var, com.tencent.mapsdk.raster.model.MarkerOptions markerOptions) {
        this.f435002g = l1Var;
        this.f434999d = n1Var;
        this.f435000e = q2Var;
        this.f435001f = markerOptions;
    }

    @Override // java.lang.Runnable
    public void run() {
        vc1.o2 o2Var;
        vc1.l1 l1Var = this.f435002g;
        vc1.n1 n1Var = this.f434999d;
        com.tencent.mapsdk.raster.model.Marker marker = l1Var.getMarker((vc1.l1) n1Var);
        vc1.o1 o1Var = (vc1.o1) ((java.util.concurrent.ConcurrentHashMap) l1Var.f435005z.Y).get(n1Var.f435021a);
        if (o1Var != null && o1Var.f435030c == null && marker != null) {
            o1Var.f435030c = marker;
        }
        int i17 = n1Var.f435023c;
        vc1.q2 q2Var = this.f435000e;
        if (i17 == 0 && o1Var != null) {
            l1Var.f435005z.o(n1Var.f435021a, q2Var, o1Var);
            if (q2Var != null && (o2Var = q2Var.f435148s) != null && o2Var.f435047n == 1) {
                l1Var.f435005z.d0(marker);
            }
        }
        if (marker != null && q2Var != null) {
            if (android.text.TextUtils.isEmpty(q2Var.f435146q) || !q2Var.f435146q.equals("withLabel")) {
                marker.setCollisions(com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem.NONE);
            } else {
                marker.setCollisions(com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem.POI);
            }
        }
        vc1.p1.h(l1Var.f435005z, n1Var.f435021a, this.f435001f, q2Var, marker);
    }
}
