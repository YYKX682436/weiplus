package pz0;

/* loaded from: classes5.dex */
public final class m implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.maas.MaasFlutterApi {

    /* renamed from: e, reason: collision with root package name */
    public io.flutter.view.TextureRegistry f359148e;

    /* renamed from: g, reason: collision with root package name */
    public az0.n7 f359150g;

    /* renamed from: h, reason: collision with root package name */
    public io.flutter.view.TextureRegistry.SurfaceTextureEntry f359151h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.Surface f359152i;

    /* renamed from: d, reason: collision with root package name */
    public final dz0.h f359147d = new dz0.h("TemplateRecommendv2", false, true, -1, false, kz5.p0.f313996d, 0, false, null, false);

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f359149f = kotlinx.coroutines.z0.b();

    @Override // com.tencent.pigeon.maas.MaasFlutterApi
    public void initRenderSurface(long j17, long j18, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "initRenderSurface: width " + j17 + ", height " + j18);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setReportScene: 6, field: ");
        sb6.append(bz0.a.f36723b);
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", sb6.toString());
        bz0.a.f36723b = 6;
        if (this.f359152i != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "initRenderSurface: renderSurface is not null");
            return;
        }
        io.flutter.view.TextureRegistry textureRegistry = this.f359148e;
        if (textureRegistry == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "textureRegistry is null");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(-1L)));
            return;
        }
        io.flutter.view.TextureRegistry.SurfaceTextureEntry createSurfaceTexture = textureRegistry.createSurfaceTexture();
        if (createSurfaceTexture == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "createTexture error");
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(-1L)));
            return;
        }
        android.view.Surface surface = this.f359152i;
        if (surface != null) {
            surface.release();
        }
        io.flutter.view.TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = this.f359151h;
        if (surfaceTextureEntry != null) {
            surfaceTextureEntry.release();
        }
        android.view.Surface surface2 = new android.view.Surface(createSurfaceTexture.surfaceTexture());
        createSurfaceTexture.surfaceTexture().setDefaultBufferSize((int) j17, (int) j18);
        this.f359151h = createSurfaceTexture;
        this.f359152i = surface2;
        az0.i5.s(az0.i5.f15557a, false, null, false, 7, null);
        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Long.valueOf(createSurfaceTexture.id()))));
        com.tencent.mars.xlog.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "initRenderSurface id " + createSurfaceTexture.id());
        if (this.f359150g != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "initRenderSurface: setSurface");
            az0.n7 n7Var = this.f359150g;
            if (n7Var != null) {
                n7Var.f15742a.setSurface(surface2);
            }
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mars.xlog.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "onAttachedToEngine");
        this.f359148e = p07.getTextureRegistry();
        com.tencent.pigeon.maas.MaasFlutterApi.Companion companion = com.tencent.pigeon.maas.MaasFlutterApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = p07.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.maas.MaasFlutterApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mars.xlog.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "onDetachedFromEngine");
        this.f359148e = null;
    }

    @Override // com.tencent.pigeon.maas.MaasFlutterApi
    public void recreateCreation(java.lang.String templateId, java.lang.String musicId, yz5.l callback) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        kotlin.jvm.internal.o.g(musicId, "musicId");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "recreateCreation: " + templateId + ' ' + musicId);
        kotlinx.coroutines.l.d(this.f359149f, null, null, new pz0.d(this, templateId, musicId, callback, null), 3, null);
    }

    @Override // com.tencent.pigeon.maas.MaasFlutterApi
    public void release() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "release");
        az0.n7 n7Var = this.f359150g;
        if (n7Var != null) {
            n7Var.f15742a.setSurface(null);
        }
        az0.n7 n7Var2 = this.f359150g;
        if (n7Var2 != null) {
            n7Var2.k();
        }
        this.f359150g = null;
        android.view.Surface surface = this.f359152i;
        if (surface != null) {
            surface.release();
        }
        this.f359152i = null;
        io.flutter.view.TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = this.f359151h;
        if (surfaceTextureEntry != null) {
            surfaceTextureEntry.release();
        }
        this.f359151h = null;
    }

    @Override // com.tencent.pigeon.maas.MaasFlutterApi
    public void startMovieCreation(java.lang.String templateId, java.lang.String musicId, byte[] mediaInfo, yz5.l callback) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        kotlin.jvm.internal.o.g(musicId, "musicId");
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "startMovieCreation() called with: templateId = " + templateId + ", musicId = " + musicId + ", mediaInfo = " + mediaInfo);
        kotlinx.coroutines.l.d(this.f359149f, null, null, new pz0.j(this, mediaInfo, templateId, musicId, callback, null), 3, null);
    }

    @Override // com.tencent.pigeon.maas.MaasFlutterApi
    public void startPlay(long j17, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "startPlay: " + j17);
        kotlinx.coroutines.l.d(this.f359149f, null, null, new pz0.k(this, j17, callback, null), 3, null);
    }

    @Override // com.tencent.pigeon.maas.MaasFlutterApi
    public void stopPlay(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "stopPlay");
        kotlinx.coroutines.l.d(this.f359149f, null, null, new pz0.l(this, callback, null), 3, null);
    }
}
