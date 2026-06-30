package wu3;

/* loaded from: classes10.dex */
public final class d2 implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.StoryFakeVideoPlayView f449728d;

    public d2(com.tencent.mm.plugin.recordvideo.ui.editor.StoryFakeVideoPlayView storyFakeVideoPlayView) {
        this.f449728d = storyFakeVideoPlayView;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mm.plugin.recordvideo.ui.editor.StoryFakeVideoPlayView storyFakeVideoPlayView = this.f449728d;
        nt3.f0 f0Var = storyFakeVideoPlayView.f156088e;
        if (f0Var == null) {
            kotlin.jvm.internal.o.o("render");
            throw null;
        }
        nt3.f fVar = new nt3.f(surface, f0Var);
        storyFakeVideoPlayView.f156087d = fVar;
        fVar.b();
        nt3.f fVar2 = storyFakeVideoPlayView.f156087d;
        if (fVar2 == null) {
            kotlin.jvm.internal.o.o("glThread");
            throw null;
        }
        nt3.f0 f0Var2 = fVar2.f339777c;
        f0Var2.f339781a = i17;
        f0Var2.f339782b = i18;
        if (fVar2 == null) {
            kotlin.jvm.internal.o.o("glThread");
            throw null;
        }
        f0Var2.f339784d = 66;
        storyFakeVideoPlayView.f156090g = true;
        int i19 = com.tencent.mm.plugin.recordvideo.ui.editor.StoryFakeVideoPlayView.f156086o;
        com.tencent.mars.xlog.Log.i("MicroMsg.Story.StoryFakeVideoPlayView", "onSurfaceTextureAvailable");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        int i17 = com.tencent.mm.plugin.recordvideo.ui.editor.StoryFakeVideoPlayView.f156086o;
        com.tencent.mars.xlog.Log.i("MicroMsg.Story.StoryFakeVideoPlayView", "onSurfaceTextureDestroyed");
        com.tencent.mm.plugin.recordvideo.ui.editor.StoryFakeVideoPlayView storyFakeVideoPlayView = this.f449728d;
        storyFakeVideoPlayView.f156090g = false;
        nt3.f fVar = storyFakeVideoPlayView.f156087d;
        if (fVar == null) {
            kotlin.jvm.internal.o.o("glThread");
            throw null;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = fVar.f339780f;
        if (n3Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Story.GLThread", "stop but handler is null");
            return true;
        }
        n3Var.removeCallbacksAndMessages(null);
        fVar.f339780f.post(new nt3.e(fVar));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        int i19 = com.tencent.mm.plugin.recordvideo.ui.editor.StoryFakeVideoPlayView.f156086o;
        com.tencent.mars.xlog.Log.i("MicroMsg.Story.StoryFakeVideoPlayView", "onSurfaceTextureSizeChanged");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        int i17 = com.tencent.mm.plugin.recordvideo.ui.editor.StoryFakeVideoPlayView.f156086o;
        com.tencent.mars.xlog.Log.i("MicroMsg.Story.StoryFakeVideoPlayView", "onSurfaceTextureUpdated");
    }
}
