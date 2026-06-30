package wf;

/* loaded from: classes7.dex */
public class y extends tf.r0 {

    /* renamed from: e, reason: collision with root package name */
    public pd1.l f445488e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf1.o f445489f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(wf.z zVar, tf.q qVar, yf1.o oVar) {
        super(qVar);
        this.f445489f = oVar;
        this.f445488e = null;
    }

    @Override // pd1.l
    public pd1.f a() {
        return !this.f445489f.a() ? g().a() : tf.r0.f418842c;
    }

    @Override // pd1.l
    public void b(android.view.View view) {
        if (this.f445489f.a()) {
            return;
        }
        if (view instanceof com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl) {
            g().b((com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl) view);
        } else {
            com.tencent.mars.xlog.Log.w(this.f418844a, "recycleVideoContainerView, view is not instanceof TextureImageViewLikeImpl");
        }
    }

    @Override // tf.r0, pd1.l
    public void c(android.view.View view, java.lang.Runnable runnable) {
        if (this.f445489f.a()) {
            super.c(view, runnable);
            return;
        }
        if (view instanceof com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl) {
            g().c((com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl) view, runnable);
            return;
        }
        java.lang.String str = this.f418844a;
        com.tencent.mars.xlog.Log.w(str, "transferTo, view is not instanceof TextureImageViewLikeImpl");
        if (runnable != null) {
            com.tencent.mars.xlog.Log.i(str, "transferTo, run afterTransferToTask when view is not instanceof TextureImageViewLikeImpl");
            runnable.run();
        }
    }

    @Override // tf.r0, pd1.l
    public void d(android.view.View view, java.lang.Runnable runnable) {
        if (this.f445489f.a()) {
            super.d(view, runnable);
            return;
        }
        if (view instanceof com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl) {
            g().d((com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl) view, runnable);
            return;
        }
        java.lang.String str = this.f418844a;
        com.tencent.mars.xlog.Log.w(str, "transferFrom, view is not instanceof TextureImageViewLikeImpl");
        if (runnable != null) {
            com.tencent.mars.xlog.Log.i(str, "transferFrom, run afterTransferFromTask when view is not instanceof TextureImageViewLikeImpl");
            runnable.run();
        }
    }

    @Override // pd1.l
    public android.view.View e(android.content.Context context) {
        return !this.f445489f.a() ? g().e(context) : new tf.p0(this, context);
    }

    @Override // pd1.l
    public void f(android.view.View view) {
        boolean a17 = this.f445489f.a();
        java.lang.String str = this.f418844a;
        if (a17) {
            com.tencent.mars.xlog.Log.i(str, "onPlayEndWorkaround, view: " + view);
        } else if (view instanceof com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl) {
            g().f((com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl) view);
        } else {
            com.tencent.mars.xlog.Log.w(str, "onPlayEndWorkaround, view is not instanceof TextureImageViewLikeImpl");
        }
    }

    public final pd1.l g() {
        if (this.f445488e == null) {
            this.f445488e = ((wf.v) wf.x.f445485c).a(this.f445489f);
        }
        return this.f445488e;
    }
}
