package m90;

/* loaded from: classes4.dex */
public class m1 extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f324894e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f324895f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(m90.n1 n1Var, int i17, r35.m3 m3Var, java.lang.ref.WeakReference weakReference, java.lang.String str) {
        super(i17, m3Var);
        this.f324894e = weakReference;
        this.f324895f = str;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        android.content.Context context = (android.content.Context) this.f324894e.get();
        if (context != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", this.f324895f);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }
}
