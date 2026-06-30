package za3;

/* loaded from: classes13.dex */
public class j implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.NewMyLocationButton f470966d;

    public j(com.tencent.mm.plugin.location.ui.NewMyLocationButton newMyLocationButton) {
        this.f470966d = newMyLocationButton;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        if (!z17) {
            return false;
        }
        com.tencent.mm.plugin.location.ui.NewMyLocationButton newMyLocationButton = this.f470966d;
        newMyLocationButton.f144621f.setVisibility(8);
        newMyLocationButton.f144620e.setVisibility(0);
        ab3.h hVar = newMyLocationButton.f144622g;
        if (hVar != null && newMyLocationButton.f144623h) {
            hVar.getIController().setCenter(f18, f17);
            if (newMyLocationButton.f144622g.getZoomLevel() < 15) {
                newMyLocationButton.f144622g.getIController().setZoom(15);
            }
        }
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new za3.i(this));
        return false;
    }
}
