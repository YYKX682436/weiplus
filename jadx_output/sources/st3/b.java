package st3;

/* loaded from: classes10.dex */
public final class b implements gt0.a {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelcontrol.VideoTransPara f412520d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView f412521e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f412522f;

    public b(com.tencent.mm.modelcontrol.VideoTransPara recordVideoTransPara, com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView previewPlugin, java.lang.String videoPath) {
        kotlin.jvm.internal.o.g(recordVideoTransPara, "recordVideoTransPara");
        kotlin.jvm.internal.o.g(previewPlugin, "previewPlugin");
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        this.f412520d = recordVideoTransPara;
        this.f412521e = previewPlugin;
        this.f412522f = videoPath;
    }

    @Override // gt0.a
    public boolean g() {
        return false;
    }

    @Override // gt0.a
    public et0.q getCameraPreviewView() {
        return this.f412521e;
    }

    @Override // gt0.a
    public android.content.Context getContext() {
        android.content.Context context = this.f412521e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return context;
    }

    @Override // gt0.a
    public ct0.a getEncodeConfig() {
        return new st3.a(this);
    }

    @Override // gt0.d
    public int getRecordScene() {
        return 9;
    }

    @Override // gt0.d
    public int getResolutionLimit() {
        return st3.t.f412601e ? st3.t.f412599c : this.f412520d.f71191d;
    }

    @Override // gt0.a
    public com.tencent.mm.modelcontrol.VideoTransPara getVideoTransPara() {
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara;
        if (st3.t.f412601e && (videoTransPara = st3.t.f412598b) != null) {
            int i17 = videoTransPara.f71191d;
            com.tencent.mm.modelcontrol.VideoTransPara videoTransPara2 = this.f412520d;
            if (i17 != videoTransPara2.f71191d || videoTransPara.f71192e != videoTransPara2.f71192e) {
                videoTransPara2.f71191d = i17;
                videoTransPara2.f71192e = videoTransPara.f71192e;
            }
        }
        return this.f412520d;
    }
}
