package yc1;

/* loaded from: classes15.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f460814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f460815e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yc1.y f460816f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yc1.z f460817g;

    public w(yc1.z zVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, yc1.y yVar) {
        this.f460817g = zVar;
        this.f460814d = lVar;
        this.f460815e = str;
        this.f460816f = yVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        s75.d.b(new yc1.v(this), "stopScanServices");
    }
}
