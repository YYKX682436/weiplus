package ox2;

/* loaded from: classes10.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEggDarkPreview f349642d;

    public a0(com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEggDarkPreview centerInteractionEasterEggDarkPreview) {
        this.f349642d = centerInteractionEasterEggDarkPreview;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEggDarkPreview centerInteractionEasterEggDarkPreview = this.f349642d;
        com.tencent.mm.view.MMPAGView mMPAGView = centerInteractionEasterEggDarkPreview.f132390g;
        if (mMPAGView != null) {
            mMPAGView.getLocationInWindow(centerInteractionEasterEggDarkPreview.f132397q);
            com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg centerInteractionEasterEgg = centerInteractionEasterEggDarkPreview.f132389f;
            if (centerInteractionEasterEgg != null) {
                int[] iArr = centerInteractionEasterEggDarkPreview.f132397q;
                centerInteractionEasterEgg.d(iArr[0] + (mMPAGView.getWidth() / 2), iArr[1] + (mMPAGView.getHeight() / 2));
            }
        }
    }
}
