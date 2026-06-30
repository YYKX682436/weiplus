package z35;

/* loaded from: classes4.dex */
public final class d implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView f470007d;

    public d(com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView) {
        this.f470007d = expandableHeroSeekBarView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        android.graphics.Point point = new android.graphics.Point();
        com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView = this.f470007d;
        android.view.Display display = expandableHeroSeekBarView.getDisplay();
        if (display != null) {
            display.getSize(point);
        }
        int i39 = i19 - i17;
        int i47 = i27 - i18;
        if (expandableHeroSeekBarView.getBarDynamicExpandSize().x != i39 || expandableHeroSeekBarView.getBarDynamicExpandSize().y != i47) {
            expandableHeroSeekBarView.setBarDynamicExpandSize(new android.graphics.Point(i39, i47));
        }
        if (i17 == i28 && i18 == i29 && i19 == i37 && i27 == i38) {
            return;
        }
        expandableHeroSeekBarView.b(false);
    }
}
