package gf;

/* loaded from: classes7.dex */
public abstract class w implements com.tencent.mm.plugin.appbrand.page.dd {

    /* renamed from: d, reason: collision with root package name */
    public xi1.m f271181d;

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void E(int i17, long j17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.dd
    public void J(java.lang.Runnable runnable) {
        kotlin.jvm.internal.o.g(runnable, "runnable");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void M(java.net.URL url, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, android.webkit.ValueCallback valueCallback) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void R(java.net.URL url, java.lang.String str, android.webkit.ValueCallback valueCallback) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.dd
    public void X(java.lang.String script, android.webkit.ValueCallback valueCallback) {
        kotlin.jvm.internal.o.g(script, "script");
    }

    @Override // com.tencent.mm.plugin.appbrand.page.dd
    public boolean Y() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void addJavascriptInterface(java.lang.Object obj, java.lang.String str) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public boolean b0() {
        return false;
    }

    @Override // pq5.a
    public boolean c0(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.c0
    public void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback valueCallback) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void g0(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public int getContentHeight() {
        return getHeight();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public xi1.m getFullscreenImpl() {
        return this.f271181d;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public java.lang.String getUserAgentString() {
        return "";
    }

    @Override // com.tencent.mm.plugin.appbrand.page.dd
    public boolean i0() {
        return false;
    }

    @Override // se.a
    public boolean m() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void n(java.lang.String str, com.tencent.mm.plugin.appbrand.page.db dbVar) {
        if (dbVar != null) {
            ((com.tencent.mm.plugin.appbrand.jsapi.media.l6) dbVar).a(str, null);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void o0() {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public boolean p0() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.dd
    public boolean q() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setAppBrandInfo(java.util.Map map) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setFullscreenImpl(xi1.m mVar) {
        this.f271181d = mVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void setJsExceptionHandler(com.tencent.mm.plugin.appbrand.jsruntime.s sVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setOnScrollChangedListener(com.tencent.mm.plugin.appbrand.page.ma maVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setOnTrimListener(com.tencent.mm.plugin.appbrand.page.ka kaVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setVerticalScrollBarEnabled(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setWebViewLayoutListener(com.tencent.mm.plugin.appbrand.page.ja jaVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setXWebKeyboardImpl(com.tencent.mm.plugin.appbrand.page.oa oaVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.dd
    public void x() {
    }
}
