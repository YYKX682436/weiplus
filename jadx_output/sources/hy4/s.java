package hy4;

/* loaded from: classes8.dex */
public class s {

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f286193f;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f286194a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMWebView f286195b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f286196c;

    /* renamed from: d, reason: collision with root package name */
    public hy4.r f286197d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.k3 f286198e;

    public s() {
        hy4.n nVar = new hy4.n(this);
        this.f286198e = nVar;
        this.f286194a = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper(), nVar);
    }

    public void a(com.tencent.mm.ui.widget.MMWebView mMWebView, hy4.r rVar) {
        this.f286195b = mMWebView;
        this.f286197d = rVar;
        this.f286194a.sendEmptyMessage(1);
    }

    public void b() {
        s75.d.b(new hy4.p(this, null), "ViewCaptureHelper_DeleteBitmap");
    }
}
