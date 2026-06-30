package p10;

/* loaded from: classes8.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView f351010d;

    public w(com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView magicDebugPanelView) {
        this.f351010d = magicDebugPanelView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView.G;
        com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView magicDebugPanelView = this.f351010d;
        java.lang.Object parent = magicDebugPanelView.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view == null) {
            return;
        }
        int width = view.getWidth();
        if (magicDebugPanelView.getWidth() <= 0 || width <= 0) {
            return;
        }
        float left = magicDebugPanelView.getLeft() + magicDebugPanelView.getTranslationX();
        float right = magicDebugPanelView.getRight() + magicDebugPanelView.getTranslationX();
        if (left < 0.0f) {
            magicDebugPanelView.setTranslationX(-magicDebugPanelView.getLeft());
            return;
        }
        float f17 = width;
        if (right > f17) {
            magicDebugPanelView.setTranslationX(f17 - magicDebugPanelView.getRight());
        }
    }
}
