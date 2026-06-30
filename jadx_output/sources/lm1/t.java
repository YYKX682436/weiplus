package lm1;

/* loaded from: classes7.dex */
public final class t implements bg.a {

    /* renamed from: a, reason: collision with root package name */
    public bg.f f319359a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f319360b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.Surface f319361c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f319362d;

    /* renamed from: e, reason: collision with root package name */
    public android.util.Size f319363e;

    /* renamed from: f, reason: collision with root package name */
    public volatile android.view.Surface f319364f;

    public final void a() {
        ae.r rVar;
        if (this.f319360b) {
            return;
        }
        android.view.Surface surface = this.f319361c;
        java.lang.ref.WeakReference weakReference = this.f319362d;
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = weakReference != null ? (com.tencent.mm.plugin.appbrand.page.n7) weakReference.get() : null;
        android.util.Size size = this.f319363e;
        if (surface == null || n7Var == null || size == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.service.c0 U1 = n7Var.U1();
        com.tencent.magicbrush.MagicBrush w17 = (U1 == null || (rVar = (ae.r) U1.z1(ae.r.class)) == null) ? null : rVar.w();
        if (w17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoCanvasExtTextureProducerMBImpl", "tryRegisterProducerIfNeed, magicBrush is null");
            return;
        }
        com.tencent.magicbrush.ext_texture.MBExternalTexturePlugin mBExternalTexturePlugin = w17.f48582f;
        kotlin.jvm.internal.o.f(mBExternalTexturePlugin, "getExternalTexturePlugin(...)");
        bg.f fVar = this.f319359a;
        if (fVar == null) {
            kotlin.jvm.internal.o.o("videoPluginHandler");
            throw null;
        }
        bh.a.a(mBExternalTexturePlugin, "video", fVar.f252497d, size.getWidth(), size.getHeight(), surface, new lm1.s(this, surface), null, false, 192, null);
        this.f319360b = true;
    }
}
