package of4;

/* loaded from: classes4.dex */
public final class c implements sf4.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.StoryBrowseUI f345105a;

    public c(com.tencent.mm.plugin.story.ui.StoryBrowseUI storyBrowseUI) {
        this.f345105a = storyBrowseUI;
    }

    public void a() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        com.tencent.mm.plugin.story.ui.StoryBrowseUI storyBrowseUI = this.f345105a;
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = storyBrowseUI.f171865f;
        if (storyGalleryView != null) {
            storyGalleryView.setEnabled(false);
            long height = ((storyGalleryView.getHeight() - storyGalleryView.getTranslationY()) / storyGalleryView.getHeight()) * 300;
            if (height < 0) {
                height = 0;
            }
            android.widget.ImageView imageView = storyBrowseUI.f171866g;
            if (imageView != null && (animate = imageView.animate()) != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(height)) != null) {
                duration.start();
            }
            storyGalleryView.animate().translationY(storyGalleryView.getHeight()).setDuration(height).withEndAction(new of4.b(storyBrowseUI)).start();
        }
    }
}
