package zh1;

/* loaded from: classes8.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.OpenMaterialWebView f472888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472889e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f472890f;

    public i(com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.OpenMaterialWebView openMaterialWebView, java.lang.String str, byte[] bArr) {
        this.f472888d = openMaterialWebView;
        this.f472889e = str;
        this.f472890f = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f472888d.loadDataWithBaseURL(this.f472889e, new java.lang.String(this.f472890f, r26.c.f368865a), "text/html", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding, null);
    }
}
