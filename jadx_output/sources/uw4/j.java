package uw4;

/* loaded from: classes8.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f431737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f431738e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f431739f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ uw4.n f431740g;

    public j(uw4.n nVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f431740g = nVar;
        this.f431737d = str;
        this.f431738e = str2;
        this.f431739f = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        super/*com.tencent.xweb.WebView*/.loadData(this.f431737d, this.f431738e, this.f431739f);
    }
}
