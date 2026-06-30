package px0;

/* loaded from: classes5.dex */
public final class u implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment f358810d;

    public u(com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment) {
        this.f358810d = materialImportPreviewFragment;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        int i39 = com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment.f69642z;
        android.widget.TextView textView = (android.widget.TextView) this.f358810d.f69651o.getValue();
        if (textView != null) {
            if (i27 - i18 < textView.getLineHeight() * 3) {
                textView.setMaxLines(2);
            } else {
                textView.setMaxLines(3);
            }
        }
    }
}
