package me1;

/* loaded from: classes7.dex */
public final class h implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f325913a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f325914b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ me1.i f325915c;

    public h(com.tencent.mm.plugin.appbrand.y yVar, int i17, me1.i iVar) {
        this.f325913a = yVar;
        this.f325914b = i17;
        this.f325915c = iVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        this.f325913a.a(this.f325914b, this.f325915c.r(null, ((com.tencent.mm.plugin.appbrand.jsapi.ui.launcher.API_openWeAppSearch$OpenSearchResponse) appBrandProxyUIProcessTask$ProcessResult).f83505d ? jc1.f.f298912a : jc1.f.f298915d, null));
    }
}
