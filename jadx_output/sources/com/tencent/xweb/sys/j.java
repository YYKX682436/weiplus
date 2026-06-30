package com.tencent.xweb.sys;

/* loaded from: classes13.dex */
public class j implements com.tencent.xweb.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.net.Uri f220556a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f220557b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f220558c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f220559d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f220560e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.xweb.v0 f220561f;

    public j(android.webkit.WebResourceRequest webResourceRequest) {
        if (webResourceRequest != null) {
            this.f220556a = webResourceRequest.getUrl();
            this.f220557b = webResourceRequest.isForMainFrame();
            this.f220558c = webResourceRequest.hasGesture();
            this.f220559d = webResourceRequest.getMethod();
            webResourceRequest.isRedirect();
            this.f220560e = webResourceRequest.getRequestHeaders();
            this.f220561f = new com.tencent.xweb.v0(this);
        }
    }

    @Override // com.tencent.xweb.x0
    public java.lang.String getMethod() {
        return this.f220559d;
    }

    @Override // com.tencent.xweb.x0
    public java.util.Map getRequestHeaders() {
        return this.f220560e;
    }

    @Override // com.tencent.xweb.x0
    public android.net.Uri getUrl() {
        return this.f220556a;
    }

    @Override // com.tencent.xweb.x0
    public boolean hasGesture() {
        return this.f220558c;
    }

    @Override // com.tencent.xweb.x0
    public boolean isForMainFrame() {
        return this.f220557b;
    }
}
