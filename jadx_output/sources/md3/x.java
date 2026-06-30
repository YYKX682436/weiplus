package md3;

/* loaded from: classes7.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ md3.z f325863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325864e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325865f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325866g;

    public x(md3.z zVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f325863d = zVar;
        this.f325864e = str;
        this.f325865f = str2;
        this.f325866g = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        lc3.e eVar = this.f325863d.f317890a;
        ((com.tencent.mm.feature.lite.i) g0Var).Qj(eVar != null ? eVar.B0() : null, this.f325864e, this.f325865f, this.f325866g);
    }
}
