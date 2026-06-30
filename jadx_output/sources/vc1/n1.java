package vc1;

/* loaded from: classes13.dex */
public class n1 implements com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f435021a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mapsdk.raster.model.LatLng f435022b;

    /* renamed from: c, reason: collision with root package name */
    public int f435023c;

    public n1(java.lang.String str, com.tencent.mapsdk.raster.model.LatLng latLng) {
        this.f435021a = str;
        this.f435022b = latLng;
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem
    public com.tencent.mapsdk.raster.model.LatLng getPosition() {
        return this.f435022b;
    }
}
