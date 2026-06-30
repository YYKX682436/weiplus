package uw4;

/* loaded from: classes8.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f431734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f431735e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uw4.n f431736f;

    public i(uw4.n nVar, java.lang.String str, java.util.Map map) {
        this.f431736f = nVar;
        this.f431734d = str;
        this.f431735e = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        super/*com.tencent.xweb.WebView*/.loadUrl(this.f431734d, this.f431735e);
    }
}
