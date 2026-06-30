package vx5;

/* loaded from: classes13.dex */
public class t implements com.tencent.xweb.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.net.Uri f441389a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f441390b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f441391c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f441392d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f441393e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.xweb.v0 f441394f;

    public t(android.webkit.WebResourceRequest webResourceRequest) {
        this.f441389a = webResourceRequest.getUrl();
        this.f441390b = webResourceRequest.isForMainFrame();
        this.f441391c = webResourceRequest.hasGesture();
        this.f441392d = webResourceRequest.getMethod();
        webResourceRequest.isRedirect();
        this.f441393e = webResourceRequest.getRequestHeaders();
        this.f441394f = new com.tencent.xweb.v0(this);
    }

    @Override // com.tencent.xweb.x0
    public java.lang.String getMethod() {
        return this.f441392d;
    }

    @Override // com.tencent.xweb.x0
    public java.util.Map getRequestHeaders() {
        return this.f441393e;
    }

    @Override // com.tencent.xweb.x0
    public android.net.Uri getUrl() {
        return this.f441389a;
    }

    @Override // com.tencent.xweb.x0
    public boolean hasGesture() {
        return this.f441391c;
    }

    @Override // com.tencent.xweb.x0
    public boolean isForMainFrame() {
        return this.f441390b;
    }
}
