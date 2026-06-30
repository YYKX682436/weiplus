package cw2;

/* loaded from: classes10.dex */
public final class h0 extends st3.e {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f223737o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider, com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView previewPlugin) {
        super(configProvider, previewPlugin);
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        kotlin.jvm.internal.o.g(previewPlugin, "previewPlugin");
        this.f223737o = "Finder.FinderCameraContainerProcess";
        if (((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).qj()) {
            com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = super.getVideoTransPara();
            ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            videoTransPara.f71194g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_high_record_bitrate, 10000000);
        }
    }

    @Override // st3.e, gt0.a
    public ct0.a getEncodeConfig() {
        return new cw2.f0(this);
    }

    @Override // st3.e, gt0.a
    public ms0.c getPreviewRenderer() {
        com.tencent.mm.plugin.xlabeffect.XEffectConfig xEffectConfig = this.f412525d.Q;
        if ((xEffectConfig.f188597e || xEffectConfig.f188598f) && this.f412531m == null) {
            this.f412531m = new mu3.b(6);
            this.f412532n = new mu3.a();
            mu3.b bVar = this.f412531m;
            if (bVar != null) {
                bVar.f331401y = new cw2.g0(this);
            }
        }
        return super.getPreviewRenderer();
    }

    @Override // st3.e, gt0.d
    public int getResolutionLimit() {
        return 2500;
    }

    @Override // st3.e, gt0.a
    public com.tencent.mm.modelcontrol.VideoTransPara getVideoTransPara() {
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = super.getVideoTransPara();
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_record_max_size, 1920);
        if (videoTransPara.f71191d > Ni || videoTransPara.f71192e > Ni) {
            java.lang.String str = "getVideoTransPara, size to large, originWidth:" + videoTransPara.f71191d + ", originHeight:" + videoTransPara.f71192e + ", maxSize:" + Ni;
            java.lang.String str2 = this.f223737o;
            com.tencent.mars.xlog.Log.i(str2, str);
            int i17 = videoTransPara.f71192e;
            int i18 = videoTransPara.f71191d;
            float f17 = i17 / i18;
            if (i18 > i17) {
                videoTransPara.f71192e = (int) (Ni * f17);
                videoTransPara.f71191d = Ni;
            } else {
                videoTransPara.f71191d = (int) (Ni / f17);
                videoTransPara.f71192e = Ni;
            }
            videoTransPara.f71191d = ai3.d.a(videoTransPara.f71191d);
            videoTransPara.f71192e = ai3.d.a(videoTransPara.f71192e);
            com.tencent.mars.xlog.Log.i(str2, "getVideoTransPara, do size crop, width:" + videoTransPara.f71191d + ", height:" + videoTransPara.f71192e + ", maxSize:" + Ni);
        }
        return videoTransPara;
    }

    @Override // st3.e, gt0.a
    public boolean j() {
        boolean g17 = g();
        java.lang.String str = this.f223737o;
        boolean z17 = false;
        if (g17) {
            com.tencent.mars.xlog.Log.i(str, "useDaemonRecorder useCpuCrop false");
            dw3.f.f244204b = false;
            return false;
        }
        if (((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).qj() && this.f412528g.a()) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i(str, "useDaemonRecorder useDaemonRecorder:" + z17 + ", FinderConfig.USE_DAEMON_RECORD:" + ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).qj());
        dw3.f.f244204b = z17;
        return z17;
    }
}
