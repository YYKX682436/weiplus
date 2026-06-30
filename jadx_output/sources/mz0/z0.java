package mz0;

/* loaded from: classes5.dex */
public final class z0 implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f333082d;

    public z0(mz0.b2 b2Var) {
        this.f333082d = b2Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("MicroMsg.Template.TemplateControlUIC", "onSurfaceTextureAvailable() called with: surface = " + surface + ", width = " + i17 + ", height = " + i18);
        android.app.Activity context = this.f333082d.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(dz0.l.class))).p7(new android.view.Surface(surface));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("MicroMsg.Template.TemplateControlUIC", "onSurfaceTextureDestroyed: ");
        android.app.Activity context = this.f333082d.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(dz0.l.class))).p7(null);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        az0.n7 n7Var;
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("MicroMsg.Template.TemplateControlUIC", "onSurfaceTextureSizeChanged() called with: surface = " + surface + ", width = " + i17 + ", height = " + i18);
        android.app.Activity context = this.f333082d.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC = (com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(dz0.l.class));
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "notifySurfaceChanged() called with: format = 1, width = " + i17 + ", height = " + i18);
        if (!maasSdkUIC.B || (n7Var = maasSdkUIC.f69783d) == null) {
            return;
        }
        n7Var.f15742a.notifySurfaceChanged(1, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }
}
