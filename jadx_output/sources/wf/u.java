package wf;

/* loaded from: classes7.dex */
public class u extends tf.j {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yf1.o f445484g;

    public u(wf.v vVar, yf1.o oVar) {
        this.f445484g = oVar;
    }

    @Override // pd1.l
    public void d(android.view.View view, java.lang.Runnable runnable) {
        java.lang.String str = this.f418826a;
        com.tencent.mars.xlog.Log.i(str, "transferFrom, textureView: " + ((com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl) view));
        this.f418829d = false;
        yf1.o oVar = this.f445484g;
        wf.b bVar = oVar.f461651a;
        wf.b bVar2 = oVar.f461651a;
        android.view.Surface surface = bVar.f445416g;
        if (surface == null || !surface.isValid()) {
            com.tencent.mars.xlog.Log.w(str, "transferFrom, originSurface is invalid");
            if (runnable != null) {
                com.tencent.mars.xlog.Log.i(str, "transferFrom, run afterTransferFromTask when originSurface is invalid");
                runnable.run();
                return;
            }
            return;
        }
        try {
            bVar2.f445417h = surface;
            if (bVar2.N(surface)) {
                oVar.b(bVar2.f445424q, bVar2.f445425r);
            }
            if (runnable != null) {
                bVar2.getClass();
                com.tencent.mars.xlog.Log.i(str, "transferFrom, run afterTransferFromTask when originSurfaceTexture is null");
                runnable.run();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // pd1.l
    public android.view.View e(android.content.Context context) {
        return new com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl(context, null);
    }

    @Override // tf.j
    public tf.i g(android.view.View view, java.lang.Runnable runnable) {
        return new wf.t(this, (com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl) view, runnable);
    }
}
