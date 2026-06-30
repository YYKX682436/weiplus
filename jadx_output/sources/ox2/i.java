package ox2;

/* loaded from: classes2.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg f349668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f349669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f349670f;

    public i(com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg centerInteractionEasterEgg, int i17, int i18) {
        this.f349668d = centerInteractionEasterEgg;
        this.f349669e = i17;
        this.f349670f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view;
        com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg centerInteractionEasterEgg = this.f349668d;
        android.view.View view2 = centerInteractionEasterEgg.f132374i;
        if (view2 == null || (view = centerInteractionEasterEgg.f132371f) == null) {
            return;
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view2.getLocationInWindow(centerInteractionEasterEgg.f132386x);
        float t17 = (this.f349669e - centerInteractionEasterEgg.f132386x[0]) - (hc2.f1.t(view2) / 2);
        int i17 = centerInteractionEasterEgg.f132386x[1];
        float n17 = (this.f349670f - i17) - (hc2.f1.n(view2) / 2);
        view.setTranslationX(t17);
        view.setTranslationY(n17);
        android.view.View view3 = centerInteractionEasterEgg.f132376n;
        if (view3 == null) {
            return;
        }
        view3.setTranslationY(0.0f);
        view3.getLocationInWindow(centerInteractionEasterEgg.f132386x);
        view3.setTranslationY((r7 - centerInteractionEasterEgg.f132386x[1]) - (hc2.f1.n(view3) / 2));
    }
}
