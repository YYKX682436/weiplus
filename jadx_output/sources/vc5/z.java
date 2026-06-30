package vc5;

/* loaded from: classes5.dex */
public final class z implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f435356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f435357e;

    public z(com.tencent.mm.ui.widget.imageview.WeImageView weImageView, int i17) {
        this.f435356d = weImageView;
        this.f435357e = i17;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        view.removeOnLayoutChangeListener(this);
        com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.Companion companion = com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.INSTANCE;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f435356d;
        int i39 = this.f435357e;
        com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.Companion.expand$default(companion, weImageView, i39 * 2, i39 * 2, i39 * 2, i39 * 2, false, 32, null);
    }
}
