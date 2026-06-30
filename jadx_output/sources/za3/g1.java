package za3;

/* loaded from: classes15.dex */
public class g1 implements va3.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ za3.i1 f470920a;

    public g1(za3.i1 i1Var) {
        this.f470920a = i1Var;
    }

    @Override // va3.d0
    public void a(double d17) {
        com.tencent.mm.plugin.location.ui.impl.TrackPoint trackPoint = this.f470920a.f470946d;
        if (trackPoint != null) {
            trackPoint.f144715g = d17;
            com.tencent.mm.plugin.location_soso.ViewManager viewManager = trackPoint.f144721p;
            if (viewManager != null) {
                viewManager.updateRotation(trackPoint.f144714f, (float) d17);
            }
        }
    }
}
