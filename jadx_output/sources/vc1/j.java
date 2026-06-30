package vc1;

/* loaded from: classes13.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tencentmap.mapsdk.map.TencentMap f434986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f434987e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f434988f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f434989g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f434990h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f434991i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f434992m;

    public j(vc1.p1 p1Var, com.tencent.tencentmap.mapsdk.map.TencentMap tencentMap, float f17, float f18, float f19, double d17, double d18) {
        this.f434992m = p1Var;
        this.f434986d = tencentMap;
        this.f434987e = f17;
        this.f434988f = f18;
        this.f434989g = f19;
        this.f434990h = d17;
        this.f434991i = d18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.tencentmap.mapsdk.map.CameraUpdate I = this.f434992m.I(this.f434986d, this.f434987e, this.f434988f, this.f434989g, this.f434990h, this.f434991i);
        vc1.p1 p1Var = this.f434992m;
        p1Var.f435059J = false;
        this.f434986d.animateCamera(I, vc1.p1.F0, p1Var.T);
    }
}
