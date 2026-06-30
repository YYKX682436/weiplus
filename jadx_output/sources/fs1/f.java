package fs1;

/* loaded from: classes7.dex */
public final class f implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f266281a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266282b;

    public f(yz5.p pVar, java.lang.String str) {
        this.f266281a = pVar;
        this.f266282b = str;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        this.f266281a.invoke(java.lang.Boolean.TRUE, this.f266282b);
    }
}
