package za3;

/* loaded from: classes13.dex */
public class g implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.MyPoiPoint f470911d;

    public g(com.tencent.mm.plugin.location.ui.MyPoiPoint myPoiPoint) {
        this.f470911d = myPoiPoint;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        if (!z17) {
            return false;
        }
        com.tencent.mm.plugin.location.ui.MyPoiPoint myPoiPoint = this.f470911d;
        ab3.h hVar = myPoiPoint.f144614d;
        if (hVar != null) {
            com.tencent.mapsdk.raster.model.Circle circle = myPoiPoint.f144617g;
            if (circle != null) {
                circle.setCenter(new com.tencent.mapsdk.raster.model.LatLng(f18, f17));
                myPoiPoint.f144617g.setRadius(d18);
            } else {
                myPoiPoint.f144617g = hVar.drawAccuracyCircle(f18, f17, d18);
            }
            com.tencent.mm.plugin.location.ui.MyPoiPoint myPoiPoint2 = this.f470911d;
            if (myPoiPoint2.f144616f) {
                myPoiPoint2.f144614d.updateLocaitonPinLayout(myPoiPoint2, f18, f17);
            } else {
                myPoiPoint2.f144616f = true;
                myPoiPoint2.f144614d.addPinView(myPoiPoint2, f18, f17);
            }
        }
        return true;
    }
}
