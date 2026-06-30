package e33;

/* loaded from: classes10.dex */
public class w2 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView f247524a;

    public w2(com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView imageFolderMgrView) {
        this.f247524a = imageFolderMgrView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView imageFolderMgrView = this.f247524a;
        imageFolderMgrView.f138565m = true;
        imageFolderMgrView.f138566n = false;
        e33.g3 g3Var = imageFolderMgrView.f138570r;
        if (g3Var != null) {
            ((e33.f0) g3Var).a(true);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
