package yt3;

/* loaded from: classes10.dex */
public final class y0 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.StoryFakeVideoPlayView f465722d;

    /* renamed from: e, reason: collision with root package name */
    public ct0.b f465723e;

    /* renamed from: f, reason: collision with root package name */
    public final yt3.x0 f465724f;

    public y0(com.tencent.mm.plugin.recordvideo.ui.editor.StoryFakeVideoPlayView videoPlayView, ju3.d0 status) {
        kotlin.jvm.internal.o.g(videoPlayView, "videoPlayView");
        kotlin.jvm.internal.o.g(status, "status");
        this.f465722d = videoPlayView;
        this.f465724f = new yt3.x0(this, status);
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        this.f465722d.a();
        return false;
    }

    @Override // yt3.r2
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoToVideoPlugin", "onPause");
        com.tencent.mm.plugin.recordvideo.ui.editor.StoryFakeVideoPlayView storyFakeVideoPlayView = this.f465722d;
        storyFakeVideoPlayView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Story.StoryFakeVideoPlayView", "pause");
        storyFakeVideoPlayView.f156089f = wu3.z1.f449837f;
    }

    @Override // yt3.r2
    public void onResume() {
        java.util.ArrayList arrayList;
        com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoToVideoPlugin", "onResume");
        ct0.b bVar = this.f465723e;
        boolean z17 = false;
        if (bVar != null && (arrayList = bVar.f222214k) != null && !arrayList.isEmpty()) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mm.plugin.recordvideo.ui.editor.StoryFakeVideoPlayView storyFakeVideoPlayView = this.f465722d;
            storyFakeVideoPlayView.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Story.StoryFakeVideoPlayView", "resume");
            storyFakeVideoPlayView.f156089f = wu3.z1.f449836e;
        }
    }

    @Override // yt3.r2
    public void release() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoToVideoPlugin", "release");
        this.f465722d.a();
        this.f465723e = null;
    }

    @Override // yt3.r2
    public void reset() {
        this.f465722d.a();
        this.f465723e = null;
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        this.f465722d.setVisibility(i17);
    }
}
