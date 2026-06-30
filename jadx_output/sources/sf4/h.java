package sf4;

/* loaded from: classes4.dex */
public final class h extends oj5.y {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView f407483a;

    /* renamed from: b, reason: collision with root package name */
    public float f407484b;

    /* renamed from: c, reason: collision with root package name */
    public int f407485c;

    /* renamed from: d, reason: collision with root package name */
    public int f407486d;

    @Override // oj5.y
    public boolean a(android.view.MotionEvent event, boolean z17, int i17) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator translationY;
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView;
        kotlin.jvm.internal.o.g(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            event.getX();
            this.f407484b = event.getY();
        } else if (actionMasked == 1) {
            if (this.f407485c > 0 && this.f407486d == 1) {
                com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView2 = this.f407483a;
                if (storyGalleryView2 != null && (animate = storyGalleryView2.animate()) != null && (translationY = animate.translationY(0.0f)) != null) {
                    translationY.start();
                }
                this.f407486d = 0;
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                java.lang.Object systemService = context.getSystemService("vibrator");
                android.os.Vibrator vibrator = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
                if (vibrator != null) {
                    vibrator.vibrate(10L);
                }
                db5.e1.T(context, context.getString(com.tencent.mm.R.string.jlz));
            }
            this.f407485c = 0;
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GalleryOverScrollConsumer", "LogStory: touch cancel");
                this.f407486d = 0;
                com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView3 = this.f407483a;
                if (storyGalleryView3 != null) {
                    storyGalleryView3.setTranslationY(0.0f);
                }
                this.f407485c = 0;
            }
        } else if (z17) {
            this.f407486d = i17;
            r1 = i17 == 1;
            float y17 = event.getY() - this.f407484b;
            if (y17 <= 0.0f && (storyGalleryView = this.f407483a) != null) {
                this.f407485c = -((int) y17);
                storyGalleryView.animate().cancel();
                storyGalleryView.setTranslationY(y17 / 2);
            }
        }
        return r1;
    }

    @Override // oj5.y
    public int b() {
        return 1;
    }
}
