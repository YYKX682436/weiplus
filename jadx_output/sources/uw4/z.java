package uw4;

/* loaded from: classes8.dex */
public class z implements android.webkit.WebResourceRequest {

    /* renamed from: a, reason: collision with root package name */
    public final android.net.Uri f431759a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f431760b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f431761c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f431762d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f431763e;

    public z(android.net.Uri uri, boolean z17, boolean z18, boolean z19, java.lang.String str, java.util.Map map) {
        this.f431759a = uri;
        this.f431760b = z17;
        this.f431761c = z19;
        this.f431762d = str;
        this.f431763e = map;
    }

    @Override // android.webkit.WebResourceRequest
    public java.lang.String getMethod() {
        return this.f431762d;
    }

    @Override // android.webkit.WebResourceRequest
    public java.util.Map getRequestHeaders() {
        return this.f431763e;
    }

    @Override // android.webkit.WebResourceRequest
    public android.net.Uri getUrl() {
        return this.f431759a;
    }

    @Override // android.webkit.WebResourceRequest
    public boolean hasGesture() {
        return this.f431761c;
    }

    @Override // android.webkit.WebResourceRequest
    public boolean isForMainFrame() {
        return this.f431760b;
    }

    @Override // android.webkit.WebResourceRequest
    public boolean isRedirect() {
        return false;
    }
}
