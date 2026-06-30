package uw4;

/* loaded from: classes8.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f431732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw4.n f431733e;

    public h(uw4.n nVar, java.lang.String str) {
        this.f431733e = nVar;
        this.f431732d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        super/*com.tencent.mm.ui.widget.MMWebView*/.loadUrl(this.f431732d);
    }
}
