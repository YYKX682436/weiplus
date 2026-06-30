package tr0;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public wo.h f421280a;

    /* renamed from: b, reason: collision with root package name */
    public android.hardware.Camera.Parameters f421281b;

    /* renamed from: c, reason: collision with root package name */
    public int f421282c;

    /* renamed from: d, reason: collision with root package name */
    public int f421283d;

    /* renamed from: e, reason: collision with root package name */
    public int f421284e;

    /* renamed from: f, reason: collision with root package name */
    public int f421285f;

    /* renamed from: g, reason: collision with root package name */
    public android.util.Range f421286g;

    /* renamed from: h, reason: collision with root package name */
    public int f421287h;

    public final void a(int i17) {
        android.hardware.Camera.Parameters parameters = this.f421281b;
        if (parameters != null) {
            parameters.setExposureCompensation(i17);
        }
        try {
            wo.h hVar = this.f421280a;
            wo.d1 d1Var = hVar != null ? hVar.f447713a : null;
            if (d1Var != null) {
                d1Var.f(this.f421281b);
            }
            com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct a17 = as0.a.f13425a.a(this.f421287h);
            if (a17 != null) {
                a17.Z = 1;
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Camera1ExpoHelper", "enLargeExpo is error " + i17);
            com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct a18 = as0.a.f13425a.a(this.f421287h);
            if (a18 != null) {
                a18.Z = 2;
            }
        }
    }
}
