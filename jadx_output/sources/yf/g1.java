package yf;

/* loaded from: classes7.dex */
public final class g1 extends tf.j {

    /* renamed from: g, reason: collision with root package name */
    public final yf.e0 f461355g;

    public g1(yf.e0 originVideoContainer) {
        kotlin.jvm.internal.o.g(originVideoContainer, "originVideoContainer");
        this.f461355g = originVideoContainer;
    }

    @Override // pd1.l
    public void d(android.view.View view, java.lang.Runnable runnable) {
        com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl textureImageViewLike = (com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl) view;
        kotlin.jvm.internal.o.g(textureImageViewLike, "textureImageViewLike");
        java.lang.String str = this.f418826a;
        com.tencent.mars.xlog.Log.i(str, "transferFrom, textureView: " + textureImageViewLike);
        this.f418829d = false;
        yf.e0 e0Var = this.f461355g;
        android.view.Surface surface = e0Var.f461337a.f461361h;
        if (surface == null || !surface.isValid()) {
            com.tencent.mars.xlog.Log.w(str, "transferFrom, originSurface is invalid");
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        try {
            if (e0Var.o(surface)) {
                yf.i0 i0Var = e0Var.f461337a;
                e0Var.p(i0Var.f461367q, i0Var.f461368r);
            }
            if (runnable != null) {
                runnable.run();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // pd1.l
    public android.view.View e(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl(context, null);
    }

    @Override // tf.j
    public tf.i g(android.view.View view, java.lang.Runnable runnable) {
        com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl textureImageViewLike = (com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl) view;
        kotlin.jvm.internal.o.g(textureImageViewLike, "textureImageViewLike");
        return new yf.f1(this, textureImageViewLike, runnable);
    }
}
