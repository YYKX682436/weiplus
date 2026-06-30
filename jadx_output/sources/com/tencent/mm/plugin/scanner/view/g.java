package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes13.dex */
public class g extends qt5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f159932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f159933b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.e f159934c;

    public g(com.tencent.mm.plugin.scanner.view.e eVar, java.lang.Integer num, yz5.l lVar) {
        this.f159934c = eVar;
        this.f159932a = num;
        this.f159933b = lVar;
    }

    @Override // qt5.f
    public void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("retryOpenCameraDelay ");
        sb6.append(this.f159932a);
        sb6.append("s: ");
        com.tencent.mm.plugin.scanner.view.ScanCardRectView scanCardRectView = this.f159934c.f159926a;
        int i17 = com.tencent.mm.plugin.scanner.view.ScanCardRectView.A;
        sb6.append(((qt5.c) scanCardRectView.f215302e).f366657b);
        sb6.append(", cameraFacing:");
        sb6.append(((qt5.c) this.f159934c.f159926a.f215302e).f366673r);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCardRectView", sb6.toString());
        this.f159933b.invoke(java.lang.Boolean.valueOf(((qt5.c) this.f159934c.f159926a.f215302e).f366657b));
    }
}
