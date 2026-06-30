package za3;

/* loaded from: classes13.dex */
public class f implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.MyLocationButton f470909d;

    public f(com.tencent.mm.plugin.location.ui.MyLocationButton myLocationButton) {
        this.f470909d = myLocationButton;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        if (!z17) {
            return false;
        }
        com.tencent.mm.plugin.location.ui.MyLocationButton myLocationButton = this.f470909d;
        myLocationButton.f144610f.setVisibility(8);
        myLocationButton.f144609e.setVisibility(0);
        ab3.h hVar = myLocationButton.f144611g;
        if (hVar != null && myLocationButton.f144612h) {
            hVar.getIController().setCenter(f18, f17);
            if (myLocationButton.f144611g.getZoomLevel() < 15) {
                myLocationButton.f144611g.getIController().setZoom(15);
            }
        }
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new za3.e(this));
        return false;
    }
}
