package di3;

/* loaded from: classes10.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public int f232700a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.modelcontrol.VideoTransPara f232701b;

    /* renamed from: c, reason: collision with root package name */
    public int f232702c;

    /* renamed from: d, reason: collision with root package name */
    public int f232703d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f232704e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f232705f;

    /* renamed from: g, reason: collision with root package name */
    public int f232706g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f232707h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f232708i;

    public f0() {
        this.f232700a = 2;
        this.f232702c = -1;
        this.f232704e = false;
        this.f232705f = false;
        this.f232706g = -1;
        this.f232707h = true;
        this.f232708i = false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    public static di3.f0 a(int i17, com.tencent.mm.modelcontrol.VideoTransPara videoTransPara) {
        di3.f0 f0Var;
        switch (i17) {
            case 1:
                com.tencent.mars.xlog.Log.i("MicroMsg.RecoderParameter", "setToPresetConfig1");
                f0Var = new di3.f0(2, videoTransPara);
                f0Var.f232705f = false;
                f0Var.f232702c = i17;
                return f0Var;
            case 2:
                com.tencent.mars.xlog.Log.i("MicroMsg.RecoderParameter", "setToPresetConfig2");
                f0Var = new di3.f0(2, videoTransPara);
                f0Var.f232705f = false;
                f0Var.c();
                f0Var.d(com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH);
                f0Var.f232702c = i17;
                return f0Var;
            case 3:
                com.tencent.mars.xlog.Log.i("MicroMsg.RecoderParameter", "setToPresetConfig3");
                f0Var = new di3.f0(1, videoTransPara);
                f0Var.f232705f = false;
                f0Var.f232702c = i17;
                return f0Var;
            case 4:
                com.tencent.mars.xlog.Log.i("MicroMsg.RecoderParameter", "setToPresetConfig4");
                f0Var = new di3.f0(1, videoTransPara);
                f0Var.f232705f = false;
                f0Var.c();
                f0Var.d(com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH);
                f0Var.f232702c = i17;
                return f0Var;
            case 5:
                com.tencent.mars.xlog.Log.i("MicroMsg.RecoderParameter", "setToPresetConfig5");
                f0Var = new di3.f0(2, videoTransPara);
                f0Var.f232705f = true;
                f0Var.f232704e = false;
                f0Var.d(com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH);
                f0Var.f232702c = i17;
                return f0Var;
            case 6:
                com.tencent.mars.xlog.Log.i("MicroMsg.RecoderParameter", "setToPresetConfig6");
                f0Var = new di3.f0(1, videoTransPara);
                f0Var.f232705f = true;
                f0Var.d(com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH);
                f0Var.f232702c = i17;
                return f0Var;
            case 7:
                com.tencent.mars.xlog.Log.i("MicroMsg.RecoderParameter", "setToPresetConfig7");
                f0Var = new di3.f0(2, videoTransPara);
                f0Var.f232705f = true;
                f0Var.b();
                f0Var.f232704e = false;
                f0Var.f232702c = i17;
                return f0Var;
            case 8:
                com.tencent.mars.xlog.Log.i("MicroMsg.RecoderParameter", "setToPresetConfig8");
                f0Var = new di3.f0(2, videoTransPara);
                f0Var.f232705f = true;
                f0Var.b();
                f0Var.f232704e = true;
                f0Var.f232702c = i17;
                return f0Var;
            case 9:
                f0Var = new di3.f0(1, videoTransPara);
                f0Var.f232705f = true;
                f0Var.b();
                f0Var.f232704e = false;
                f0Var.f232702c = i17;
                return f0Var;
            case 10:
                com.tencent.mars.xlog.Log.i("MicroMsg.RecoderParameter", "setToPresetConfig10");
                f0Var = new di3.f0(1, videoTransPara);
                f0Var.f232705f = true;
                f0Var.b();
                f0Var.f232704e = true;
                f0Var.f232702c = i17;
                return f0Var;
            case 11:
                com.tencent.mars.xlog.Log.i("MicroMsg.RecoderParameter", "setToPresetConfig10");
                f0Var = new di3.f0(2, videoTransPara);
                f0Var.f232705f = true;
                f0Var.b();
                f0Var.f232704e = false;
                f0Var.c();
                f0Var.f232702c = i17;
                return f0Var;
            case 12:
                com.tencent.mars.xlog.Log.i("MicroMsg.RecoderParameter", "setToPresetConfig10");
                f0Var = new di3.f0(2, videoTransPara);
                f0Var.f232705f = true;
                f0Var.f232706g = 1080;
                f0Var.f232704e = false;
                f0Var.c();
                f0Var.f232702c = i17;
                return f0Var;
            default:
                return null;
        }
    }

    public di3.f0 b() {
        this.f232706g = this.f232701b.f71191d * 2;
        return this;
    }

    public di3.f0 c() {
        this.f232703d = this.f232701b.f71194g * 2;
        this.f232708i = true;
        return this;
    }

    public di3.f0 d(int i17) {
        this.f232706g = i17;
        return this;
    }

    public java.lang.String toString() {
        return java.lang.String.format("mediatype %s videoBitrate : %s isEnableLandscapeMode %s needRotateEachFrame %s isNeedRealtimeScale %s resolutionLimit %s videoParams %s", java.lang.Integer.valueOf(this.f232700a), java.lang.Integer.valueOf(this.f232703d), java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(this.f232704e), java.lang.Boolean.valueOf(this.f232705f), java.lang.Integer.valueOf(this.f232706g), this.f232701b);
    }

    public f0(int i17, com.tencent.mm.modelcontrol.VideoTransPara videoTransPara) {
        this.f232702c = -1;
        this.f232704e = false;
        this.f232705f = false;
        this.f232706g = -1;
        this.f232707h = true;
        this.f232708i = false;
        this.f232701b = videoTransPara;
        this.f232700a = i17;
        this.f232703d = videoTransPara.f71194g;
        this.f232706g = videoTransPara.f71191d;
    }
}
