package e33;

/* loaded from: classes10.dex */
public class t0 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Runnable f247465a = new e33.s0(this);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI f247466b;

    public t0(com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI) {
        this.f247466b = albumPreviewUI;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = this.f247466b;
        albumPreviewUI.f138538q.setVisibility(0);
        albumPreviewUI.f138538q.postDelayed(this.f247465a, 4000L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
