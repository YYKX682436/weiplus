package ox4;

/* loaded from: classes8.dex */
public final class a implements zg0.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ox4.b f349788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zg0.v2 f349789b;

    public a(ox4.b bVar, zg0.v2 v2Var) {
        this.f349788a = bVar;
        this.f349789b = v2Var;
    }

    public void a(int i17, int i18) {
        boolean z17;
        int i19 = this.f349788a.f349790a;
        if (i19 != i17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewExtEventHandler", "checkWebViewIdValid failed %s, %s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17));
            z17 = false;
        } else {
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewExtEventHandler", "onImageViewPositionChanged dispatchEvent webViewId: " + i17 + ", pos: " + i18);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(ya.b.INDEX, java.lang.Integer.valueOf(i18));
            ((nw4.n) this.f349789b).o("onImagePreviewChanged", hashMap);
        }
    }
}
