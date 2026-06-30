package st3;

/* loaded from: classes10.dex */
public class e implements gt0.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f412525d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView f412526e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.modelcontrol.VideoTransPara f412527f;

    /* renamed from: g, reason: collision with root package name */
    public final bt0.a f412528g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f412529h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f412530i;

    /* renamed from: m, reason: collision with root package name */
    public mu3.b f412531m;

    /* renamed from: n, reason: collision with root package name */
    public mu3.a f412532n;

    public e(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider, com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView previewPlugin) {
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara;
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        kotlin.jvm.internal.o.g(previewPlugin, "previewPlugin");
        this.f412525d = configProvider;
        this.f412526e = previewPlugin;
        android.content.Context context = previewPlugin.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f412528g = new bt0.a(context);
        dw3.c0.f244182a.a(configProvider);
        java.lang.Object clone = configProvider.f155676n.clone();
        kotlin.jvm.internal.o.e(clone, "null cannot be cast to non-null type com.tencent.mm.modelcontrol.VideoTransPara");
        this.f412527f = (com.tencent.mm.modelcontrol.VideoTransPara) clone;
        if (st3.t.f412601e && (videoTransPara = st3.t.f412598b) != null) {
            java.lang.Object clone2 = videoTransPara.clone();
            kotlin.jvm.internal.o.e(clone2, "null cannot be cast to non-null type com.tencent.mm.modelcontrol.VideoTransPara");
            this.f412527f = (com.tencent.mm.modelcontrol.VideoTransPara) clone2;
        }
        boolean z17 = true;
        if (configProvider.f155673h == 1) {
            if (!st3.t.f412601e) {
                int i17 = vt3.q.f440037a;
                int i18 = vt3.q.f440038b;
                int i19 = vt3.q.f440037a;
                com.tencent.mm.modelcontrol.VideoTransPara videoTransPara2 = this.f412527f;
                videoTransPara2.f71191d = (videoTransPara2.f71192e * i19) / i18;
                com.tencent.mars.xlog.Log.i("MicroMsg.CameraContainerProcess", "SightRecordConfig init failed, fix videoPara");
            }
            if (!es0.b.f256310a) {
                int i27 = configProvider.F;
                if (i27 == 2) {
                    this.f412527f.f71194g = (int) (r7.f71194g * 6.0f);
                    com.tencent.mars.xlog.Log.i("MicroMsg.CameraContainerProcess", "final kbps: 6.0  " + this.f412527f.f71194g);
                } else if (i27 == 1) {
                    this.f412527f.f71194g = (int) (r7.f71194g * 8.0f);
                    com.tencent.mars.xlog.Log.i("MicroMsg.CameraContainerProcess", "final kbps: 8.0  " + this.f412527f.f71194g);
                } else {
                    this.f412527f.f71194g = 8000000;
                    com.tencent.mars.xlog.Log.i("MicroMsg.CameraContainerProcess", "final kbps: $2  " + this.f412527f.f71194g);
                }
            }
        }
        com.tencent.mm.plugin.xlabeffect.XEffectConfig xEffectConfig = configProvider.Q;
        if (!xEffectConfig.f188597e && !xEffectConfig.f188598f) {
            z17 = false;
        }
        this.f412529h = z17;
        ts0.d.f421551b = configProvider.F;
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraContainerProcess", "init CameraContainerProcess, scene: " + configProvider.F + "   " + this.f412527f);
    }

    @Override // gt0.a
    public boolean g() {
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_PREVIEW_CROP_INT_SYNC, -1);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) m17).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraContainerProcess", "cuttype : " + intValue);
        if (intValue == 1) {
            dw3.f.f244203a = false;
            return false;
        }
        if (intValue == 2) {
            dw3.f.f244203a = true;
            return true;
        }
        if (com.tencent.mm.sdk.platformtools.o4.L().getBoolean("mediacodec_create_error", false)) {
            dw3.f.f244203a = true;
            return true;
        }
        java.lang.Boolean valueOf = st3.t.f412601e ? java.lang.Boolean.valueOf(st3.t.f412597a.b()) : this.f412525d.f155670e;
        kotlin.jvm.internal.o.d(valueOf);
        dw3.f.f244203a = valueOf.booleanValue();
        return valueOf.booleanValue();
    }

    @Override // gt0.a
    public et0.q getCameraPreviewView() {
        return this.f412526e;
    }

    @Override // gt0.a
    public android.content.Context getContext() {
        android.content.Context context = this.f412526e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return context;
    }

    @Override // gt0.a
    public com.tencent.mm.modelcontrol.VideoTransPara getDaemonVideoTransPara() {
        com.tencent.mm.modelcontrol.VideoTransPara videoParam = this.f412525d.f155676n;
        kotlin.jvm.internal.o.f(videoParam, "videoParam");
        return videoParam;
    }

    @Override // gt0.a
    public ct0.a getEncodeConfig() {
        return new st3.c(this);
    }

    @Override // gt0.a
    public ms0.c getPreviewRenderer() {
        boolean z17 = this.f412529h;
        if (!z17) {
            this.f412531m = null;
            this.f412532n = null;
        } else if (this.f412531m == null) {
            this.f412531m = new mu3.b(2);
            this.f412532n = new mu3.a();
            mu3.b bVar = this.f412531m;
            if (bVar != null) {
                bVar.f331401y = new st3.d(this);
            }
        }
        if (z17) {
            return this.f412531m;
        }
        return null;
    }

    @Override // gt0.a
    public ms0.c getRecordRenderer() {
        if (this.f412529h) {
            return this.f412532n;
        }
        return null;
    }

    @Override // gt0.d
    public int getRecordScene() {
        return this.f412525d.F;
    }

    @Override // gt0.a
    public ht0.b getRecorder() {
        if (!this.f412529h) {
            return null;
        }
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = getVideoTransPara();
        mu3.a aVar = this.f412532n;
        android.opengl.EGLContext eGLContext = this.f412526e.getEGLContext();
        kotlin.jvm.internal.o.d(eGLContext);
        mu3.b bVar = this.f412531m;
        is0.c cVar = bVar != null ? bVar.f331399w : null;
        kotlin.jvm.internal.o.d(cVar);
        return new ht0.s(videoTransPara, aVar, eGLContext, cVar.f294395e);
    }

    @Override // gt0.d
    public int getResolutionLimit() {
        return st3.t.f412601e ? st3.t.f412599c : this.f412525d.f155671f;
    }

    @Override // gt0.a
    public com.tencent.mm.modelcontrol.VideoTransPara getVideoTransPara() {
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara;
        int i17;
        boolean z17 = st3.t.f412601e;
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara2 = this.f412527f;
        if (z17 && (videoTransPara = st3.t.f412598b) != null && ((i17 = videoTransPara.f71191d) != videoTransPara2.f71191d || videoTransPara.f71192e != videoTransPara2.f71192e)) {
            videoTransPara2.f71191d = i17;
            videoTransPara2.f71192e = videoTransPara.f71192e;
        }
        return videoTransPara2;
    }

    @Override // gt0.a
    public boolean isMute() {
        return this.f412530i;
    }

    @Override // gt0.a
    public boolean j() {
        boolean z17 = false;
        if (g()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CameraContainerProcess", "useDaemonRecorder false");
            dw3.f.f244204b = false;
            return false;
        }
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f412525d;
        int i17 = recordConfigProvider.F;
        if (i17 != 2 && i17 != 1) {
            dw3.f.f244204b = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.CameraContainerProcess", "scene " + recordConfigProvider.F + " not use DaemonRecorder");
            return false;
        }
        if (getEncodeConfig().c() == 1) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("info: enable:[");
        bt0.a aVar = this.f412528g;
        boolean z18 = aVar.f24139b;
        sb6.append(z18);
        sb6.append("] ramConfig:[");
        sb6.append(aVar.f24140c);
        sb6.append("] blackModelList:[");
        sb6.append(aVar.f24141d);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("MicroMsg.DaemonChecker", sb6.toString());
        if (z18 && aVar.a()) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraContainerProcess", "useDaemonRecorder " + z17);
        dw3.f.f244204b = z17;
        return z17;
    }
}
