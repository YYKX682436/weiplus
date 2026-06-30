package wf;

/* loaded from: classes7.dex */
public class t extends tf.i {

    /* renamed from: h, reason: collision with root package name */
    public android.view.Surface f445482h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wf.u f445483i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(wf.u uVar, com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl textureImageViewLikeImpl, java.lang.Runnable runnable) {
        super(uVar, textureImageViewLikeImpl, runnable);
        this.f445483i = uVar;
        this.f445482h = null;
    }

    @Override // tf.i
    public void b() {
    }

    @Override // tf.i
    public boolean c(android.view.Surface surface, int i17, int i18) {
        boolean z17;
        try {
            android.view.Surface surface2 = this.f445482h;
            if (surface2 != null && surface2 == surface) {
                surface = null;
            }
            wf.u uVar = this.f445483i;
            if (surface != null) {
                wf.b bVar = uVar.f445484g.f461651a;
                bVar.f445417h = surface;
                z17 = bVar.N(surface);
                if (z17) {
                    this.f445482h = surface;
                }
            } else {
                z17 = true;
            }
            if (z17) {
                uVar.f445484g.b(i17, i18);
            }
            return z17;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
