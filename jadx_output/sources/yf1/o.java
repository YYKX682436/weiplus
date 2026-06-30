package yf1;

/* loaded from: classes7.dex */
public final class o implements pd1.j {

    /* renamed from: a, reason: collision with root package name */
    public final wf.b f461651a;

    /* renamed from: b, reason: collision with root package name */
    public final yf1.n f461652b = new yf1.n(this, null);

    public o(wf.b bVar) {
        this.f461651a = bVar;
    }

    public boolean a() {
        return this.f461651a.V.get();
    }

    public boolean b(int i17, int i18) {
        wf.b bVar = this.f461651a;
        bVar.w();
        if (i17 == 0 || i18 == 0 || bVar.f445418i == null) {
            com.tencent.mars.xlog.Log.w(bVar.w(), "setSurfaceSize, Adapter is null");
            return false;
        }
        if (bVar.V.get()) {
            com.tencent.mars.xlog.Log.i(bVar.w(), "setSurfaceSize, JustPlayAudio");
        } else {
            bVar.f445418i.setSurfaceSize(i17, i18);
        }
        return true;
    }

    @Override // pd1.j
    public void d(com.tencent.mm.plugin.appbrand.page.v5 v5Var, pd1.i iVar) {
        com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime = v5Var.getJsRuntime();
        wf.b bVar = this.f461651a;
        if (jsRuntime == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.XWebLivePlayerOriginVideoContainer", "getVideoPositionAsync, null == jsRuntime");
            iVar.a(bVar.f445426s, bVar.f445427t);
            return;
        }
        java.lang.String str = "document.querySelector('embed[embed-id=\"" + bVar.f252497d + "\"]').getBoundingClientRect().toJSON()";
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.XWebLivePlayerOriginVideoContainer", "getVideoPositionAsync, jsScript: " + str);
        jsRuntime.evaluateJavascript(str, new yf1.l(this, iVar));
    }

    @Override // pd1.j
    public int i() {
        return this.f461651a.f445424q;
    }

    @Override // pd1.j
    public boolean isPlaying() {
        wf.a aVar = this.f461651a.f445418i;
        if (aVar == null) {
            return false;
        }
        return aVar.isPlaying();
    }

    @Override // pd1.j
    public int k() {
        return this.f461651a.f445425r;
    }

    @Override // pd1.j
    public android.graphics.Point m() {
        wf.b bVar = this.f461651a;
        return new android.graphics.Point(bVar.f445426s, bVar.f445427t);
    }

    @Override // pd1.j
    public pd1.o n() {
        return this.f461652b;
    }
}
