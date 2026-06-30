package wu3;

/* loaded from: classes10.dex */
public final class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.StoryFakeVideoPlayView f449714d;

    public a2(com.tencent.mm.plugin.recordvideo.ui.editor.StoryFakeVideoPlayView storyFakeVideoPlayView) {
        this.f449714d = storyFakeVideoPlayView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nt3.f0 f0Var = this.f449714d.f156088e;
        if (f0Var != null) {
            f0Var.f339783c = 0L;
        } else {
            kotlin.jvm.internal.o.o("render");
            throw null;
        }
    }
}
