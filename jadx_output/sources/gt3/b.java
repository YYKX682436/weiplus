package gt3;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final gt3.b f275383a = new gt3.b();

    public final void a(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        boolean contains = kz5.c0.i(1, 2, 4).contains(java.lang.Integer.valueOf(configProvider.F));
        st3.t tVar = st3.t.f412597a;
        if (contains) {
            if (configProvider.f155676n == null) {
                configProvider.f155676n = new com.tencent.mm.plugin.mmsight.SightParams(configProvider.F, 0).f148819f;
            }
            boolean z17 = configProvider.M.getBoolean("key_record_keep_ratio", false);
            com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = configProvider.f155676n;
            if (videoTransPara != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordConfig", "initLogic init SightRecordConfig ");
                if (z17) {
                    tVar.c(videoTransPara, configProvider.F, false);
                } else {
                    int i17 = configProvider.F;
                    if (i17 == 2) {
                        tVar.c(videoTransPara, configProvider.F, !t94.a.f416583a.a());
                    } else {
                        tVar.c(videoTransPara, i17, true);
                    }
                }
            }
        }
        java.lang.Boolean valueOf = st3.t.f412601e ? java.lang.Boolean.valueOf(tVar.b()) : configProvider.f155670e;
        qr0.a aVar = qr0.a.f366055a;
        boolean z18 = !valueOf.booleanValue();
        qr0.a.f366056b = z18;
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKitConfig", "setTexturePreview:" + z18);
        configProvider.f155679q = 3;
    }
}
