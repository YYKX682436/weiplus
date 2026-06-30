package in0;

/* loaded from: classes3.dex */
public final class d implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in0.q f292744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn0.a f292745e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.TextureView f292746f;

    public d(in0.q qVar, long j17, jn0.a aVar, android.view.TextureView textureView) {
        this.f292744d = qVar;
        this.f292745e = aVar;
        this.f292746f = textureView;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", "float onSurfaceTextureAvailable, surface:" + surface + ", size:[" + i17 + ", " + i18 + ']');
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        jn0.a aVar = this.f292745e;
        int i19 = com.tencent.mm.ui.bl.b(aVar.f300475a).x;
        int i27 = com.tencent.mm.ui.bl.b(aVar.f300475a).y;
        if (i19 <= i27) {
            i19 = i27;
            i27 = i19;
        }
        fn0.g gVar = fn0.g.f264195a;
        boolean z18 = false;
        if (fn0.g.f264196b != null) {
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.I5).getValue()).r()).intValue() == 0) {
                z18 = true;
            }
        }
        if (!z18) {
            if (i17 < i18) {
                i18 = (int) (i17 * (i19 / i27));
            } else if (i18 < i17) {
                i17 = (int) (i18 * (i19 / i27));
            }
        }
        in0.q qVar = this.f292744d;
        qVar.f420771r.a(this.f292746f.getSurfaceTexture(), qVar.L());
        qVar.f420771r.i(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", "float onSurfaceTextureDestroyed");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", "float onSurfaceTextureSizeChanged, surface:" + surface + ", size:[" + i17 + ", " + i18 + ']');
        this.f292744d.f420771r.i(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }
}
