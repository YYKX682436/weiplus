package za3;

/* loaded from: classes15.dex */
public class f1 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ za3.i1 f470910d;

    public f1(za3.i1 i1Var) {
        this.f470910d = i1Var;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        java.lang.Object obj;
        if (!z17) {
            return false;
        }
        double d27 = f18;
        double d28 = f17;
        za3.i1 i1Var = this.f470910d;
        i1Var.getClass();
        java.lang.String.format("latitude = %f, longtitude = %f", java.lang.Double.valueOf(d27), java.lang.Double.valueOf(d28));
        if (i1Var.f470945c == null) {
            i1Var.f470945c = new r45.mw6();
            i1Var.f470945c.f380873e = new r45.wa5();
            java.lang.String r17 = c01.z1.r();
            r45.mw6 mw6Var = i1Var.f470945c;
            mw6Var.f380872d = r17;
            r45.wa5 wa5Var = mw6Var.f380873e;
            wa5Var.f389011d = d27;
            wa5Var.f389012e = d28;
            if (i1Var.f470955m && i1Var.f470947e) {
                i1Var.f();
            }
        }
        r45.mw6 mw6Var2 = i1Var.f470945c;
        r45.wa5 wa5Var2 = mw6Var2.f380873e;
        wa5Var2.f389011d = d27;
        wa5Var2.f389012e = d28;
        java.lang.String str = mw6Var2.f380872d;
        ab3.h hVar = i1Var.f470954l;
        java.lang.Object viewByItag = hVar.getViewByItag(str);
        if (viewByItag != null) {
            viewByItag.hashCode();
            obj = viewByItag;
        } else {
            com.tencent.mm.plugin.location_soso.ViewManager viewManager = (com.tencent.mm.plugin.location_soso.ViewManager) hVar.getViewManager();
            android.content.Context context = i1Var.f470943a;
            com.tencent.mm.plugin.location.ui.impl.TrackPoint trackPoint = new com.tencent.mm.plugin.location.ui.impl.TrackPoint(context, viewManager, com.tencent.mm.R.drawable.cj_);
            i1Var.f470954l.addView(trackPoint, 0.0d, 0.0d, i1Var.f470945c.f380872d);
            com.tencent.mm.plugin.location_soso.ViewManager viewManager2 = trackPoint.f144721p;
            if (viewManager2 != null) {
                viewManager2.addView(trackPoint.f144713e, d27, d28);
                trackPoint.f144721p.addView(trackPoint.f144714f, d27, d28);
            }
            if (i1Var.f470952j) {
                trackPoint.setOnAvatarOnClickListener(null);
                trackPoint.setOnLocationOnClickListener(null);
                trackPoint.a();
            } else {
                trackPoint.setOnAvatarOnClickListener(i1Var.f470963u);
                trackPoint.setOnLocationOnClickListener(i1Var.f470962t);
            }
            trackPoint.setAvatar(i1Var.f470945c.f380872d);
            new com.tencent.mm.plugin.location.ui.impl.TrackPointAnimAvatar(context);
            obj = trackPoint;
        }
        if (obj instanceof com.tencent.mm.plugin.location.ui.impl.TrackPoint) {
            com.tencent.mm.plugin.location.ui.impl.TrackPoint trackPoint2 = (com.tencent.mm.plugin.location.ui.impl.TrackPoint) obj;
            i1Var.f470946d = trackPoint2;
            com.tencent.mm.plugin.location_soso.ViewManager viewManager3 = trackPoint2.f144721p;
            if (viewManager3 != null) {
                viewManager3.updateViewLayout(trackPoint2.f144713e, d27, d28, false);
                trackPoint2.f144721p.updateLocationPinLayout(trackPoint2.f144714f, d27, d28, false);
            }
            if (i1Var.f470949g) {
                i1Var.f470946d.getClass();
            } else {
                i1Var.f470946d.getClass();
            }
        }
        if (!i1Var.f470956n) {
            return true;
        }
        ab3.f iController = hVar.getIController();
        r45.wa5 wa5Var3 = i1Var.f470945c.f380873e;
        iController.setCenter(wa5Var3.f389011d, wa5Var3.f389012e);
        return true;
    }
}
