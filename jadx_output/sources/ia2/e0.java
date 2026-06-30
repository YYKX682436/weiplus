package ia2;

/* loaded from: classes15.dex */
public abstract class e0 {
    public static final boolean a(com.tencent.mm.plugin.location.model.LocationInfo locationInfo) {
        kotlin.jvm.internal.o.g(locationInfo, "<this>");
        java.lang.String poiid = locationInfo.f144594p;
        if (poiid == null) {
            return false;
        }
        kotlin.jvm.internal.o.f(poiid, "poiid");
        return r26.i0.y(poiid, "UgcPoiEx_", false);
    }

    public static com.tencent.mm.plugin.location.model.LocationInfo b(r45.f96 f96Var, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        kotlin.jvm.internal.o.g(f96Var, "<this>");
        com.tencent.mm.plugin.location.model.LocationInfo locationInfo = new com.tencent.mm.plugin.location.model.LocationInfo(z17);
        locationInfo.f144586e = f96Var.getFloat(1);
        locationInfo.f144587f = f96Var.getFloat(0);
        locationInfo.f144598t = f96Var.getString(19);
        locationInfo.f144594p = f96Var.getString(5);
        locationInfo.f144591m = f96Var.getString(3);
        locationInfo.f144589h = f96Var.getString(4);
        locationInfo.f144596r = f96Var.getString(17);
        locationInfo.f144595q = f96Var.getBoolean(16);
        locationInfo.f144590i = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        return locationInfo;
    }
}
