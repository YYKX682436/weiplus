package lf1;

/* loaded from: classes7.dex */
public final class j extends eg.a implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g {

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.SurfaceTexture f318264g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d f318265h;

    /* renamed from: m, reason: collision with root package name */
    public int f318267m;

    /* renamed from: n, reason: collision with root package name */
    public int f318268n;

    /* renamed from: o, reason: collision with root package name */
    public int f318269o;

    /* renamed from: p, reason: collision with root package name */
    public int f318270p;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f318266i = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f318271q = "cover";

    /* renamed from: r, reason: collision with root package name */
    public final fg1.r0 f318272r = new fg1.r0();

    @Override // eg.b
    public boolean b(sf.f invokeContext) {
        kotlin.jvm.internal.o.g(invokeContext, "invokeContext");
        return true;
    }

    @Override // eg.a, eg.b
    public void e() {
        this.f318264g = null;
        t();
        ((java.util.ArrayList) this.f318266i).clear();
    }

    @Override // eg.b
    public java.lang.String f(sf.f invokeContext) {
        com.tencent.mm.plugin.appbrand.extendplugin.b bVar;
        com.tencent.mm.plugin.appbrand.jsapi.l m17;
        kotlin.jvm.internal.o.g(invokeContext, "invokeContext");
        if (!(invokeContext instanceof com.tencent.mm.plugin.appbrand.extendplugin.b) || (m17 = (bVar = (com.tencent.mm.plugin.appbrand.extendplugin.b) invokeContext).m()) == null) {
            return null;
        }
        java.lang.String q17 = q();
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = bVar.f78021c;
        java.lang.String k17 = k0Var.k();
        org.json.JSONObject jSONObject = bVar.f78020b;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.VoipRoomPluginHandler", "*** handler(%s) handleJsApi(%s), data:%s", q17, k17, jSONObject.toString());
        m17.m(new lf1.e(this, invokeContext, new lf1.f(k0Var, this, m17, invokeContext, jSONObject)));
        return null;
    }

    @Override // eg.b
    public void p(android.graphics.SurfaceTexture surfaceTexture) {
        this.f318264g = surfaceTexture;
        if (surfaceTexture != null) {
            java.util.List list = this.f318266i;
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                f((sf.f) it.next());
            }
            ((java.util.ArrayList) list).clear();
        }
    }

    public final void r(org.json.JSONObject jSONObject, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.h hVar) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("position");
        if (optJSONObject != null) {
            int c17 = ik1.w.c(optJSONObject.optInt("width", 0));
            int c18 = ik1.w.c(optJSONObject.optInt("height", 0));
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.VoipRoomPluginHandler", "adjustSurfaceSize, size:[%d, %d]", java.lang.Integer.valueOf(c17), java.lang.Integer.valueOf(c18));
            if (c17 <= 0 || c18 <= 0) {
                return;
            }
            this.f318267m = c17;
            this.f318268n = c18;
            android.graphics.SurfaceTexture surfaceTexture = this.f318264g;
            if (surfaceTexture != null) {
                surfaceTexture.setDefaultBufferSize(c17, c18);
            }
            if (hVar != null) {
                com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b3 b3Var = (com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b3) hVar;
                b3Var.f95843n = c17;
                b3Var.f95844o = c18;
                b3Var.f95854y = new android.util.Size(c17, c18);
            }
            if (hVar != null) {
                int optInt = optJSONObject.optInt("width", 0);
                int optInt2 = optJSONObject.optInt("height", 0);
                com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b3 b3Var2 = (com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b3) hVar;
                b3Var2.f95845p = optInt;
                b3Var2.f95846q = optInt2;
            }
        }
    }

    public final void s() {
        fg1.r0 r0Var = this.f318272r;
        if (r0Var.a(this.f318271q, this.f318267m, this.f318268n, this.f318269o, this.f318270p)) {
            sf.i.c(this.f252499f, this.f252498e, this.f252497d, r0Var.f261888h, r0Var.f261889i);
        }
    }

    public final void t() {
        if (this.f318265h != null) {
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE.f96019h.a(this.f318265h);
            this.f318265h = null;
        }
    }
}
