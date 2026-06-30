package cx4;

/* loaded from: classes5.dex */
public final class f implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cx4.m f224592a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224593b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f224594c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f224595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224596e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f224597f;

    public f(cx4.m mVar, java.lang.String str, int i17, int i18, java.lang.String str2, int i19) {
        this.f224592a = mVar;
        this.f224593b = str;
        this.f224594c = i17;
        this.f224595d = i18;
        this.f224596e = str2;
        this.f224597f = i19;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        ((ku5.t0) ku5.t0.f312615d).h(new cx4.e(this.f224592a, this.f224593b, this.f224594c, this.f224595d, this.f224596e, str, this.f224597f), "WebViewKeyWordAuditReport");
    }
}
