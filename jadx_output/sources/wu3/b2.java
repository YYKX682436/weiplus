package wu3;

/* loaded from: classes10.dex */
public final class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.StoryFakeVideoPlayView f449717d;

    public b2(com.tencent.mm.plugin.recordvideo.ui.editor.StoryFakeVideoPlayView storyFakeVideoPlayView) {
        this.f449717d = storyFakeVideoPlayView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.recordvideo.ui.editor.StoryFakeVideoPlayView storyFakeVideoPlayView = this.f449717d;
        wu3.y1 callback = storyFakeVideoPlayView.getCallback();
        if (callback != null) {
            yt3.x0 x0Var = (yt3.x0) callback;
            yt3.y0 y0Var = x0Var.f465713a;
            y0Var.f465722d.post(new yt3.w0(y0Var, x0Var.f465714b));
        }
        storyFakeVideoPlayView.setCallback(null);
    }
}
