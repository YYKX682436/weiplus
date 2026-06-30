package lt3;

/* loaded from: classes10.dex */
public final class q extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public lt3.g f321271f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel f321272g;

    /* renamed from: h, reason: collision with root package name */
    public int f321273h;

    public q(lt3.g editorData, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel) {
        kotlin.jvm.internal.o.g(editorData, "editorData");
        this.f321271f = editorData;
        this.f321272g = captureDataManager$CaptureVideoNormalModel;
    }

    @Override // fp0.d
    public void a() {
        if (lt3.v.f321279c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.mix_background.VideoMixHandler", "running forground task");
            b(fp0.u.f265292h);
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new lt3.o(this), "VideoMixHandler");
        }
    }

    @Override // fp0.d
    public java.lang.String d() {
        return "mixTask_" + this.f321271f.field_taskId;
    }
}
