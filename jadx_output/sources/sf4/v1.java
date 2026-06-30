package sf4;

/* loaded from: classes4.dex */
public final class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView f407602d;

    public v1(com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView) {
        this.f407602d = storyVideoView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView.f172110a2;
        com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView = this.f407602d;
        com.tencent.mars.xlog.Log.i(storyVideoView.f189739e, "onTextureUpdate");
        if (storyVideoView.f189748q == null) {
            return;
        }
        storyVideoView.D();
        java.lang.Object obj = storyVideoView.f189748q;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type android.view.View");
        android.view.View view = (android.view.View) obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryVideoView$playLocalVideo$1$onPrepared$1$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/story/ui/view/gallery/StoryVideoView$playLocalVideo$1$onPrepared$1$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
