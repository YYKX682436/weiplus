package or2;

/* loaded from: classes10.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f347662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347663e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i17, java.lang.String str) {
        super(0);
        this.f347662d = i17;
        this.f347663e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.mmdata.rpt.FinderFPSMonitorStruct finderFPSMonitorStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderFPSMonitorStruct();
        finderFPSMonitorStruct.f56753d = this.f347662d;
        java.lang.String str = this.f347663e;
        finderFPSMonitorStruct.f56754e = java.lang.Long.parseLong(str);
        finderFPSMonitorStruct.f56755f = finderFPSMonitorStruct.b("commentSceneString", str, true);
        finderFPSMonitorStruct.l();
        com.tencent.mars.xlog.Log.i("Finder.FinderFpsReporter", "[fpsReporter] " + finderFPSMonitorStruct.n());
        return jz5.f0.f302826a;
    }
}
