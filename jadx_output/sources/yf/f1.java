package yf;

/* loaded from: classes7.dex */
public final class f1 extends tf.i {

    /* renamed from: h, reason: collision with root package name */
    public android.view.Surface f461348h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yf.g1 f461349i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(yf.g1 g1Var, com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl textureImageViewLike, java.lang.Runnable runnable) {
        super(g1Var, textureImageViewLike, runnable);
        kotlin.jvm.internal.o.g(textureImageViewLike, "textureImageViewLike");
        this.f461349i = g1Var;
    }

    @Override // tf.i
    public void b() {
    }

    @Override // tf.i
    public boolean c(android.view.Surface surface, int i17, int i18) {
        boolean z17;
        kotlin.jvm.internal.o.g(surface, "surface");
        try {
            android.view.Surface surface2 = this.f461348h;
            if (surface2 != null && surface2 == surface) {
                surface = null;
            }
            yf.g1 g1Var = this.f461349i;
            if (surface != null) {
                z17 = g1Var.f461355g.o(surface);
                if (z17) {
                    this.f461348h = surface;
                }
            } else {
                z17 = true;
            }
            if (!z17) {
                return z17;
            }
            g1Var.f461355g.p(i17, i18);
            return z17;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
