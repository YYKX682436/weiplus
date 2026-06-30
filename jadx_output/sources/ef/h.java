package ef;

/* loaded from: classes7.dex */
public final class h implements com.tencent.mm.plugin.appbrand.widget.input.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ef.m f252118a;

    public h(ef.m mVar) {
        this.f252118a = mVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p3
    public void a(int i17) {
        ef.m mVar = this.f252118a;
        ef.e eVar = mVar.f252126c;
        if (eVar == null) {
            return;
        }
        int c17 = eVar.c();
        com.tencent.mars.xlog.Log.i("WebViewExtendInputClient", "OnHeightChangedListener, totalHeight: %d, lateSavedKeyboardPanelHeight: %d, currentKeyboardPanelHeight: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(mVar.f252128e), java.lang.Integer.valueOf(c17));
        if (mVar.f252128e != c17) {
            mVar.f252128e = c17;
            mVar.e(null);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p3
    public android.widget.EditText b() {
        android.widget.EditText editText = this.f252118a.f252127d;
        kotlin.jvm.internal.o.d(editText);
        return editText;
    }
}
